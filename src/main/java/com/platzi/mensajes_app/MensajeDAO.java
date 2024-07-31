/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.platzi.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author saul
 */
public class MensajeDAO {

    public static void crearMensajeDB(Mensajes mensaje) throws SQLException {
        try (Connection conexion = Conexion.get_connection(); PreparedStatement stat = conexion.prepareStatement("INSERT INTO mensajes(mensaje,autor_mensaje) values (?,?)")) {
            stat.setString(1, mensaje.getMensaje());
            stat.setString(2, mensaje.getAutor_mensaje());
//        stat.setString(3, mensaje.getFecha_mensaje());
            int RowUpdate = stat.executeUpdate();
            if (RowUpdate > 0) {
                System.out.println("Ingreso de datos satisfactorio");
            }
        }
    }

    public static void leerMensajesDB() throws SQLException {
        try (Connection conexion = Conexion.get_connection(); Statement stat = conexion.createStatement()) {
            List<Mensajes> mensajes = new ArrayList<>();
            try (ResultSet result = stat.executeQuery("Select * from mensajes")) {
                while (result.next()) {
                    mensajes.add(saveMensaje(result.getInt("id_mensaje"), result.getString("mensaje"), result.getString("autor_mensaje"), result.getString("fecha_mensaje")));
                }
                for (Mensajes mensaje : mensajes) {
                    System.out.println(mensaje);
                }
            }
        }
    }

    public static void borrarMensajeDB(int id_mensaje) throws SQLException {
        try (Connection conexion = Conexion.get_connection(); PreparedStatement stat = conexion.prepareStatement("DELETE FROM mensajes WHERE id_mensaje= ? ")) {
            stat.setInt(1, id_mensaje);
//        stat.setString(3, mensaje.getFecha_mensaje());
            int RowUpdate = stat.executeUpdate();
            if (RowUpdate > 0) {
                System.out.println("El registro se elemino satisfactoriamente");
            } else {
                System.out.println("Registro no encontrado en la base de datos");
            }
        }
    }

    public static void actualizarMensajeDB(Mensajes mensaje, String confirmacion) throws SQLException {
        if (confirmacion.equalsIgnoreCase("yes")) {
            try (Connection conexion = Conexion.get_connection(); PreparedStatement stat = conexion.prepareStatement("UPDATE mensajes set mensaje=?,autor_mensaje=?   where id_mensaje =?")) {
                stat.setString(1, mensaje.getMensaje());
                stat.setString(2, mensaje.getAutor_mensaje());
                stat.setInt(3, mensaje.getId_mensaje());
                int RowUpdate = stat.executeUpdate();
                if (RowUpdate == 1) {
                    System.out.println("Registro actualizado actualizada");
                } else {
                    System.out.println("Registro no actualizado");
                }
            }
        }else{
            System.out.println("El mensaje no fue actualizado");
        }
    }

    public static Mensajes saveMensaje(int id, String mensaje, String autor, String fecha) {
        return new Mensajes(id, mensaje, autor, fecha);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.platzi.mensajes_app;

import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author saul
 */
public class mensajeService {
    private static final Scanner sc = new Scanner(System.in);
    public static void crearMensaje() throws SQLException{
        
        System.out.println("Ingrese el mensaje: ");
        String mensaje = sc.nextLine();
        System.out.println("Ingrese el autor del mensaje");
        String autorMensaje = sc.nextLine();
        MensajeDAO.crearMensajeDB(new Mensajes(mensaje,autorMensaje));
    }

    public static void listarMensajes() throws SQLException, ClassNotFoundException {
        MensajeDAO.leerMensajesDB();
    }

    public static void borrarMensaje() throws SQLException {
         System.out.println("Ingrese el Id del mensaje que quiere eliminar");
         int id = sc.nextInt();
         MensajeDAO.borrarMensajeDB(id);
    }

    public static void editarMensaje() throws SQLException, ClassNotFoundException {
        System.out.println("Ingrese el Id del mensaje que quiere actualizar");
        int id = sc.nextInt();
          sc.nextLine();
        System.out.println("Escriba el nuevo mensaje");
        String mensaje= sc.nextLine();
        System.out.println("Escriba el autor del mensaje");
        String autor_mensaje = sc.nextLine();
        System.out.println("Seguro que quiere cambiar el mensaje? yes/no");
        String confirmacion = sc.nextLine();
        MensajeDAO.actualizarMensajeDB(new Mensajes(id,mensaje,autor_mensaje),confirmacion);
        
    }
}

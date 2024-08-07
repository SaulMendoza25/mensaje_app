/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.platzi.mensajes_app;

/**
 *
 * @author saul
 */
public class Mensajes {
    public Mensajes(){
    }

    public Mensajes( int id,String mensaje, String autor_mensaje, String fecha_mensaje) {
        this.id_mensaje=id;
        this.mensaje = mensaje;
        this.autor_mensaje = autor_mensaje;
        this.fecha_mensaje = fecha_mensaje;
    }
    public Mensajes( int id,String mensaje, String autor_mensaje) {
        this.id_mensaje=id;
        this.mensaje = mensaje;
        this.autor_mensaje = autor_mensaje;
       
    }

    public Mensajes(String mensaje, String autor_mensaje) {
        this.mensaje = mensaje;
        this.autor_mensaje = autor_mensaje;
    }
    
    public int getId_mensaje() {
        return id_mensaje;
    }

    public void setId_mensaje(int id_mensaje) {
        this.id_mensaje = id_mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAutor_mensaje() {
        return autor_mensaje;
    }

    public void setAutor_mensaje(String autor_mensaje) {
        this.autor_mensaje = autor_mensaje;
    }

    public String getFecha_mensaje() {
        return fecha_mensaje;
    }

    public void setFecha_mensaje(String fecha_mensaje) {
        this.fecha_mensaje = fecha_mensaje;
    }

    @Override
    public String toString() {
        return "Mensajes: " + "id_mensaje: " + id_mensaje + ", mensaje: " + mensaje + ", autor_mensaje: " + autor_mensaje + ", fecha_mensaje: " + fecha_mensaje;
    }
    
    private int id_mensaje;
    private String mensaje;
    private String autor_mensaje;
    private String fecha_mensaje;
}

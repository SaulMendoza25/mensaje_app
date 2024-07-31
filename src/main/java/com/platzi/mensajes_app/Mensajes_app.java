/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.platzi.mensajes_app;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author saul
 */
public class Mensajes_app {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("\n-------------------------"); 
            System.out.println("Aplicaciones de mensajes"); 
            System.out.println("1._ Listar los mensajes");                    
            System.out.println("2._ Crear un mensaje");
            System.out.println("3._ Editar un mensaje");
            System.out.println("4._ Borrar un mensaje");
            System.out.println("5._ Salir");
            opcion = sc.nextInt();
            switch(opcion){
                case 1 -> mensajeService.listarMensajes();
                case 2 -> mensajeService.crearMensaje();
                case 3 -> mensajeService.editarMensaje();
                case 4 -> mensajeService.borrarMensaje();
                case 5 -> {
                    System.out.println("Gracias por usar nuetro aplicacion Domo arigato");
                    opcion=5;
                }
                default -> System.out.println("La opcion que eligion no es valida intente otra vez por favor");
            }
        }while(opcion !=5);
              
    }
}

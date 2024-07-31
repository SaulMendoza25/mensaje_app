/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.platzi.mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author saul
 */
public class Conexion {
    private static  Connection connection;
    public static Connection get_connection(){
        final String URL = "jdbc:postgresql://192.168.1.9/Persistence_database_java"; 
        final String USER = "postgres";
        final String PASSWORD= "postgres";
        connection =null;
        if(connection ==null){
        try{
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        }catch(SQLException E){
            System.out.println(E);
        }
        }
      return connection;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jcuel
 */
public class Conexion {
    //Conexion
    
    public static Connection conectar(){
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql:/localhost/shoestore", "root", "");
            return con; 
        }catch(SQLException e){
            System.out.println("Error en la conexion: " + e);
        }
        return null;
    }
}

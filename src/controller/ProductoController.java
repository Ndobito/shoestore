/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Conexion;
import model.Producto;

/**
 *
 * @author jcuel
 */
public class ProductoController {
    public boolean guardar(Producto objeto) {
        boolean res = false; 
        Connection con = Conexion.conectar(); 
        try{
            PreparedStatement consulta = con.prepareStatement("INSERT INTO producto VALUES (?,?,?,?,?,?,?)"); 
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getNomprod());
            consulta.setInt(3, objeto.getCantprod());
            consulta.setDouble(4, objeto.getPrecprod());
            consulta.setString(5, objeto.getDesprod());
            consulta.setInt(6, objeto.getIvaprod());
            consulta.setInt(7, objeto.getStateprod());
            
            if(consulta.executeUpdate() > 0 ){
                res = true; 
            }
            
            con.close(); 
        }catch(SQLException e){
            System.out.println("Error al guardar Producto: "+ e);
        }
        
        return res; 
    }
    
    public boolean existeProducto(String Producto) {
        boolean respuesta = false; 
        String sql = "SELECT namprod FROM producto WHERE namprod = '"+Producto+"';"; 
        Statement st; 
        
        try{
            Connection con = Conexion.conectar(); 
            st = con.createStatement(); 
            ResultSet rs = st.executeQuery(sql); 
            while(rs.next()){
                respuesta= true; 
            }
        }catch(SQLException e){
            System.out.println("Error al consultar Producto: "+ e);
        }
        return respuesta; 
    }
    
}

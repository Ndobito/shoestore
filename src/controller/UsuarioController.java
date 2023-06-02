/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.Conexion;
import model.Usuario;

/**
 *
 * @author jcuel
 */
public class UsuarioController {
    public boolean loginUser(Usuario objeto){
        boolean res = false; 
        Connection cn = Conexion.conectar(); 
        String sql = "SELECT nickusu, passusu FROM usuario WHERE nickusu='"+objeto.getUsuario()+"' AND passusu= '"+objeto.getPassword()+"'"; 
        Statement st; 
        try{
            st = cn.createStatement(); 
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                res = true; 
            }
        }catch(SQLException e){
            System.out.println("Error al Iniciar Sesion");
            JOptionPane.showMessageDialog(null, "Error al Iniciar Sesion" + e);
        }
        
        return res; 
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica9;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Víctor
 */
public class ConectBD {
    DefaultListModel modeloTablas = new DefaultListModel();
    DefaultListModel modeloCampos = new DefaultListModel();
    
    public void connect(String user, String pass) throws ClassNotFoundException, SQLException{
        
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://i7-lab5.dis.ulpgc.es/DIU_BD?useSSL=true",
                    user,
                    pass);
            DatabaseMetaData md = con.getMetaData();
            String[] types = {"TABLE"};
            ResultSet rs = md.getTables(null, null, "%", types);
            while (rs.next()) {
                String nombreTabla = rs.getString("TABLE_NAME");
                int n = 0;
                modeloTablas.add(n, nombreTabla);
                n++;

            }
       
    }
    
    
    
}

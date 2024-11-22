/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class DatabaseUtil {
    public Connection conn = null;
    
    //Phuong thuc thuc hien ket noi CSDL
    public Connection connectSQL() throws SQLException {
        try{
        String userName = "sa";
        String password = "nam2092004";
        String url = "jdbc:sqlserver://localhost:1433;databaseName=ExpenditureDB;";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        conn = java.sql.DriverManager.getConnection(url, userName, password);
        return conn;
        }
        catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ket noi SQL that bai","Thong bao",1);
        }
    return null;
    }
}

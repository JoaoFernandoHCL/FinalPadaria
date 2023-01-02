package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class ConexaoDAO {
    
    private static String host = "localhost";
    private static String port = "3306";
    private static String db = "bdPadaria";
    private static String user = "root";
    private static String pass = "senha123";
    
    public Connection conectaBD(){
         Connection conn = null;
         
        try {
            String url = String.format(
                "jdbc:mysql://%s:%s/%s?useTimezone=true&serverTimezone=UTC",
                host,
                port,
                db
            );
            
            conn = DriverManager.getConnection(url, user,pass);
            
        
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null,"Error ConexaoDAO" + e.getMessage());
        }
         return conn;
         
    }
}

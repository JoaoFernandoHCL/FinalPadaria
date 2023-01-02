package DAO;

import DTO.AdminDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class AdminDAO {
 
    Connection conn;
    
    public ResultSet autenticacaoAdmin(AdminDTO objadmindto){
        
        conn = new ConexaoDAO().conectaBD();
        
        
        try {
            
            String sql = "SELECT *FROM adm WHERE nome_adm = ? AND senha_adm = ? ";
            PreparedStatement pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, objadmindto.getNome_adm());
            pstm.setString(2, objadmindto.getSenha_adm());
            
            ResultSet rs = pstm.executeQuery();
            
            return rs;
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null,"AdminDAO: " + e);
            return null;
        }
    }
}

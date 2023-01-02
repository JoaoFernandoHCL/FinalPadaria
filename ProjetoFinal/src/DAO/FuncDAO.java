/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.FuncDTO;
import DTO.LoginFuncDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author danil
 */

public class FuncDAO {
    
    Connection conn; 
    PreparedStatement pstm;
    public boolean existeFuncionario(FuncDTO funcionario) throws Exception {
        
        String sql = "SELECT * FROM tb_func WHERE nome = ? AND senha = ?";
        
        conn = new ConexaoDAO().conectaBD();
                
        try ( PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, funcionario.getNome_func());
            ps.setString(2, funcionario.getSenha_func());
            try ( ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }

    public FuncDTO[] obterFuncionario() throws Exception {
        String sql = "SELECT * FROM tb_func";
        conn = new ConexaoDAO().conectaBD();
        try (
                PreparedStatement ps
                = conn.prepareStatement(sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);  
            ResultSet rs = ps.executeQuery()) {
            int totalDeFuncionarios = rs.last() ? rs.getRow() : 0;
            FuncDTO[] funcionarios = new FuncDTO[totalDeFuncionarios];
            rs.beforeFirst();
            int contador = 0;
            while (rs.next()) {
                int id = rs.getInt("id_func");
                String nome = rs.getString("nome_func");
                String tipo = rs.getString("cargo_func");
                funcionarios[contador++] = new FuncDTO(id, nome, tipo);
            }
            return funcionarios;
        }
    }
     
    public ResultSet autenticacaoFunc(LoginFuncDTO objFuncDTO){
        
        conn = new ConexaoDAO().conectaBD();
        
        
        try {
            
            String sql = "SELECT *FROM tb_func WHERE nome_func = ? AND senha_func = ? ";
            PreparedStatement pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, objFuncDTO.getNome_func());
            pstm.setString(2, objFuncDTO.getSenha_func());
            
            ResultSet rs = pstm.executeQuery();
            
            return rs;
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null,"FuncDAO: " + e);
            return null;
        }
    }
       
    }
    


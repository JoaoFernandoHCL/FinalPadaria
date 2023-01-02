/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author danil
 */

import DTO.ProdDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProdDAO {
    Connection conn;
    PreparedStatement pstm;
    
    public boolean existeProduto(ProdDTO produto) throws Exception {
        String sql = "SELECT * FROM prod WHERE nome = ?";
        
        conn = new ConexaoDAO().conectaBD();
        
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, produto.getNome_prod());
            try ( ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }

    public ProdDTO[] obterProduto() throws Exception {
        
        String sql = "SELECT * FROM prod";
        conn = new ConexaoDAO().conectaBD();
        try (  
                PreparedStatement ps
                = conn.prepareStatement(sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);  
            ResultSet rs = ps.executeQuery()) {
            int totalDeProdutos = rs.last() ? rs.getRow() : 0;
            ProdDTO[] produtos = new ProdDTO[totalDeProdutos];
            rs.beforeFirst();
            int contador = 0;
            while (rs.next()) {
                int id = rs.getInt("id_prod");
                String nome = rs.getString("nome_prod");
                String unid = rs.getString("unidadeMed_prod");
                double preco = rs.getDouble("valor_prod");
                produtos[contador++] = new ProdDTO(id, nome, unid, preco);
            }
            return produtos;
        }
    }
    
}

package DAO;

import DTO.PedidoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PedidoDAO {
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<PedidoDTO> lista = new ArrayList<>();
    
    public void fazerPedido(PedidoDTO objPedidoDTO){
        
        String sql = "INSERT INTO pedido (produto_pedido, valor, quantidade_pedido, tipoPedido_pedido, preco_pedido) VALUES (?, ?, ? ,?, ?)";
        
        conn = new ConexaoDAO().conectaBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objPedidoDTO.getProduto_pedido());
            pstm.setDouble(2, objPedidoDTO.getValor());
            pstm.setInt(3, objPedidoDTO.getQuantidade_pedido());
            pstm.setString(4, objPedidoDTO.getTipoPedido_pedido());
            pstm.setDouble(5, objPedidoDTO.getPreco_pedido());
            
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "pedidoDAO" + e);
        }
    }
    
    
    
    public ArrayList<PedidoDTO> MostrarPedido(PedidoDTO objPedidoDTO){
        
        String sql = "SELECT *FROM pedido WHERE id_mesa = ?";
        
        conn = new ConexaoDAO().conectaBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objPedidoDTO.getId_pedido());
          //  pstm.execute();
          //  pstm.close();
            
            rs = pstm.executeQuery();
            
            while(rs.next()){
                PedidoDTO obj_PedidoDTO = new PedidoDTO();
                obj_PedidoDTO.setId_pedido(rs.getInt("id_mesa")); 
                obj_PedidoDTO.setNum_pedido(rs.getInt("num_pedido"));
                obj_PedidoDTO.setValor(rs.getDouble("valor"));
                obj_PedidoDTO.setProduto_pedido(rs.getString("produto_pedido"));
                obj_PedidoDTO.setQuantidade_pedido(rs.getInt("quantidade_pedido"));
                obj_PedidoDTO.setTipoPedido_pedido(rs.getString("tipoPedido_pedido"));
                obj_PedidoDTO.setPreco_pedido(rs.getDouble("preco_pedido"));
           
                lista.add(obj_PedidoDTO);
            
            }
                
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "PedidoDAO MostrarPedido:" + e);
        }
        return lista;
    }
}

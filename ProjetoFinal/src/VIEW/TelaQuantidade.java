/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import DAO.PedidoDAO;
import DTO.PedidoDTO;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author MathM
 */
public class TelaQuantidade extends javax.swing.JFrame {

    /**
     * Creates new form TelaQuantidade
     */
    public TelaQuantidade() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(255,145,77));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtfQuantidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnFinalizarEscolha = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cmbProduto = new javax.swing.JComboBox<>();
        txtfPreco = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        cmbTipoPedido = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("Preço");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setText("Tipo de Pedido");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, -1, -1));

        txtfQuantidade.setBackground(new java.awt.Color(255, 255, 253));
        txtfQuantidade.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        txtfQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfQuantidadeActionPerformed(evt);
            }
        });
        getContentPane().add(txtfQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 297, 36));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 48)); // NOI18N
        jLabel4.setText("SELECIONE A QUANTIDADE QUE DESEJA PEDIR");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 6, -1, -1));

        btnFinalizarEscolha.setBackground(new java.awt.Color(255, 255, 253));
        btnFinalizarEscolha.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnFinalizarEscolha.setText("Fazer Escolha");
        btnFinalizarEscolha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarEscolhaActionPerformed(evt);
            }
        });
        getContentPane().add(btnFinalizarEscolha, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 610, 338, 52));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setText("Produto");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        cmbProduto.setBackground(new java.awt.Color(255, 255, 253));
        cmbProduto.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        cmbProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pão Francês", "Baguete", "Broa de Milho", "Brioche", "Pão de Leite", "Pão Italiano", "Hamburguer", "Coxinha", "Bauru", "Beirute", "Misto Quente", "Sanduíche Natural", "Sanduíche Mortadela", "Torta Salgada", "Mussarela", "Presunto", "Queijo Prato", "Mortadela", "Peito de Peru", "Lombo", "Samale", "Torta de Limão", "Torta de Morango", "Sonho", "Bolo de Brigadeiro", "Bolo de Cenoura", "Bomba de Chocolate", "Coca-Cola 300ml", "Coca-Cola 300ml / Copo com gelo", "Coca-Cola 1,5L", "Coca-Cola 1,5L  / Copo com gelo", "Água Mineral 500ml", "Água Com Gás 500ml", "Cerveja Brahma 350ml", "Cerveja Brahma 350ml  / Copo com gelo", "Cerveja Brahma 1L", "Cerveja Brahma 1L  / Copo com gelo", "Suco de Laranja 400ml", "Suco de Laranja 400ml / Copo com gelo", "Café", "Cappuccino" }));
        cmbProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 291, 52));

        txtfPreco.setEditable(false);
        txtfPreco.setBackground(new java.awt.Color(255, 255, 253));
        txtfPreco.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        txtfPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfPrecoActionPerformed(evt);
            }
        });
        getContentPane().add(txtfPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, 297, 38));

        btnCalcular.setBackground(new java.awt.Color(255, 255, 253));
        btnCalcular.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        btnCalcular.setText("Fazer Calculo");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 165, 38));

        cmbTipoPedido.setBackground(new java.awt.Color(255, 255, 253));
        cmbTipoPedido.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        cmbTipoPedido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comer Agora!", "Levar Para a Viagem!" }));
        getContentPane().add(cmbTipoPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 297, 38));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setText("Quantidade");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  
    double valor = 0;
    double resultado;
    private void btnFinalizarEscolhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarEscolhaActionPerformed
        String produto;
        String quantidade;
        String tipoPedido;
        String preco;
        
        
       produto = cmbProduto.getSelectedItem().toString();
       quantidade = txtfQuantidade.getText();
       tipoPedido = cmbTipoPedido.getSelectedItem().toString();
       preco = txtfPreco.getText();
       
         int quantidadee = Integer.parseInt(quantidade);
         double precoo = Double.parseDouble (preco);
       
       PedidoDTO objPedidoDTO = new PedidoDTO();
       objPedidoDTO.setProduto_pedido(produto);
       objPedidoDTO.setValor(valor);
       objPedidoDTO.setQuantidade_pedido(quantidadee);
       objPedidoDTO.setTipoPedido_pedido(tipoPedido);
       objPedidoDTO.setPreco_pedido(precoo);
       
       PedidoDAO objPedidoDAO = new PedidoDAO();
       objPedidoDAO.fazerPedido(objPedidoDTO);
       
       JOptionPane.showMessageDialog(null, "Pedido Feito!");
       
       
    }//GEN-LAST:event_btnFinalizarEscolhaActionPerformed
         
    private void txtfQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfQuantidadeActionPerformed
       
    }//GEN-LAST:event_txtfQuantidadeActionPerformed
   
    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed

        int quan = Integer.parseInt(txtfQuantidade.getText());
        resultado = quan * valor;
        System.out.println(resultado);
        txtfPreco.setText(Double.toString(resultado));
        
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtfPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfPrecoActionPerformed
       
    }//GEN-LAST:event_txtfPrecoActionPerformed

    private void cmbProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProdutoActionPerformed
        PedidoDTO escolhido = new PedidoDTO();
        String produto = cmbProduto.getSelectedItem().toString();
        escolhido.setProduto_pedido(produto);
        
        if (escolhido.porPeso()){
            JOptionPane.showMessageDialog(null, escolhido.mensagem() );
        } 
        
        if (escolhido.doces()){
        } else if(escolhido.lanches()){
        } else if (escolhido.paes()){
        }else if (escolhido.bebidas());

        JOptionPane.showMessageDialog(null, "Valor a pagar: R$"+ escolhido.getValor());
        valor = escolhido.getValor();

    }//GEN-LAST:event_cmbProdutoActionPerformed

        
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaQuantidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaQuantidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaQuantidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaQuantidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaQuantidade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnFinalizarEscolha;
    private javax.swing.JComboBox<String> cmbProduto;
    private javax.swing.JComboBox<String> cmbTipoPedido;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtfPreco;
    private javax.swing.JTextField txtfQuantidade;
    // End of variables declaration//GEN-END:variables
}

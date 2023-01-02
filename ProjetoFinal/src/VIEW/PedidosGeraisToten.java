/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import javax.swing.JOptionPane;


/**
 *
 * @author ronil
 */
public class PedidosGeraisToten extends javax.swing.JFrame {

    /**
     * Creates new form PedidosGeraisToten
     */
    
    public PedidosGeraisToten() {
        initComponents();
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnLanchesGerais = new javax.swing.JButton();
        btnPaesGerais = new javax.swing.JButton();
        btnFrios = new javax.swing.JButton();
        btnTelasDoces = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnCancelarPedido = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnLanches = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnFazerPedido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLanchesGerais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LancheGeral.jpg"))); // NOI18N
        btnLanchesGerais.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnLanchesGerais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanchesGeraisActionPerformed(evt);
            }
        });
        jPanel1.add(btnLanchesGerais, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 206, 183));

        btnPaesGerais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/paoGeral.jpg"))); // NOI18N
        btnPaesGerais.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPaesGerais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaesGeraisActionPerformed(evt);
            }
        });
        jPanel1.add(btnPaesGerais, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 207, 183));

        btnFrios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/friosGeral.jpg"))); // NOI18N
        btnFrios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFriosActionPerformed(evt);
            }
        });
        jPanel1.add(btnFrios, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, 206, 183));

        btnTelasDoces.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/docesGeral.jpg"))); // NOI18N
        btnTelasDoces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelasDocesActionPerformed(evt);
            }
        });
        jPanel1.add(btnTelasDoces, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 207, 184));

        jLabel1.setFont(new java.awt.Font("Curlz MT", 1, 48)); // NOI18N
        jLabel1.setText("CARDÁPIO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, -1));

        btnVoltar.setBackground(new java.awt.Color(255, 255, 253));
        btnVoltar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 22, 128, 48));

        btnCancelarPedido.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelarPedido.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnCancelarPedido.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarPedido.setText("Cancelar Pedido");
        btnCancelarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPedidoActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 30)); // NOI18N
        jLabel2.setText("Pães");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 30)); // NOI18N
        jLabel3.setText("Lanches");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 30)); // NOI18N
        jLabel4.setText("Frios");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 330, -1, 26));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 30)); // NOI18N
        jLabel5.setText("Doces");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 600, -1, -1));

        btnLanches.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sucoGeral.jpg"))); // NOI18N
        btnLanches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanchesActionPerformed(evt);
            }
        });
        jPanel1.add(btnLanches, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, 206, 184));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 30)); // NOI18N
        jLabel6.setText("Bebidas");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 610, -1, 41));

        btnFazerPedido.setBackground(new java.awt.Color(51, 255, 0));
        btnFazerPedido.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnFazerPedido.setForeground(new java.awt.Color(255, 255, 255));
        btnFazerPedido.setText("Fazer Pedido");
        btnFazerPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFazerPedidoActionPerformed(evt);
            }
        });
        jPanel1.add(btnFazerPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 670, 176, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void telaLanches(){
        
         TelaLanches vss = new TelaLanches();
         vss.setVisible(true);
    }
    
    private void btnLanchesGeraisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanchesGeraisActionPerformed
        telaLanches();
        this.dispose();
    }//GEN-LAST:event_btnLanchesGeraisActionPerformed
    
        public void telapaes(){
        
         TelasPaes vs = new TelasPaes();
         vs.setVisible(true); 
         
    }  
    
    private void btnPaesGeraisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaesGeraisActionPerformed
        telapaes();
        this.dispose();
    }//GEN-LAST:event_btnPaesGeraisActionPerformed

    public void telaDoces(){
        
       TelaDoces vs = new TelaDoces();
         vs.setVisible(true); 
    }
    
    private void btnTelasDocesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelasDocesActionPerformed
        telaDoces();
        this.dispose();
    }//GEN-LAST:event_btnTelasDocesActionPerformed

    public void voltar(){
        
        InicialToten vs = new InicialToten();
         vs.setVisible(true); 
         
    }
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
       voltar();
       this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnCancelarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPedidoActionPerformed
        
        int resultado =JOptionPane.showConfirmDialog(null, "Deseja Mesmo cancelar?", "Cancelando Pedido ...",JOptionPane.YES_NO_OPTION,  JOptionPane.INFORMATION_MESSAGE);
        
        if (resultado == JOptionPane.YES_OPTION){
        InicialToten vss = new InicialToten(); 
        vss.setVisible(true);
        this.dispose();
    }
             
    }//GEN-LAST:event_btnCancelarPedidoActionPerformed

    
    public void fazerPedido(){
        
        TelaQuantidade vs = new TelaQuantidade();
         vs.setVisible(true); 
         
    }
    private void btnFazerPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFazerPedidoActionPerformed
        fazerPedido();
    }//GEN-LAST:event_btnFazerPedidoActionPerformed

    
    public void irFrios(){
        
        TelaFrios vs = new TelaFrios();
         vs.setVisible(true); 
         
    }
    
    private void btnFriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFriosActionPerformed
        irFrios();
        this.dispose();
    }//GEN-LAST:event_btnFriosActionPerformed
    
    public void irLanches(){
        
        TelaBebidas vss1 = new TelaBebidas();
         vss1.setVisible(true); 
         
    }
    private void btnLanchesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanchesActionPerformed
        irLanches();
        this.dispose();
    }//GEN-LAST:event_btnLanchesActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(PedidosGeraisToten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PedidosGeraisToten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PedidosGeraisToten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PedidosGeraisToten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PedidosGeraisToten().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarPedido;
    private javax.swing.JButton btnFazerPedido;
    private javax.swing.JButton btnFrios;
    private javax.swing.JButton btnLanches;
    private javax.swing.JButton btnLanchesGerais;
    private javax.swing.JButton btnPaesGerais;
    private javax.swing.JButton btnTelasDoces;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

   
}

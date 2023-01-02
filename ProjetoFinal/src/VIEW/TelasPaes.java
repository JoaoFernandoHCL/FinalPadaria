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
public class TelasPaes extends javax.swing.JFrame{

    /**
     * Creates new form PedidosGeraisToten
     */
    public TelasPaes() {
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

        txtFTipoPedido = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnLanchesGerais = new javax.swing.JButton();
        btnPaesGerais = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnCancelarPedido = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        txtFTipoPedido.setEditable(false);
        txtFTipoPedido.setBackground(new java.awt.Color(0, 153, 0));
        txtFTipoPedido.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        txtFTipoPedido.setForeground(new java.awt.Color(255, 255, 255));
        txtFTipoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFTipoPedidoActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1030, 830));
        jPanel1.setPreferredSize(new java.awt.Dimension(830, 1030));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLanchesGerais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/baguete.jpg"))); // NOI18N
        btnLanchesGerais.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnLanchesGerais.setBorderPainted(false);
        btnLanchesGerais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanchesGeraisActionPerformed(evt);
            }
        });
        jPanel1.add(btnLanchesGerais, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 206, 183));

        btnPaesGerais.setForeground(new java.awt.Color(255, 255, 255));
        btnPaesGerais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/frances.png"))); // NOI18N
        btnPaesGerais.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPaesGerais.setBorderPainted(false);
        btnPaesGerais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaesGeraisActionPerformed(evt);
            }
        });
        jPanel1.add(btnPaesGerais, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 207, 183));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/milho.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, 206, 183));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/brioche.jpg"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 207, 184));

        jLabel1.setBackground(new java.awt.Color(0, 153, 0));
        jLabel1.setFont(new java.awt.Font("Curlz MT", 1, 52)); // NOI18N
        jLabel1.setText("PÃES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, -1));

        btnVoltar.setBackground(new java.awt.Color(255, 255, 253));
        btnVoltar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 128, 48));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 30)); // NOI18N
        jLabel2.setText("R$ 22,90/Kg");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 30)); // NOI18N
        jLabel4.setText("Broa de Milho");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 290, -1, 26));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 30)); // NOI18N
        jLabel5.setText("Brioche");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 590, -1, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/leite.png"))); // NOI18N
        jButton5.setBorderPainted(false);
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 206, 184));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 30)); // NOI18N
        jLabel6.setText("Pão de Leite");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 580, -1, 41));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 30)); // NOI18N
        jLabel7.setText("Baguete");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 30)); // NOI18N
        jLabel8.setText("R$ 1, 00");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 320, -1, 21));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 30)); // NOI18N
        jLabel9.setText("R$ 24, 00");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, -1, 21));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 30)); // NOI18N
        jLabel10.setText("R$ 13, 75");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 620, -1, 27));

        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 30)); // NOI18N
        jLabel11.setText("R$ 10, 00");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 620, -1, 21));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/italiano.jpg"))); // NOI18N
        jButton3.setBorderPainted(false);
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 400, 206, 183));

        jLabel12.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 30)); // NOI18N
        jLabel12.setText("Pão Italiano");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 580, -1, 41));

        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 30)); // NOI18N
        jLabel13.setText("R$ 5, 60");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 610, -1, -1));

        btnCancelarPedido.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelarPedido.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnCancelarPedido.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarPedido.setText("Cancelar Pedido");
        btnCancelarPedido.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCancelarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPedidoActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, 150, 30));

        jLabel14.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 30)); // NOI18N
        jLabel14.setText("Pão Francês");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1030, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 826, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLanchesGeraisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanchesGeraisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLanchesGeraisActionPerformed

           
    private void btnPaesGeraisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaesGeraisActionPerformed
                
    }//GEN-LAST:event_btnPaesGeraisActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    public void voltar(){
         
        PedidosGeraisToten vs = new PedidosGeraisToten();
         vs.setVisible(true); 
  
    }
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
       voltar();
       this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtFTipoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFTipoPedidoActionPerformed
     
    }//GEN-LAST:event_txtFTipoPedidoActionPerformed

    private void btnCancelarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPedidoActionPerformed
        int resultado =JOptionPane.showConfirmDialog(null, "Deseja Mesmo cancelar?", "Cancelando Pedido ...",JOptionPane.YES_NO_OPTION,  JOptionPane.INFORMATION_MESSAGE);

        if (resultado == JOptionPane.YES_OPTION){
            InicialToten vss = new InicialToten();
            vss.setVisible(true);
            this.dispose();

    }//GEN-LAST:event_btnCancelarPedidoActionPerformed
   
    }
    
    
    
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
            java.util.logging.Logger.getLogger(TelasPaes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelasPaes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelasPaes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelasPaes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelasPaes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarPedido;
    private javax.swing.JButton btnLanchesGerais;
    private javax.swing.JButton btnPaesGerais;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txtFTipoPedido;
    // End of variables declaration//GEN-END:variables
}
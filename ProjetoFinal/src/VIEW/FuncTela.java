/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import DAO.ConexaoDAO;
import DAO.FuncDAO;
import DTO.FuncDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.DefaultComboBoxModel;

import javax.swing.JOptionPane;

/**
 *
 * @author danil
 */
public class FuncTela extends javax.swing.JFrame {

    /**
     * Creates new form FuncTela
     */
    public FuncTela() {
        super ("Funcionarios");
        initComponents();
        buscarFuncionarios();
        setLocationRelativeTo(null);
    }
    private void buscarFuncionarios() {
        try {
            FuncDAO dao = new FuncDAO();
            FuncDTO[] funcionarios = dao.obterFuncionario();
            funcionariosComboBox.setModel(new DefaultComboBoxModel<>(funcionarios));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Funcionario não encontrado, tente novamente mais tarde.");
            e.printStackTrace();
        }
    }
    
    private void adicionarFuncionario() {
        Connection conn;
        PreparedStatement pstm;
        String sql = "INSERT INTO tb_func (nome_func, senha_func, cargo_func) VALUES (?, ?, ?)";
        conn = new ConexaoDAO().conectaBD();
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, nomeFuncTextField.getText());
            pstm.setString(2, senhaFuncPasswordField.getText());
            pstm.setString(3, cargoFuncTextField.getText());
            
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "funcionarioDAO" + e);
        }
    }
    
    private void removerFuncionario() {
        Connection conn;
        PreparedStatement pstm;
        String sql = "DELETE FROM tb_func WHERE id_func = ?";
        conn = new ConexaoDAO().conectaBD();
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, Integer.parseInt(idFuncTextField.getText()));
            
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "funcionarioDAO" + e);
        }
    }
    
    private void atualizarFuncionario() {
        Connection conn;
        PreparedStatement pstm;
        String sqlNome = "UPDATE tb_func SET nome_func = ? WHERE id_func = ?";
        String sqlSenha = "UPDATE tb_func SET senha_func = ? WHERE id_func = ?";
        String sqlCargo = "UPDATE tb_func SET cargo_func = ? WHERE id_func = ?";
        conn = new ConexaoDAO().conectaBD();
        if (nomeFuncTextField.getText() != "") {
            try {
                pstm = conn.prepareStatement(sqlNome);
                pstm.setString(1, nomeFuncTextField.getText());
                pstm.setInt(2, Integer.parseInt(idFuncTextField.getText()));
                pstm.execute();
                pstm.close();
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "funcionarioDAO" + e);
            }
        }
        if (senhaFuncPasswordField.getText() != "") {
            try {   
                pstm = conn.prepareStatement(sqlSenha);
                pstm.setString(1, senhaFuncPasswordField.getText());
                pstm.setInt(2, Integer.parseInt(idFuncTextField.getText()));
                pstm.execute();
                pstm.close();
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "funcionarioDAO" + e);
            }
        }
        if (cargoFuncTextField.getText() != "") {
            try {
                pstm = conn.prepareStatement(sqlCargo);
                pstm.setString(1,cargoFuncTextField.getText());
                pstm.setInt(2, Integer.parseInt(idFuncTextField.getText()));
                pstm.execute();
                pstm.close();
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "funcionarioDAO" + e);
            }
        } 
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        funcionariosPanel = new javax.swing.JPanel();
        novoFuncButton = new javax.swing.JButton();
        atualizarFuncButton = new javax.swing.JButton();
        removerFuncButton = new javax.swing.JButton();
        cancelarFuncButton = new javax.swing.JButton();
        voltarFuncButton = new javax.swing.JButton();
        funcionariosComboBox = new javax.swing.JComboBox<>();
        senhaFuncPasswordField = new javax.swing.JPasswordField();
        idFuncTextField = new javax.swing.JTextField();
        nomeFuncTextField = new javax.swing.JTextField();
        cargoFuncTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        funcionariosPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Gerenciamento de Funcionarios"));

        novoFuncButton.setText("Novo");
        novoFuncButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoFuncButtonActionPerformed(evt);
            }
        });

        atualizarFuncButton.setText("Atualizar");
        atualizarFuncButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarFuncButtonActionPerformed(evt);
            }
        });

        removerFuncButton.setText("Remover");
        removerFuncButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerFuncButtonActionPerformed(evt);
            }
        });

        cancelarFuncButton.setText("Cancelar");
        cancelarFuncButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarFuncButtonActionPerformed(evt);
            }
        });

        voltarFuncButton.setText("Voltar");
        voltarFuncButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarFuncButtonActionPerformed(evt);
            }
        });

        funcionariosComboBox.setMaximumRowCount(30);

        senhaFuncPasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder("Senha"));

        idFuncTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Id"));

        nomeFuncTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));

        cargoFuncTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Cargo"));
        cargoFuncTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargoFuncTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout funcionariosPanelLayout = new javax.swing.GroupLayout(funcionariosPanel);
        funcionariosPanel.setLayout(funcionariosPanelLayout);
        funcionariosPanelLayout.setHorizontalGroup(
            funcionariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(funcionariosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(funcionariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cargoFuncTextField)
                    .addGroup(funcionariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(funcionariosPanelLayout.createSequentialGroup()
                            .addComponent(novoFuncButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(atualizarFuncButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(funcionariosComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, funcionariosPanelLayout.createSequentialGroup()
                            .addComponent(removerFuncButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                            .addGroup(funcionariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(voltarFuncButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cancelarFuncButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(senhaFuncPasswordField)
                    .addComponent(nomeFuncTextField)
                    .addComponent(idFuncTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        funcionariosPanelLayout.setVerticalGroup(
            funcionariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(funcionariosPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(funcionariosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(idFuncTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(nomeFuncTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(senhaFuncPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cargoFuncTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(funcionariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novoFuncButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atualizarFuncButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(funcionariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removerFuncButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarFuncButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(voltarFuncButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(funcionariosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(funcionariosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarFuncButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarFuncButtonActionPerformed
        DashboardAdminTela vs = new DashboardAdminTela();
                    vs.setVisible(true);
                    this.dispose();
    }//GEN-LAST:event_voltarFuncButtonActionPerformed

    private void novoFuncButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoFuncButtonActionPerformed
        adicionarFuncionario();
        buscarFuncionarios();
        nomeFuncTextField.setText("");
        senhaFuncPasswordField.setText("");
        cargoFuncTextField.setText("");
    }//GEN-LAST:event_novoFuncButtonActionPerformed

    private void removerFuncButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerFuncButtonActionPerformed
       removerFuncionario();
       buscarFuncionarios();
       idFuncTextField.setText("");
    }//GEN-LAST:event_removerFuncButtonActionPerformed

    private void atualizarFuncButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarFuncButtonActionPerformed
       atualizarFuncionario();
       buscarFuncionarios();
       idFuncTextField.setText("");
       nomeFuncTextField.setText("");
       senhaFuncPasswordField.setText("");
       cargoFuncTextField.setText("");
    }//GEN-LAST:event_atualizarFuncButtonActionPerformed

    private void cancelarFuncButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarFuncButtonActionPerformed
       idFuncTextField.setText("");
       nomeFuncTextField.setText("");
       senhaFuncPasswordField.setText("");
       cargoFuncTextField.setText("");
    }//GEN-LAST:event_cancelarFuncButtonActionPerformed

    private void cargoFuncTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargoFuncTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargoFuncTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(FuncTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarFuncButton;
    private javax.swing.JButton cancelarFuncButton;
    private javax.swing.JTextField cargoFuncTextField;
    private javax.swing.JComboBox<FuncDTO> funcionariosComboBox;
    private javax.swing.JPanel funcionariosPanel;
    private javax.swing.JTextField idFuncTextField;
    private javax.swing.JTextField nomeFuncTextField;
    private javax.swing.JButton novoFuncButton;
    private javax.swing.JButton removerFuncButton;
    private javax.swing.JPasswordField senhaFuncPasswordField;
    private javax.swing.JButton voltarFuncButton;
    // End of variables declaration//GEN-END:variables
}
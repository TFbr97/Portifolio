/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import classe.Funcionario;
import dao.FuncionarioDao;
import javax.swing.JOptionPane;

/**
 *
 * @author 62127512022.2
 */
public class FrFuncionario extends javax.swing.JFrame {

    Funcionario funcionario = new Funcionario();
    FuncionarioDao daofu = new FuncionarioDao();
    
    public FrFuncionario() {
        initComponents();
    }

    public void GuardaDados(){
       // funcionario.setIdFuncionario(Integer.parseInt(TxIdfuncionario.getText()));
        funcionario.setCpf(TxCpf.getText());
        funcionario.setNome(TxNome.getText());
        funcionario.setTelefone(TxTelefone.getText());
        funcionario.setUsuario(TxUser.getText());
        funcionario.setSenha(TxSenha.getText());
        
    }
    
    public void LimpaDados(){
        TxIdfuncionario.setText(null);
        TxCpf.setText(null);
        TxNome.setText(null);
        TxTelefone.setText(null);
        TxUser.setText(null);
        TxSenha.setText(null);
    }
    
    public void Pesquisa(){
       TxIdfuncionario.setText(String.valueOf(funcionario.getIdFuncionario()));
       TxCpf.setText(funcionario.getCpf());
       TxNome.setText(funcionario.getNome());
       TxTelefone.setText(funcionario.getTelefone());
       TxUser.setText(funcionario.getUsuario());
       TxSenha.setText(funcionario.getSenha()); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TxIdfuncionario = new javax.swing.JTextField();
        BtConsCpf = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxNome = new javax.swing.JTextField();
        BtConsNome = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        TxTelefone = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        TxUser = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TxSenha = new javax.swing.JTextField();
        BtCadastro = new javax.swing.JToggleButton();
        BtEditar = new javax.swing.JButton();
        BtCancelar = new javax.swing.JButton();
        TxCpf = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de funcionários");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 16, 481, 81));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 120));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("idFuncionário:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 20, 125, -1));

        TxIdfuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxIdfuncionarioActionPerformed(evt);
            }
        });
        jPanel2.add(TxIdfuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 24, 180, -1));

        BtConsCpf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/images_1.jpg"))); // NOI18N
        BtConsCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtConsCpfActionPerformed(evt);
            }
        });
        jPanel2.add(BtConsCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("CPF:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nome:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 84, -1, -1));
        jPanel2.add(TxNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 88, 210, -1));

        BtConsNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/images_1.jpg"))); // NOI18N
        BtConsNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtConsNomeActionPerformed(evt);
            }
        });
        jPanel2.add(BtConsNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Telefone:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        try {
            TxTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(TxTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 88, 200, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Usuário:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 147, -1, -1));
        jPanel2.add(TxUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 151, 230, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Senha:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, -1));
        jPanel2.add(TxSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 151, 200, -1));

        BtCadastro.setBackground(new java.awt.Color(0, 255, 0));
        BtCadastro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Gnome-Media-Floppy-32.png"))); // NOI18N
        BtCadastro.setText("CADASTRAR");
        BtCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCadastroActionPerformed(evt);
            }
        });
        jPanel2.add(BtCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 229, -1, 50));

        BtEditar.setBackground(new java.awt.Color(255, 255, 0));
        BtEditar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Gnome-Edit-Clear-32.png"))); // NOI18N
        BtEditar.setText("EDITAR");
        BtEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEditarActionPerformed(evt);
            }
        });
        jPanel2.add(BtEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, -1, 50));

        BtCancelar.setBackground(new java.awt.Color(255, 0, 51));
        BtCancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Gnome-Edit-Delete-32.png"))); // NOI18N
        BtCancelar.setText("CANCELAR");
        BtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(BtCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 229, -1, 50));

        try {
            TxCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(TxCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 130, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 117, 668, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCadastroActionPerformed
       
        GuardaDados();
        daofu.insertDados(funcionario);
        LimpaDados();
        
    }//GEN-LAST:event_BtCadastroActionPerformed

    private void BtEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEditarActionPerformed
        funcionario.setIdFuncionario(Integer.parseInt(TxIdfuncionario.getText()));
        GuardaDados();
        daofu.editDados(funcionario);
        LimpaDados();
        
    }//GEN-LAST:event_BtEditarActionPerformed

    private void BtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCancelarActionPerformed
        
        LimpaDados();
        
    }//GEN-LAST:event_BtCancelarActionPerformed

    private void BtConsNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtConsNomeActionPerformed
        
        funcionario.setNome(TxNome.getText());
        daofu.buscanome(funcionario);
        Pesquisa();
        
    }//GEN-LAST:event_BtConsNomeActionPerformed

    private void BtConsCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtConsCpfActionPerformed
        
        funcionario.setCpf(TxCpf.getText());
        daofu.buscacpf(funcionario);
        Pesquisa();
    }//GEN-LAST:event_BtConsCpfActionPerformed

    private void TxIdfuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxIdfuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxIdfuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(FrFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BtCadastro;
    private javax.swing.JButton BtCancelar;
    private javax.swing.JButton BtConsCpf;
    private javax.swing.JButton BtConsNome;
    private javax.swing.JButton BtEditar;
    private javax.swing.JFormattedTextField TxCpf;
    private javax.swing.JTextField TxIdfuncionario;
    private javax.swing.JTextField TxNome;
    private javax.swing.JTextField TxSenha;
    private javax.swing.JFormattedTextField TxTelefone;
    private javax.swing.JTextField TxUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

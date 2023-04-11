/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import classe.Cliente;
import dao.ClienteDao;

/**
 *
 * @author 62127512022.2
 */
public class FrCliente extends javax.swing.JFrame {

   
    Cliente cliente = new Cliente();
    ClienteDao daocli = new ClienteDao();
    
    
    
    public FrCliente() {
        initComponents();
        setLocationRelativeTo(null);
    }

   
    private void PassaDados(){
        
       // cliente.setIdcliente(Integer.parseInt(TxId.getText()));
        cliente.setNome(TxNome.getText());
        cliente.setTelefone(TxTelefone.getText());
        cliente.setEmail(TxEmail.getText()); 
        cliente.setStatus("A");
        
    }
    
    private void MostraDados(){
        TxId.setText(String.valueOf(cliente.getIdcliente()));
        TxNome.setText(cliente.getNome());
        TxTelefone.setText(cliente.getTelefone());
        TxEmail.setText(cliente.getEmail());     
        
    }
    
    private void Limpar(){
        TxId.setText(null);
        TxNome.setText(null);
        TxTelefone.setText(null);
        TxEmail.setText(null);     
    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxId = new javax.swing.JTextField();
        TxNome = new javax.swing.JTextField();
        TxEmail = new javax.swing.JTextField();
        TxTelefone = new javax.swing.JFormattedTextField();
        BtCancelar = new javax.swing.JButton();
        BtSalvar = new javax.swing.JButton();
        BtConsCod = new javax.swing.JButton();
        BtConsNome = new javax.swing.JButton();
        BtEditar = new javax.swing.JButton();
        BtExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(jLabel1)
                .addContainerGap(412, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel2.setText("Código do Cliente");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 19, -1, -1));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel3.setText("Nome");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 19, -1, -1));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel4.setText("Telefone");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 78, -1, -1));

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel5.setText("E-mail");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 78, -1, -1));

        TxId.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        TxId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxIdActionPerformed(evt);
            }
        });
        jPanel2.add(TxId, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 16, 123, -1));

        TxNome.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jPanel2.add(TxNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 16, 324, -1));

        TxEmail.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jPanel2.add(TxEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 75, 324, -1));

        try {
            TxTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TxTelefone.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jPanel2.add(TxTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 75, 199, -1));

        BtCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Gnome-Edit-Clear-32.png"))); // NOI18N
        BtCancelar.setText("Cancelar");
        BtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(BtCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 147, -1, -1));

        BtSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Gnome-Media-Floppy-32.png"))); // NOI18N
        BtSalvar.setText("Salvar");
        BtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(BtSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 147, -1, -1));

        BtConsCod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/images_1.jpg"))); // NOI18N
        BtConsCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtConsCodActionPerformed(evt);
            }
        });
        jPanel2.add(BtConsCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 18, 35, -1));

        BtConsNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/images_1.jpg"))); // NOI18N
        BtConsNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtConsNomeActionPerformed(evt);
            }
        });
        jPanel2.add(BtConsNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(799, 18, 35, -1));

        BtEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Gnome-Accessories-Text-Editor-32.png"))); // NOI18N
        BtEditar.setText("Atualizar Cliente");
        BtEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEditarActionPerformed(evt);
            }
        });
        jPanel2.add(BtEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 147, -1, -1));

        BtExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Gnome-Edit-Delete-32.png"))); // NOI18N
        BtExcluir.setText("Inativar Cliente");
        BtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtExcluirActionPerformed(evt);
            }
        });
        jPanel2.add(BtExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 147, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalvarActionPerformed
       PassaDados();
       daocli.insert(cliente);
       Limpar();
       
    }//GEN-LAST:event_BtSalvarActionPerformed

    private void BtEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEditarActionPerformed
       cliente.setIdcliente(Integer.parseInt(TxId.getText()));
       PassaDados();
       daocli.edit(cliente);
       Limpar();
       
    }//GEN-LAST:event_BtEditarActionPerformed

    private void BtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCancelarActionPerformed
        Limpar();
    }//GEN-LAST:event_BtCancelarActionPerformed

    private void BtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtExcluirActionPerformed
        cliente.setStatus("I");
        daocli.inativo(cliente);
        Limpar();
        
    }//GEN-LAST:event_BtExcluirActionPerformed

    private void BtConsCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtConsCodActionPerformed
        cliente.setIdcliente(Integer.parseInt(TxId.getText()));
        daocli.buscaid(cliente);
        MostraDados();
    }//GEN-LAST:event_BtConsCodActionPerformed

    private void BtConsNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtConsNomeActionPerformed
        cliente.setNome(TxNome.getText());
        daocli.buscanome(cliente);
        MostraDados();
    }//GEN-LAST:event_BtConsNomeActionPerformed

    private void TxIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxIdActionPerformed

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
            java.util.logging.Logger.getLogger(FrCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCancelar;
    private javax.swing.JButton BtConsCod;
    private javax.swing.JButton BtConsNome;
    private javax.swing.JButton BtEditar;
    private javax.swing.JButton BtExcluir;
    private javax.swing.JButton BtSalvar;
    private javax.swing.JTextField TxEmail;
    private javax.swing.JTextField TxId;
    private javax.swing.JTextField TxNome;
    private javax.swing.JFormattedTextField TxTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

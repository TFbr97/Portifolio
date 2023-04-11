
package Interfaces;

//import util.ModalFrameUtil;


public class FrMenu extends javax.swing.JFrame {

   
    //FrCliente frcliente = null;
    
    
    
    public FrMenu() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mCadastro = new javax.swing.JMenu();
        CadCliente = new javax.swing.JMenuItem();
        CadFuncionario = new javax.swing.JMenuItem();
        CadProduto = new javax.swing.JMenuItem();
        CadPedido = new javax.swing.JMenuItem();
        mRelatorios = new javax.swing.JMenu();
        RelCliente = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mAjuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 893, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
        );

        mCadastro.setText("Cadastros");

        CadCliente.setText("Cliente");
        CadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadClienteActionPerformed(evt);
            }
        });
        mCadastro.add(CadCliente);

        CadFuncionario.setText("Funcionário");
        CadFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadFuncionarioActionPerformed(evt);
            }
        });
        mCadastro.add(CadFuncionario);

        CadProduto.setText("Produtos");
        mCadastro.add(CadProduto);

        CadPedido.setText("Pedido");
        mCadastro.add(CadPedido);

        jMenuBar1.add(mCadastro);

        mRelatorios.setText("Relatórios");

        RelCliente.setText("Relatório Clientes");
        RelCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelClienteActionPerformed(evt);
            }
        });
        mRelatorios.add(RelCliente);

        jMenuItem1.setText("Relatório Produtos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mRelatorios.add(jMenuItem1);

        jMenuBar1.add(mRelatorios);

        mAjuda.setText("Ajuda");
        jMenuBar1.add(mAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void CadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadClienteActionPerformed
        
          new FrCliente().setVisible(true);
        
        
    }//GEN-LAST:event_CadClienteActionPerformed

    private void CadFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadFuncionarioActionPerformed
        
        new FrFuncionario().setVisible(true);
        
    }//GEN-LAST:event_CadFuncionarioActionPerformed

    private void RelClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelClienteActionPerformed
       
         new RelClientes().setVisible(true);
        
    }//GEN-LAST:event_RelClienteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        new RelProdutos().setVisible(true);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

  
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
            java.util.logging.Logger.getLogger(FrMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CadCliente;
    private javax.swing.JMenuItem CadFuncionario;
    private javax.swing.JMenuItem CadPedido;
    private javax.swing.JMenuItem CadProduto;
    private javax.swing.JMenuItem RelCliente;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mAjuda;
    private javax.swing.JMenu mCadastro;
    private javax.swing.JMenu mRelatorios;
    // End of variables declaration//GEN-END:variables
}

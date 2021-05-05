
package Classes;

public class Tela_Menu extends javax.swing.JFrame {

    public Tela_Menu() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemCadastrar = new javax.swing.JMenuItem();
        jMenuItemLocacao = new javax.swing.JMenuItem();
        jMenuItemDevolucao = new javax.swing.JMenuItem();
        jMenuItemRelatorio = new javax.swing.JMenuItem();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("CONTROLE DE LOCAÇÃO");

        jMenuItemCadastrar.setText("CADASTRAR DADOS DOS IMÓVEIS");
        jMenuItemCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemCadastrar);

        jMenuItemLocacao.setText("REALIZAR LOCAÇÃO DO IMÓVEL");
        jMenuItemLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLocacaoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemLocacao);

        jMenuItemDevolucao.setText("DEVOLUÇÃO IMÓVEL");
        jMenuItemDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDevolucaoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemDevolucao);

        jMenuItemRelatorio.setText("GERAR RELATÓRIO DOS IMÓVEIS DISPONÍVEIS E ALUGADOS");
        jMenuItemRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelatorioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemRelatorio);

        jMenuItemSair.setText("SAIR");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("SAIR");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarActionPerformed
        dispose();
        Tela_Cadastrar x = new Tela_Cadastrar();
        x.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastrarActionPerformed

    private void jMenuItemLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLocacaoActionPerformed
        dispose();
        Tela_Locacao x = new Tela_Locacao();
        x.setVisible(true);
    }//GEN-LAST:event_jMenuItemLocacaoActionPerformed

    private void jMenuItemDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDevolucaoActionPerformed
        dispose();
        Tela_Devolucao x = new Tela_Devolucao();
        x.setVisible(true);
    }//GEN-LAST:event_jMenuItemDevolucaoActionPerformed

    private void jMenuItemRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelatorioActionPerformed
        dispose();
        Tela_Relatorio x = new Tela_Relatorio();
        x.setVisible(true);
    }//GEN-LAST:event_jMenuItemRelatorioActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu2MouseClicked

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
            java.util.logging.Logger.getLogger(Tela_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemCadastrar;
    private javax.swing.JMenuItem jMenuItemDevolucao;
    private javax.swing.JMenuItem jMenuItemLocacao;
    private javax.swing.JMenuItem jMenuItemRelatorio;
    private javax.swing.JMenuItem jMenuItemSair;
    // End of variables declaration//GEN-END:variables
}

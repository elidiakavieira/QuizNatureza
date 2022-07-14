package Forms;
import jDialogs.*;
public class Quiz extends javax.swing.JFrame 
 {
    public Quiz() 
    {
        initComponents();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuJogar = new javax.swing.JMenu();
        jMenuItemCriancas = new javax.swing.JMenuItem();
        jMenuItemJovens = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();
        jMenuItemJogo = new javax.swing.JMenuItem();
        jMenuItemSobre = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(19, 98, 43));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Sem título.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 20, 1330, 720);

        jMenuBar1.setBackground(new java.awt.Color(119, 143, 193));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 98, 43)));
        jMenuBar1.setForeground(new java.awt.Color(240, 240, 240));
        jMenuBar1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N

        jMenuJogar.setText("Jogar");

        jMenuItemCriancas.setText("Crianças");
        jMenuItemCriancas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCriancasActionPerformed(evt);
            }
        });
        jMenuJogar.add(jMenuItemCriancas);

        jMenuItemJovens.setText("Jovens");
        jMenuItemJovens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemJovensActionPerformed(evt);
            }
        });
        jMenuJogar.add(jMenuItemJovens);

        jMenuBar1.add(jMenuJogar);

        jMenuSobre.setText("Sobre");

        jMenuItemJogo.setText("Jogo");
        jMenuItemJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemJogoActionPerformed(evt);
            }
        });
        jMenuSobre.add(jMenuItemJogo);

        jMenuItemSobre.setText("Sobre");
        jMenuItemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSobreActionPerformed(evt);
            }
        });
        jMenuSobre.add(jMenuItemSobre);

        jMenuBar1.add(jMenuSobre);

        jMenuSair.setText("Sair");

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed

        System.exit(0);
        
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSobreActionPerformed

        Sobre sob = new Sobre(this ,true);
        sob.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemSobreActionPerformed

    private void jMenuItemCriancasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCriancasActionPerformed

        Criancas cri = new Criancas (this,true);
        cri.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemCriancasActionPerformed

    private void jMenuItemJovensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemJovensActionPerformed

        Jovens jov = new Jovens (this,true);
        jov.setVisible(true);

    }//GEN-LAST:event_jMenuItemJovensActionPerformed

    private void jMenuItemJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemJogoActionPerformed

        Jogo jog = new Jogo (this,true);
        jog.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemJogoActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemCriancas;
    private javax.swing.JMenuItem jMenuItemJogo;
    private javax.swing.JMenuItem jMenuItemJovens;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSobre;
    private javax.swing.JMenu jMenuJogar;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenu jMenuSobre;
    // End of variables declaration//GEN-END:variables
}

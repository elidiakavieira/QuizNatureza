package perguntasJovens;
import java.awt.Color;
import javax.swing.JOptionPane;
import respostasJovens.*;

public class perguntaQuinzej extends javax.swing.JDialog {

    public perguntaQuinzej(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        getContentPane().setBackground(new Color(19,98,43));
        setSize(810,450);
        setResizable(false);
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Alternativas = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rdA = new javax.swing.JRadioButton();
        rdB = new javax.swing.JRadioButton();
        rdC = new javax.swing.JRadioButton();
        rdD = new javax.swing.JRadioButton();
        btnResp = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pergunta 15");

        jLabel1.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(119, 143, 193));
        jLabel1.setText("Pergunta 15");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(119, 143, 193));
        jLabel2.setText("Qual é a fonte de energia mais barata?");

        rdA.setBackground(new java.awt.Color(19, 98, 43));
        Alternativas.add(rdA);
        rdA.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        rdA.setForeground(new java.awt.Color(119, 143, 193));
        rdA.setText(" A) Madeira");

        rdB.setBackground(new java.awt.Color(19, 98, 43));
        Alternativas.add(rdB);
        rdB.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        rdB.setForeground(new java.awt.Color(119, 143, 193));
        rdB.setText(" B) Petróleo");

        rdC.setBackground(new java.awt.Color(19, 98, 43));
        Alternativas.add(rdC);
        rdC.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        rdC.setForeground(new java.awt.Color(119, 143, 193));
        rdC.setText(" C) Argila");

        rdD.setBackground(new java.awt.Color(19, 98, 43));
        Alternativas.add(rdD);
        rdD.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        rdD.setForeground(new java.awt.Color(119, 143, 193));
        rdD.setText(" D) N.D.A.");

        btnResp.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnResp.setForeground(new java.awt.Color(19, 98, 43));
        btnResp.setText("Responder");
        btnResp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRespActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(19, 98, 43));
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(rdA))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(rdB))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(rdC))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(rdD))
            .addGroup(layout.createSequentialGroup()
                .addGap(536, 536, 536)
                .addComponent(btnResp, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addGap(53, 53, 53)
                .addComponent(rdA)
                .addGap(18, 18, 18)
                .addComponent(rdB)
                .addGap(18, 18, 18)
                .addComponent(rdC)
                .addGap(18, 18, 18)
                .addComponent(rdD)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnResp)
                    .addComponent(jButton1)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.dispose();//System.exit(0);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRespActionPerformed

        respQuinzej rQuinzej = new respQuinzej (null,true);
        if ((!rdA.isSelected()) && (!rdB.isSelected()) && (!rdC.isSelected()) && (!rdD.isSelected()))
        {
        JOptionPane.showMessageDialog(null,"Você não selecionou uma resposta");
        }        
        else if(rdB.isSelected())
        {
        rQuinzej.setVisible(true);    
        this.dispose();
        }
        else
        {
        JOptionPane.showMessageDialog(null,"Você errou tente novamente");
        }
        
        

    }//GEN-LAST:event_btnRespActionPerformed

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
            java.util.logging.Logger.getLogger(perguntaQuinzej.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(perguntaQuinzej.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(perguntaQuinzej.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(perguntaQuinzej.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                perguntaQuinzej dialog = new perguntaQuinzej(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Alternativas;
    private javax.swing.JButton btnResp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton rdA;
    private javax.swing.JRadioButton rdB;
    private javax.swing.JRadioButton rdC;
    private javax.swing.JRadioButton rdD;
    // End of variables declaration//GEN-END:variables
}

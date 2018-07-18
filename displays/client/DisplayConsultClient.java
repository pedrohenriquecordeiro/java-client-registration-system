/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package displays.client;

import DAO.TattooArtistDAO;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import model.Client;

/**
 *
 * @author pedro
 */
public class DisplayConsultClient extends javax.swing.JFrame {

    Client client = null;

    public DisplayConsultClient() {
        initComponents();
    }

    public DisplayConsultClient(Client client) {
        initComponents();
        this.client = client;
        jLabelName.setText(client.getName().substring(0, 1).toUpperCase() + client.getName().substring(1));
        jLabelTel.setText(client.getTel());
        try {
            jLabelResposible.setText(TattooArtistDAO.selectOne(client.getTattoo_artist()));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DisplayConsultClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DisplayConsultClient.class.getName()).log(Level.SEVERE, null, ex);
        }

        jLabelAge.setText(Integer.toString(client.getAge()));
        jLabelDateSession.setText(client.getNext_session());

        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(client.getLocal_picture()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(jLabelPicture.getWidth(), jLabelPicture.getHeight(),Image.SCALE_SMOOTH);
        jLabelPicture.setIcon(new ImageIcon(dimg));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabelPicture = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabelAge = new javax.swing.JLabel();
        jLabelTel = new javax.swing.JLabel();
        jLabelDateSession = new javax.swing.JLabel();
        jLabelResposible = new javax.swing.JLabel();
        jButtonDone = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Age:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Tel:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Session Date:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Tattooist:");

        jLabelName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(0, 153, 51));
        jLabelName.setText("jLabel7");

        jLabelAge.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelAge.setForeground(new java.awt.Color(0, 153, 51));
        jLabelAge.setText("jLabel8");

        jLabelTel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelTel.setForeground(new java.awt.Color(0, 153, 51));
        jLabelTel.setText("jLabel9");

        jLabelDateSession.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelDateSession.setForeground(new java.awt.Color(0, 153, 51));
        jLabelDateSession.setText("jLabel10");

        jLabelResposible.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelResposible.setForeground(new java.awt.Color(0, 153, 51));
        jLabelResposible.setText("jLabel11");

        jButtonDone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/done.png"))); // NOI18N
        jButtonDone.setToolTipText("Done!");
        jButtonDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelResposible)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 253, Short.MAX_VALUE)
                        .addComponent(jButtonDone))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelName)
                            .addComponent(jLabelDateSession)
                            .addComponent(jLabelAge)
                            .addComponent(jLabelTel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabelName))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabelAge))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabelTel))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabelDateSession)))
                    .addComponent(jLabelPicture, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabelResposible))
                    .addComponent(jButtonDone))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDoneActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonDoneActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        /*jLabelName.setText(client.getName().substring(0, 1).toUpperCase() + client.getName().substring(1));
        jLabelTel.setText(client.getTel());
        try {
            jLabelResposible.setText(TattooArtistDAO.selectOne(client.getTattoo_artist()));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DisplayConsultClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DisplayConsultClient.class.getName()).log(Level.SEVERE, null, ex);
        }

        jLabelAge.setText(Integer.toString(client.getAge()));
        jLabelDateSession.setText(client.getNext_session());

        try {
            BufferedImage img = ImageIO.read(new File(client.getLocal_picture()));
            Image dimg = img.getScaledInstance(jLabelPicture.getWidth(), jLabelPicture.getHeight(),Image.SCALE_SMOOTH);
            jLabelPicture.setIcon(new ImageIcon(dimg));
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(DisplayConsultClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayConsultClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayConsultClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayConsultClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayConsultClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonDone;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelAge;
    private javax.swing.JLabel jLabelDateSession;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPicture;
    private javax.swing.JLabel jLabelResposible;
    private javax.swing.JLabel jLabelTel;
    // End of variables declaration//GEN-END:variables
}

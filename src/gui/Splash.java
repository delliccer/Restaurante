package gui;

import gui.Cargar;

public final class Splash extends javax.swing.JFrame {

    /**
     * Creates new form Splash
     */
    Cargar hilo;

    public Splash() {
        initComponents();
        iniciar();

    }

    public void iniciar() {
        setLocationRelativeTo(null);
        hilo = new Cargar(getProgress());
        hilo.start();
        hilo = null;
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Credits_ = new javax.swing.JLabel();
        jLabel_Credits_1 = new javax.swing.JLabel();
        jProgressBar_ = new javax.swing.JProgressBar();
        jLabel_CR_ = new javax.swing.JLabel();
        jLabel_imagen_ = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 500));
        setMinimumSize(new java.awt.Dimension(900, 500));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Credits_.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel_Credits_.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Credits_.setText("Power By:");
        getContentPane().add(jLabel_Credits_, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, -1, 30));

        jLabel_Credits_1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Credits_1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Credits_1.setText("©");
        getContentPane().add(jLabel_Credits_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 450, 30, 30));

        jProgressBar_.setMinimumSize(new java.awt.Dimension(888, 16));
        jProgressBar_.setPreferredSize(new java.awt.Dimension(888, 16));
        jProgressBar_.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jProgressBar_StateChanged(evt);
            }
        });
        getContentPane().add(jProgressBar_, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 880, -1));

        jLabel_CR_.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel_CR_.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_CR_.setText("Marco Méndez / Freddy Camposeco");
        getContentPane().add(jLabel_CR_, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, -1, 30));

        jLabel_imagen_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/core/resources/Restaurante-Splash.png"))); // NOI18N
        getContentPane().add(jLabel_imagen_, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jProgressBar_StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jProgressBar_StateChanged
        if (jProgressBar_.getValue() == 100) {

            gui.login.vista.login vp = new gui.login.vista.login();
            vp.setVisible(true);

            this.dispose();
        }
    }//GEN-LAST:event_jProgressBar_StateChanged

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
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Splash().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_CR_;
    private javax.swing.JLabel jLabel_Credits_;
    private javax.swing.JLabel jLabel_Credits_1;
    private javax.swing.JLabel jLabel_imagen_;
    private javax.swing.JProgressBar jProgressBar_;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the progress
     */
    public javax.swing.JProgressBar getProgress() {
        return jProgressBar_;
    }

}

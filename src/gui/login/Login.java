/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.login;

import core.utils.login.Hash;
import javax.swing.JOptionPane;
import core.utils.login.SqlUsuarios;
import core.utils.login.Usuarios;
import gui.MenuPrincipal;
import java.awt.event.KeyEvent;

/**
 *
 * @author Marko
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        txtUsuario.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel_LogoUser_ = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        btnEntrar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(java.awt.Color.darkGray);
        jPanel2.setForeground(java.awt.Color.white);

        jLabel_LogoUser_.setBackground(java.awt.Color.darkGray);
        jLabel_LogoUser_.setForeground(java.awt.Color.white);
        jLabel_LogoUser_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/core/resources/icons/userGx300.png"))); // NOI18N

        jPanel1.setBackground(java.awt.Color.darkGray);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, 28));

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtUsuario.setToolTipText("Usuario");
        txtUsuario.setCaretColor(new java.awt.Color(102, 0, 0));
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 182, 28));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 28));

        btnEntrar.setBackground(new java.awt.Color(102, 0, 0));
        btnEntrar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 98, 28));

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtPassword.setToolTipText("Contraseña");
        txtPassword.setCaretColor(new java.awt.Color(102, 0, 0));
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 182, 28));

        btnEntrar1.setBackground(new java.awt.Color(102, 0, 0));
        btnEntrar1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnEntrar1.setText("Cancelar");
        btnEntrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 98, 28));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel_LogoUser_)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_LogoUser_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed

        SqlUsuarios modSql = new SqlUsuarios();
        Usuarios mod = new Usuarios();

        String pass = new String(txtPassword.getPassword());

        if (!txtUsuario.getText().equals("") && !pass.equals("")) {

            String nuevoPass = Hash.sha1(pass);

            mod.setUsuario(txtUsuario.getText());
            mod.setPassword(nuevoPass);

            if (modSql.login(mod)) {
                this.dispose();

                if (mod.getIdTipo() == 1) {
                    gui.MenuPrincipal menu = new gui.MenuPrincipal();
                    menu.setVisible(true);

                    menu.lblUser.setText(mod.getNombre());
                    MenuPrincipal.lblCargo.setText("Administrador");
                } else {
                    gui.MenuPrincipal menu = new gui.MenuPrincipal();
                    menu.setVisible(true);

                    menu.lblUser.setText(mod.getNombre());
                    MenuPrincipal.lblCargo.setText("Usuario");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Datos incorrectos");
                limpiar();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar sus datos");
        }

    }//GEN-LAST:event_btnEntrarActionPerformed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        char teclapresionada = evt.getKeyChar();
        if (teclapresionada == KeyEvent.VK_ENTER) {
            
        SqlUsuarios modSql = new SqlUsuarios();
        Usuarios mod = new Usuarios();

        String pass = new String(txtPassword.getPassword());

        if (!txtUsuario.getText().equals("") && !pass.equals("")) {

            String nuevoPass = Hash.sha1(pass);

            mod.setUsuario(txtUsuario.getText());
            mod.setPassword(nuevoPass);

            if (modSql.login(mod)) {
                this.dispose();

                if (mod.getIdTipo() == 1) {
                    gui.MenuPrincipal menu = new gui.MenuPrincipal();
                    menu.setVisible(true);

                    menu.lblUser.setText(mod.getNombre());
                    menu.lblCargo.setText("Administrador");
                } else {
                    gui.MenuPrincipal menu = new gui.MenuPrincipal();
                    menu.setVisible(true);

                    menu.lblUser.setText(mod.getNombre());
                    menu.lblCargo.setText("Usuario");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Datos incorrectos");
                limpiar();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar sus datos");
        }
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void btnEntrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrar1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnEntrar1ActionPerformed

    private void limpiar() {
        txtUsuario.setText("");
        txtPassword.setText("");
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnEntrar;
    public javax.swing.JButton btnEntrar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_LogoUser_;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPasswordField txtPassword;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}

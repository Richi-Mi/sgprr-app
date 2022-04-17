
package ventanas;

import helpers.ValidarLogin;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * @author José Ricardo Mendoza Castañeda
 */

public class Login extends javax.swing.JFrame {

    private ValidarLogin val = new ValidarLogin();
    
    int xMouse, yMouse;
    
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        jlbl_nombre_empresa = new javax.swing.JLabel();
        btnClose = new javax.swing.JPanel();
        btnCloseText = new javax.swing.JLabel();
        icono = new javax.swing.JLabel();
        image_right = new javax.swing.JLabel();
        icono_usuario = new javax.swing.JLabel();
        texto_inicioSesion = new javax.swing.JLabel();
        txt_contraseña = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txt_usuario = new javax.swing.JLabel();
        input_correo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        header = new javax.swing.JPanel();
        input_password = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JPanel();
        loginBtnText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbl_nombre_empresa.setFont(new java.awt.Font("Gargi", 0, 48)); // NOI18N
        jlbl_nombre_empresa.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_nombre_empresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl_nombre_empresa.setText("SGPRR");
        backgroundPanel.add(jlbl_nombre_empresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 370, 90));

        btnClose.setBackground(new java.awt.Color(255, 255, 255));
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCloseMouseEntered(evt);
            }
        });

        btnCloseText.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCloseText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCloseText.setText("X");
        btnCloseText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseTextMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCloseTextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnCloseLayout = new javax.swing.GroupLayout(btnClose);
        btnClose.setLayout(btnCloseLayout);
        btnCloseLayout.setHorizontalGroup(
            btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnCloseLayout.createSequentialGroup()
                    .addComponent(btnCloseText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnCloseLayout.setVerticalGroup(
            btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
            .addGroup(btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnCloseLayout.createSequentialGroup()
                    .addComponent(btnCloseText, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        backgroundPanel.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, -1));

        icono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icon_planta.png"))); // NOI18N
        backgroundPanel.add(icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 380, 200));

        image_right.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/bacground_planta.jpg"))); // NOI18N
        backgroundPanel.add(image_right, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 380, 500));

        icono_usuario.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        icono_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/user_logo.png"))); // NOI18N
        backgroundPanel.add(icono_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 430, 120));

        texto_inicioSesion.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        texto_inicioSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texto_inicioSesion.setText("Iniciar Sesion");
        backgroundPanel.add(texto_inicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 220, -1));

        txt_contraseña.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_contraseña.setForeground(new java.awt.Color(51, 153, 0));
        txt_contraseña.setText("Contraseña");
        backgroundPanel.add(txt_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 120, -1));
        backgroundPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 350, 20));

        txt_usuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(51, 153, 0));
        txt_usuario.setText("Correo:");
        backgroundPanel.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 70, -1));

        input_correo.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        input_correo.setForeground(new java.awt.Color(153, 153, 153));
        input_correo.setText("Ingrese su correo de Usuario");
        input_correo.setBorder(null);
        input_correo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                input_correoMousePressed(evt);
            }
        });
        backgroundPanel.add(input_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 350, -1));
        backgroundPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 303, 350, 20));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        backgroundPanel.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 30));

        input_password.setForeground(new java.awt.Color(51, 51, 51));
        input_password.setBorder(null);
        input_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                input_passwordMousePressed(evt);
            }
        });
        backgroundPanel.add(input_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 350, 30));

        loginBtn.setBackground(new java.awt.Color(24, 101, 49));
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        loginBtnText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        loginBtnText.setForeground(new java.awt.Color(255, 255, 255));
        loginBtnText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBtnText.setLabelFor(loginBtn);
        loginBtnText.setText("Iniciar Sesion");
        loginBtnText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtnText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnTextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout loginBtnLayout = new javax.swing.GroupLayout(loginBtn);
        loginBtn.setLayout(loginBtnLayout);
        loginBtnLayout.setHorizontalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBtnText, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        loginBtnLayout.setVerticalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBtnText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        backgroundPanel.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 200, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation( x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void btnCloseTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseTextMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCloseTextMouseClicked

    private void btnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseEntered
        btnCloseText.setForeground(Color.red);
    }//GEN-LAST:event_btnCloseMouseEntered

    private void btnCloseTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseTextMouseExited
        btnCloseText.setForeground(Color.black);
    }//GEN-LAST:event_btnCloseTextMouseExited

    private void loginBtnTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTextMouseExited
        loginBtn.setBackground( new Color( 24, 101, 49) );
    }//GEN-LAST:event_loginBtnTextMouseExited

    private void loginBtnTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTextMouseEntered
        loginBtn.setBackground( new Color( 35, 120, 49) );
    }//GEN-LAST:event_loginBtnTextMouseEntered

    private void input_correoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input_correoMousePressed
        
        if( input_correo.getText().equals("Ingrese su correo de Usuario") || input_correo.getText().equals("") ) {
            input_correo.setText("");    
            input_correo.setForeground(Color.black);
        }
        if( String.valueOf(input_password.getPassword()).isEmpty() ) {
            input_password.setText("*****************");
            input_password.setForeground( Color.gray );
        }
    }//GEN-LAST:event_input_correoMousePressed

    private void input_passwordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input_passwordMousePressed
        if( input_correo.getText().isEmpty()) {
            input_correo.setText("Ingrese su correo de Usuario");    
            input_correo.setForeground(Color.gray);
        }
        if( String.valueOf(input_password.getPassword()).equals("*****************") ) {
            input_password.setText("");
            input_password.setForeground( Color.black );
        }
    }//GEN-LAST:event_input_passwordMousePressed

    private void loginBtnTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTextMouseClicked
        String correo = input_correo.getText();
        String password = input_password.getText();
        
        String[] result = val.validate( correo, password );
        
        switch( result[0] ) {
            case "ADMIN":
                MenuAdmin ventana = new MenuAdmin( result[1] );

                ventana.setVisible(true);
                this.setVisible(false);

                break;
            case "USER":
                // Problemas con esta interfaz, cambiala Capo
                MenuUser ventanaU = new MenuUser( result[1] );
                
                ventanaU.setVisible(true);
                this.setVisible(false);
                
                break;
            case "BadCon":
                
                JOptionPane.showMessageDialog(null, "Error a la hora de Iniciar Sesion \n Vuelva a Intentar", "ERROR", JOptionPane.OK_OPTION);
                
                break;
        }
    }//GEN-LAST:event_loginBtnTextMouseClicked

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JPanel btnClose;
    private javax.swing.JLabel btnCloseText;
    private javax.swing.JPanel header;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel icono_usuario;
    private javax.swing.JLabel image_right;
    private javax.swing.JTextField input_correo;
    private javax.swing.JPasswordField input_password;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jlbl_nombre_empresa;
    private javax.swing.JPanel loginBtn;
    private javax.swing.JLabel loginBtnText;
    private javax.swing.JLabel texto_inicioSesion;
    private javax.swing.JLabel txt_contraseña;
    private javax.swing.JLabel txt_usuario;
    // End of variables declaration//GEN-END:variables
}

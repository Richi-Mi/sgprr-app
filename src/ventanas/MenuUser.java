
package ventanas;

import modelos.Usuario;

/**
 * @author Mendoza Castañeda José Ricardo
 */

public class MenuUser extends javax.swing.JFrame {
    
    private Usuario user;
    private int id;
    
    public MenuUser( String id ) {
        initComponents();
        setLocationRelativeTo( null );
        this.id = Integer.parseInt(id);
        user = new Usuario( this.id );
        
        this.mostrarDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        lblIcon = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        lblActions = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblSueldo = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblCorreo = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lblID = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        lblType = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icon_planta.png"))); // NOI18N
        background.add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/bacground_planta.jpg"))); // NOI18N
        background.add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 380));

        lblPass.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        lblPass.setText("Contraseña:");
        background.add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        lblActions.setFont(new java.awt.Font("Ubuntu Light", 1, 22)); // NOI18N
        lblActions.setText("Acciones:");
        background.add(lblActions, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, -1, -1));
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 350, 10));

        lblSueldo.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        lblSueldo.setText("Sueldo: ");
        background.add(lblSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));
        background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 350, -1));

        lblCorreo.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        lblCorreo.setText("Correo:");
        background.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, -1));
        background.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 350, -1));

        lblID.setFont(new java.awt.Font("Chandas", 0, 18)); // NOI18N
        lblID.setText("1");
        background.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));

        lblNombre.setFont(new java.awt.Font("Ubuntu Light", 1, 19)); // NOI18N
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("Nombre Usuario");
        background.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 10, 330, -1));

        btnRegistrar.setText("Registrar Ventas");
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });
        background.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, -1, -1));

        lblType.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        lblType.setText("Tipo:");
        background.add(lblType, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, -1, -1));
        background.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 233, 350, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        // TERMINAR DESPUES DE LOS PRODUCTOS.
    }//GEN-LAST:event_btnRegistrarMouseClicked

    void mostrarDatos() {
        lblID.setText( user.getId() + "" );
        lblNombre.setText( "Nombre: " + user.getNombre() );
        lblCorreo.setText( "Correo: " + user.getCorreo() );
        lblPass.setText( "Contraseña: " + user.getPassword() );
        lblSueldo.setText( "Sueldo: " + user.getSueldo() + "" );
        lblType.setText( "Tipo: " + user.getTipo() );
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
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblActions;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblSueldo;
    private javax.swing.JLabel lblType;
    // End of variables declaration//GEN-END:variables
}

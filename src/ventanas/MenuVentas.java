/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSetImpl;
import com.mysql.jdbc.Statement;
import database.ConnectionToDB;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 * @author Mendoza Castañeda José Ricardo
 */
public class MenuVentas extends javax.swing.JFrame {
    private Vector<String[]> datosProductos = new Vector(10, 1);;
    
    private ConnectionToDB conexion = new ConnectionToDB();
    private Connection con;
    private Statement st;
    private ResultSetImpl res;
    
    private int idUser, idPr;
    
    public MenuVentas( int idUser ) {
        initComponents();
        setLocationRelativeTo( null );
        
        this.idUser = idUser;
        con = conexion.conectar();
        try {
            st  = (Statement) con.createStatement();
        } catch (SQLException ex) {
            System.out.println("ERROR. - " + ex);
        }
        this.obtenerDatosProductos();
        this.mostrarDatosCombo();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnReturn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblInfo1 = new javax.swing.JLabel();
        comboProducts = new javax.swing.JComboBox<>();
        lblIcon = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblInfo2 = new javax.swing.JLabel();
        lblInfo3 = new javax.swing.JLabel();
        lblInfo4 = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblCosto = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblInfo5 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        lblInfo6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrador de Ventas");
        setResizable(false);
        setSize(new java.awt.Dimension(800, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));

        lblTitle.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Registrador de Ventas");

        jSeparator1.setBackground(new java.awt.Color(153, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(102, 255, 102));

        btnReturn.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        btnReturn.setForeground(new java.awt.Color(255, 255, 255));
        btnReturn.setText("<");
        btnReturn.setContentAreaFilled(false);
        btnReturn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addContainerGap(274, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnReturn)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnReturn)
                .addGap(10, 10, 10)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 110));

        jPanel2.setBackground(new java.awt.Color(0, 51, 0));

        lblInfo1.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 18)); // NOI18N
        lblInfo1.setForeground(new java.awt.Color(255, 255, 255));
        lblInfo1.setText("Seleccione el Producto:");

        comboProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboProductsMouseClicked(evt);
            }
        });
        comboProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProductsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInfo1)
                    .addComponent(comboProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInfo1)
                .addGap(36, 36, 36)
                .addComponent(comboProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 440, 180));

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icon_planta.png"))); // NOI18N
        getContentPane().add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/bacground_planta.jpg"))); // NOI18N
        getContentPane().add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 440, 410));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lblID.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
        lblID.setText("1");

        lblNombre.setFont(lblID.getFont());
        lblNombre.setText("(Nombre Producto)");

        lblInfo2.setFont(new java.awt.Font("DejaVu Sans", 1, 15)); // NOI18N
        lblInfo2.setText("Costo del Producto:");

        lblInfo3.setFont(new java.awt.Font("DejaVu Sans", 1, 15)); // NOI18N
        lblInfo3.setText("Marca del Producto:");

        lblInfo4.setFont(new java.awt.Font("DejaVu Sans", 1, 15)); // NOI18N
        lblInfo4.setText("Cantidad Disponible:");

        lblMarca.setFont(new java.awt.Font("DejaVu Sans", 0, 15)); // NOI18N
        lblMarca.setText("( Marca )");

        lblCosto.setFont(new java.awt.Font("DejaVu Sans", 0, 15)); // NOI18N
        lblCosto.setText("(Costo)");

        lblCantidad.setFont(new java.awt.Font("DejaVu Sans", 0, 15)); // NOI18N
        lblCantidad.setText("( Cantidad )");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblNombre)
                        .addGap(97, 97, 97)
                        .addComponent(lblID))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblInfo2)
                                .addGap(18, 18, 18)
                                .addComponent(lblCosto))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblInfo3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblMarca))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblInfo4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblCantidad)))
                        .addGap(0, 84, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(lblNombre))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInfo2)
                    .addComponent(lblCosto))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInfo3)
                    .addComponent(lblMarca))
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInfo4)
                    .addComponent(lblCantidad))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 360, 250));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        lblInfo5.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
        lblInfo5.setForeground(new java.awt.Color(255, 255, 255));
        lblInfo5.setText("Registra Ventas");

        txtCantidad.setBackground(new java.awt.Color(51, 51, 51));
        txtCantidad.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidad.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lblInfo6.setForeground(new java.awt.Color(255, 255, 255));
        lblInfo6.setText("Cantidad Vendida:");

        btnRegistro.setBackground(new java.awt.Color(0, 153, 0));
        btnRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistro.setText("Registrar Venta");
        btnRegistro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(lblInfo5)
                        .addGap(0, 109, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCantidad)
                            .addComponent(jSeparator2)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblInfo6)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInfo5)
                .addGap(18, 18, 18)
                .addComponent(lblInfo6)
                .addGap(13, 13, 13)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 360, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        try {
            MenuUser newVentana = new MenuUser( this.idUser  + "");
            newVentana.setVisible( true );

            this.con.close();

            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(TablaEmpleados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnReturnActionPerformed

    private void comboProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboProductsMouseClicked
// VACIO
    }//GEN-LAST:event_comboProductsMouseClicked

    private void comboProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProductsActionPerformed
        this.idPr = comboProducts.getSelectedIndex();
        
        String[] datosThis = datosProductos.elementAt( this.idPr );
        
        lblID.setText( datosThis[0] );
        lblNombre.setText( datosThis[1] );
        lblCosto.setText( datosThis[2] );
        lblCantidad.setText( datosThis[3] );
        lblMarca.setText( datosThis[4] );
    }//GEN-LAST:event_comboProductsActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        try {
            int cantidadVendida = Integer.parseInt( txtCantidad.getText() );
            int cantidadActual  = Integer.parseInt( lblCantidad.getText() );
            int cantidadNueva = cantidadActual - cantidadVendida;
            int id = Integer.parseInt( lblID.getText() );
            
            if( cantidadNueva > 0 ) {
                String query = "update productos set cantidad=" + cantidadNueva + " where id=" + id + ";";
                st.executeUpdate( query );
                
                this.obtenerDatosProductos();
                
                lblCantidad.setText( cantidadNueva + "");
                
                JOptionPane.showMessageDialog(null, "Cantidad Actualizada Correctamente", "Cantidad Actualizada", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "ERROR. - No se pudo actualizar Producto por que no coinciden los datos de venta", "ERROR", JOptionPane.OK_OPTION);
            }
            
            
        } catch (SQLException ex) {
            System.out.println("ERROR. - " + ex);
        }
    }//GEN-LAST:event_btnRegistroActionPerformed

    void obtenerDatosProductos() {
        try {
            datosProductos.removeAllElements();
            String query = "select * from productos;";
            res = (ResultSetImpl) st.executeQuery( query );
            
            while( res.next() ) {
                String[] datos = new String[ 5 ];
                
                datos[0] = Integer.toString( res.getInt("id") );
                datos[1] = res.getString("nombre");
                datos[2] = Double.toString( res.getDouble("costo") );
                datos[3] = Integer.toString( res.getInt("cantidad") );
                datos[4] = res.getString("marca");
                
                datosProductos.addElement( datos );
            }
        } catch (SQLException ex) {
            System.out.println("ERROR. - " + ex );
        }
    }
    
    void mostrarDatosCombo() {
        // String[] datosThis = datosProductos.elementAt(1);
        // System.out.println( datosThis[1] );
        
        for( int i = 0; i < datosProductos.size(); i++ ) {
            String[] thisProduct = datosProductos.elementAt(i);
            
            comboProducts.addItem( thisProduct[1] );
        }
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
            java.util.logging.Logger.getLogger(MenuVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnReturn;
    private javax.swing.JComboBox<String> comboProducts;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblInfo1;
    private javax.swing.JLabel lblInfo2;
    private javax.swing.JLabel lblInfo3;
    private javax.swing.JLabel lblInfo4;
    private javax.swing.JLabel lblInfo5;
    private javax.swing.JLabel lblInfo6;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
}

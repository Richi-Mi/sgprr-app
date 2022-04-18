
package ventanas;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSetImpl;
import com.mysql.jdbc.Statement;
import database.ConnectionToDB;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

/**
 * @author Mendoza Castañeda José Ricardo
 * 
 * Modulo para obtener la información relevante de todos los empleados.
 */
public class TablaEmpleados extends javax.swing.JFrame {

    private String idU;
    
    private DefaultTableModel model;
    
    private ConnectionToDB conexion = new ConnectionToDB();
    private Connection con;
    private Statement st;
    private ResultSetImpl res;
    
    public TablaEmpleados( String id ) {
        initComponents();
        setLocationRelativeTo(null);
        
        this.model = (DefaultTableModel) tableUsers.getModel();
        this.con = conexion.conectar();
        
        this.idU = id;
        
        this.consultarUsuarios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableUsers = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnReturn = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre:", "Correo:", "Sueldo"
            }
        ));
        jScrollPane1.setViewportView(tableUsers);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar Empleado");
        btnEliminar.setBorderPainted(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 190, -1));

        btnAgregar.setBackground(new java.awt.Color(0, 102, 0));
        btnAgregar.setFont(new java.awt.Font("Purisa", 0, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar Empleado");
        btnAgregar.setBorderPainted(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 60, 190, -1));

        btnActualizar.setFont(new java.awt.Font("Purisa", 0, 14)); // NOI18N
        btnActualizar.setText("Actualizar Empleado");
        btnActualizar.setBorderPainted(false);
        btnActualizar.setEnabled(false);
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 190, -1));

        jLabel2.setFont(new java.awt.Font("Purisa", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tabla de Empleados");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel1.setBackground(new java.awt.Color(51, 153, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/banner_plant.jpg"))); // NOI18N
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            AgregarUsuario newVentana = new AgregarUsuario( this.idU );
            this.con.close();
            
            newVentana.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(TablaEmpleados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String idCadena = JOptionPane.showInputDialog(null, "Escribe el ID del usuario que desea eliminiar", "Borrar Usuario", JOptionPane.QUESTION_MESSAGE);
        try {
            int id = Integer.parseInt( idCadena );
            String query = "delete from usuarios where id=" + id + ";";
            
            st = (Statement) con.createStatement();
            st.executeUpdate( query );
            
            System.out.println(" Usuario " + id + " eliminado.");
            JOptionPane.showMessageDialog( null, "Usuario Eliminado Correctamente" );
            
            // this.limpiarTabla();
            
            this.consultarUsuarios();
            
        } catch (Exception e ) {
            System.out.println( e );
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error y no podemos eliminar el usuario", "ERROR", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        try {
            MenuAdmin newVentana = new MenuAdmin( this.idU );
            newVentana.setVisible( true );
            
            this.con.close();
            
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(TablaEmpleados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnReturnActionPerformed
    
    void limpiarTabla() {
        int i;
        for( i = 0; i <= tableUsers.getRowCount(); i++ ) {
            model.removeRow(i);
        }
        
    }
    
    void consultarUsuarios() {
        String sql = "select * from usuarios;";
        
        try {
            model = (DefaultTableModel) tableUsers.getModel();
            st = (Statement) con.createStatement();
            res = (ResultSetImpl) st.executeQuery(sql);
            
            Object[] cliente = new Object[4];
            
            while( res.next() ) {
                
                cliente [0] = res.getInt("id");
                cliente [1] = res.getString("nombre");
                cliente [2] = res.getString("correo");
                cliente [3] = res.getInt("sueldo");
                
                model.addRow(cliente);
            }
            tableUsers.setModel(model);
        } catch ( Exception e ) {
            System.out.println(e);
            System.out.println("ERROR PA");
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
            java.util.logging.Logger.getLogger(TablaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableUsers;
    // End of variables declaration//GEN-END:variables
}


package ventanas;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSetImpl;
import com.mysql.jdbc.Statement;
import database.ConnectionToDB;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Mendoza Castañeda José Ricardo
 * 
 * Menu de Productos, con capacidad de eliminar, agregar o actualizar Producto
 */
public class MenuProductos extends javax.swing.JFrame {
    
    private ConnectionToDB conexion;
    private Connection con;
    private Statement st;
    private ResultSetImpl res;
    
    private String idU;
    
    public MenuProductos( String id ) {
        initComponents();
        setLocationRelativeTo(null);
        
        this.idU = id;
        this.conexion = new ConnectionToDB();
        this.con = conexion.conectar();
        try {
            this.st = (Statement) con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(MenuProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.mostrarProductos();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnReturn = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblNombreForm = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblPticeForm = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lblMarcaForm = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        lblFechaForm = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        lblCantidadForm = new javax.swing.JLabel();
        lblFechaEdit = new javax.swing.JLabel();
        lblIDForm = new javax.swing.JLabel();
        lblIDEdit = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnFormA = new javax.swing.JPanel();
        lblBtnForm = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        btnAct = new javax.swing.JPanel();
        btnActlbl = new javax.swing.JLabel();
        btnEl = new javax.swing.JPanel();
        btnEllbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu de Productos");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1050, 700));
        setPreferredSize(new java.awt.Dimension(1050, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1050, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(0, 51, 0));

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

        lblTitle.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Formulario de Productos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(lblTitle)
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnReturn)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnReturn)
                .addGap(13, 13, 13)
                .addComponent(lblTitle)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        lblNombreForm.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 16)); // NOI18N
        lblNombreForm.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreForm.setText("Nombre Producto:");

        txtNombre.setBackground(new java.awt.Color(51, 51, 51));
        txtNombre.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblPticeForm.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 16)); // NOI18N
        lblPticeForm.setForeground(new java.awt.Color(255, 255, 255));
        lblPticeForm.setText("Precio del Producto:");

        txtPrecio.setBackground(new java.awt.Color(51, 51, 51));
        txtPrecio.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtPrecio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblMarcaForm.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 16)); // NOI18N
        lblMarcaForm.setForeground(new java.awt.Color(255, 255, 255));
        lblMarcaForm.setText("Marca del Producto:");

        txtMarca.setBackground(new java.awt.Color(51, 51, 51));
        txtMarca.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(255, 255, 255));
        txtMarca.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtMarca.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblFechaForm.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 16)); // NOI18N
        lblFechaForm.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaForm.setText("Fecha de Creacion:");

        txtCantidad.setBackground(new java.awt.Color(51, 51, 51));
        txtCantidad.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidad.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtCantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblCantidadForm.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 16)); // NOI18N
        lblCantidadForm.setForeground(new java.awt.Color(255, 255, 255));
        lblCantidadForm.setText("Cantidad del Producto:");

        lblFechaEdit.setFont(lblNombreForm.getFont());
        lblFechaEdit.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaEdit.setText("Fecha Generada");

        lblIDForm.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 16)); // NOI18N
        lblIDForm.setForeground(new java.awt.Color(255, 255, 255));
        lblIDForm.setText("ID:");

        lblIDEdit.setFont(lblFechaEdit.getFont());
        lblIDEdit.setForeground(new java.awt.Color(255, 255, 255));
        lblIDEdit.setText("ID Generado");

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        btnFormA.setBackground(new java.awt.Color(0, 102, 0));

        lblBtnForm.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblBtnForm.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnForm.setText("Agregar Producto");
        lblBtnForm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBtnForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnFormMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnFormMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnFormALayout = new javax.swing.GroupLayout(btnFormA);
        btnFormA.setLayout(btnFormALayout);
        btnFormALayout.setHorizontalGroup(
            btnFormALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
        );
        btnFormALayout.setVerticalGroup(
            btnFormALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(btnFormA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(btnFormA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre)
                    .addComponent(jSeparator1)
                    .addComponent(txtPrecio)
                    .addComponent(jSeparator2)
                    .addComponent(txtMarca)
                    .addComponent(jSeparator3)
                    .addComponent(txtCantidad)
                    .addComponent(jSeparator4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblIDForm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblIDEdit))
                            .addComponent(lblCantidadForm)
                            .addComponent(lblPticeForm)
                            .addComponent(lblNombreForm)
                            .addComponent(lblMarcaForm)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblFechaForm)
                                .addGap(18, 18, 18)
                                .addComponent(lblFechaEdit)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNombreForm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPticeForm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMarcaForm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCantidadForm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaForm)
                    .addComponent(lblFechaEdit))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDForm)
                    .addComponent(lblIDEdit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        jPanel3.setBackground(new java.awt.Color(51, 153, 0));

        jLabel2.setFont(lblTitle.getFont());
        jLabel2.setForeground(lblTitle.getForeground());
        jLabel2.setText("Tabla de Productos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(177, 177, 177))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(37, 37, 37))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 550, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Costo:", "Cantidad:", "Marca"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 550, 490));

        jPanel5.setBackground(new java.awt.Color(102, 255, 0));

        btnAct.setBackground(new java.awt.Color(0, 51, 0));

        btnActlbl.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        btnActlbl.setForeground(new java.awt.Color(255, 255, 255));
        btnActlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnActlbl.setText("Actualizar Producto");
        btnActlbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActlblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActlblMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnActLayout = new javax.swing.GroupLayout(btnAct);
        btnAct.setLayout(btnActLayout);
        btnActLayout.setHorizontalGroup(
            btnActLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnActlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        btnActLayout.setVerticalGroup(
            btnActLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnActlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnEl.setBackground(new java.awt.Color(153, 0, 0));

        btnEllbl.setBackground(new java.awt.Color(153, 0, 0));
        btnEllbl.setFont(btnActlbl.getFont());
        btnEllbl.setForeground(new java.awt.Color(255, 255, 255));
        btnEllbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEllbl.setText("Eliminar Producto");
        btnEllbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEllbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEllblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEllblMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnElLayout = new javax.swing.GroupLayout(btnEl);
        btnEl.setLayout(btnElLayout);
        btnElLayout.setHorizontalGroup(
            btnElLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 142, Short.MAX_VALUE)
            .addGroup(btnElLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnEllbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
        );
        btnElLayout.setVerticalGroup(
            btnElLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
            .addGroup(btnElLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnEllbl, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addComponent(btnEl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 550, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        try {
            MenuAdmin newVentana = new MenuAdmin( this.idU );
            newVentana.setVisible( true );

            this.con.close();

            this.setVisible(false);
        } catch (SQLException ex) {
            System.out.println("ERROR a la hora de Cerra conexion o cambiar ventana MenuAdmin");
        }
    }//GEN-LAST:event_btnReturnActionPerformed

    private void lblBtnFormMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnFormMouseEntered
        btnFormA.setBackground( new Color( 20, 102, 20 ) );
    }//GEN-LAST:event_lblBtnFormMouseEntered

    private void lblBtnFormMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnFormMouseExited
        btnFormA.setBackground( new Color(0, 102, 0) );
    }//GEN-LAST:event_lblBtnFormMouseExited

    private void btnActlblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActlblMouseEntered
        btnAct.setBackground( new Color( 0, 120, 0 ) );
    }//GEN-LAST:event_btnActlblMouseEntered

    private void btnActlblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActlblMouseExited
        btnAct.setBackground( new Color( 0, 51, 0) );
    }//GEN-LAST:event_btnActlblMouseExited

    private void btnEllblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEllblMouseEntered
        btnEl.setBackground( new Color( 53, 0, 0) );
    }//GEN-LAST:event_btnEllblMouseEntered

    private void btnEllblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEllblMouseExited
        btnEl.setBackground( new Color( 153, 0, 0) );
    }//GEN-LAST:event_btnEllblMouseExited

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
            java.util.logging.Logger.getLogger(MenuProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    void mostrarProductos() {
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAct;
    private javax.swing.JLabel btnActlbl;
    private javax.swing.JPanel btnEl;
    private javax.swing.JLabel btnEllbl;
    private javax.swing.JPanel btnFormA;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblBtnForm;
    private javax.swing.JLabel lblCantidadForm;
    private javax.swing.JLabel lblFechaEdit;
    private javax.swing.JLabel lblFechaForm;
    private javax.swing.JLabel lblIDEdit;
    private javax.swing.JLabel lblIDForm;
    private javax.swing.JLabel lblMarcaForm;
    private javax.swing.JLabel lblNombreForm;
    private javax.swing.JLabel lblPticeForm;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}

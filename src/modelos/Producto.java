
package modelos;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSetImpl;
import com.mysql.jdbc.Statement;
import database.ConnectionToDB;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Mendoza Castañeda José Ricardo
 */

public class Producto {
    // Objetos de conexión
    private ConnectionToDB conexion;
    private Connection con;
    private Statement st;
    private ResultSetImpl res;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCosto() {
        return costo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getMarca() {
        return marca;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public double getTotal() {
        this.total = this.cantidad * this.costo;
        return total;
    }
    
    // Columnas de MySQL
    private int id;
    private String nombre;
    private double costo;
    private int cantidad;
    private String marca;
    private String fecha_creacion; // Corregir 
    // columnas adicionales
    private double total;
    

    public Producto( int id ) {
        this.id = id;
        con = conexion.conectar();
        try {
            st = (Statement) con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println( ex );
        }
    }
    
    public void obtenerDatosProducto() {
        String query = "select * from productos where id=" + this.id + ";";
        try {
            res = (ResultSetImpl) st.executeQuery(query);
            
            while ( res.next() ) {
                
                this.id = res.getInt("id");
                this.nombre = res.getString("nombre");
                this.costo = res.getDouble("costo");
                this.cantidad = res.getInt("cantidad");
                this.marca = res.getString("marca");
                // this.fecha_creacion = res.getDate("fecha_creacion"); // Corregir
                
            }
        } catch (SQLException ex) {
            System.out.println("ERROR - SQL");
            System.out.println( ex );
        }
        
    }
}

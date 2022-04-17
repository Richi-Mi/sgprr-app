
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

/**
 * El codigo esta hecho para que cuando se entre a la interfaz de usuario pueda obtener su información.
 * La función obtenerDatos
 */

public class Usuario {

    public int getId() {
        return id;
    }

    public double getSueldo() {
        return sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getPassword() {
        return password;
    }

    public String getTipo() {
        return tipo;
    }
    
    private static int id;
    private static double sueldo;
    private static String nombre, correo, password, tipo;
    private static ConnectionToDB conexion;
    private static Connection con;
    private static Statement st;
    private static ResultSetImpl res;
    
    
    public Usuario( int id ) {
        this.id = id;
        this.conexion = new ConnectionToDB();
        this.con = conexion.conectar();
        this.obtenerDatos();
    }
    
    public static void obtenerDatos() {
        String query = "select * from usuarios where id=" + Usuario.id +";";
        try {
            st = (Statement) Usuario.con.createStatement();
            res = (ResultSetImpl) Usuario.st.executeQuery( query );
            
            while ( res.next() ) {
                
                Usuario.id = res.getInt("id");
                Usuario.nombre = res.getString("nombre");
                Usuario.correo = res.getString("correo");
                Usuario.password = res.getString("password");
                Usuario.tipo = res.getString("tipo");
                Usuario.sueldo = res.getDouble("sueldo");
                
            }
            Usuario.con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        
    }
    
}

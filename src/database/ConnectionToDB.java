
package database;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Mendoza Castañeda José Ricardo
 * 
 * Este modulo sirve para conectarse a MySQL 
 */

public class ConnectionToDB {
    
    // Declaramos la conexion a mysql mediante el objeto connection.
    private static Connection con;
    
    // Declaramos los datos de conexion a la bd
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "123456789"; // host/nombre_base_datos
    private static final String url  = "jdbc:mysql://localhost:3306/SGPRR?characterEncoding=utf8&useSSL=false&useUnicode=true";   
    
    // Funcion que va conectarse a mi bd de mysql
    public Connection conectar() {
        // Reseteamos a null la conexion a la bd
        con = null;
        try{
            Class.forName( driver );
            
            // Nos conectamos a la bd
            con = (Connection) DriverManager.getConnection( url, user, pass );
            // Si la conexion fue exitosa mostramos un mensaje de conexion exitosa
            if ( con != null){
                System.out.println("CONECTADO A DB"); // Cambiar metodo
            }
            
            // Statement stmt = con.createStatement();  
            // ResultSet rs = stmt.executeQuery("show databases;");
        }
        // Si la conexion NO fue exitosa mostramos un mensaje de error
        catch (ClassNotFoundException | SQLException e){
            System.out.println("ERROR A LA HORA DE CONECTARSE");
            System.out.println( e );
        }
        return con;
    }
    public void desconectar() {
        try {
            con.close();
        } catch (SQLException ex) {
            System.out.println(" No se pudo desconectar papu");
        }
    }
}

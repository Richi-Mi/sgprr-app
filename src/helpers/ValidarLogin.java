
package helpers;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSetImpl;
import com.mysql.jdbc.Statement;
import database.ConnectionToDB;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Mendoza Castañeda José Ricardo
 * 
 * Este Modulo nos ayudara a validar los Login de los usuarios Usando Base de Datos
 */

public class ValidarLogin {
    private Connection con;
    private ConnectionToDB newConexion = new ConnectionToDB();
    private static Statement st;
    private static ResultSetImpl res;
    
    public ValidarLogin() {
        con = newConexion.conectar();
        
    }
    
    public String[] validate( String correo, String password ) {
        try {
            String query = "select * from usuarios where correo='" + correo + "' and password='" + password + "';";
            st = (Statement) con.createStatement();
            res = (ResultSetImpl) st.executeQuery(query);
            
            if( res.next() ) {
                String type = res.getString("tipo");
                String id   = Integer.toString(res.getInt("id") );
                String[] data = new String[2];
                
                data[0] = type;
                data[1] = id;
                
                System.out.println(" Correo. - " + data[0]);
                System.out.println(" Contra. - " + data[1]);
                
                con.close();
                
                return data;
            }
            else {
                // Error en el login
                System.out.println("Login .- ERROR, No se encontro usuario");
                String[] ret = {"BadCon"};
                
                con.close();
                
                return ret;
            }
            
            
        } catch (SQLException ex) {
            System.out.println("Login .- ERROR, SQL execption");
            String[] ret = {"BadCon"};
            return ret;
        }
    }
}

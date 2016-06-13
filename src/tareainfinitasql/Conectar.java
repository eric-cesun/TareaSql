/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareainfinitasql;

import com.mysql.jdbc.Connection;
import static java.lang.System.out;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author kirito205
 */
public class Conectar {
    private static Connection conn;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String password="dragon12";
    private static final String url="jdbc:mysql://localhost:3306/Docentes";
    
    public Conectar(){
        conn=null;
        try{
            Class.forName(driver);
            conn = (Connection) DriverManager.getConnection(url, user,password);
            if (conn !=null) {
                out.println("Conneccion correcta");
            }
        }catch (ClassNotFoundException | SQLException e){
            out.println("error de coneccion "+e);
        }
    }
    public Connection getConnection(){
        return conn;
    }
    public void desconectar(){
        conn=null;
        if (conn==null) {
            out.println("se acabo la coneccion");  
        }
    }
}

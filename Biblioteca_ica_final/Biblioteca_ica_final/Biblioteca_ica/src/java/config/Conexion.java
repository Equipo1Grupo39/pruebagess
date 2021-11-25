package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
     
    public static Connection conectar(){
        Connection conn = null;
        
        String login = "root";
        String password = "matty32502876";
        String url = "jdbc:mysql://localhost:3306/biblioteca?autoReconnect=true";        

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url,login,password);
            if (conn != null){
                System.out.println("Conexión a base de datos "+url+" ... Ok");
            }  
        } catch(SQLException ex){
            System.out.println(ex);
        } catch(ClassNotFoundException ex){
            System.out.println(ex);
        }
        return conn;
    } 
}

package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Connection getconexion() throws ClassNotFoundException {

        try {
            Class.forName ("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", "matty32502876");
            System.out.println("conexion exitosa");
            return conn;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
    }
}

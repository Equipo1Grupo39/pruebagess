package modelo;

import java.sql.ResultSet;
import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.sql.Statement;

public class EditorialDAO {
    
    private Conexion con = new Conexion();
    private Connection connection =  null;     

    public List<Editorial> listar() {
        PreparedStatement ps;
        ResultSet rs;
        
        Statement stm= null;
        Connection con=null;

        List<Editorial> lista = new ArrayList<>();
        try {
            String sql = "SELECT codigoeditorial, Edinombreeditorial FROM Editorial";
            con = Conexion.conectar();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Integer codigoeditorial = rs.getInt("codigoeditorial");
                String edinombreeditorial = rs.getString("Edinombreeditorial");

                Editorial editorial = new Editorial(codigoeditorial, edinombreeditorial);
                lista.add(editorial);

            }
            return lista;
        } catch (SQLException e) {
            System.out.print(e.toString());
            return null;

        }
    }

    public Editorial buscar(int codigo) {
        PreparedStatement ps;
        ResultSet rs;
        
        Statement stm= null;
        Connection con=null;
        
        Editorial editorial = null;
        try {
            String sql = "SELECT codigoeditorial, Edinombreeditorial FROM editorial WHERE codigoeditorial = "+codigo;
            con = Conexion.conectar();
            stm= con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Integer codigoeditorial = rs.getInt("codigoeditorial");
                String edinombreeditorial = rs.getString("Edinombreeditorial");

                editorial = new Editorial(codigoeditorial, edinombreeditorial);

            }
            return editorial;
        } catch (SQLException e) {
            System.out.print(e.toString());
            return null;

        }
    }

    public boolean insertar(String nombre) {
        PreparedStatement ps = null;
        Statement stm = null;
        Connection con = null;
        ResultSet rs = null;
        int codigoeditorial = 0; 

        try {
            String sql = "SELECT max(codigoeditorial)+1 codigoeditorial FROM Editorial";
            con = Conexion.conectar();
            stm= con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                codigoeditorial = rs.getInt("codigoeditorial");  
            }
            
            sql = "INSERT INTO Editorial (codigoeditorial, Edinombreeditorial) VALUES(?,?)";
            con = Conexion.conectar();
            stm= con.createStatement();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigoeditorial);
            ps.setString(2, nombre);

            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }
    public boolean modificar(Editorial editorial) {
        PreparedStatement ps = null;        
        Statement stm= null;
        Connection con=null;

        try {
            String sql = "UPDATE  Editorial SET Edinombreeditorial = ? WHERE codigoeditorial = ? ";
            con = Conexion.conectar();
            stm= con.createStatement();
            ps = con.prepareStatement(sql);
            ps.setString(1, editorial.getEdinombreeditorial());
            ps.setInt(2, editorial.getCodigoeditorial());

            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }
     public boolean eliminar(String codigoeditorial) {
        PreparedStatement ps=null;
        Statement stm= null;
        Connection con=null;
        try {
            String sql = "DELETE FROM Editorial WHERE codigoeditorial = ? ";
            con = Conexion.conectar();
            stm= con.createStatement();
            ps = con.prepareStatement(sql);
            ps.setString(1, codigoeditorial);
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }
}

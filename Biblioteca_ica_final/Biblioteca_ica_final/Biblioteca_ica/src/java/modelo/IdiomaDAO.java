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

public class IdiomaDAO {
    
    private Conexion con = new Conexion();
    private Connection connection =  null;     

    public List<Idioma> listar() {
        PreparedStatement ps;
        ResultSet rs;
        
        Statement stm= null;
        Connection con=null;

        List<Idioma> lista = new ArrayList<>();
        try {
            String sql = "SELECT codigoidioma, Idinombreidioma FROM Idioma";
            con = Conexion.conectar();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            //ps = connection.prepareStatement(sql);
            //rs = ps.executeQuery();
            while (rs.next()) {
                Integer codigoidioma = rs.getInt("codigoidioma");
                String idinombreidioma = rs.getString("Idinombreidioma");

                Idioma idioma = new Idioma(codigoidioma, idinombreidioma);
                lista.add(idioma);

            }
            return lista;
        } catch (SQLException e) {
            System.out.print(e.toString());
            return null;

        }
    }

    public Idioma buscar(int codigo) {
        PreparedStatement ps;
        ResultSet rs;
        
        Statement stm= null;
        Connection con=null;
        
        Idioma idioma = null;
        try {
            String sql = "SELECT codigoidioma, Idinombreidioma FROM Idioma WHERE codigoidioma = "+codigo;
            con = Conexion.conectar();
            stm= con.createStatement();
            //ps = connection.prepareStatement(sql);
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Integer codigoidioma = rs.getInt("codigoidioma");
                String idinombreidioma = rs.getString("Idinombreidioma");

                idioma = new Idioma(codigoidioma, idinombreidioma);

            }
            return idioma;
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
        int codigoidioma = 0; 

        try {
            String sql = "SELECT max(codigoidioma)+1 codigoidioma FROM Idioma";
            con = Conexion.conectar();
            stm= con.createStatement();
            //ps = connection.prepareStatement(sql);
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                codigoidioma = rs.getInt("codigoidioma");  
            }
            
            sql = "INSERT INTO Idioma (codigoidioma, Idinombreidioma) VALUES(?,?)";
            con = Conexion.conectar();
            stm= con.createStatement();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigoidioma);
            ps.setString(2, nombre);

            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }
    public boolean modificar(Idioma idioma) {
        PreparedStatement ps = null;        
        Statement stm= null;
        Connection con=null;
        

        try {
            String sql = "UPDATE  Idioma SET Idinombreidioma = ? WHERE codigoidioma = ? ";
            con = Conexion.conectar();
            stm= con.createStatement();
            ps = con.prepareStatement(sql);
            ps.setString(1, idioma.getIdinombreidioma());
            ps.setInt(2, idioma.getCodigoidioma());

            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }
     public boolean eliminar(String codigoidioma) {
        PreparedStatement ps=null;
        Statement stm= null;
        Connection con=null;
        try {
            String sql = "DELETE FROM Idioma WHERE codigoidioma = ? ";
            con = Conexion.conectar();
            stm= con.createStatement();
            ps = con.prepareStatement(sql);
            ps.setString(1, codigoidioma);
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }
}

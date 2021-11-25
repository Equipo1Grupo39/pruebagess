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

public class AutorDAO {
    
    private Conexion con = new Conexion();
    private Connection connection =  null;     

    public List<Autor> listar() {
        PreparedStatement ps;
        ResultSet rs;
        
        Statement stm= null;
        Connection con=null;

        List<Autor> lista = new ArrayList<>();
        try {
            String sql = "SELECT codigoautor, Autnombresapellidos, Autnacionalidad FROM Autor";
            con = Conexion.conectar();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            //ps = connection.prepareStatement(sql);
            //rs = ps.executeQuery();
            while (rs.next()) {
                Integer codigoautor = rs.getInt("codigoautor");
                String autnombresapellidos = rs.getString("Autnombresapellidos");
                String autnacionalidad = rs.getString("Autnacionalidad");

                Autor autor = new Autor(codigoautor, autnombresapellidos, autnacionalidad);
                lista.add(autor);

            }
            return lista;
        } catch (SQLException e) {
            System.out.print(e.toString());
            return null;

        }
    }

    public Autor buscar(int codigo) {
        PreparedStatement ps;
        ResultSet rs;
        
        Statement stm= null;
        Connection con=null;
        
        Autor autor = null;
        try {
            String sql = "SELECT codigoautor, Autnombresapellidos, Autnacionalidad FROM Autor WHERE codigoautor = "+codigo;
            con = Conexion.conectar();
            stm= con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Integer codigoautor = rs.getInt("codigoautor");
                String autnombresapellidos = rs.getString("Autnombresapellidos");
                String autnacionalidad = rs.getString("Autnacionalidad");

                autor = new Autor(codigoautor, autnombresapellidos, autnacionalidad);

            }
            return autor;
        } catch (SQLException e) {
            System.out.print(e.toString());
            return null;

        }
    }

    public boolean insertar(String nombre, String nacionalidad) {
        PreparedStatement ps = null;
        Statement stm = null;
        Connection con = null;
        ResultSet rs = null;
        int codigoautor = 0; 

        try {
            String sql = "SELECT max(codigoautor)+1 codigoautor FROM Autor";
            con = Conexion.conectar();
            stm= con.createStatement();
            //ps = connection.prepareStatement(sql);
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                codigoautor = rs.getInt("codigoautor");  
            }
            
            sql = "INSERT INTO Autor (codigoautor, Autnombresapellidos, Autnacionalidad) VALUES(?,?,?)";
            con = Conexion.conectar();
            stm= con.createStatement();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigoautor);
            ps.setString(2, nombre);
            ps.setString(3, nacionalidad);

            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }
    public boolean modificar(Autor autor) {
        PreparedStatement ps = null;        
        Statement stm= null;
        Connection con=null;
        

        try {
            String sql = "UPDATE  Autor SET Autnombresapellidos = ?, Autnacionalidad = ? WHERE codigoautor = ? ";
            con = Conexion.conectar();
            stm= con.createStatement();
            ps = con.prepareStatement(sql);
            ps.setString(1, autor.getAutnombresapellidos());
            ps.setString(2, autor.getAutnacionalidad());
            ps.setInt(3, autor.getCodigoautor());

            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }
     public boolean eliminar(String codigoautor) {
        PreparedStatement ps=null;
        Statement stm= null;
        Connection con=null;
        try {
            String sql = "DELETE FROM Autor WHERE codigoautor = ? ";
            con = Conexion.conectar();
            stm= con.createStatement();
            ps = con.prepareStatement(sql);
            ps.setString(1, codigoautor);
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }
}

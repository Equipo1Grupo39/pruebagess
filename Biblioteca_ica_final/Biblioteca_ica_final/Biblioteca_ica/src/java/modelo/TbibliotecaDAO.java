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

public class TbibliotecaDAO {
    
    private Conexion con = new Conexion();
    private Connection connection =  null;     

    public List<Tbiblioteca> listar() {
        PreparedStatement ps;
        ResultSet rs;
        
        Statement stm= null;
        Connection con=null;

        List<Tbiblioteca> lista = new ArrayList<>();
        try {
            String sql = "SELECT idtbiblioteca, tbinombre, tbinit, tbiemail, tbidireccion, tbitelefono, tbicuentabancaria, tbinombrebanco FROM Tbiblioteca";
            con = Conexion.conectar();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Integer idtbiblioteca = rs.getInt("idtbiblioteca");
                String tbinombre = rs.getString("tbinombre");
                Integer tbinit = rs.getInt("tbinit");
                String tbiemail = rs.getString("tbiemail");
                String tbidireccion = rs.getString("tbidireccion");
                String tbitelefono = rs.getString("tbitelefono");
                String tbicuentabancaria = rs.getString("tbicuentabancaria");
                String tbinombrebanco = rs.getString("tbinombrebanco");

                Tbiblioteca autor = new Tbiblioteca(idtbiblioteca, tbinombre, tbinit, tbiemail, tbidireccion, tbitelefono, tbicuentabancaria, tbinombrebanco);
                lista.add(autor);

            }
            return lista;
        } catch (SQLException e) {
            System.out.print(e.toString());
            return null;

        }
    }

    public Tbiblioteca buscar(int codigo) {
        PreparedStatement ps;
        ResultSet rs;
        
        Statement stm= null;
        Connection con=null;
        
        Tbiblioteca autor = null;
        try {
            String sql = "SELECT idtbiblioteca, tbinombre, tbinit, tbiemail, tbidireccion, tbitelefono, tbicuentabancaria, tbinombrebanco FROM Tbiblioteca WHERE idtbiblioteca = "+codigo;
            con = Conexion.conectar();
            stm= con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Integer idtbiblioteca = rs.getInt("idtbiblioteca");
                String tbinombre = rs.getString("tbinombre");
                Integer tbinit = rs.getInt("tbinit");
                String tbiemail = rs.getString("tbiemail");
                String tbidireccion = rs.getString("tbidireccion");
                String tbitelefono = rs.getString("tbitelefono");
                String tbicuentabancaria = rs.getString("tbicuentabancaria");
                String tbinombrebanco = rs.getString("tbinombrebanco");

                autor = new Tbiblioteca(idtbiblioteca, tbinombre, tbinit, tbiemail, tbidireccion, tbitelefono, tbicuentabancaria, tbinombrebanco);

            }
            return autor;
        } catch (SQLException e) {
            System.out.print(e.toString());
            return null;

        }
    }

    public boolean insertar(Tbiblioteca tbiblioteca) {
        PreparedStatement ps = null;
        Statement stm = null;
        Connection con = null;
        ResultSet rs = null;
        int idtbiblioteca = 0; 

        try {
            String sql = "SELECT max(idtbiblioteca)+1 idtbiblioteca FROM Tbiblioteca";
            con = Conexion.conectar();
            stm= con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                idtbiblioteca = rs.getInt("idtbiblioteca");  
            }
            
            sql = "INSERT INTO Tbiblioteca (idtbiblioteca, tbinombre, tbinit, tbiemail, tbidireccion, tbitelefono, tbicuentabancaria, tbinombrebanco) VALUES(?,?,?,?,?,?,?,?)";
            con = Conexion.conectar();
            stm= con.createStatement();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idtbiblioteca);
            ps.setString(2, tbiblioteca.getTbinombre());
            ps.setInt(3, tbiblioteca.getTbinit());
            ps.setString(4, tbiblioteca.getTbiemail());
            ps.setString(5, tbiblioteca.getTbidireccion());
            ps.setString(6, tbiblioteca.getTbitelefono());
            ps.setString(7, tbiblioteca.getTbicuentabancaria());
            ps.setString(8, tbiblioteca.getTbinombrebanco());

            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }
    public boolean modificar(Tbiblioteca tbiblioteca) {
        PreparedStatement ps = null;        
        Statement stm= null;
        Connection con=null;
        

        try {
            String sql = "UPDATE  Tbiblioteca SET tbinombre = ?, tbinit = ?, tbiemail = ?, tbidireccion = ?, "+
                    "tbitelefono = ?, tbicuentabancaria = ?, tbinombrebanco = ? WHERE idtbiblioteca = ? ";
            con = Conexion.conectar();
            stm= con.createStatement();
            ps = con.prepareStatement(sql);
            ps.setString(1, tbiblioteca.getTbinombre());
            ps.setInt(2, tbiblioteca.getTbinit());
            ps.setString(3, tbiblioteca.getTbiemail());
            ps.setString(4, tbiblioteca.getTbidireccion());
            ps.setString(5, tbiblioteca.getTbitelefono());
            ps.setString(6, tbiblioteca.getTbicuentabancaria());
            ps.setString(7, tbiblioteca.getTbinombrebanco());
            ps.setInt(8, tbiblioteca.getIdtbiblioteca());

            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }
     public boolean eliminar(Integer idtbiblioteca) {
        PreparedStatement ps=null;
        Statement stm= null;
        Connection con=null;
        try {
            String sql = "DELETE FROM Tbiblioteca WHERE idtbiblioteca = ? ";
            con = Conexion.conectar();
            stm= con.createStatement();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idtbiblioteca);
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }
}

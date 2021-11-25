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

public class SignaturatopograficaDAO {
    
    private Conexion con = new Conexion();
    private Connection connection =  null;     

    public List<Signaturatopografica> listar() {
        PreparedStatement ps;
        ResultSet rs;
        
        Statement stm= null;
        Connection con=null;

        List<Signaturatopografica> lista = new ArrayList<>();
        try {
            String sql = "SELECT s.codigosignaturatopografica, s.STo_idtbiblioteca, t.Tbinombre, s.STo_codigolibroisbn, " +
                "s.STo_codigoaudiosyvideosisbn, l.Libtitulo, a.AyVtitulo " +
                "join tbiblioteca t on s.STo_idtbiblioteca = t.idtbiblioteca " +
                "left join libros l on s.STo_codigolibroisbn = l.codigolibroisbn " +
                "left join audiosyvideos a  on s.STo_codigoaudiosyvideosisbn = a.codigoaudiosyvideosisbn";
            
            con = Conexion.conectar();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                String codigosignaturatopografica = rs.getString("codigosignaturatopografica");
                Integer sToidtbiblioteca = rs.getInt("STo_idtbiblioteca");
                String sTocodigolibroisbn = rs.getString("STo_codigolibroisbn");
                String sTocodigoaudiosyvideosisbn = rs.getString("STo_codigoaudiosyvideosisbn");
                String tbinombre = rs.getString("Tbinombre");
                String libtitulo = rs.getString("Libtitulo");
                String ayVtitulo = rs.getString("AyVtitulo");

                Signaturatopografica signatura = new Signaturatopografica(codigosignaturatopografica, sToidtbiblioteca, sTocodigolibroisbn, sTocodigoaudiosyvideosisbn, tbinombre, libtitulo, ayVtitulo);
                lista.add(signatura);

            }
            return lista;
        } catch (SQLException e) {
            System.out.print(e.toString());
            return null;

        }
    }

    public List<Signaturatopografica> listarSignaturasLibros() {
        PreparedStatement ps;
        ResultSet rs;
        
        Statement stm= null;
        Connection con=null;

        List<Signaturatopografica> lista = new ArrayList<>();
        try {
            String sql = "SELECT s.codigosignaturatopografica, s.STo_idtbiblioteca, s.STo_codigolibroisbn "+
                    "FROM Signaturatopografica s, libros l "+
                    "WHERE s.STo_codigolibroisbn = l.codigolibroisbn";
            con = Conexion.conectar();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                String codigosignaturatopografica = rs.getString("codigosignaturatopografica");
                Integer sToidtbiblioteca = rs.getInt("STo_idtbiblioteca");
                String sTocodigolibroisbn = rs.getString("STo_codigolibroisbn");

                Signaturatopografica signatura = new Signaturatopografica(codigosignaturatopografica, sToidtbiblioteca, sTocodigolibroisbn);
                lista.add(signatura);

            }
            return lista;
        } catch (SQLException e) {
            System.out.print(e.toString());
            return null;

        }
    }
    
    public List<Signaturatopografica> listarSignaturasAudios() {
        PreparedStatement ps;
        ResultSet rs;
        
        Statement stm= null;
        Connection con=null;

        List<Signaturatopografica> lista = new ArrayList<>();
        try {
            String sql = "SELECT s.codigosignaturatopografica, s.STo_idtbiblioteca, s.STo_codigoaudiosyvideosisbn "+
                    "FROM Signaturatopografica s, audiosyvideos a "+
                    "WHERE s.STo_codigoaudiosyvideosisbn = a.codigoaudiosyvideosisbn";
            con = Conexion.conectar();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                String codigosignaturatopografica = rs.getString("codigosignaturatopografica");
                Integer sToidtbiblioteca = rs.getInt("STo_idtbiblioteca");
                String sTocodigoaudiosyvideosisbn = rs.getString("STo_codigoaudiosyvideosisbn");

                Signaturatopografica signatura = new Signaturatopografica(codigosignaturatopografica, sToidtbiblioteca, sTocodigoaudiosyvideosisbn);
                lista.add(signatura);

            }
            return lista;
        } catch (SQLException e) {
            System.out.print(e.toString());
            return null;

        }
    }    
    
    public Signaturatopografica buscar(String codigo) {
        PreparedStatement ps;
        ResultSet rs;
        
        Statement stm= null;
        Connection con=null;
        
        Signaturatopografica signatura = null;
        try {
            String sql = "SELECT codigosignaturatopografica, STo_idtbiblioteca, STo_codigolibroisbn, STo_codigoaudiosyvideosisbn  FROM Signaturatopografica WHERE codigosignaturatopografica = "+codigo;
            con = Conexion.conectar();
            stm= con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                String codigosignaturatopografica = rs.getString("codigosignaturatopografica");
                Integer sToidtbiblioteca = rs.getInt("STo_idtbiblioteca");
                String sTocodigolibroisbn = rs.getString("STo_codigolibroisbn");
                String sTocodigoaudiosyvideosisbn = rs.getString("STo_codigoaudiosyvideosisbn");

                signatura = new Signaturatopografica(codigosignaturatopografica, sToidtbiblioteca, sTocodigolibroisbn, sTocodigoaudiosyvideosisbn);
            }
            return signatura;
        } catch (SQLException e) {
            System.out.print(e.toString());
            return null;

        }
    }
    
    public Signaturatopografica buscarSignaturaLibro(String codigo) {
        PreparedStatement ps;
        ResultSet rs;
        
        Statement stm= null;
        Connection con=null;
        
        Signaturatopografica signatura = null;
        try {
            String sql = "SELECT codigosignaturatopografica, STo_idtbiblioteca, STo_codigolibroisbn FROM Signaturatopografica WHERE STo_codigolibroisbn = '"+codigo+"'";
            con = Conexion.conectar();
            stm= con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                String codigosignaturatopografica = rs.getString("codigosignaturatopografica");
                Integer stoidtbiblioteca = rs.getInt("STo_idtbiblioteca");
                String stocodigolibroisbn = rs.getString("STo_codigolibroisbn");

                signatura = new Signaturatopografica(codigosignaturatopografica, stoidtbiblioteca, stocodigolibroisbn);
            }
            return signatura;
        } catch (SQLException e) {
            System.out.print(e.toString());
            return null;

        }    
    }

    public Signaturatopografica buscarSignaturaAudio(String codigo) {
        PreparedStatement ps;
        ResultSet rs;
        
        Statement stm= null;
        Connection con=null;
        
        Signaturatopografica signatura = null;
        try {
            String sql = "SELECT codigosignaturatopografica, STo_idtbiblioteca, STo_codigoaudiosyvideosisbn FROM Signaturatopografica WHERE STo_codigoaudiosyvideosisbn = '"+codigo+"'";
            con = Conexion.conectar();
            stm= con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                String codigosignaturatopografica = rs.getString("codigosignaturatopografica");
                Integer stoidtbiblioteca = rs.getInt("STo_idtbiblioteca");
                String stocodigoaudiosyvideosisbn = rs.getString("STo_codigoaudiosyvideosisbn");

                signatura = new Signaturatopografica(codigosignaturatopografica, stoidtbiblioteca, stocodigoaudiosyvideosisbn);
            }
            return signatura;
        } catch (SQLException e) {
            System.out.print(e.toString());
            return null;

        }    
    }
    
    public boolean insertarSignaturaLibro(Signaturatopografica signatura) {
        PreparedStatement ps = null;
        Statement stm = null;
        Connection con = null;

        try {
            String sql = "INSERT INTO Signaturatopografica (codigosignaturatopografica, STo_idtbiblioteca, STo_codigolibroisbn) VALUES(?,?,?)";
            con = Conexion.conectar();
            stm= con.createStatement();
            ps = con.prepareStatement(sql);
            ps.setString(1, signatura.getCodigosignaturatopografica());
            ps.setInt(2, signatura.getstoidtbiblioteca());
            ps.setString(3, signatura.getCodigo());

            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }
    
    public boolean insertarSignaturaAudio(Signaturatopografica signatura) {
        PreparedStatement ps = null;
        Statement stm = null;
        Connection con = null;

        try {
            String sql = "INSERT INTO Signaturatopografica (codigosignaturatopografica, STo_idtbiblioteca, STo_codigoaudiosyvideosisbn) VALUES(?,?,?)";
            con = Conexion.conectar();
            stm= con.createStatement();
            ps = con.prepareStatement(sql);
            ps.setString(1, signatura.getCodigosignaturatopografica());
            ps.setInt(2, signatura.getstoidtbiblioteca());
            ps.setString(3, signatura.getCodigo());

            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }    
    
    public boolean modificarSignaturaLibro(Signaturatopografica signatura, String codigoAnt) {
        PreparedStatement ps = null;        
        Statement stm= null;
        Connection con=null;
        

        try {
            String sql = "UPDATE  Signaturatopografica SET codigosignaturatopografica = ?, STo_idtbiblioteca = ?, STo_codigolibroisbn = ? WHERE codigosignaturatopografica = ? ";
            con = Conexion.conectar();
            stm= con.createStatement();
            ps = con.prepareStatement(sql);
            ps.setString(1, signatura.getCodigosignaturatopografica());
            ps.setInt(2, signatura.getstoidtbiblioteca());
            ps.setString(3, signatura.getCodigo());
            ps.setString(4, codigoAnt);

            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }

    public boolean modificarSignaturaAudio(Signaturatopografica signatura, String codigoAnt) {
        PreparedStatement ps = null;        
        Statement stm= null;
        Connection con=null;
        

        try {
            String sql = "UPDATE  Signaturatopografica SET codigosignaturatopografica = ?, STo_idtbiblioteca = ?, STo_codigoaudiosyvideosisbn = ? WHERE codigosignaturatopografica = ? ";
            con = Conexion.conectar();
            stm= con.createStatement();
            ps = con.prepareStatement(sql);
            ps.setString(1, signatura.getCodigosignaturatopografica());
            ps.setInt(2, signatura.getstoidtbiblioteca());
            ps.setString(3, signatura.getCodigo());
            ps.setString(4, codigoAnt);

            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }
    
    
    public boolean eliminarSignaturaLibro(String codigo) {
        PreparedStatement ps=null;
        Statement stm= null;
        Connection con=null;
        try {
            String sql = "DELETE FROM Signaturatopografica WHERE STo_codigolibroisbn = ? ";
            con = Conexion.conectar();
            stm= con.createStatement();
            ps = con.prepareStatement(sql);
            ps.setString(1, codigo);
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }

    public boolean eliminarSignaturaAudio(String codigo) {
        PreparedStatement ps=null;
        Statement stm= null;
        Connection con=null;
        try {
            String sql = "DELETE FROM Signaturatopografica WHERE STo_codigoaudiosyvideosisbn = ? ";
            con = Conexion.conectar();
            stm= con.createStatement();
            ps = con.prepareStatement(sql);
            ps.setString(1, codigo);
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }

}

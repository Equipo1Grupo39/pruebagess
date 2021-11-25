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

public class LibrosDAO {
    
    private Conexion con = new Conexion();
    private Connection connection =  null;     

    public List<Libros> listar() {
        PreparedStatement ps;
        ResultSet rs;
        
        Statement stm= null;
        Connection con=null;

        List<Libros> lista = new ArrayList<>();
        try {
            String sql = "SELECT l.codigolibroisbn, l.Libtitulo, l.Libnumerodepaginas, l.Lib_codigoautor, a.Autnombresapellidos, " +
                    "l.Lib_codigomateria, m.Matnombremateria, l.Lib_codigoeditorial, e.Edinombreeditorial, l.Lib_codigoidioma, i.idinombreidioma, " +
                    "s.codigosignaturatopografica, Libfechacreacion, Libfecharetiro, Invcantidad, (Invcantidad-Invsalidas) disponibles " +
                    "FROM libros l " +
                    "join autor a on l.Lib_codigoautor = a.codigoautor " +
                    "join materia m on l.Lib_codigomateria = m.codigomateria " +
                    "join editorial e on l.Lib_codigoeditorial = e.codigoeditorial " +
                    "join idioma i on l.Lib_codigoidioma = i.codigoidioma " +
                    "join signaturatopografica s on s.STo_codigolibroisbn = l.codigolibroisbn " +
                    "left join inventario v on v.Inv_codigolibroisbn = l.codigolibroisbn";
            
            con = Conexion.conectar();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                String codigolibroisbn = rs.getString("codigolibroisbn");
                String libtitulo = rs.getString("Libtitulo");
                int libnumerodepaginas = rs.getInt("Libnumerodepaginas");
                int libcodigoautor = rs.getInt("Lib_codigoautor");
                int libcodigomateria = rs.getInt("Lib_codigomateria");
                int libcodigoeditorial = rs.getInt("Lib_codigoeditorial");
                int libcodigoidioma = rs.getInt("Lib_codigoidioma");
                String libcodigosignaturatopografica = rs.getString("codigosignaturatopografica");
                Date libfechacreacion = rs.getDate("Libfechacreacion");
                Date libfecharetiro = rs.getDate("Libfecharetiro");
                String autnombresapellidos = rs.getString("autnombresapellidos");
                String matnombremateria = rs.getString("matnombremateria");
                String edinombreeditorial = rs.getString("edinombreeditorial");
                String idinombreidioma = rs.getString("idinombreidioma");
                int invcantidad = rs.getInt("Invcantidad");
                int disponibles = rs.getInt("disponibles");

                Libros libro = new Libros(codigolibroisbn, libtitulo, libnumerodepaginas, libcodigoautor, libcodigomateria, 
                        libcodigoeditorial, libcodigoidioma, libcodigosignaturatopografica, libfechacreacion, libfecharetiro,
                        autnombresapellidos, matnombremateria, edinombreeditorial, idinombreidioma, invcantidad, disponibles);
                lista.add(libro);

            }
            return lista;
        } catch (SQLException e) {
            System.out.print(e.toString());
            return null;

        }
    }

    public Libros buscar(String codigoLibro) {
        PreparedStatement ps;
        ResultSet rs;
        
        Statement stm= null;
        Connection con=null;
        
        Libros libro = null;
        try {
            String sql = "SELECT codigolibroisbn, Libtitulo, Libnumerodepaginas, Lib_codigoautor, Lib_codigomateria, "+
                    "Lib_codigoeditorial, Lib_codigoidioma, s.codigosignaturatopografica, Libfechacreacion, Libfecharetiro, "+
                    "Invcantidad,(Invcantidad-Invsalidas) disponibles "+
                    "FROM libros l join signaturatopografica s on s.STo_codigolibroisbn = l.codigolibroisbn " +
                    "left join inventario v on v.Inv_codigolibroisbn = l.codigolibroisbn "+
                    "WHERE codigolibroisbn = '"+codigoLibro+"'";
            
            con = Conexion.conectar();
            stm= con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                String codigolibroisbn = rs.getString("codigolibroisbn");
                String libtitulo = rs.getString("Libtitulo");
                int libnumerodepaginas = rs.getInt("Libnumerodepaginas");
                int libcodigoautor = rs.getInt("Lib_codigoautor");
                int libcodigomateria = rs.getInt("Lib_codigomateria");
                int libcodigoeditorial = rs.getInt("Lib_codigoeditorial");
                int libcodigoidioma = rs.getInt("Lib_codigoidioma");
                String libcodigosignaturatopografica = rs.getString("codigosignaturatopografica");
                Date libfechacreacion = rs.getDate("Libfechacreacion");
                Date libfecharetiro = rs.getDate("Libfecharetiro");
                int invcantidad = rs.getInt("Invcantidad");
                int disponibles = rs.getInt("disponibles");
                

                libro = new Libros(codigolibroisbn, libtitulo, libnumerodepaginas, libcodigoautor, libcodigomateria, 
                        libcodigoeditorial, libcodigoidioma, libcodigosignaturatopografica, libfechacreacion, 
                        libfecharetiro, invcantidad, disponibles);

            }
            return libro;
        } catch (SQLException e) {
            System.out.print(e.toString());
            return null;

        }
    }

    public boolean insertar(Libros libro) {
        PreparedStatement ps;

        Statement stm= null;
        Connection con=null;

        try {
            String sql = "INSERT INTO libros (codigolibroisbn, Libtitulo, Libnumerodepaginas, Lib_codigoautor, "+
                    "Lib_codigomateria, Lib_codigoeditorial, Lib_codigoidioma, Libfechacreacion) VALUES(?,?,?,?,?,?,?,now())";
            con = Conexion.conectar();
            stm= con.createStatement();
            ps = con.prepareStatement(sql);
            ps.setString(1, libro.getCodigolibroisbn());
            ps.setString(2, libro.getLibtitulo());
            ps.setInt(3, libro.getLibnumerodepaginas());
            ps.setInt(4, libro.getLibcodigoautor());
            ps.setInt(5, libro.getLibcodigomateria());
            ps.setInt(6, libro.getLibcodigoeditorial());
            ps.setInt(7, libro.getLibcodigoidioma());
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }
    
    public boolean modificar(Libros libro, String codigoAnt) {
        PreparedStatement ps;
        
        Statement stm= null;
        Connection con=null;
        

        try {
            String sql = "UPDATE  libros SET codigolibroisbn=?, Libtitulo=?, Libnumerodepaginas=?, Lib_codigoautor=?, "+
                    "Lib_codigomateria=?, Lib_codigoeditorial=?, Lib_codigoidioma=? "+
                    "WHERE codigolibroisbn=? ";
            con = Conexion.conectar();
            stm= con.createStatement();
            ps = con.prepareStatement(sql);
            ps.setString(1, libro.getCodigolibroisbn());
            ps.setString(2, libro.getLibtitulo());
            ps.setInt(3, libro.getLibnumerodepaginas());
            ps.setInt(4, libro.getLibcodigoautor());
            ps.setInt(5, libro.getLibcodigomateria());
            ps.setInt(6, libro.getLibcodigoeditorial());
            ps.setInt(7, libro.getLibcodigoidioma());
            ps.setString(8, codigoAnt);
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }
     public boolean eliminar(String _codigolibroisbn) {
        PreparedStatement ps;
        Statement stm= null;
        Connection con=null;
        try {
            String sql = "DELETE FROM libros WHERE codigolibroisbn=? ";
            con = Conexion.conectar();
            stm= con.createStatement();
            ps = con.prepareStatement(sql);
            ps.setString(1, _codigolibroisbn);
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }
}

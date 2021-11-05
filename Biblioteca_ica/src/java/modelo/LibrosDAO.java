package modelo;

import java.sql.ResultSet;
import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LibrosDAO {

    Connection conexion;

    public LibrosDAO() throws ClassNotFoundException {
        Conexion con = new Conexion();
        conexion = con.getconexion();
    }

    public List<Libros> listarlibros() {
        PreparedStatement ps;
        ResultSet rs;

        List<Libros> listalibros = new ArrayList<>();
        try {
            ps = conexion.prepareStatement("SELECT codigolibroisbn, Libtitulo, Libnumerodepaginas, Lib_codigoautor, Lib_codigomateria, Lib_codigoeditorial, Lib_codigoidioma, Lib_codigosignaturatopografica, Libfechacreacion,Libfecharetiro FROM libros");
            rs = ps.executeQuery();
            while (rs.next()) {
                String codigolibroisbn = rs.getString("codigolibroisbn");
                String Libtitulo = rs.getString("Libtitulo");
                int Libnumerodepaginas = rs.getInt("Libnumerodepaginas");
                int Lib_codigoautor = rs.getInt("Lib_codigoautor");
                int Lib_codigomateria = rs.getInt("Lib_codigomateria");
                int Lib_codigoeditorial = rs.getInt("Lib_codigoeditorial");
                int Lib_codigoidioma = rs.getInt("Lib_codigoidioma");
                String Lib_codigosignaturatopografica = rs.getString("Lib_codigosignaturatopografica");
                String Libfechacreacion = rs.getString("Libfechacreacion");
                String Libfecharetiro = rs.getString("Libfecharetiro");

                Libros libro = new Libros(codigolibroisbn, Libtitulo, Libnumerodepaginas, Lib_codigoautor, Lib_codigomateria, Lib_codigoeditorial, Lib_codigoidioma, Lib_codigosignaturatopografica, Libfechacreacion, Libfecharetiro);
                listalibros.add(libro);
                

            }
            return listalibros;
        } catch (SQLException e) {
            System.out.print(e.toString());
            return null;

        }
    }

    public Libros buscarlibros(String _codigolibroisbn) {
        PreparedStatement ps;
        ResultSet rs;

        Libros libro = null;
        try {
            ps = conexion.prepareStatement("SELECT codigolibroisbn, Libtitulo, Libnumerodepaginas, Lib_codigoautor, Lib_codigomateria, Lib_codigoeditorial, Lib_codigoidioma, Lib_codigosignaturatopografica, Libfechacreacion,Libfecharetiro FROM libros WHERE codigolibroisbn=? ");
            ps.setString(1, _codigolibroisbn);
            rs = ps.executeQuery();
            while (rs.next()) {
                String codigolibroisbn = rs.getString("codigolibroisbn");
                String Libtitulo = rs.getString("Libtitulo");
                int Libnumerodepaginas = rs.getInt("Libnumerodepaginas");
                int Lib_codigoautor = rs.getInt("Lib_codigoautor");
                int Lib_codigomateria = rs.getInt("Lib_codigomateria");
                int Lib_codigoeditorial = rs.getInt("Lib_codigoeditorial");
                int Lib_codigoidioma = rs.getInt("Lib_codigoidioma");
                String Lib_codigosignaturatopografica = rs.getString("Lib_codigosignaturatopografica");
                String Libfechacreacion = rs.getString("Libfechacreacion");
                String Libfecharetiro = rs.getString("Libfecharetiro");

                libro = new Libros(codigolibroisbn, Libtitulo, Libnumerodepaginas, Lib_codigoautor, Lib_codigomateria, Lib_codigoeditorial, Lib_codigoidioma, Lib_codigosignaturatopografica, Libfechacreacion, Libfecharetiro);

            }
            return libro;
        } catch (SQLException e) {
            System.out.print(e.toString());
            return null;

        }
    }

    public boolean agragarlibros(Libros libro) {
        PreparedStatement ps;

        try {
            ps = conexion.prepareStatement("INSERT INTO libros (codigolibroisbn, Libtitulo, Libnumerodepaginas, Lib_codigoautor, Lib_codigomateria, Lib_codigoeditorial, Lib_codigoidioma, Lib_codigosignaturatopografica, Libfechacreacion,Libfecharetiro VALUES(?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, libro.getCodigolibroisbn());
            ps.setString(2, libro.getLibtitulo());
            ps.setInt(3, libro.getLibnumerodepaginas());
            ps.setInt(4, libro.getLib_codigoautor());
            ps.setInt(5, libro.getLib_codigomateria());
            ps.setInt(6, libro.getLib_codigoeditorial());
            ps.setInt(7, libro.getLib_codigoidioma());
            ps.setString(8, libro.getLib_codigosignaturatopografica());
            ps.setString(9, libro.getLibfechacreacion());
            ps.setString(10, libro.getLibfecharetiro());

            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }

    public boolean modificarlibros(Libros libro) {
        PreparedStatement ps;

        try {
            ps = conexion.prepareStatement("UPDATE  libros SET Libtitulo=?, Libnumerodepaginas=?, Lib_codigoautor=?, Lib_codigomateria=?, Lib_codigoeditorial=?, Lib_codigoidioma=?, Lib_codigosignaturatopografica=?, Libfechacreacion=?,Libfecharetiro=? WHERE codigolibroisbn=? ");
            ps.setString(1, libro.getCodigolibroisbn());
            ps.setString(2, libro.getLibtitulo());
            ps.setInt(3, libro.getLibnumerodepaginas());
            ps.setInt(4, libro.getLib_codigoautor());
            ps.setInt(5, libro.getLib_codigomateria());
            ps.setInt(6, libro.getLib_codigoeditorial());
            ps.setInt(7, libro.getLib_codigoidioma());
            ps.setString(8, libro.getLib_codigosignaturatopografica());
            ps.setString(9, libro.getLibfechacreacion());
            ps.setString(10, libro.getLibfecharetiro());

            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }

    public boolean eliminarlibros(String _codigolibroisbn) {
        PreparedStatement ps;

        try {
            ps = conexion.prepareStatement("DELETE FROM libros WHERE codigolibroisbn=? ");
            ps.setString(1, _codigolibroisbn);

            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }
}

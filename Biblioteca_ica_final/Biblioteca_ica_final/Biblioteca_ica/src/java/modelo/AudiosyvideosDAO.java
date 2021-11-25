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

public class AudiosyvideosDAO {
    
    public List<Audiosyvideos> listar() {
        ResultSet rs;
        
        Statement stm;
        Connection con;

        List<Audiosyvideos> lista = new ArrayList<>();
        try {
            String sql = "SELECT av.codigoaudiosyvideosisbn, av.AyVtitulo, av.AyVcontenido, av.AyV_codigoautor, av.AyV_codigomateria, "+
                    "av.AyV_codigoeditorial, av.AyV_codigoidioma, av.AyVfechacreacion, "+
                    "a.autnombresapellidos, m.matnombremateria, e.Edinombreeditorial, i.idinombreidioma, "+
                    "s.codigosignaturatopografica, Invcantidad "+
                    "FROM audiosyvideos av "+ 
                    "join autor a on av.AyV_codigoautor = a.codigoautor "+
                    "join materia m on av.AyV_codigomateria = m.codigomateria "+
                    "join editorial e on av.AyV_codigoeditorial = e.codigoeditorial "+
                    "join idioma i on av.AyV_codigoidioma = i.codigoidioma "+
                    "join signaturatopografica s on s.STo_codigoaudiosyvideosisbn = av.codigoaudiosyvideosisbn "+
                    "left join inventario v on v.Inv_codigoaudiosyvideosisbn = av.codigoaudiosyvideosisbn";
            
            con = Conexion.conectar();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                String codigoaudiosyvideosisbn = rs.getString("codigoaudiosyvideosisbn");
                String ayVtitulo = rs.getString("AyVtitulo");
                String ayVcontenido = rs.getString("AyVcontenido");
                int ayVcodigoautor = rs.getInt("AyV_codigoautor");
                int ayVcodigomateria = rs.getInt("AyV_codigomateria");
                int ayVcodigoeditorial = rs.getInt("AyV_codigoeditorial");
                int ayVcodigoidioma = rs.getInt("AyV_codigoidioma");
                Date ayVfechacreacion = rs.getDate("AyVfechacreacion");
                String autnombresapellidos = rs.getString("autnombresapellidos");
                String matnombremateria = rs.getString("matnombremateria");
                String edinombreeditorial = rs.getString("edinombreeditorial");
                String idinombreidioma = rs.getString("idinombreidioma");
                String ayVcodigosignaturatopografica = rs.getString("codigosignaturatopografica");
                int invcantidad = rs.getInt("Invcantidad");

                Audiosyvideos audios = new Audiosyvideos(codigoaudiosyvideosisbn, ayVtitulo, ayVcontenido, ayVcodigoautor, ayVcodigomateria, 
                        ayVcodigoeditorial, ayVcodigoidioma, ayVfechacreacion,
                        autnombresapellidos, matnombremateria, edinombreeditorial, idinombreidioma, ayVcodigosignaturatopografica, invcantidad);
                lista.add(audios);

            }
            return lista;
        } catch (SQLException e) {
            System.out.print(e.toString());
            return null;

        }
    }

    public Audiosyvideos buscar(String codigoAudio) {
        PreparedStatement ps;
        ResultSet rs;
        
        Statement stm= null;
        Connection con=null;
        
        Audiosyvideos audio = null;
        try {
            String sql = "SELECT av.codigoaudiosyvideosisbn, av.AyVtitulo, av.AyVcontenido, av.AyV_codigoautor, av.AyV_codigomateria, "+
                    "av.AyV_codigoeditorial, av.AyV_codigoidioma, av.AyVfechacreacion, av.AyVfecharetiro, "+
                    "a.autnombresapellidos, m.matnombremateria, e.Edinombreeditorial, i.idinombreidioma, "+
                    "s.codigosignaturatopografica, Invcantidad "+
                    "FROM audiosyvideos av "+ 
                    "join autor a on av.AyV_codigoautor = a.codigoautor "+
                    "join materia m on av.AyV_codigomateria = m.codigomateria "+
                    "join editorial e on av.AyV_codigoeditorial = e.codigoeditorial "+
                    "join idioma i on av.AyV_codigoidioma = i.codigoidioma "+
                    "join signaturatopografica s on s.STo_codigoaudiosyvideosisbn = av.codigoaudiosyvideosisbn "+
                    "left join inventario v on v.Inv_codigoaudiosyvideosisbn = av.codigoaudiosyvideosisbn "+
                    "WHERE codigoaudiosyvideosisbn = '"+codigoAudio+"'";
            
            con = Conexion.conectar();
            stm= con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                String codigoaudiosyvideosisbn = rs.getString("codigoaudiosyvideosisbn");
                String ayVtitulo = rs.getString("AyVtitulo");
                String ayVcontenido = rs.getString("AyVcontenido");
                int ayVcodigoautor = rs.getInt("AyV_codigoautor");
                int ayVcodigomateria = rs.getInt("AyV_codigomateria");
                int ayVcodigoeditorial = rs.getInt("AyV_codigoeditorial");
                int ayVcodigoidioma = rs.getInt("AyV_codigoidioma");
                String ayVcodigosignaturatopografica = rs.getString("codigosignaturatopografica");
                Date ayVfechacreacion = rs.getDate("AyVfechacreacion");
                String autnombresapellidos = rs.getString("autnombresapellidos");
                String matnombremateria = rs.getString("matnombremateria");
                String edinombreeditorial = rs.getString("edinombreeditorial");
                String idinombreidioma = rs.getString("idinombreidioma");   
                int invcantidad = rs.getInt("Invcantidad");

                audio = new Audiosyvideos(codigoaudiosyvideosisbn, ayVtitulo, ayVcontenido, ayVcodigoautor, ayVcodigomateria, 
                        ayVcodigoeditorial, ayVcodigoidioma, ayVfechacreacion,
                        autnombresapellidos, matnombremateria, edinombreeditorial, idinombreidioma, ayVcodigosignaturatopografica, invcantidad);

            }
            return audio;
        } catch (SQLException e) {
            System.out.print(e.toString());
            return null;

        }
    }

    public boolean insertar(Audiosyvideos audio) {
        PreparedStatement ps;

        Statement stm= null;
        Connection con=null;

        try {
            String sql = "INSERT INTO audiosyvideos (codigoaudiosyvideosisbn, AyVtitulo, AyVcontenido, AyV_codigoautor, "+
                    "AyV_codigomateria, AyV_codigoeditorial, AyV_codigoidioma, AyVfechacreacion) VALUES(?,?,?,?,?,?,?,now())";
            con = Conexion.conectar();
            stm= con.createStatement();
            ps = con.prepareStatement(sql);
            ps.setString(1, audio.getCodigoaudiosyvideosisbn());
            ps.setString(2, audio.getAyVtitulo());
            ps.setString(3, audio.getAyVcontenido());
            ps.setInt(4, audio.getAyVcodigoautor());
            ps.setInt(5, audio.getAyVcodigomateria());
            ps.setInt(6, audio.getAyVcodigoeditorial());
            ps.setInt(7, audio.getAyVcodigoidioma());
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }
    public boolean modificar(Audiosyvideos audio, String codigoAnt) {
        PreparedStatement ps;
        
        Statement stm= null;
        Connection con=null;
        

        try {
            String sql = "UPDATE  audiosyvideos SET codigoaudiosyvideosisbn = ?, AyVtitulo = ?, AyVcontenido = ?, AyV_codigoautor = ?, "+
                    "AyV_codigomateria = ?, AyV_codigoeditorial = ?, AyV_codigoidioma = ? WHERE codigoaudiosyvideosisbn=? ";
            con = Conexion.conectar();
            stm= con.createStatement();
            ps = con.prepareStatement(sql);
            ps.setString(1, audio.getCodigoaudiosyvideosisbn());
            ps.setString(2, audio.getAyVtitulo());
            ps.setString(3, audio.getAyVcontenido());
            ps.setInt(4, audio.getAyVcodigoautor());
            ps.setInt(5, audio.getAyVcodigomateria());
            ps.setInt(6, audio.getAyVcodigoeditorial());
            ps.setInt(7, audio.getAyVcodigoidioma());
            ps.setString(8, codigoAnt);
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }
     public boolean eliminar(String codigo) {
        PreparedStatement ps;
        Statement stm;
        Connection con;
        try {
            String sql = "DELETE FROM audiosyvideos WHERE codigoaudiosyvideosisbn=? ";
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

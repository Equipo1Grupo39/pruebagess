package modelo;

import java.sql.ResultSet;
import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;
import java.sql.Statement;
import java.util.Calendar;


public class ReservasDAO {
    
    private Conexion con = new Conexion();
    private Connection connection =  null;     

    public List<Reservas> listar(int idusuario) {
        PreparedStatement ps;
        ResultSet rs;
        
        Statement stm= null;
        Connection con=null;

        List<Reservas> lista = new ArrayList<>();
        try {
            String sql = "SELECT codigoreservas, Res_idusuario, Res_idadministrador, concat(Usulogin,' - ',Usunombresapellidos) nombreAdmon, "+
                "Res_codigolibroisbn codigo, Libtitulo titulo, Resfechareserva, Resfechaactualizacion, Resestado, 'L' tipo "+                    
                "FROM reservas, libros, usuario " +
                "WHERE Res_codigolibroisbn = codigolibroisbn " +
                "AND Res_idadministrador = idusuario "+
                "AND Res_idusuario = "+ idusuario + 
                " UNION "+
                "SELECT codigoreservas, Res_idusuario, Res_idadministrador, concat(Usulogin,' - ',Usunombresapellidos) nombreAdmon, "+
                "Res_codigoaudiosyvideosisbn codigo, AyVtitulo titulo, Resfechareserva, Resfechaactualizacion, Resestado, 'A' tipo "+
                "FROM reservas, audiosyvideos, usuario " +
                "WHERE Res_codigoaudiosyvideosisbn = codigoaudiosyvideosisbn "+
                "AND Res_idadministrador = idusuario "+
                "AND Res_idusuario = "+ idusuario;
            
            con = Conexion.conectar();
            stm= con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Integer codigoreservas = rs.getInt("codigoreservas");
                Integer residusuario = rs.getInt("Res_idusuario");
                Integer residadministrador = rs.getInt("Res_idadministrador");
                String codigo = rs.getString("codigo");
                String titulo = rs.getString("titulo");
                Date resfechareserva = rs.getDate("Resfechareserva");
                Date resfechaactualizacion = rs.getDate("Resfechaactualizacion");
                String resestado = rs.getString("Resestado");
                String nombreAdmon = rs.getString("nombreAdmon");
                String tipo = rs.getString("tipo");

                Reservas reservas = new Reservas(codigoreservas, residusuario, residadministrador, codigo, 
                        titulo, resfechareserva, resfechaactualizacion, resestado, nombreAdmon, tipo);
                lista.add(reservas);

            }
            return lista;
        } catch (SQLException e) {
            System.out.print(e.toString());
            return null;

        }
    }
    
    public Reservas buscar(int idReserva) {
        PreparedStatement ps;
        ResultSet rs;
        
        Statement stm= null;
        Connection con=null;

        Reservas reserva = new Reservas();
        try {
            String sql = "SELECT codigoreservas, Res_idusuario, Res_idadministrador, concat(Usulogin,' - ',Usunombresapellidos) nombreAdmon, "+
                "Res_codigolibroisbn codigo, Libtitulo titulo, Resfechareserva, Resfechaactualizacion, Resestado, 'L' tipo "+                    
                "FROM reservas, libros, usuario " +
                "WHERE Res_codigolibroisbn = codigolibroisbn " +
                "AND Res_idadministrador = idusuario "+
                "AND codigoreservas = "+ idReserva + 
                " UNION "+
                "SELECT codigoreservas, Res_idusuario, Res_idadministrador, concat(Usulogin,' - ',Usunombresapellidos) nombreAdmon, "+
                "Res_codigoaudiosyvideosisbn codigo, AyVtitulo titulo, Resfechareserva, Resfechaactualizacion, Resestado, 'A' tipo "+
                "FROM reservas, audiosyvideos, usuario " +
                "WHERE Res_codigoaudiosyvideosisbn = codigoaudiosyvideosisbn "+
                "AND Res_idadministrador = idusuario "+
                "AND codigoreservas = "+ idReserva;
            
            con = Conexion.conectar();
            stm= con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Integer codigoreservas = rs.getInt("codigoreservas");
                Integer residusuario = rs.getInt("Res_idusuario");
                Integer residadministrador = rs.getInt("Res_idadministrador");
                String codigo = rs.getString("codigo");
                String titulo = rs.getString("titulo");
                Date resfechareserva = rs.getDate("Resfechareserva");
                Date resfechaactualizacion = rs.getDate("Resfechaactualizacion");
                String resestado = rs.getString("Resestado");
                String nombreAdmon = rs.getString("nombreAdmon");
                String tipo = rs.getString("tipo");

                reserva = new Reservas(codigoreservas, residusuario, residadministrador, codigo, 
                        titulo, resfechareserva, resfechaactualizacion, resestado, nombreAdmon, tipo);
            }
            return reserva;
        } catch (SQLException e) {
            System.out.print(e.toString());
            return null;

        }
    }
    
        
    public boolean insertarLib(Reservas reservas) {
        PreparedStatement ps = null;
        Statement stm = null;
        Connection con = null;
        ResultSet rs = null;
        int codigoreservas = 0; 
        Date sqlDate;

        try {
            String sql = "SELECT max(codigoreservas)+1 codigoreservas FROM reservas";
            con = Conexion.conectar();
            stm= con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                codigoreservas = rs.getInt("codigoreservas");  
            }
                       
            sql = "INSERT INTO reservas (codigoreservas, Res_idusuario, Res_idadministrador, "+
                    "Res_codigolibroisbn, Resfechareserva, Resestado) "+
                    "VALUES(?,?,?,?,?,?)";
            con = Conexion.conectar();
            stm= con.createStatement();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigoreservas);
            ps.setInt(2, reservas.getResidusuario());
            ps.setInt(3, reservas.getResidadministrador());
            ps.setString(4, reservas.getCodigo());
            
            sqlDate = new java.sql.Date(reservas.getResfechareserva().getTime());            
            ps.setDate(5, sqlDate);
                        
            ps.setString(6, "A");
            
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }
        
    public boolean insertarAud(Reservas reservas) {
        PreparedStatement ps = null;
        Statement stm = null;
        Connection con = null;
        ResultSet rs = null;
        int codigoreservas = 0; 
        Date sqlDate;

        try {
            String sql = "SELECT max(codigoreservas)+1 codigoreservas FROM reservas";
            con = Conexion.conectar();
            stm= con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                codigoreservas = rs.getInt("codigoreservas");  
            }
                       
            sql = "INSERT INTO prestamos (codigoreservas, Res_idusuario, Res_idadministrador, "+
                    "Res_codigoaudiosyvideosisbn, Resfechareserva, Resestado) "+
                    "VALUES(?,?,?,?,?,?)";
            con = Conexion.conectar();
            stm= con.createStatement();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigoreservas);
            ps.setInt(2, reservas.getResidusuario());
            ps.setInt(3, reservas.getResidadministrador());
            ps.setString(4, reservas.getCodigo());
            
            sqlDate = new java.sql.Date(reservas.getResfechareserva().getTime());            
            ps.setDate(5, sqlDate);
                        
            ps.setString(6, "A");
            
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }
    
    
    public boolean modificar(int codigoreservas, String estado) {
        PreparedStatement ps = null;        
        Statement stm= null;
        Connection con=null;
        
        try {
            String sql = "UPDATE  reservas SET Resestado = ?, Resfechaactualizacion = now() WHERE codigoreservas = ? ";
            con = Conexion.conectar();
            stm= con.createStatement();
            ps = con.prepareStatement(sql);
            ps.setString(1, estado);
            ps.setInt(2, codigoreservas);

            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }
}

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
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class PrestamosDAO {
    
    private Conexion con = new Conexion();
    private Connection connection =  null;     

    public List<Prestamos> listar(int pridusuario) {
        PreparedStatement ps;
        ResultSet rs;
        
        Statement stm= null;
        Connection con=null;

        List<Prestamos> lista = new ArrayList<>();
        try {
            String sql = "SELECT codigoprestamo, Pr_idusuario, Pr_idadministrador, concat(Usulogin,' - ',Usunombresapellidos) nombreAdmon, "+
                "Pr_codigolibroisbn codigo, Libtitulo titulo, Prfechaprestamo, Prfechaprogdevolucion, "+
                "Prestado, 'L' tipo, Pr_codigofacturasmulta, FMuestado "+                    
                "FROM prestamos " +
                "INNER JOIN libros ON Pr_codigolibroisbn = codigolibroisbn "+
                "INNER JOIN usuario ON Pr_idadministrador = idusuario "+
                "LEFT OUTER JOIN facturasmulta ON Pr_codigofacturasmulta = codigofacturasmulta "+
                "WHERE Pr_idusuario = "+ pridusuario + 
                " UNION "+
                "SELECT codigoprestamo, Pr_idusuario, Pr_idadministrador, concat(Usulogin,' - ',Usunombresapellidos) nombreAdmon, "+
                "Pr_codigoaudiosyvideosisbn codigo, AyVtitulo titulo, Prfechaprestamo, Prfechaprogdevolucion, "+
                "Prestado, 'A' tipo, Pr_codigofacturasmulta, FMuestado "+
                "FROM prestamos " +
                "INNER JOIN audiosyvideos ON Pr_codigoaudiosyvideosisbn = codigoaudiosyvideosisbn "+
                "INNER JOIN usuario ON Pr_idadministrador = idusuario "+
                "LEFT OUTER JOIN facturasmulta ON Pr_codigofacturasmulta = codigofacturasmulta "+
                "WHERE Pr_idusuario = "+ pridusuario;
            
            con = Conexion.conectar();
            stm= con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Integer codigoprestamo = rs.getInt("codigoprestamo");
                Integer pridadministrador = rs.getInt("Pr_idadministrador");
                String codigo = rs.getString("codigo");
                String titulo = rs.getString("titulo");
                Date prfechaprestamo = rs.getDate("Prfechaprestamo");
                Date prfechaprogdevolucion = rs.getDate("Prfechaprogdevolucion");
                String prestado = rs.getString("Prestado");
                String nombreAdmon = rs.getString("nombreAdmon");
                String tipo = rs.getString("tipo");
                Integer prcodigofacturasmulta = rs.getInt("Pr_codigofacturasmulta");
                String fMuestado = rs.getString("FMuestado");

                Prestamos prestamos = new Prestamos(codigoprestamo, pridusuario, pridadministrador, codigo, 
                        titulo, prfechaprestamo, prfechaprogdevolucion, prestado, nombreAdmon, tipo, 
                        prcodigofacturasmulta, fMuestado);
                lista.add(prestamos);

            }
            return lista;
        } catch (SQLException e) {
            System.out.print(e.toString());
            return null;

        }
    }
        
    public boolean insertarLib(Prestamos prestamos) {
        PreparedStatement ps = null;
        Statement stm = null;
        Connection con = null;
        ResultSet rs = null;
        int codigoprestamo = 0; 
        Date sqlDate;

        try {
            String sql = "SELECT max(codigoprestamo)+1 codigoprestamo FROM prestamos";
            con = Conexion.conectar();
            stm= con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                codigoprestamo = rs.getInt("codigoprestamo");  
            }
                       
            sql = "INSERT INTO prestamos (codigoprestamo, Pr_idusuario, Pr_idadministrador, "+
                    "Pr_codigolibroisbn, Prfechaprestamo, Prfechaprogdevolucion, Prestado) "+
                    "VALUES(?,?,?,?,?,?,?)";
            con = Conexion.conectar();
            stm= con.createStatement();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigoprestamo);
            ps.setInt(2, prestamos.getPridusuario());
            ps.setInt(3, prestamos.getPridadministrador());
            ps.setString(4, prestamos.getCodigo());
            
            sqlDate = new java.sql.Date(prestamos.getPrfechaprestamo().getTime());            
            ps.setDate(5, sqlDate);            
            
            java.util.Date dt = new java.util.Date();
            Calendar c = Calendar.getInstance();
            c.setTime(prestamos.getPrfechaprestamo());
            c.add(Calendar.DATE, 8); 
            dt = c.getTime();            
            sqlDate = new java.sql.Date(dt.getTime()); 
            ps.setDate(6, sqlDate);
            
            ps.setString(7, "V");
            
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }
        
    public boolean insertarAud(Prestamos prestamos) {
        PreparedStatement ps = null;
        Statement stm = null;
        Connection con = null;
        ResultSet rs = null;
        int codigoprestamo = 0; 
        Date sqlDate;

        try {
            String sql = "SELECT max(codigoprestamo)+1 codigoprestamo FROM prestamos";
            con = Conexion.conectar();
            stm= con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                codigoprestamo = rs.getInt("codigoprestamo");  
            }
                       
            sql = "INSERT INTO prestamos (codigoprestamo, Pr_idusuario, Pr_idadministrador, "+
                    "Pr_codigoaudiosyvideosisbn, Prfechaprestamo, Prfechaprogdevolucion, Prestado) "+
                    "VALUES(?,?,?,?,?,?,?)";
            con = Conexion.conectar();
            stm= con.createStatement();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigoprestamo);
            ps.setInt(2, prestamos.getPridusuario());
            ps.setInt(3, prestamos.getPridadministrador());
            ps.setString(4, prestamos.getCodigo());
            
            sqlDate = new java.sql.Date(prestamos.getPrfechaprestamo().getTime());            
            ps.setDate(5, sqlDate);
            
            java.util.Date dt = new java.util.Date();
            Calendar c = Calendar.getInstance();
            c.setTime(prestamos.getPrfechaprestamo());
            c.add(Calendar.DATE, 8); 
            dt = c.getTime();            
            sqlDate = new java.sql.Date(dt.getTime()); 
            ps.setDate(6, sqlDate);
            
            ps.setString(7, "V");
            
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }
    
    
    public boolean modificar(int codigoprestamo, String estado) {
        PreparedStatement ps = null;        
        Statement stm= null;
        Connection con=null;
        
        try {
            String sql = "UPDATE  prestamos SET Prestado = ?, Prfecharealdevolucion = now() WHERE codigoprestamo = ? ";
            con = Conexion.conectar();
            stm= con.createStatement();
            ps = con.prepareStatement(sql);
            ps.setString(1, estado);
            ps.setInt(2, codigoprestamo);

            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }
}

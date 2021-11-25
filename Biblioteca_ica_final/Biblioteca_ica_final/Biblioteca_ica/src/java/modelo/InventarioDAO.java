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

public class InventarioDAO {
    
    private Conexion con = new Conexion();
    private Connection connection =  null;     

    public List<Inventario> listar() {
        PreparedStatement ps;
        ResultSet rs;
        
        Statement stm= null;
        Connection con=null;

        List<Inventario> lista = new ArrayList<>();
        try {
            String sql = "SELECT codigoinventario, Inv_codigolibroisbn codigo, Libtitulo titulo, "+
                "Invcantidad, Invsalidas "+                    
                "FROM inventario, libros " +
                "WHERE Inv_codigolibroisbn = codigolibroisbn " +
                "UNION "+
                "SELECT codigoinventario, Inv_codigoaudiosyvideosisbn codigo, AyVtitulo titulo, "+
                "Invcantidad, Invsalidas"+
                "FROM inventario, audiosyvideos " +
                "WHERE Inv_codigoaudiosyvideosisbn = codigoaudiosyvideosisbn";
            
            con = Conexion.conectar();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Integer codigoinventario = rs.getInt("codigoinventario");
                String codigo = rs.getString("codigo");
                String titulo = rs.getString("titulo");
                Integer invcantidad = rs.getInt("Invcantidad");
                Integer invsalidas = rs.getInt("Invsalidas");

                Inventario inventario = new Inventario(codigoinventario, codigo, titulo, 
                        invcantidad, invsalidas);
                lista.add(inventario);

            }
            return lista;
        } catch (SQLException e) {
            System.out.print(e.toString());
            return null;

        }
    }

    public Inventario buscar(int codigo) {
        PreparedStatement ps;
        ResultSet rs;
        
        Statement stm= null;
        Connection con=null;
        
        Inventario inventario = null;
        try {
            String sql = "SELECT codigoinventario, Inv_codigolibroisbn, Inv_codigoaudiosyvideosisbn, "+
                    "Invcantidad, Invsalidas  FROM inventario WHERE codigoinventario = "+codigo;
            con = Conexion.conectar();
            stm= con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Integer codigoinventario = rs.getInt("codigoinventario");
                String invcodigolibroisbn = rs.getString("Inv_codigolibroisbn");
                String invcodigoaudiosyvideosisbn = rs.getString("Inv_codigoaudiosyvideosisbn");
                Integer invcantidad = rs.getInt("Invcantidad");
                Integer invsalidas = rs.getInt("Invsalidas");

                inventario = new Inventario(codigoinventario, invcodigolibroisbn, invcodigoaudiosyvideosisbn, invcantidad, invsalidas);
            }
            return inventario;
        } catch (SQLException e) {
            System.out.print(e.toString());
            return null;

        }
    }
        
    public boolean insertar(Inventario inventario) {
        PreparedStatement ps = null;
        Statement stm = null;
        Connection con = null;
        ResultSet rs = null;
        int codigoinventario = 0; 

        try {
            String sql = "SELECT max(codigoinventario)+1 codigoinventario FROM inventario";
            con = Conexion.conectar();
            stm= con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                codigoinventario = rs.getInt("codigoinventario");  
            }
                       
            sql = "INSERT INTO Inventario (codigoinventario, Inv_codigolibroisbn, "+
                    "Invcantidad, Invsalidas, Invfechacreacion) VALUES(?,?,?,0, now())";
            con = Conexion.conectar();
            stm= con.createStatement();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigoinventario);
            ps.setString(2, inventario.getCodigo());
            ps.setInt(3, inventario.getInvcantidad());

            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }
        
    public boolean insertarAud(Inventario inventario) {
        PreparedStatement ps = null;
        Statement stm = null;
        Connection con = null;
        ResultSet rs = null;
        int codigoinventario = 0; 

        try {
            String sql = "SELECT max(codigoinventario)+1 codigoinventario FROM inventario";
            con = Conexion.conectar();
            stm= con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                codigoinventario = rs.getInt("codigoinventario");  
            }
                       
            sql = "INSERT INTO Inventario (codigoinventario, Inv_codigoaudiosyvideosisbn, "+
                    "Invcantidad, Invsalidas, Invfechacreacion) VALUES(?,?,?,0, now())";
            con = Conexion.conectar();
            stm= con.createStatement();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigoinventario);
            ps.setString(2, inventario.getCodigo());
            ps.setInt(3, inventario.getInvcantidad());

            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }
    
    
    public boolean modificar(Inventario inventario) {
        PreparedStatement ps = null;        
        Statement stm= null;
        Connection con=null;
        

        try {
            String sql = "UPDATE  inventario SET Invcantidad = ? WHERE codigoinventario = ? ";
            con = Conexion.conectar();
            stm= con.createStatement();
            ps = con.prepareStatement(sql);
            ps.setInt(1, inventario.getInvcantidad());
            ps.setInt(2, inventario.getCodigoinventario());

            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }
    
    public boolean actualizarInv(String codigoLib, String codigoAud) {
        PreparedStatement ps = null;        
        Statement stm= null;
        Connection con=null;
        ResultSet rs;
        String sql;
        Integer cantidad = 0;
        
        try {            
            if (!codigoLib.equals("")) {
                sql = "SELECT  (Invsalidas+1) cantidad FROM inventario WHERE Inv_codigolibroisbn = '"+codigoLib+"'";
                con = Conexion.conectar();
                stm= con.createStatement();
                rs = stm.executeQuery(sql);
                while (rs.next()) {
                    cantidad = rs.getInt("cantidad");
                }
                                
                sql = "UPDATE  inventario SET Invsalidas = ?, Invfechaactualizacion = now() WHERE Inv_codigolibroisbn = ? ";
                con = Conexion.conectar();
                stm= con.createStatement();
                ps = con.prepareStatement(sql);
                ps.setInt(1, cantidad);
                ps.setString(2, codigoLib);
                
                ps.execute();
            }

            if (!codigoAud.equals("")) {
                sql = "SELECT  (Invsalidas+1) cantidad FROM inventario WHERE Inv_codigoaudiosyvideosisbn = '"+codigoAud+"'";
                con = Conexion.conectar();
                stm= con.createStatement();
                rs = stm.executeQuery(sql);
                while (rs.next()) {
                    cantidad = rs.getInt("cantidad");
                }
                                
                sql = "UPDATE  inventario SET Invsalidas = ?, Invfechaactualizacion = now() WHERE Inv_codigoaudiosyvideosisbn = ? ";
                con = Conexion.conectar();
                stm= con.createStatement();
                ps = con.prepareStatement(sql);
                ps.setInt(1, cantidad);
                ps.setString(2, codigoAud);
                
                ps.execute();
            }
            
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }    

    public boolean devolverInv(String codigoLib, String codigoAud) {
        PreparedStatement ps = null;        
        Statement stm= null;
        Connection con=null;
        ResultSet rs;
        String sql;
        Integer cantidad = 0;
        
        try {            
            if (!codigoLib.equals("")) {
                sql = "SELECT  (Invsalidas-1) cantidad FROM inventario WHERE Inv_codigolibroisbn = '"+codigoLib+"'";
                con = Conexion.conectar();
                stm= con.createStatement();
                rs = stm.executeQuery(sql);
                while (rs.next()) {
                    cantidad = rs.getInt("cantidad");
                }
                                
                sql = "UPDATE  inventario SET Invsalidas = ?, Invfechaactualizacion = now() WHERE Inv_codigolibroisbn = ? ";
                con = Conexion.conectar();
                stm= con.createStatement();
                ps = con.prepareStatement(sql);
                ps.setInt(1, cantidad);
                ps.setString(2, codigoLib);
                
                ps.execute();
            }

            if (!codigoAud.equals("")) {
                sql = "SELECT  (Invsalidas-1) cantidad FROM inventario WHERE Inv_codigoaudiosyvideosisbn = '"+codigoAud+"'";
                con = Conexion.conectar();
                stm= con.createStatement();
                rs = stm.executeQuery(sql);
                while (rs.next()) {
                    cantidad = rs.getInt("cantidad");
                }
                                
                sql = "UPDATE  inventario SET Invsalidas = ?, Invfechaactualizacion = now() WHERE Inv_codigoaudiosyvideosisbn = ? ";
                con = Conexion.conectar();
                stm= con.createStatement();
                ps = con.prepareStatement(sql);
                ps.setInt(1, cantidad);
                ps.setString(2, codigoAud);
                
                ps.execute();
            }
            
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }    
    
    
    public boolean eliminar(String codigo) {
        PreparedStatement ps=null;
        Statement stm= null;
        Connection con=null;
        try {
            String sql = "DELETE FROM inventario WHERE Inv_codigolibroisbn = ? ";
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

    public boolean eliminarAud(String codigo) {
        PreparedStatement ps=null;
        Statement stm= null;
        Connection con=null;
        try {
            String sql = "DELETE FROM inventario WHERE Inv_codigoaudiosyvideosisbn = ? ";
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

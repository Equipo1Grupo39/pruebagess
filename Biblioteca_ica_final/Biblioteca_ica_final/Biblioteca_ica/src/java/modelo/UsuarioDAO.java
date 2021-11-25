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

public class UsuarioDAO {
    
    private Conexion con = new Conexion();
    private Connection connection =  null;     

    public List<Usuario> listar() {
        PreparedStatement ps;
        ResultSet rs;
        
        Statement stm= null;
        Connection con=null;

        List<Usuario> lista = new ArrayList<>();
        try {
            String sql = "SELECT idusuario, Usulogin, Usucedula, Usunombresapellidos, Usuemail, Usutelefono, Usudireccion, "
                    + "Usutipo, Usuestado, Usufechacreacion, Usufechainactivacion FROM Usuario";
            con = Conexion.conectar();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Integer idusuario = rs.getInt("idusuario");
                String usulogin = rs.getString("Usulogin");
                String usucedula = rs.getString("Usucedula");
                String usunombresapellidos = rs.getString("Usunombresapellidos");
                String usuemail = rs.getString("Usuemail");
                String usutelefono = rs.getString("Usutelefono");
                String usudireccion = rs.getString("Usudireccion");
                String usutipo = rs.getString("Usutipo");
                String usuestado = rs.getString("Usuestado");                
                Date usufechacreacion = rs.getDate("Usufechacreacion");
                Date usufechainactivacion = rs.getDate("Usufechainactivacion");

                Usuario usuario = new Usuario(idusuario, usulogin, usucedula, usunombresapellidos, usuemail, 
                        usutelefono, usudireccion, usutipo, usuestado, usufechacreacion, usufechainactivacion);
                lista.add(usuario);

            }
            return lista;
        } catch (SQLException e) {
            System.out.print(e.toString());
            return null;

        }
    }

    public List<Usuario> listarTipoUsu(String tipo) {
        PreparedStatement ps;
        ResultSet rs;
        
        Statement stm= null;
        Connection con=null;

        List<Usuario> lista = new ArrayList<>();
        try {
            String sql = "SELECT idusuario, Usulogin, Usucedula, Usunombresapellidos, Usuemail, Usutelefono, Usudireccion, "
                    + "Usutipo, Usuestado, Usufechacreacion, Usufechainactivacion FROM Usuario "+
                    "Where Usutipo = '"+tipo+"'";
            con = Conexion.conectar();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Integer idusuario = rs.getInt("idusuario");
                String usulogin = rs.getString("Usulogin");
                String usucedula = rs.getString("Usucedula");
                String usunombresapellidos = rs.getString("Usunombresapellidos");
                String usuemail = rs.getString("Usuemail");
                String usutelefono = rs.getString("Usutelefono");
                String usudireccion = rs.getString("Usudireccion");
                String usutipo = rs.getString("Usutipo");
                String usuestado = rs.getString("Usuestado");                
                Date usufechacreacion = rs.getDate("Usufechacreacion");
                Date usufechainactivacion = rs.getDate("Usufechainactivacion");

                Usuario usuario = new Usuario(idusuario, usulogin, usucedula, usunombresapellidos, usuemail, 
                        usutelefono, usudireccion, usutipo, usuestado, usufechacreacion, usufechainactivacion);
                lista.add(usuario);

            }
            return lista;
        } catch (SQLException e) {
            System.out.print(e.toString());
            return null;

        }
    }

    
    public Usuario buscar(int codigo) {
        PreparedStatement ps;
        ResultSet rs;
        
        Statement stm= null;
        Connection con=null;
        
        Usuario usuario = null;
        try {
            String sql = "SELECT idusuario, Usulogin, Usucedula, Usunombresapellidos, Usuemail, Usutelefono, Usudireccion, "
                    + "Usutipo, Usuestado, Usucontrasena FROM Usuario WHERE idusuario = "+codigo;
            con = Conexion.conectar();
            stm= con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Integer idusuario = rs.getInt("idusuario");
                String usulogin = rs.getString("Usulogin");
                String usucedula = rs.getString("Usucedula");
                String usunombresapellidos = rs.getString("Usunombresapellidos");
                String usuemail = rs.getString("Usuemail");
                String usutelefono = rs.getString("Usutelefono");
                String usudireccion = rs.getString("Usudireccion");
                String usutipo = rs.getString("Usutipo");
                String usuestado = rs.getString("Usuestado");                
                String usucontrasena = rs.getString("Usucontrasena");                

                usuario = new Usuario(idusuario, usulogin, usucedula, usunombresapellidos, usuemail, 
                        usutelefono, usudireccion, usutipo, usuestado, usucontrasena);

            }
            return usuario;
        } catch (SQLException e) {
            System.out.print(e.toString());
            return null;

        }
    }

    public Usuario buscar(String cedula) {
        PreparedStatement ps;
        ResultSet rs;
        
        Statement stm= null;
        Connection con=null;
        
        Usuario usuario = null;
        try {
            String sql = "SELECT idusuario, Usulogin, Usucedula, Usunombresapellidos, Usuemail, Usutelefono, Usudireccion, "
                    + "Usutipo, Usuestado, Usucontrasena FROM Usuario WHERE Usucedula = "+cedula;
            con = Conexion.conectar();
            stm= con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Integer idusuario = rs.getInt("idusuario");
                String usulogin = rs.getString("Usulogin");
                String usucedula = rs.getString("Usucedula");
                String usunombresapellidos = rs.getString("Usunombresapellidos");
                String usuemail = rs.getString("Usuemail");
                String usutelefono = rs.getString("Usutelefono");
                String usudireccion = rs.getString("Usudireccion");
                String usutipo = rs.getString("Usutipo");
                String usuestado = rs.getString("Usuestado");                
                String usucontrasena = rs.getString("Usucontrasena");                

                usuario = new Usuario(idusuario, usulogin, usucedula, usunombresapellidos, usuemail, 
                        usutelefono, usudireccion, usutipo, usuestado, usucontrasena);

            }
            return usuario;
        } catch (SQLException e) {
            System.out.print(e.toString());
            return null;

        }
    }
    
    public boolean insertar(Usuario usuario) {
        PreparedStatement ps = null;
        Statement stm = null;
        Connection con = null;
        ResultSet rs = null;
        int idusuario = 0; 

        try {
            
            String sql = "SELECT max(idusuario)+1 idusuario FROM Usuario";
            con = Conexion.conectar();
            stm= con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                idusuario = rs.getInt("idusuario");  
            }            
            
            sql = "INSERT INTO Usuario (idusuario, Usulogin, Usucedula, Usunombresapellidos, "+
                    "Usuemail, Usutelefono, Usudireccion, Usutipo, Usuestado, Usucontrasena, "+
                    "Usufechacreacion) VALUES(?,?,?,?,?,?,?,?,?,?,now())";
            con = Conexion.conectar();
            stm= con.createStatement();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idusuario);
            ps.setString(2, usuario.getUsulogin());
            ps.setString(3, usuario.getUsucedula());
            ps.setString(4, usuario.getUsunombresapellidos());
            ps.setString(5, usuario.getUsuemail());
            ps.setString(6, usuario.getUsutelefono());
            ps.setString(7, usuario.getUsudireccion());
            ps.setString(8, usuario.getUsutipo());   
            ps.setString(9, usuario.getUsuestado());
            ps.setString(10, usuario.getUsucontrasena());            
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }
    
    public boolean modificar(Usuario usuario) {
        PreparedStatement ps = null;        
        Statement stm= null;
        Connection con=null;
        String sql;

        try {
            if (usuario.getUsutipo().equals("A")){
                sql = "UPDATE  Usuario SET Usucedula = ?, Usunombresapellidos = ?, Usuemail = ?, Usutelefono = ?, "+
                        "Usudireccion = ?, Usuestado = ?, Usucontrasena = ? "+
                        "WHERE idusuario = ? ";
                
                con = Conexion.conectar();
                stm= con.createStatement();
                ps = con.prepareStatement(sql);
                ps.setString(1, usuario.getUsucedula());
                ps.setString(2, usuario.getUsunombresapellidos());
                ps.setString(3, usuario.getUsuemail());
                ps.setString(4, usuario.getUsutelefono());
                ps.setString(5, usuario.getUsudireccion());
                ps.setString(6, usuario.getUsuestado());            
                ps.setString(7, usuario.getUsucontrasena());            
                ps.setInt(8, usuario.getIdusuario());                
            } else {
                sql = "UPDATE  Usuario SET Usulogin = ?, Usucedula = ?, Usunombresapellidos = ?, Usuemail = ?, Usutelefono = ?, "+
                        "Usudireccion = ?, Usuestado = ?, Usucontrasena = ? "+
                        "WHERE idusuario = ? ";
                
                con = Conexion.conectar();
                stm= con.createStatement();
                ps = con.prepareStatement(sql);
                ps.setString(1, usuario.getUsucedula());
                ps.setString(2, usuario.getUsucedula());
                ps.setString(3, usuario.getUsunombresapellidos());
                ps.setString(4, usuario.getUsuemail());
                ps.setString(5, usuario.getUsutelefono());
                ps.setString(6, usuario.getUsudireccion());
                ps.setString(7, usuario.getUsuestado());            
                ps.setString(8, usuario.getUsucontrasena());            
                ps.setInt(9, usuario.getIdusuario());                                
            }
            
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }
     public boolean eliminar(Integer idusuario) {
        PreparedStatement ps=null;
        Statement stm= null;
        Connection con=null;
        try {
            String sql = "DELETE FROM Usuario WHERE idusuario = ? ";
            con = Conexion.conectar();
            stm= con.createStatement();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idusuario);
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }
     
    public Usuario identificar(String login, String contrasena) {
        PreparedStatement ps;
        ResultSet rs;
        
        Statement stm= null;
        Connection con=null;
        
        Usuario usuario = null;
        try {
            String sql = "SELECT idusuario, Usulogin, Usucedula, Usunombresapellidos, Usuemail, "+
                    "Usutelefono, Usudireccion, Usutipo, Usuestado, Usucontrasena "+
                    "FROM Usuario "+
                    "WHERE Usulogin = '"+login+"' " +
                    "AND Usucontrasena = '"+contrasena+"'";
            con = Conexion.conectar();
            stm= con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Integer idusuario = rs.getInt("idusuario");
                String usulogin = rs.getString("Usulogin");
                String usucedula = rs.getString("Usucedula");
                String usunombresapellidos = rs.getString("Usunombresapellidos");
                String usuemail = rs.getString("Usuemail");
                String usutelefono = rs.getString("Usutelefono");
                String usudireccion = rs.getString("Usudireccion");
                String usutipo = rs.getString("Usutipo");
                String usuestado = rs.getString("Usuestado");                
                String usucontrasena = rs.getString("Usucontrasena");                

                usuario = new Usuario(idusuario, usulogin, usucedula, usunombresapellidos, usuemail, 
                        usutelefono, usudireccion, usutipo, usuestado, usucontrasena);

            }
            return usuario;
        } catch (SQLException e) {
            System.out.print(e.toString());
            return null;

        }
    }     
}

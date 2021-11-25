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

public class MateriaDAO {
    
    private Conexion con = new Conexion();
    private Connection connection =  null;     

    public List<Materia> listar() {
        PreparedStatement ps;
        ResultSet rs;
        
        Statement stm= null;
        Connection con=null;

        List<Materia> lista = new ArrayList<>();
        try {
            String sql = "SELECT codigomateria, Matnombremateria FROM materia";
            con = Conexion.conectar();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Integer codigomateria = rs.getInt("codigomateria");
                String matnombremateria = rs.getString("Matnombremateria");

                Materia materia = new Materia(codigomateria, matnombremateria);
                lista.add(materia);

            }
            return lista;
        } catch (SQLException e) {
            System.out.print(e.toString());
            return null;

        }
    }

    public Materia buscar(int codigo) {
        PreparedStatement ps;
        ResultSet rs;
        
        Statement stm= null;
        Connection con=null;
        
        Materia materia = null;
        try {
            String sql = "SELECT codigomateria, Matnombremateria FROM materia WHERE codigomateria = "+codigo;
            con = Conexion.conectar();
            stm= con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Integer codigomateria = rs.getInt("codigomateria");
                String matnombremateria = rs.getString("Matnombremateria");

                materia = new Materia(codigomateria, matnombremateria);

            }
            return materia;
        } catch (SQLException e) {
            System.out.print(e.toString());
            return null;

        }
    }

    public boolean insertar(Materia materia) {
        PreparedStatement ps = null;
        Statement stm = null;
        Connection con = null;
        ResultSet rs = null;
        int codigomateria = 0; 

        try {
            String sql = "INSERT INTO Materia (codigomateria, Matnombremateria) VALUES(?,?)";
            con = Conexion.conectar();
            stm= con.createStatement();
            ps = con.prepareStatement(sql);
            ps.setInt(1, materia.getCodigomateria());
            ps.setString(2, materia.getMatnombremateria());

            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }
    public boolean modificar(Materia materia, Integer codigoAnt) {
        PreparedStatement ps = null;        
        Statement stm= null;
        Connection con=null;

        try {
            String sql = "UPDATE  Materia SET codigomateria = ?, Matnombremateria = ? WHERE codigomateria = ? ";
            con = Conexion.conectar();
            stm= con.createStatement();
            ps = con.prepareStatement(sql);
            ps.setInt(1, materia.getCodigomateria());
            ps.setString(2, materia.getMatnombremateria());
            ps.setInt(3, codigoAnt);

            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }
     public boolean eliminar(String codigomateria) {
        PreparedStatement ps=null;
        Statement stm= null;
        Connection con=null;
        try {
            String sql = "DELETE FROM Materia WHERE codigomateria = ? ";
            con = Conexion.conectar();
            stm= con.createStatement();
            ps = con.prepareStatement(sql);
            ps.setString(1, codigomateria);
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }
}

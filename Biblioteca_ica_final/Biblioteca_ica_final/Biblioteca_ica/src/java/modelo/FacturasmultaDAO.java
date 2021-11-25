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

public class FacturasmultaDAO {
    
    private Conexion con = new Conexion();
    private Connection connection =  null;     

    public Integer cantidad(Integer usuario) {
        PreparedStatement ps;
        ResultSet rs;
        
        Statement stm= null;
        Connection con=null;

        Integer cantidad = 0;
        
        try {
            String sql = "SELECT count(*) cantidad FROM facturasmulta "+
                    "WHERE FMu_idusuario = '"+usuario+"' "+
                    "AND FMuestado = 'V'";
            con = Conexion.conectar();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                cantidad = rs.getInt("cantidad");
            }
            return cantidad;
        } catch (SQLException e) {
            System.out.print(e.toString());
            return null;

        }
    }    
    
    public Facturasmulta buscar(int codigo) {
        PreparedStatement ps;
        ResultSet rs;
        
        Statement stm= null;
        Connection con=null;
        
        Facturasmulta factura = null;
        try {
            String sql = "SELECT codigofacturasmulta, FMu_idusuario, FMuvalorafacturar, FMunumero, "+
                    "FMucantidad, FMuestado, FMufecha, FMufechapago FROM facturasmulta "+
                    "WHERE codigofacturasmulta = "+codigo;
            con = Conexion.conectar();
            stm= con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Integer codigofacturasmulta = rs.getInt("codigofacturasmulta");
                Integer fMuidusuario = rs.getInt("FMu_idusuario");
                Integer fMuvalorafacturar = rs.getInt("FMuvalorafacturar");                
                String fMunumero = rs.getString("FMunumero");
                Integer fMucantidad = rs.getInt("FMucantidad");
                String fMuestado = rs.getString("FMuestado");
                java.sql.Date fMufecha = rs.getDate("FMufecha");
                java.sql.Date fMufechapago = rs.getDate("FMufechapago");
                
                factura = new Facturasmulta(codigofacturasmulta, fMuidusuario, fMuvalorafacturar, fMunumero,
                                fMucantidad, fMuestado, fMufecha, fMufechapago);

            }
            return factura;
        } catch (SQLException e) {
            System.out.print(e.toString());
            return null;

        }
    }

    
    public boolean modificar(int codigo) {
        PreparedStatement ps = null;        
        Statement stm= null;
        Connection con=null;

        try {
            String sql = "UPDATE  facturasmulta SET FMuestado = 'C', FMufechapago = now() WHERE codigofacturasmulta = ? ";
            con = Conexion.conectar();
            stm= con.createStatement();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);

            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;

        }
    }
}

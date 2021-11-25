/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;

public class Facturasmulta implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer codigofacturasmulta;
    private Integer fMuidusuario;
    private String fMunumero;
    private Integer fMucantidad;
    private String fMuestado;
    private Date fMufecha;
    private Integer fMuvalorafacturar;
    private Date fMufechapago;
    
    public Facturasmulta() {
    }

    public Facturasmulta(Integer codigofacturasmulta) {
        this.codigofacturasmulta = codigofacturasmulta;
    }

    public Facturasmulta(Integer codigofacturasmulta, Integer fMuidusuario, Integer fMuvalorafacturar,
            String fMunumero, Integer fMucantidad, String fMuestado, Date fMufecha, Date FMufechapago) {
        this.codigofacturasmulta = codigofacturasmulta;
        this.fMuidusuario = fMuidusuario;
        this.fMuvalorafacturar = fMuvalorafacturar;
        this.fMunumero = fMunumero;
        this.fMucantidad = fMucantidad;
        this.fMuestado = fMuestado;
        this.fMufecha = fMufecha;
        this.fMufechapago = FMufechapago;
    }

    public Integer getCodigofacturasmulta() {
        return codigofacturasmulta;
    }

    public void setCodigofacturasmulta(Integer codigofacturasmulta) {
        this.codigofacturasmulta = codigofacturasmulta;
    }

    public Integer getfMuidusuario() {
        return fMuidusuario;
    }

    public void setfMuidusuario(Integer fMuidusuario) {
        this.fMuidusuario = fMuidusuario;
    }

    public String getfMunumero() {
        return fMunumero;
    }

    public void setfMunumero(String fMunumero) {
        this.fMunumero = fMunumero;
    }

    public Integer getfMucantidad() {
        return fMucantidad;
    }

    public void setfMucantidad(Integer fMucantidad) {
        this.fMucantidad = fMucantidad;
    }

    public String getfMuestado() {
        return fMuestado;
    }

    public void setfMuestado(String fMuestado) {
        this.fMuestado = fMuestado;
    }

    public Date getfMufecha() {
        return fMufecha;
    }

    public void setfMufecha(Date fMufecha) {
        this.fMufecha = fMufecha;
    }

    public Integer getfMuvalorafacturar() {
        return fMuvalorafacturar;
    }

    public void setfMuvalorafacturar(Integer fMuvalorafacturar) {
        this.fMuvalorafacturar = fMuvalorafacturar;
    }

    public Date getfMufechapago() {
        return fMufechapago;
    }

    public void setfMufechapago(Date fMufechapago) {
        this.fMufechapago = fMufechapago;
    }


    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigofacturasmulta != null ? codigofacturasmulta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facturasmulta)) {
            return false;
        }
        Facturasmulta other = (Facturasmulta) object;
        if ((this.codigofacturasmulta == null && other.codigofacturasmulta != null) || (this.codigofacturasmulta != null && !this.codigofacturasmulta.equals(other.codigofacturasmulta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Facturasmulta[ codigofacturasmulta=" + codigofacturasmulta + " ]";
    }
    
}

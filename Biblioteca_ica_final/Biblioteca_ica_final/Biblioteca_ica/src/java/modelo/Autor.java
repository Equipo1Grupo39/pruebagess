/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

public class Autor implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer codigoautor;
    private String autnombresapellidos;
    private String autnacionalidad;

    public Autor() {
    }

    public Autor(Integer codigoautor) {
        this.codigoautor = codigoautor;
    }

    public Autor(Integer codigoautor, String autnombresapellidos, String autnacionalidad) {
        this.codigoautor = codigoautor;
        this.autnombresapellidos = autnombresapellidos;
        this.autnacionalidad = autnacionalidad;
    }

    public Integer getCodigoautor() {
        return codigoautor;
    }

    public void setCodigoautor(Integer codigoautor) {
        this.codigoautor = codigoautor;
    }

    public String getAutnombresapellidos() {
        return autnombresapellidos;
    }

    public void setAutnombresapellidos(String autnombresapellidos) {
        this.autnombresapellidos = autnombresapellidos;
    }

    public String getAutnacionalidad() {
        return autnacionalidad;
    }

    public void setAutnacionalidad(String autnacionalidad) {
        this.autnacionalidad = autnacionalidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoautor != null ? codigoautor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Autor)) {
            return false;
        }
        Autor other = (Autor) object;
        if ((this.codigoautor == null && other.codigoautor != null) || (this.codigoautor != null && !this.codigoautor.equals(other.codigoautor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Autor[ codigoautor=" + codigoautor + " ]";
    }
    
}

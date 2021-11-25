/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

public class Materia implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer codigomateria;
    private String matnombremateria;

    public Materia() {
    }

    public Materia(Integer codigomateria) {
        this.codigomateria = codigomateria;
    }

    public Materia(Integer codigomateria, String matnombremateria) {
        this.codigomateria = codigomateria;
        this.matnombremateria = matnombremateria;
    }

    public Integer getCodigomateria() {
        return codigomateria;
    }

    public void setCodigomateria(Integer codigomateria) {
        this.codigomateria = codigomateria;
    }

    public String getMatnombremateria() {
        return matnombremateria;
    }

    public void setMatnombremateria(String matnombremateria) {
        this.matnombremateria = matnombremateria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigomateria != null ? codigomateria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Materia)) {
            return false;
        }
        Materia other = (Materia) object;
        if ((this.codigomateria == null && other.codigomateria != null) || (this.codigomateria != null && !this.codigomateria.equals(other.codigomateria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Materia[ codigomateria=" + codigomateria + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

public class Idioma implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer codigoidioma;
    private String idinombreidioma;

    public Idioma() {
    }

    public Idioma(Integer codigoidioma) {
        this.codigoidioma = codigoidioma;
    }

    public Idioma(Integer codigoidioma, String idinombreidioma) {
        this.codigoidioma = codigoidioma;
        this.idinombreidioma = idinombreidioma;
    }

    public Integer getCodigoidioma() {
        return codigoidioma;
    }

    public void setCodigoidioma(Integer codigoidioma) {
        this.codigoidioma = codigoidioma;
    }

    public String getIdinombreidioma() {
        return idinombreidioma;
    }

    public void setIdinombreidioma(String idinombreidioma) {
        this.idinombreidioma = idinombreidioma;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoidioma != null ? codigoidioma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Idioma)) {
            return false;
        }
        Idioma other = (Idioma) object;
        if ((this.codigoidioma == null && other.codigoidioma != null) || (this.codigoidioma != null && !this.codigoidioma.equals(other.codigoidioma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Idioma[ codigoidioma=" + codigoidioma + " ]";
    }
    
}

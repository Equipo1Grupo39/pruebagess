/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

public class Editorial implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer codigoeditorial;
    private String edinombreeditorial;

    public Editorial() {
    }

    public Editorial(Integer codigoeditorial) {
        this.codigoeditorial = codigoeditorial;
    }

    public Editorial(Integer codigoeditorial, String edinombreeditorial) {
        this.codigoeditorial = codigoeditorial;
        this.edinombreeditorial = edinombreeditorial;
    }

    public Integer getCodigoeditorial() {
        return codigoeditorial;
    }

    public void setCodigoeditorial(Integer codigoeditorial) {
        this.codigoeditorial = codigoeditorial;
    }

    public String getEdinombreeditorial() {
        return edinombreeditorial;
    }

    public void setEdinombreeditorial(String edinombreeditorial) {
        this.edinombreeditorial = edinombreeditorial;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoeditorial != null ? codigoeditorial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Editorial)) {
            return false;
        }
        Editorial other = (Editorial) object;
        if ((this.codigoeditorial == null && other.codigoeditorial != null) || (this.codigoeditorial != null && !this.codigoeditorial.equals(other.codigoeditorial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Editorial[ codigoeditorial=" + codigoeditorial + " ]";
    }
    
}

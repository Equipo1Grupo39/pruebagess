/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

public class Inventario implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer codigoinventario;
    private String invcodigolibroisbn;
    private String invcodigoaudiosyvideosisbn;
    private int invcantidad;
    private int invsalidas;
    private String codigo;
    private String titulo;

    public Inventario() {
    }

    public Inventario(Integer codigoinventario) {
        this.codigoinventario = codigoinventario;
    }

    public Inventario(Integer codigoinventario, String codigo, String titulo, 
            int invcantidad, int invsalidas) {
        this.codigoinventario = codigoinventario;
        this.codigo = codigo;
        this.titulo = titulo;
        this.invcantidad = invcantidad;
        this.invsalidas = invsalidas;
    }
        
    public Integer getCodigoinventario() {
        return codigoinventario;
    }

    public void setCodigoinventario(Integer codigoinventario) {
        this.codigoinventario = codigoinventario;
    }

    public String getInvcodigolibroisbn() {
        return invcodigolibroisbn;
    }

    public void setInvcodigolibroisbn(String invcodigolibroisbn) {
        this.invcodigolibroisbn = invcodigolibroisbn;
    }

    public String getInvcodigoaudiosyvideosisbn() {
        return invcodigoaudiosyvideosisbn;
    }

    public void setInvcodigoaudiosyvideosisbn(String invcodigoaudiosyvideosisbn) {
        this.invcodigoaudiosyvideosisbn = invcodigoaudiosyvideosisbn;
    }

    public int getInvcantidad() {
        return invcantidad;
    }

    public void setInvcantidad(int invcantidad) {
        this.invcantidad = invcantidad;
    }

    public int getInvsalidas() {
        return invsalidas;
    }

    public void setInvsalidas(int invsalidas) {
        this.invsalidas = invsalidas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoinventario != null ? codigoinventario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inventario)) {
            return false;
        }
        Inventario other = (Inventario) object;
        if ((this.codigoinventario == null && other.codigoinventario != null) || (this.codigoinventario != null && !this.codigoinventario.equals(other.codigoinventario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Inventario[ codigoinventario=" + codigoinventario + " ]";
    }
    
}

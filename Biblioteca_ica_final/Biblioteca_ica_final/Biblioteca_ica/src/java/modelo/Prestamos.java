/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;

public class Prestamos implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer codigoprestamo;
    private int pridusuario;
    private int pridadministrador;
    private String prcodigolibroisbn;
    private String prcodigoaudiosyvideosisbn;
    private String titulo;
    private Date prfechaprestamo;
    private Date prfechaprogdevolucion;
    private String prestado;
    private String codigo;
    private String nombreAdmon;
    private String tipo;
    private int prcodigofacturasmulta;
    private String fMuestado;

    public Prestamos() {
    }

    public Prestamos(Integer codigoprestamo) {
        this.codigoprestamo = codigoprestamo;
    }

    public Prestamos(Integer codigoprestamo, int pridusuario, int pridadministrador, String codigo, 
            String titulo, Date prfechaprestamo, Date prfechaprogdevolucion, String prestado) {
        this.codigoprestamo = codigoprestamo;
        this.pridusuario = pridusuario;
        this.pridadministrador = pridadministrador;
        this.codigo = codigo;
        this.titulo = titulo;
        this.prfechaprestamo = prfechaprestamo;
        this.prfechaprogdevolucion = prfechaprogdevolucion;
        this.prestado = prestado;
    }
    
    public Prestamos(Integer codigoprestamo, int pridusuario, int pridadministrador, String codigo, 
            String titulo, Date prfechaprestamo, Date prfechaprogdevolucion, 
            String prestado, String nombreAdmon, String tipo, int prcodigofacturasmulta, String fMuestado) {
        this.codigoprestamo = codigoprestamo;
        this.pridusuario = pridusuario;
        this.pridadministrador = pridadministrador;
        this.codigo = codigo;
        this.titulo = titulo;
        this.prfechaprestamo = prfechaprestamo;
        this.prfechaprogdevolucion = prfechaprogdevolucion;
        this.prestado = prestado;
        this.nombreAdmon = nombreAdmon;
        this.tipo = tipo;
        this.prcodigofacturasmulta = prcodigofacturasmulta;
        this.fMuestado = fMuestado;
    }    

    public Prestamos(int pridusuario, int pridadministrador, String codigo, Date prfechaprestamo) {
        this.pridusuario = pridusuario;
        this.pridadministrador = pridadministrador;
        this.codigo = codigo;
        this.prfechaprestamo = prfechaprestamo;
    }
    
    
    public Integer getCodigoprestamo() {
        return codigoprestamo;
    }

    public void setCodigoprestamo(Integer codigoprestamo) {
        this.codigoprestamo = codigoprestamo;
    }

    public int getPridusuario() {
        return pridusuario;
    }

    public void setPridusuario(int pridusuario) {
        this.pridusuario = pridusuario;
    }

    public int getPridadministrador() {
        return pridadministrador;
    }

    public void setPridadministrador(int pridadministrador) {
        this.pridadministrador = pridadministrador;
    }

    public String getPrcodigolibroisbn() {
        return prcodigolibroisbn;
    }

    public void setPrcodigolibroisbn(String prcodigolibroisbn) {
        this.prcodigolibroisbn = prcodigolibroisbn;
    }

    public String getPrcodigoaudiosyvideosisbn() {
        return prcodigoaudiosyvideosisbn;
    }

    public void setPrcodigoaudiosyvideosisbn(String prcodigoaudiosyvideosisbn) {
        this.prcodigoaudiosyvideosisbn = prcodigoaudiosyvideosisbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getPrfechaprestamo() {
        return prfechaprestamo;
    }

    public void setPrfechaprestamo(Date prfechaprestamo) {
        this.prfechaprestamo = prfechaprestamo;
    }

    public Date getPrfechaprogdevolucion() {
        return prfechaprogdevolucion;
    }

    public void setPrfechaprogdevolucion(Date prfechaprogdevolucion) {
        this.prfechaprogdevolucion = prfechaprogdevolucion;
    }

    public String getPrestado() {
        return prestado;
    }

    public void setPrestado(String prestado) {
        this.prestado = prestado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreAdmon() {
        return nombreAdmon;
    }

    public void setNombreAdmon(String nombreAdmon) {
        this.nombreAdmon = nombreAdmon;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrcodigofacturasmulta() {
        return prcodigofacturasmulta;
    }

    public void setPrcodigofacturasmulta(int prcodigofacturasmulta) {
        this.prcodigofacturasmulta = prcodigofacturasmulta;
    }

    public String getfMuestado() {
        return fMuestado;
    }

    public void setfMuestado(String fMuestado) {
        this.fMuestado = fMuestado;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoprestamo != null ? codigoprestamo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prestamos)) {
            return false;
        }
        Prestamos other = (Prestamos) object;
        if ((this.codigoprestamo == null && other.codigoprestamo != null) || (this.codigoprestamo != null && !this.codigoprestamo.equals(other.codigoprestamo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Registrodeprestamo[ codigoregistroprestamos=" + codigoprestamo + " ]";
    }
    
}

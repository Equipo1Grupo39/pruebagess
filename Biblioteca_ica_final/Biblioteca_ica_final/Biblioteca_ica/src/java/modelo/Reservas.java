/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;

public class Reservas implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer codigoreservas;
    private int residusuario;
    private int residadministrador;
    private String rescodigolibroisbn;
    private String rescodigoaudiosyvideosisbn;
    private Date resfechareserva;
    private Date resfechaactualizacion;
    private String resestado;
    private String codigo;
    private String nombreAdmon;
    private String tipo;
    private String titulo;

    public Reservas() {
    }

    public Reservas(Integer codigoreservas) {
        this.codigoreservas = codigoreservas;
    }

    public Reservas(Integer codigoreservas, int residusuario, int residadministrador, String codigo, 
            String titulo, Date resfechareserva, Date resfechaactualizacion, String resestado) {
        this.codigoreservas = codigoreservas;
        this.residusuario = residusuario;
        this.residadministrador = residadministrador;
        this.codigo = codigo;
        this.titulo = titulo;
        this.resfechareserva = resfechareserva;
        this.resfechaactualizacion = resfechaactualizacion;
        this.resestado = resestado;
    }
    
    public Reservas(Integer codigoreservas, int residusuario, int residadministrador, String codigo, 
            String titulo, Date resfechareserva, Date resfechaactualizacion, 
            String resestado, String nombreAdmon, String tipo) {
        this.codigoreservas = codigoreservas;
        this.residusuario = residusuario;
        this.residadministrador = residadministrador;
        this.codigo = codigo;
        this.titulo = titulo;
        this.resfechareserva = resfechareserva;
        this.resfechaactualizacion = resfechaactualizacion;
        this.resestado = resestado;
        this.nombreAdmon = nombreAdmon;
        this.tipo = tipo;
    }    

    public Reservas(int residusuario, int residadministrador, String codigo, Date resfechareserva) {
        this.residusuario = residusuario;
        this.residadministrador = residadministrador;
        this.codigo = codigo;
        this.resfechareserva = resfechareserva;
    }
    

    public Integer getCodigoreservas() {
        return codigoreservas;
    }

    public void setCodigoreservas(Integer codigoreservas) {
        this.codigoreservas = codigoreservas;
    }

    public int getResidusuario() {
        return residusuario;
    }

    public void setResidusuario(int residusuario) {
        this.residusuario = residusuario;
    }

    public int getResidadministrador() {
        return residadministrador;
    }

    public void setResidadministrador(int residadministrador) {
        this.residadministrador = residadministrador;
    }

    public String getRescodigolibroisbn() {
        return rescodigolibroisbn;
    }

    public void setRescodigolibroisbn(String rescodigolibroisbn) {
        this.rescodigolibroisbn = rescodigolibroisbn;
    }

    public String getRescodigoaudiosyvideosisbn() {
        return rescodigoaudiosyvideosisbn;
    }

    public void setRescodigoaudiosyvideosisbn(String rescodigoaudiosyvideosisbn) {
        this.rescodigoaudiosyvideosisbn = rescodigoaudiosyvideosisbn;
    }

    public String getResestado() {
        return resestado;
    }

    public void setResestado(String resestado) {
        this.resestado = resestado;
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

    public Date getResfechareserva() {
        return resfechareserva;
    }

    public void setResfechareserva(Date resfechareserva) {
        this.resfechareserva = resfechareserva;
    }

    public Date getResfechaactualizacion() {
        return resfechaactualizacion;
    }

    public void setResfechaactualizacion(Date resfechaactualizacion) {
        this.resfechaactualizacion = resfechaactualizacion;
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
        hash += (codigoreservas != null ? codigoreservas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservas)) {
            return false;
        }
        Reservas other = (Reservas) object;
        if ((this.codigoreservas == null && other.codigoreservas != null) || (this.codigoreservas != null && !this.codigoreservas.equals(other.codigoreservas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Reservas[ codigoreservas=" + codigoreservas + " ]";
    }
    
}

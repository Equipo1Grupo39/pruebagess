/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

public class Signaturatopografica implements Serializable {

    private static final long serialVersionUID = 1L;
    private String codigosignaturatopografica;
    private Integer stoidtbiblioteca;
    private String stocodigolibroisbn;
    private String stocodigoaudiosyvideosisbn;
    private String tbinombre;
    private String libtitulo;
    private String ayVtitulo;
    private String titulo;
    private String codigo;

    public Signaturatopografica() {
    }

    public Signaturatopografica(String codigosignaturatopografica, Integer stoidtbiblioteca, String stocodigolibroisbn, String stocodigoaudiosyvideosisbn) {
        this.codigosignaturatopografica = codigosignaturatopografica;
        this.stoidtbiblioteca = stoidtbiblioteca;
        this.stocodigolibroisbn = stocodigolibroisbn;
        this.stocodigoaudiosyvideosisbn = stocodigoaudiosyvideosisbn;
    }

    public Signaturatopografica(String codigosignaturatopografica, Integer stoidtbiblioteca, String stocodigolibroisbn, 
                    String stocodigoaudiosyvideosisbn, String tbinombre, String libtitulo, String ayVtitulo) {
        this.codigosignaturatopografica = codigosignaturatopografica;
        this.stoidtbiblioteca = stoidtbiblioteca;
        this.stocodigolibroisbn = stocodigolibroisbn;
        this.stocodigoaudiosyvideosisbn = stocodigoaudiosyvideosisbn;
    }
    
    
    public Signaturatopografica(String codigosignaturatopografica, Integer stoidtbiblioteca, String codigo) {
        this.codigosignaturatopografica = codigosignaturatopografica;
        this.stoidtbiblioteca = stoidtbiblioteca;
        this.codigo = codigo;
    }
    
    public Signaturatopografica(String codigosignaturatopografica) {
        this.codigosignaturatopografica = codigosignaturatopografica;
    }

    public String getCodigosignaturatopografica() {
        return codigosignaturatopografica;
    }

    public void setCodigosignaturatopografica(String codigosignaturatopografica) {
        this.codigosignaturatopografica = codigosignaturatopografica;
    }

    public Integer getstoidtbiblioteca() {
        return stoidtbiblioteca;
    }

    public void setstoidtbiblioteca(Integer stoidtbiblioteca) {
        this.stoidtbiblioteca = stoidtbiblioteca;
    }

    public String getstocodigolibroisbn() {
        return stocodigolibroisbn;
    }

    public void setstocodigolibroisbn(String stocodigolibroisbn) {
        this.stocodigolibroisbn = stocodigolibroisbn;
    }

    public String getstocodigoaudiosyvideosisbn() {
        return stocodigoaudiosyvideosisbn;
    }

    public void setstocodigoaudiosyvideosisbn(String stocodigoaudiosyvideosisbn) {
        this.stocodigoaudiosyvideosisbn = stocodigoaudiosyvideosisbn;
    }

    public String getTbinombre() {
        return tbinombre;
    }

    public void setTbinombre(String tbinombre) {
        this.tbinombre = tbinombre;
    }

    public String getLibtitulo() {
        return libtitulo;
    }

    public void setLibtitulo(String libtitulo) {
        this.libtitulo = libtitulo;
    }

    public String getAyVtitulo() {
        return ayVtitulo;
    }

    public void setAyVtitulo(String ayVtitulo) {
        this.ayVtitulo = ayVtitulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigosignaturatopografica != null ? codigosignaturatopografica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Signaturatopografica)) {
            return false;
        }
        Signaturatopografica other = (Signaturatopografica) object;
        if ((this.codigosignaturatopografica == null && other.codigosignaturatopografica != null) || (this.codigosignaturatopografica != null && !this.codigosignaturatopografica.equals(other.codigosignaturatopografica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Signaturatopografica[ codigosignaturatopografica=" + codigosignaturatopografica + " ]";
    }
    
}

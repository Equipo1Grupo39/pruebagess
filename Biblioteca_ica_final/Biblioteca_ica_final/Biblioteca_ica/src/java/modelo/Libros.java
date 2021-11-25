/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;

public class Libros implements Serializable {

    private static final long serialVersionUID = 1L;
    private String codigolibroisbn;
    private String libtitulo;
    private int libnumerodepaginas;
    private int libcodigoautor;
    private int libcodigomateria;
    private int libcodigoeditorial;
    private int libcodigoidioma;
    private String libcodigosignaturatopografica;
    private Date libfechacreacion;
    private Date libfecharetiro;
    private String autnombresapellidos;
    private String matnombremateria;
    private String edinombreeditorial;
    private String idinombreidioma;
    private int invcantidad;
    private int disponibles;

    public Libros() {
    }

    public Libros(String codigolibroisbn) {
        this.codigolibroisbn = codigolibroisbn;
    }

    public Libros(String codigolibroisbn, String libtitulo, int libnumerodepaginas, int libcodigoautor, int libcodigomateria, 
            int libcodigoeditorial, int libcodigoidioma, String libcodigosignaturatopografica, Date libfechacreacion, 
            Date libfecharetiro, String autnombresapellidos, String matnombremateria, 
            String edinombreeditorial, String idinombreidioma, int invcantidad, int disponibles) {
        this.codigolibroisbn = codigolibroisbn;
        this.libtitulo = libtitulo;
        this.libnumerodepaginas = libnumerodepaginas;
        this.libcodigoautor = libcodigoautor;
        this.libcodigomateria = libcodigomateria;
        this.libcodigoeditorial = libcodigoeditorial;
        this.libcodigoidioma = libcodigoidioma;
        this.libcodigosignaturatopografica = libcodigosignaturatopografica;
        this.libfechacreacion = libfechacreacion;
        this.autnombresapellidos = autnombresapellidos;
        this.matnombremateria = matnombremateria;
        this.edinombreeditorial = edinombreeditorial;
        this.idinombreidioma = idinombreidioma;    
        this.invcantidad = invcantidad;
        this.disponibles = disponibles;
    } 
    
    public Libros(String codigolibroisbn, String libtitulo, int libnumerodepaginas, int libcodigoautor, int libcodigomateria, 
            int libcodigoeditorial, int libcodigoidioma, String libcodigosignaturatopografica, Date libfechacreacion, 
            Date libfecharetiro, int invcantidad, int disponibles) {
        this.codigolibroisbn = codigolibroisbn;
        this.libtitulo = libtitulo;
        this.libnumerodepaginas = libnumerodepaginas;
        this.libcodigoautor = libcodigoautor;
        this.libcodigomateria = libcodigomateria;
        this.libcodigoeditorial = libcodigoeditorial;
        this.libcodigoidioma = libcodigoidioma;
        this.libcodigosignaturatopografica = libcodigosignaturatopografica;
        this.libfechacreacion = libfechacreacion;   
        this.invcantidad = invcantidad;
        this.disponibles = disponibles;
    }    

    public Libros(String codigolibroisbn, String libtitulo, int libnumerodepaginas, int libcodigoautor, int libcodigomateria, 
            int libcodigoeditorial, int libcodigoidioma, String libcodigosignaturatopografica) {
        this.codigolibroisbn = codigolibroisbn;
        this.libtitulo = libtitulo;
        this.libnumerodepaginas = libnumerodepaginas;
        this.libcodigoautor = libcodigoautor;
        this.libcodigomateria = libcodigomateria;
        this.libcodigoeditorial = libcodigoeditorial;
        this.libcodigoidioma = libcodigoidioma;
        this.libcodigosignaturatopografica = libcodigosignaturatopografica; 
    }    
    
    public String getCodigolibroisbn() {
        return codigolibroisbn;
    }

    public void setCodigolibroisbn(String codigolibroisbn) {
        this.codigolibroisbn = codigolibroisbn;
    }

    public String getLibtitulo() {
        return libtitulo;
    }

    public void setLibtitulo(String libtitulo) {
        this.libtitulo = libtitulo;
    }

    public int getLibnumerodepaginas() {
        return libnumerodepaginas;
    }

    public void setLibnumerodepaginas(int libnumerodepaginas) {
        this.libnumerodepaginas = libnumerodepaginas;
    }

    public int getLibcodigoautor() {
        return libcodigoautor;
    }

    public void setLibcodigoautor(int libcodigoautor) {
        this.libcodigoautor = libcodigoautor;
    }

    public int getLibcodigomateria() {
        return libcodigomateria;
    }

    public void setLibcodigomateria(int libcodigomateria) {
        this.libcodigomateria = libcodigomateria;
    }

    public int getLibcodigoeditorial() {
        return libcodigoeditorial;
    }

    public void setLibcodigoeditorial(int libcodigoeditorial) {
        this.libcodigoeditorial = libcodigoeditorial;
    }

    public int getLibcodigoidioma() {
        return libcodigoidioma;
    }

    public void setLibcodigoidioma(int libcodigoidioma) {
        this.libcodigoidioma = libcodigoidioma;
    }

    public String getLibcodigosignaturatopografica() {
        return libcodigosignaturatopografica;
    }

    public void setLibcodigosignaturatopografica(String libcodigosignaturatopografica) {
        this.libcodigosignaturatopografica = libcodigosignaturatopografica;
    }

    public Date getLibfechacreacion() {
        return libfechacreacion;
    }

    public void setLibfechacreacion(Date libfechacreacion) {
        this.libfechacreacion = libfechacreacion;
    }

    public Date getLibfecharetiro() {
        return libfecharetiro;
    }

    public void setLibfecharetiro(Date libfecharetiro) {
        this.libfecharetiro = libfecharetiro;
    }

    public String getAutnombresapellidos() {
        return autnombresapellidos;
    }

    public void setAutnombresapellidos(String autnombresapellidos) {
        this.autnombresapellidos = autnombresapellidos;
    }

    public String getMatnombremateria() {
        return matnombremateria;
    }

    public void setMatnombremateria(String matnombremateria) {
        this.matnombremateria = matnombremateria;
    }

    public String getEdinombreeditorial() {
        return edinombreeditorial;
    }

    public void setEdinombreeditorial(String edinombreeditorial) {
        this.edinombreeditorial = edinombreeditorial;
    }

    public String getIdinombreidioma() {
        return idinombreidioma;
    }

    public void setIdinombreidioma(String idinombreidioma) {
        this.idinombreidioma = idinombreidioma;
    }

    public int getInvcantidad() {
        return invcantidad;
    }

    public void setInvcantidad(int invcantidad) {
        this.invcantidad = invcantidad;
    }

    public int getDisponibles() {
        return disponibles;
    }

    public void setDisponibles(int disponibles) {
        this.disponibles = disponibles;
    }
        

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigolibroisbn != null ? codigolibroisbn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Libros)) {
            return false;
        }
        Libros other = (Libros) object;
        if ((this.codigolibroisbn == null && other.codigolibroisbn != null) || (this.codigolibroisbn != null && !this.codigolibroisbn.equals(other.codigolibroisbn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Libros[ codigolibroisbn=" + codigolibroisbn + " ]";
    }
    
}

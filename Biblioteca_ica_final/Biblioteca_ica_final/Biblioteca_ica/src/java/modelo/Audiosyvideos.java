/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;

public class Audiosyvideos implements Serializable {

    private static final long serialVersionUID = 1L;
    private String codigoaudiosyvideosisbn;
    private String ayVtitulo;
    private String ayVcontenido;
    private int ayVcodigoautor;
    private int ayVcodigomateria;
    private int ayVcodigoeditorial;
    private int ayVcodigoidioma;
    private String ayVcodigosignaturatopografica;
    private Date ayVfechacreacion;
    private Date ayVfecharetiro;
    private String autnombresapellidos;
    private String matnombremateria;
    private String edinombreeditorial;
    private String idinombreidioma;    
    private int invcantidad;

    public Audiosyvideos() {
    }

    public Audiosyvideos(String codigoaudiosyvideosisbn) {
        this.codigoaudiosyvideosisbn = codigoaudiosyvideosisbn;
    }

    public Audiosyvideos(String codigoaudiosyvideosisbn, String ayVtitulo, String ayVcontenido, int ayVcodigoautor, int ayVcodigomateria, int ayVcodigoeditorial, 
                        int ayVcodigoidioma, Date ayVfechacreacion, String ayVcodigosignaturatopografica, int invcantidad) {
        this.codigoaudiosyvideosisbn = codigoaudiosyvideosisbn;
        this.ayVtitulo = ayVtitulo;
        this.ayVcontenido = ayVcontenido;
        this.ayVcodigoautor = ayVcodigoautor;
        this.ayVcodigomateria = ayVcodigomateria;
        this.ayVcodigoeditorial = ayVcodigoeditorial;
        this.ayVcodigoidioma = ayVcodigoidioma;
        this.ayVfechacreacion = ayVfechacreacion;
        this.ayVcodigosignaturatopografica = ayVcodigosignaturatopografica;
        this.invcantidad = invcantidad;
    }

    public Audiosyvideos(String codigoaudiosyvideosisbn, String ayVtitulo, String ayVcontenido, int ayVcodigoautor, int ayVcodigomateria, 
                    int ayVcodigoeditorial, int ayVcodigoidioma, Date ayVfechacreacion,
                    String autnombresapellidos, String matnombremateria, String edinombreeditorial, 
                    String idinombreidioma, String ayVcodigosignaturatopografica, int invcantidad) {
        this.codigoaudiosyvideosisbn = codigoaudiosyvideosisbn;
        this.ayVtitulo = ayVtitulo;
        this.ayVcontenido = ayVcontenido;
        this.ayVcodigoautor = ayVcodigoautor;
        this.ayVcodigomateria = ayVcodigomateria;
        this.ayVcodigoeditorial = ayVcodigoeditorial;
        this.ayVcodigoidioma = ayVcodigoidioma;
        this.ayVfechacreacion = ayVfechacreacion;
        this.autnombresapellidos = autnombresapellidos;
        this.matnombremateria = matnombremateria;
        this.edinombreeditorial = edinombreeditorial;
        this.idinombreidioma = idinombreidioma;      
        this.ayVcodigosignaturatopografica = ayVcodigosignaturatopografica;  
        this.invcantidad = invcantidad;
    }
    
    public Audiosyvideos(String codigoaudiosyvideosisbn, String ayVtitulo, String ayVcontenido, int ayVcodigoautor, int ayVcodigomateria, 
                    int ayVcodigoeditorial, int ayVcodigoidioma, String ayVcodigosignaturatopografica, int invcantidad) {
        this.codigoaudiosyvideosisbn = codigoaudiosyvideosisbn;
        this.ayVtitulo = ayVtitulo;
        this.ayVcontenido = ayVcontenido;
        this.ayVcodigoautor = ayVcodigoautor;
        this.ayVcodigomateria = ayVcodigomateria;
        this.ayVcodigoeditorial = ayVcodigoeditorial;
        this.ayVcodigoidioma = ayVcodigoidioma;
        this.ayVcodigosignaturatopografica = ayVcodigosignaturatopografica;
        this.invcantidad = invcantidad;
    }    
    
    public String getCodigoaudiosyvideosisbn() {
        return codigoaudiosyvideosisbn;
    }

    public void setCodigoaudiosyvideosisbn(String codigoaudiosyvideosisbn) {
        this.codigoaudiosyvideosisbn = codigoaudiosyvideosisbn;
    }

    public String getAyVtitulo() {
        return ayVtitulo;
    }

    public void setAyVtitulo(String ayVtitulo) {
        this.ayVtitulo = ayVtitulo;
    }

    public String getAyVcontenido() {
        return ayVcontenido;
    }

    public void setAyVcontenido(String ayVcontenido) {
        this.ayVcontenido = ayVcontenido;
    }

    public int getAyVcodigoautor() {
        return ayVcodigoautor;
    }

    public void setAyVcodigoautor(int ayVcodigoautor) {
        this.ayVcodigoautor = ayVcodigoautor;
    }

    public int getAyVcodigomateria() {
        return ayVcodigomateria;
    }

    public void setAyVcodigomateria(int ayVcodigomateria) {
        this.ayVcodigomateria = ayVcodigomateria;
    }

    public int getAyVcodigoeditorial() {
        return ayVcodigoeditorial;
    }

    public void setAyVcodigoeditorial(int ayVcodigoeditorial) {
        this.ayVcodigoeditorial = ayVcodigoeditorial;
    }

    public int getAyVcodigoidioma() {
        return ayVcodigoidioma;
    }

    public void setAyVcodigoidioma(int ayVcodigoidioma) {
        this.ayVcodigoidioma = ayVcodigoidioma;
    }

    public String getAyVcodigosignaturatopografica() {
        return ayVcodigosignaturatopografica;
    }

    public void setAyVcodigosignaturatopografica(String ayVcodigosignaturatopografica) {
        this.ayVcodigosignaturatopografica = ayVcodigosignaturatopografica;
    }

    public Date getAyVfechacreacion() {
        return ayVfechacreacion;
    }

    public void setAyVfechacreacion(Date ayVfechacreacion) {
        this.ayVfechacreacion = ayVfechacreacion;
    }

    public Date getAyVfecharetiro() {
        return ayVfecharetiro;
    }

    public void setAyVfecharetiro(Date ayVfecharetiro) {
        this.ayVfecharetiro = ayVfecharetiro;
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

    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoaudiosyvideosisbn != null ? codigoaudiosyvideosisbn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Audiosyvideos)) {
            return false;
        }
        Audiosyvideos other = (Audiosyvideos) object;
        if ((this.codigoaudiosyvideosisbn == null && other.codigoaudiosyvideosisbn != null) || (this.codigoaudiosyvideosisbn != null && !this.codigoaudiosyvideosisbn.equals(other.codigoaudiosyvideosisbn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Audiosyvideos[ codigoaudiosyvideosisbn=" + codigoaudiosyvideosisbn + " ]";
    }
    
}

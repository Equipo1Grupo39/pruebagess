
package modelo;


public class Libros {
    private String codigolibroisbn , Libtitulo,Lib_codigosignaturatopografica, Libfechacreacion, Libfecharetiro; 
    private int Libnumerodepaginas, Lib_codigoautor, Lib_codigomateria, Lib_codigoeditorial, Lib_codigoidioma;
    
        
    /**
     *
     * @param codigolibroisbn
     * @param Libtitulo
     * @param Libnumerodepaginas
     * @param Lib_codigoautor
     * @param Lib_codigomateria
     * @param Lib_codigoeditorial
     * @param Lib_codigoidioma
     * @param Lib_codigosignaturatopografica
     * @param Libfechacreacion
     * @param Libfecharetiro
     */
    public Libros(String codigolibroisbn, String Libtitulo, int Libnumerodepaginas, int Lib_codigoautor, int Lib_codigomateria,int Lib_codigoeditorial, int Lib_codigoidioma, String Lib_codigosignaturatopografica, String Libfechacreacion,String Libfecharetiro ){
        this.codigolibroisbn = codigolibroisbn;
        this.Libtitulo = Libtitulo;
        this.Libnumerodepaginas = Libnumerodepaginas; 
        this.Lib_codigoautor = Lib_codigoautor;
        this.Lib_codigomateria = Lib_codigomateria;
        this.Lib_codigoeditorial = Lib_codigoeditorial;
        this.Lib_codigoidioma = Lib_codigoidioma;
        this.Lib_codigosignaturatopografica = Lib_codigosignaturatopografica;
        this.Libfechacreacion = Lib_codigosignaturatopografica;
        this.Libfecharetiro = Libfecharetiro;}

    public String getCodigolibroisbn() {
        return codigolibroisbn;
    }

    public void setCodigolibroisbn(String codigolibroisbn) {
        this.codigolibroisbn = codigolibroisbn;
    }

    public String getLibtitulo() {
        return Libtitulo;
    }

    public void setLibtitulo(String Libtitulo) {
        this.Libtitulo = Libtitulo;
    }

    public String getLib_codigosignaturatopografica() {
        return Lib_codigosignaturatopografica;
    }

    public void setLib_codigosignaturatopografica(String Lib_codigosignaturatopografica) {
        this.Lib_codigosignaturatopografica = Lib_codigosignaturatopografica;
    }

    public String getLibfechacreacion() {
        return Libfechacreacion;
    }

    public void setLibfechacreacion(String Libfechacreacion) {
        this.Libfechacreacion = Libfechacreacion;
    }

    public String getLibfecharetiro() {
        return Libfecharetiro;
    }

    public void setLibfecharetiro(String Libfecharetiro) {
        this.Libfecharetiro = Libfecharetiro;
    }

    public int getLibnumerodepaginas() {
        return Libnumerodepaginas;
    }

    public void setLibnumerodepaginas(int Libnumerodepaginas) {
        this.Libnumerodepaginas = Libnumerodepaginas;
    }

    public int getLib_codigoautor() {
        return Lib_codigoautor;
    }

    public void setLib_codigoautor(int Lib_codigoautor) {
        this.Lib_codigoautor = Lib_codigoautor;
    }

    public int getLib_codigomateria() {
        return Lib_codigomateria;
    }

    public void setLib_codigomateria(int Lib_codigomateria) {
        this.Lib_codigomateria = Lib_codigomateria;
    }

    public int getLib_codigoeditorial() {
        return Lib_codigoeditorial;
    }

    public void setLib_codigoeditorial(int Lib_codigoeditorial) {
        this.Lib_codigoeditorial = Lib_codigoeditorial;
    }

    public int getLib_codigoidioma() {
        return Lib_codigoidioma;
    }

    public void setLib_codigoidioma(int Lib_codigoidioma) {
        this.Lib_codigoidioma = Lib_codigoidioma;
    }

    @Override
    public String toString() {
        return "Libros{" + "codigolibroisbn=" + codigolibroisbn + ", Libtitulo=" + Libtitulo + ", Lib_codigosignaturatopografica=" + Lib_codigosignaturatopografica + ", Libfechacreacion=" + Libfechacreacion + ", Libfecharetiro=" + Libfecharetiro + ", Libnumerodepaginas=" + Libnumerodepaginas + ", Lib_codigoautor=" + Lib_codigoautor + ", Lib_codigomateria=" + Lib_codigomateria + ", Lib_codigoeditorial=" + Lib_codigoeditorial + ", Lib_codigoidioma=" + Lib_codigoidioma + '}';
    }

        
    }

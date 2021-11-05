
package modelo;

public class Usuarios {
    
    private int idusuario, Usu_codigopagos,Usucedula, Usutelefono;
    private String Usunombresapellidos,Usuemail, Usudireccion, Usufechacreacion, Usufechaactivacion;

    public Usuarios(int idusuario, String Usunombresapellidos, int Usucedula, String Usuemail, String Usudireccion, String Usufechacreacion, String Usufechaactivacion, int Usutelefono, int Usu_codigopagos){
    
        this.idusuario = idusuario;
        this.Usunombresapellidos = Usunombresapellidos;
        this.Usucedula = Usucedula;
        this.Usuemail = Usuemail;
        this.Usudireccion = Usudireccion;
        this.Usufechacreacion = Usufechacreacion;
        this.Usufechaactivacion = Usufechaactivacion;
        this.Usutelefono = Usutelefono;
        this.Usu_codigopagos = Usu_codigopagos;
        
}
    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getUsu_codigopagos() {
        return Usu_codigopagos;
    }

    public void setUsu_codigopagos(int Usu_codigopagos) {
        this.Usu_codigopagos = Usu_codigopagos;
    }

    public int getUsucedula() {
        return Usucedula;
    }

    public void setUsucedula(int Usucedula) {
        this.Usucedula = Usucedula;
    }

    public int getUsutelefono() {
        return Usutelefono;
    }

    public void setUsutelefono(int Usutelefono) {
        this.Usutelefono = Usutelefono;
    }

    public String getUsunombresapellidos() {
        return Usunombresapellidos;
    }

    public void setUsunombresapellidos(String Usunombresapellidos) {
        this.Usunombresapellidos = Usunombresapellidos;
    }

    public String getUsuemail() {
        return Usuemail;
    }

    public void setUsuemail(String Usuemail) {
        this.Usuemail = Usuemail;
    }

    public String getDireccion() {
        return Usudireccion;
    }

    public void setDireccion(String direccion) {
        this.Usudireccion = direccion;
    }

    public String getUsufechacreacion() {
        return Usufechacreacion;
    }

    public void setUsufechacreacion(String Usufechacreacion) {
        this.Usufechacreacion = Usufechacreacion;
    }

    public String getUsufechaactivacion() {
        return Usufechaactivacion;
    }

    public void setUsufechaactivacion(String Usufechaactivacion) {
        this.Usufechaactivacion = Usufechaactivacion;
    }
    


}

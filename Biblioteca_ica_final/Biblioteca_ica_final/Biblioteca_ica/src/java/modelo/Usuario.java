/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;

public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idusuario;
    private String usunombresapellidos;
    private String usucedula;
    private String usuemail;
    private String usudireccion;
    private Date usufechacreacion;
    private Date usufechainactivacion;
    private String usutelefono;
    private String usutipo;
    private String usucontrasena;
    private String usuestado;
    private String usulogin;

    public Usuario() {
    }

    public Usuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public Usuario(Integer idusuario, String usulogin, String usucedula, String usunombresapellidos, String usuemail, String usutelefono, 
                String usudireccion, String usutipo, String usuestado, Date usufechacreacion, Date usufechainactivacion) {
        this.idusuario = idusuario;
        this.usulogin = usulogin;
        this.usucedula = usucedula;
        this.usunombresapellidos = usunombresapellidos;
        this.usuemail = usuemail;
        this.usudireccion = usudireccion;
        this.usutelefono = usutelefono;
        this.usutipo = usutipo;
        this.usuestado = usuestado;
        this.usufechacreacion = usufechacreacion;
        this.usufechainactivacion = usufechainactivacion;
    }
    
    public Usuario(String usulogin, String usucedula, String usunombresapellidos, String usuemail, String usutelefono, 
                String usudireccion, String usutipo, String usuestado, String usucontrasena) {
        this.usulogin = usulogin;
        this.usucedula = usucedula;
        this.usunombresapellidos = usunombresapellidos;
        this.usuemail = usuemail;
        this.usudireccion = usudireccion;
        this.usutelefono = usutelefono;
        this.usutipo = usutipo;
        this.usuestado = usuestado;
        this.usucontrasena = usucontrasena;
    }    

    public Usuario(Integer idusuario, String usulogin, String usucedula, String usunombresapellidos, String usuemail, String usutelefono, 
                String usudireccion, String usutipo, String usuestado, String usucontrasena) {
        this.idusuario = idusuario;
        this.usulogin = usulogin;
        this.usucedula = usucedula;
        this.usunombresapellidos = usunombresapellidos;
        this.usuemail = usuemail;
        this.usudireccion = usudireccion;
        this.usutelefono = usutelefono;
        this.usutipo = usutipo;
        this.usuestado = usuestado;
        this.usucontrasena = usucontrasena;
    }    

    public Usuario(Integer idusuario, String usucedula, String usunombresapellidos, String usuemail, String usutelefono, 
                String usudireccion, String usutipo, String usuestado, String usucontrasena) {
        this.idusuario = idusuario;
        this.usucedula = usucedula;
        this.usunombresapellidos = usunombresapellidos;
        this.usuemail = usuemail;
        this.usudireccion = usudireccion;
        this.usutelefono = usutelefono;
        this.usutipo = usutipo;
        this.usuestado = usuestado;
        this.usucontrasena = usucontrasena;
    }    
    
    
    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public String getUsunombresapellidos() {
        return usunombresapellidos;
    }

    public void setUsunombresapellidos(String usunombresapellidos) {
        this.usunombresapellidos = usunombresapellidos;
    }

    public String getUsucedula() {
        return usucedula;
    }

    public void setUsucedula(String usucedula) {
        this.usucedula = usucedula;
    }

    public String getUsuemail() {
        return usuemail;
    }

    public void setUsuemail(String usuemail) {
        this.usuemail = usuemail;
    }

    public String getUsudireccion() {
        return usudireccion;
    }

    public void setUsudireccion(String usudireccion) {
        this.usudireccion = usudireccion;
    }

    public Date getUsufechacreacion() {
        return usufechacreacion;
    }

    public void setUsufechacreacion(Date usufechacreacion) {
        this.usufechacreacion = usufechacreacion;
    }

    public Date getUsufechainactivacion() {
        return usufechainactivacion;
    }

    public void setUsufechainactivacion(Date usufechainactivacion) {
        this.usufechainactivacion = usufechainactivacion;
    }

    public String getUsutelefono() {
        return usutelefono;
    }

    public void setUsutelefono(String usutelefono) {
        this.usutelefono = usutelefono;
    }

    public String getUsutipo() {
        return usutipo;
    }

    public void setUsutipo(String usutipo) {
        this.usutipo = usutipo;
    }

    public String getUsucontrasena() {
        return usucontrasena;
    }

    public void setUsucontrasena(String usucontrasena) {
        this.usucontrasena = usucontrasena;
    }

    public String getUsuestado() {
        return usuestado;
    }

    public void setUsuestado(String usuestado) {
        this.usuestado = usuestado;
    }

    public String getUsulogin() {
        return usulogin;
    }

    public void setUsulogin(String usulogin) {
        this.usulogin = usulogin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idusuario != null ? idusuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idusuario == null && other.idusuario != null) || (this.idusuario != null && !this.idusuario.equals(other.idusuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Usuario[ idusuario=" + idusuario + " ]";
    }
    
}

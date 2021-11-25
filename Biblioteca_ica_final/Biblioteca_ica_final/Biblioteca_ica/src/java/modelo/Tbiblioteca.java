/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

public class Tbiblioteca implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idtbiblioteca;
    private String tbinombre;
    private int tbinit;
    private String tbiemail;
    private String tbidireccion;
    private String tbitelefono;
    private String tbicuentabancaria;
    private String tbinombrebanco;

    public Tbiblioteca() {
    }

    public Tbiblioteca(Integer idtbiblioteca) {
        this.idtbiblioteca = idtbiblioteca;
    }

    public Tbiblioteca(Integer idtbiblioteca, String tbinombre, int tbinit, String tbiemail, String tbidireccion, String tbitelefono, String tbicuentabancaria, String tbinombrebanco) {
        this.idtbiblioteca = idtbiblioteca;
        this.tbinombre = tbinombre;
        this.tbinit = tbinit;
        this.tbiemail = tbiemail;
        this.tbidireccion = tbidireccion;
        this.tbitelefono = tbitelefono;
        this.tbicuentabancaria = tbicuentabancaria;
        this.tbinombrebanco = tbinombrebanco;
    }

    public Integer getIdtbiblioteca() {
        return idtbiblioteca;
    }

    public void setIdtbiblioteca(Integer idtbiblioteca) {
        this.idtbiblioteca = idtbiblioteca;
    }

    public String getTbinombre() {
        return tbinombre;
    }

    public void setTbinombre(String tbinombre) {
        this.tbinombre = tbinombre;
    }

    public int getTbinit() {
        return tbinit;
    }

    public void setTbinit(int tbinit) {
        this.tbinit = tbinit;
    }

    public String getTbiemail() {
        return tbiemail;
    }

    public void setTbiemail(String tbiemail) {
        this.tbiemail = tbiemail;
    }

    public String getTbidireccion() {
        return tbidireccion;
    }

    public void setTbidireccion(String tbidireccion) {
        this.tbidireccion = tbidireccion;
    }

    public String getTbitelefono() {
        return tbitelefono;
    }

    public void setTbitelefono(String tbitelefono) {
        this.tbitelefono = tbitelefono;
    }

    public String getTbicuentabancaria() {
        return tbicuentabancaria;
    }

    public void setTbicuentabancaria(String tbicuentabancaria) {
        this.tbicuentabancaria = tbicuentabancaria;
    }

    public String getTbinombrebanco() {
        return tbinombrebanco;
    }

    public void setTbinombrebanco(String tbinombrebanco) {
        this.tbinombrebanco = tbinombrebanco;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtbiblioteca != null ? idtbiblioteca.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbiblioteca)) {
            return false;
        }
        Tbiblioteca other = (Tbiblioteca) object;
        if ((this.idtbiblioteca == null && other.idtbiblioteca != null) || (this.idtbiblioteca != null && !this.idtbiblioteca.equals(other.idtbiblioteca))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Tbiblioteca[ idtbiblioteca=" + idtbiblioteca + " ]";
    }
    
}

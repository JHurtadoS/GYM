/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author juane
 */
@Embeddable
public class CredencialesPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_credenciales", nullable = false)
    private int idCredenciales;
    @Basic(optional = false)
    @Column(name = "usuario_id_usuario", nullable = false)
    private int usuarioIdUsuario;

    public CredencialesPK() {
    }

    public CredencialesPK(int idCredenciales, int usuarioIdUsuario) {
        this.idCredenciales = idCredenciales;
        this.usuarioIdUsuario = usuarioIdUsuario;
    }

    public int getIdCredenciales() {
        return idCredenciales;
    }

    public void setIdCredenciales(int idCredenciales) {
        this.idCredenciales = idCredenciales;
    }

    public int getUsuarioIdUsuario() {
        return usuarioIdUsuario;
    }

    public void setUsuarioIdUsuario(int usuarioIdUsuario) {
        this.usuarioIdUsuario = usuarioIdUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idCredenciales;
        hash += (int) usuarioIdUsuario;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CredencialesPK)) {
            return false;
        }
        CredencialesPK other = (CredencialesPK) object;
        if (this.idCredenciales != other.idCredenciales) {
            return false;
        }
        if (this.usuarioIdUsuario != other.usuarioIdUsuario) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.CredencialesPK[ idCredenciales=" + idCredenciales + ", usuarioIdUsuario=" + usuarioIdUsuario + " ]";
    }
    
}

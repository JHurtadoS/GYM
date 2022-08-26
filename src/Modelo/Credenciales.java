/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author juane
 */
@Entity
@Table(name = "credenciales", catalog = "gimnasio", schema = "")
@NamedQueries({
    @NamedQuery(name = "Credenciales.findAll", query = "SELECT c FROM Credenciales c")})
public class Credenciales implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CredencialesPK credencialesPK;
    @Column(name = "email", length = 50)
    private String email;
    @Column(name = "contrase\u00f1a", length = 8)
    private String contraseña;
    @JoinColumn(name = "usuario_id_usuario", referencedColumnName = "id_usuario", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario usuario;

    public Credenciales() {
    }

    public Credenciales(CredencialesPK credencialesPK) {
        this.credencialesPK = credencialesPK;
    }

    public Credenciales(int idCredenciales, int usuarioIdUsuario) {
        this.credencialesPK = new CredencialesPK(idCredenciales, usuarioIdUsuario);
    }

    public CredencialesPK getCredencialesPK() {
        return credencialesPK;
    }

    public void setCredencialesPK(CredencialesPK credencialesPK) {
        this.credencialesPK = credencialesPK;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (credencialesPK != null ? credencialesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Credenciales)) {
            return false;
        }
        Credenciales other = (Credenciales) object;
        if ((this.credencialesPK == null && other.credencialesPK != null) || (this.credencialesPK != null && !this.credencialesPK.equals(other.credencialesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Credenciales[ credencialesPK=" + credencialesPK + " ]";
    }
    
}

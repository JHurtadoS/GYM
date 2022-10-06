/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author FAMILIA TOVAR BUSTOS
 */
@Entity
@Table(name = "credenciales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Credenciales.findAll", query = "SELECT c FROM Credenciales c"),
    @NamedQuery(name = "Credenciales.findByIdCredenciales", query = "SELECT c FROM Credenciales c WHERE c.idCredenciales = :idCredenciales"),
    @NamedQuery(name = "Credenciales.findByEmail", query = "SELECT c FROM Credenciales c WHERE c.email = :email"),
    @NamedQuery(name = "Credenciales.findByContrase\u00f1a", query = "SELECT c FROM Credenciales c WHERE c.contrase\u00f1a = :contrase\u00f1a")})
public class Credenciales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_credenciales")
    private Integer idCredenciales;
    @Column(name = "email")
    private String email;
    @Column(name = "contrase\u00f1a")
    private String contraseña;
    @JoinColumn(name = "usuario_id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario usuarioIdUsuario;

    public Credenciales() {
    }

    public Credenciales(Integer idCredenciales) {
        this.idCredenciales = idCredenciales;
    }

    public Integer getIdCredenciales() {
        return idCredenciales;
    }

    public void setIdCredenciales(Integer idCredenciales) {
        this.idCredenciales = idCredenciales;
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

    public Usuario getUsuarioIdUsuario() {
        return usuarioIdUsuario;
    }

    public void setUsuarioIdUsuario(Usuario usuarioIdUsuario) {
        this.usuarioIdUsuario = usuarioIdUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCredenciales != null ? idCredenciales.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Credenciales)) {
            return false;
        }
        Credenciales other = (Credenciales) object;
        if ((this.idCredenciales == null && other.idCredenciales != null) || (this.idCredenciales != null && !this.idCredenciales.equals(other.idCredenciales))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Credenciales[ idCredenciales=" + idCredenciales + " ]";
    }
    
}

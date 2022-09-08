/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author FAMILIA TOVAR BUSTOS
 */
@Entity
@Table(name = "usuario")
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByIdUsuario", query = "SELECT u FROM Usuario u WHERE u.idUsuario = :idUsuario"),
    @NamedQuery(name = "Usuario.findByDocumento", query = "SELECT u FROM Usuario u WHERE u.documento = :documento"),
    @NamedQuery(name = "Usuario.findByNombre", query = "SELECT u FROM Usuario u WHERE u.nombre = :nombre"),
    @NamedQuery(name = "Usuario.findByApellidos", query = "SELECT u FROM Usuario u WHERE u.apellidos = :apellidos"),
    @NamedQuery(name = "Usuario.findByCelular", query = "SELECT u FROM Usuario u WHERE u.celular = :celular"),
    @NamedQuery(name = "Usuario.findByGenero", query = "SELECT u FROM Usuario u WHERE u.genero = :genero"),
    @NamedQuery(name = "Usuario.findByRh", query = "SELECT u FROM Usuario u WHERE u.rh = :rh")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_usuario")
    private Integer idUsuario;
    @Column(name = "documento")
    private Integer documento;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "celular")
    private String celular;
    @Column(name = "genero")
    private String genero;
    @Column(name = "rh")
    private String rh;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioIdUsuario", fetch = FetchType.LAZY)
    private Collection<Funcional> funcionalCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioIdUsuario", fetch = FetchType.LAZY)
    private Collection<Consumidor> consumidorCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioIdUsuario", fetch = FetchType.LAZY)
    private Collection<Credenciales> credencialesCollection;

    public Usuario() {
    }

    public Usuario(Integer idUsuario, Integer documento, String nombre, String apellidos, String celular, String genero, String rh) {
        this.idUsuario = idUsuario;
        this.documento = documento;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.celular = celular;
        this.genero = genero;
        this.rh = rh;
    }

    public Usuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }

    public Collection<Funcional> getFuncionalCollection() {
        return funcionalCollection;
    }

    public void setFuncionalCollection(Collection<Funcional> funcionalCollection) {
        this.funcionalCollection = funcionalCollection;
    }

    public Collection<Consumidor> getConsumidorCollection() {
        return consumidorCollection;
    }

    public void setConsumidorCollection(Collection<Consumidor> consumidorCollection) {
        this.consumidorCollection = consumidorCollection;
    }

    public Collection<Credenciales> getCredencialesCollection() {
        return credencialesCollection;
    }

    public void setCredencialesCollection(Collection<Credenciales> credencialesCollection) {
        this.credencialesCollection = credencialesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", documento=" + documento + ", nombre=" + nombre + ", apellidos=" + apellidos + ", celular=" + celular + ", genero=" + genero + ", rh=" + rh + '}';
    }
    
}

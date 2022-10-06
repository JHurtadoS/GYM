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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author FAMILIA TOVAR BUSTOS
 */
@Entity
@Table(name = "herramienta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Herramienta.findAll", query = "SELECT h FROM Herramienta h"),
    @NamedQuery(name = "Herramienta.findById", query = "SELECT h FROM Herramienta h WHERE h.id = :id"),
    @NamedQuery(name = "Herramienta.findByNombre", query = "SELECT h FROM Herramienta h WHERE h.nombre = :nombre"),
    @NamedQuery(name = "Herramienta.findByImagenAsociada", query = "SELECT h FROM Herramienta h WHERE h.imagenAsociada = :imagenAsociada")})
public class Herramienta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "ImagenAsociada")
    private String imagenAsociada;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "herramientaId", fetch = FetchType.LAZY)
    private Collection<HerramientasRutina> herramientasRutinaCollection;

    public Herramienta() {
    }

    public Herramienta(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagenAsociada() {
        return imagenAsociada;
    }

    public void setImagenAsociada(String imagenAsociada) {
        this.imagenAsociada = imagenAsociada;
    }

    @XmlTransient
    public Collection<HerramientasRutina> getHerramientasRutinaCollection() {
        return herramientasRutinaCollection;
    }

    public void setHerramientasRutinaCollection(Collection<HerramientasRutina> herramientasRutinaCollection) {
        this.herramientasRutinaCollection = herramientasRutinaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Herramienta)) {
            return false;
        }
        Herramienta other = (Herramienta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Herramienta[ id=" + id + " ]";
    }
    
}

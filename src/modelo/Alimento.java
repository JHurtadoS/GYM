/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

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
 * @author juane
 */
@Entity
@Table(name = "alimento")
@NamedQueries({
    @NamedQuery(name = "Alimento.findAll", query = "SELECT a FROM Alimento a")})
public class Alimento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "Imagen_asociada")
    private String imagenasociada;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "alimentoId", fetch = FetchType.LAZY)
    private Collection<AlimentosDelPlanDeNutricion> alimentosDelPlanDeNutricionCollection;

    public Alimento() {
    }

    public Alimento(Integer id, String nombre, String descripcion, String imagenasociada) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagenasociada = imagenasociada;
    }

    public Alimento(Integer id) {
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagenasociada() {
        return imagenasociada;
    }

    public void setImagenasociada(String imagenasociada) {
        this.imagenasociada = imagenasociada;
    }

    public Collection<AlimentosDelPlanDeNutricion> getAlimentosDelPlanDeNutricionCollection() {
        return alimentosDelPlanDeNutricionCollection;
    }

    public void setAlimentosDelPlanDeNutricionCollection(Collection<AlimentosDelPlanDeNutricion> alimentosDelPlanDeNutricionCollection) {
        this.alimentosDelPlanDeNutricionCollection = alimentosDelPlanDeNutricionCollection;
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
        if (!(object instanceof Alimento)) {
            return false;
        }
        Alimento other = (Alimento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Alimento[ id=" + id + " ]";
    }
    
}

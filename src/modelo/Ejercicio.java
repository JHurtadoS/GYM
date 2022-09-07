/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author juane
 */
@Entity
@Table(name = "ejercicio")
@NamedQueries({
    @NamedQuery(name = "Ejercicio.findAll", query = "SELECT e FROM Ejercicio e"),
    @NamedQuery(name = "Ejercicio.findById", query = "SELECT e FROM Ejercicio e WHERE e.id = :id"),
    @NamedQuery(name = "Ejercicio.findByVideoAsociado", query = "SELECT e FROM Ejercicio e WHERE e.videoAsociado = :videoAsociado"),
    @NamedQuery(name = "Ejercicio.findByNombre", query = "SELECT e FROM Ejercicio e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Ejercicio.findByTipo", query = "SELECT e FROM Ejercicio e WHERE e.tipo = :tipo"),
    @NamedQuery(name = "Ejercicio.findByNcalorias", query = "SELECT e FROM Ejercicio e WHERE e.ncalorias = :ncalorias")})
public class Ejercicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "Video_Asociado")
    private String videoAsociado;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Tipo")
    private String tipo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Ncalorias")
    private Float ncalorias;
    @JoinTable(name = "ejercicios_has_rutina", joinColumns = {
        @JoinColumn(name = "Ejercicios_Id", referencedColumnName = "Id")}, inverseJoinColumns = {
        @JoinColumn(name = "Rutina_id", referencedColumnName = "Id")})
    @ManyToMany(fetch = FetchType.LAZY)
    private Collection<Rutina> rutinaCollection;

    public Ejercicio() {
    }

    public Ejercicio(Integer id, String videoAsociado, String nombre, String tipo, Float ncalorias) {
        this.id = id;
        this.videoAsociado = videoAsociado;
        this.nombre = nombre;
        this.tipo = tipo;
        this.ncalorias = ncalorias;
    }


    

    public Ejercicio(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVideoAsociado() {
        return videoAsociado;
    }

    public void setVideoAsociado(String videoAsociado) {
        this.videoAsociado = videoAsociado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Float getNcalorias() {
        return ncalorias;
    }

    public void setNcalorias(Float ncalorias) {
        this.ncalorias = ncalorias;
    }

    public Collection<Rutina> getRutinaCollection() {
        return rutinaCollection;
    }

    public void setRutinaCollection(Collection<Rutina> rutinaCollection) {
        this.rutinaCollection = rutinaCollection;
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
        if (!(object instanceof Ejercicio)) {
            return false;
        }
        Ejercicio other = (Ejercicio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ejercicio{" + "id=" + id + ", videoAsociado=" + videoAsociado + ", nombre=" + nombre + ", tipo=" + tipo + ", ncalorias=" + ncalorias + '}';
    }


    
}

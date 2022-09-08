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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author juane
 */
@Entity
@Table(name = "rutina")
@NamedQueries({
    @NamedQuery(name = "Rutina.findAll", query = "SELECT r FROM Rutina r"),
    @NamedQuery(name = "Rutina.findById", query = "SELECT r FROM Rutina r WHERE r.id = :id"),
    @NamedQuery(name = "Rutina.findByTipRutina", query = "SELECT r FROM Rutina r WHERE r.tipRutina = :tipRutina"),
    @NamedQuery(name = "Rutina.findByCantCalorias", query = "SELECT r FROM Rutina r WHERE r.cantCalorias = :cantCalorias")})
public class Rutina implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "tip_rutina")
    private String tipRutina;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cant_calorias")
    private Float cantCalorias;
    @ManyToMany(mappedBy = "rutinaCollection", fetch = FetchType.LAZY)
    private Collection<Ejercicio> ejercicioCollection;
    @JoinColumn(name = "cita_id", referencedColumnName = "Id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Cita citaId;
    @JoinColumn(name = "Actividad_Id", referencedColumnName = "Id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Actividad actividadId;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "rutina", fetch = FetchType.LAZY)
    private ActividadHasHerramienta actividadHasHerramienta;

    public Rutina() {
    }

    public Rutina(Integer id, String tipRutina, Float cantCalorias, Cita citaId, Actividad actividadId) {
        this.id = id;
        this.tipRutina = tipRutina;
        this.cantCalorias = cantCalorias;
        this.citaId = citaId;
        this.actividadId = actividadId;
    }

    public Rutina(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipRutina() {
        return tipRutina;
    }

    public void setTipRutina(String tipRutina) {
        this.tipRutina = tipRutina;
    }

    public Float getCantCalorias() {
        return cantCalorias;
    }

    public void setCantCalorias(Float cantCalorias) {
        this.cantCalorias = cantCalorias;
    }

    public Collection<Ejercicio> getEjercicioCollection() {
        return ejercicioCollection;
    }

    public void setEjercicioCollection(Collection<Ejercicio> ejercicioCollection) {
        this.ejercicioCollection = ejercicioCollection;
    }

    public Cita getCitaId() {
        return citaId;
    }

    public void setCitaId(Cita citaId) {
        this.citaId = citaId;
    }

    public Actividad getActividadId() {
        return actividadId;
    }

    public void setActividadId(Actividad actividadId) {
        this.actividadId = actividadId;
    }

    public ActividadHasHerramienta getActividadHasHerramienta() {
        return actividadHasHerramienta;
    }

    public void setActividadHasHerramienta(ActividadHasHerramienta actividadHasHerramienta) {
        this.actividadHasHerramienta = actividadHasHerramienta;
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
        if (!(object instanceof Rutina)) {
            return false;
        }
        Rutina other = (Rutina) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Rutina{" + "id=" + id + ", tipRutina=" + tipRutina + ", cantCalorias=" + cantCalorias + ", citaId=" + citaId + ", actividadId=" + actividadId + '}';
    }

}

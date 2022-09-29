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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author juane
 */
@Entity
@Table(name = "actividad")
@NamedQueries({
    @NamedQuery(name = "Actividad.findAll", query = "SELECT a FROM Actividad a")})
public class Actividad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "Descripciion")
    private String descripciion;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "fecha")
    private String fecha;
    @Basic(optional = false)
    @Column(name = "rutina_Id")
    private int rutinaId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "actividadId", fetch = FetchType.LAZY)
    private Collection<Rutina> rutinaCollection;
    @JoinColumn(name = "historial_actividades_id", referencedColumnName = "Id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private HistorialActividades historialActividadesId;
    @JoinColumn(name = "consumidor_Id", referencedColumnName = "Id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Consumidor consumidorId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "actividadId", fetch = FetchType.LAZY)
    private Collection<Evento> eventoCollection;

    public Actividad() {
    }

    public Actividad(Integer id) {
        this.id = id;
    }

    public Actividad(Integer id, String descripciion, String nombre, String fecha, int rutinaId, HistorialActividades historialActividadesId, Consumidor consumidorId) {
        this.id = id;
        this.descripciion = descripciion;
        this.nombre = nombre;
        this.fecha = fecha;
        this.rutinaId = rutinaId;
        this.historialActividadesId = historialActividadesId;
        this.consumidorId = consumidorId;
    }

    public Actividad(Integer id, int rutinaId) {
        this.id = id;
        this.rutinaId = rutinaId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripciion() {
        return descripciion;
    }

    public void setDescripciion(String descripciion) {
        this.descripciion = descripciion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getRutinaId() {
        return rutinaId;
    }

    public void setRutinaId(int rutinaId) {
        this.rutinaId = rutinaId;
    }

    public Collection<Rutina> getRutinaCollection() {
        return rutinaCollection;
    }

    public void setRutinaCollection(Collection<Rutina> rutinaCollection) {
        this.rutinaCollection = rutinaCollection;
    }

    public HistorialActividades getHistorialActividadesId() {
        return historialActividadesId;
    }

    public void setHistorialActividadesId(HistorialActividades historialActividadesId) {
        this.historialActividadesId = historialActividadesId;
    }

    public Consumidor getConsumidorId() {
        return consumidorId;
    }

    public void setConsumidorId(Consumidor consumidorId) {
        this.consumidorId = consumidorId;
    }

    public Collection<Evento> getEventoCollection() {
        return eventoCollection;
    }

    public void setEventoCollection(Collection<Evento> eventoCollection) {
        this.eventoCollection = eventoCollection;
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
        if (!(object instanceof Actividad)) {
            return false;
        }
        Actividad other = (Actividad) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Actividad[ id=" + id + " ]";
    }
    
}

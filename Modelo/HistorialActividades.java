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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author FAMILIA TOVAR BUSTOS
 */
@Entity
@Table(name = "historial_actividades")
@NamedQueries({
    @NamedQuery(name = "HistorialActividades.findAll", query = "SELECT h FROM HistorialActividades h"),
    @NamedQuery(name = "HistorialActividades.findById", query = "SELECT h FROM HistorialActividades h WHERE h.id = :id")})
public class HistorialActividades implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "historialActividadesId", fetch = FetchType.LAZY)
    private Collection<Actividad> actividadCollection;
    @JoinColumn(name = "consumidor_Id", referencedColumnName = "Id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Consumidor consumidorId;

    public HistorialActividades() {
    }

    public HistorialActividades(Integer id, Consumidor consumidorId) {
        this.id = id;
        this.consumidorId = consumidorId;
    }

    public HistorialActividades(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Collection<Actividad> getActividadCollection() {
        return actividadCollection;
    }

    public void setActividadCollection(Collection<Actividad> actividadCollection) {
        this.actividadCollection = actividadCollection;
    }

    public Consumidor getConsumidorId() {
        return consumidorId;
    }

    public void setConsumidorId(Consumidor consumidorId) {
        this.consumidorId = consumidorId;
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
        if (!(object instanceof HistorialActividades)) {
            return false;
        }
        HistorialActividades other = (HistorialActividades) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HistorialActividades{" + "id=" + id + ", consumidorId=" + consumidorId + '}';
    }

    
    
}

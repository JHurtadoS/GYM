/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "historial_actividades", catalog = "gimnasio", schema = "")
@NamedQueries({
    @NamedQuery(name = "HistorialActividades.findAll", query = "SELECT h FROM HistorialActividades h")})
public class HistorialActividades implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HistorialActividadesPK historialActividadesPK;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "historialActividadesId", fetch = FetchType.LAZY)
    private Collection<Actividad> actividadCollection;
    @JoinColumn(name = "consumidor_Id", referencedColumnName = "Id", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Consumidor consumidor;

    public HistorialActividades() {
    }

    public HistorialActividades(HistorialActividadesPK historialActividadesPK) {
        this.historialActividadesPK = historialActividadesPK;
    }

    public HistorialActividades(int id, int consumidorId) {
        this.historialActividadesPK = new HistorialActividadesPK(id, consumidorId);
    }

    public HistorialActividadesPK getHistorialActividadesPK() {
        return historialActividadesPK;
    }

    public void setHistorialActividadesPK(HistorialActividadesPK historialActividadesPK) {
        this.historialActividadesPK = historialActividadesPK;
    }

    public Collection<Actividad> getActividadCollection() {
        return actividadCollection;
    }

    public void setActividadCollection(Collection<Actividad> actividadCollection) {
        this.actividadCollection = actividadCollection;
    }

    public Consumidor getConsumidor() {
        return consumidor;
    }

    public void setConsumidor(Consumidor consumidor) {
        this.consumidor = consumidor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (historialActividadesPK != null ? historialActividadesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistorialActividades)) {
            return false;
        }
        HistorialActividades other = (HistorialActividades) object;
        if ((this.historialActividadesPK == null && other.historialActividadesPK != null) || (this.historialActividadesPK != null && !this.historialActividadesPK.equals(other.historialActividadesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.HistorialActividades[ historialActividadesPK=" + historialActividadesPK + " ]";
    }
    
}

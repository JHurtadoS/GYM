/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author juane
 */
@Entity
@Table(name = "actividad_has_herramienta")
@NamedQueries({
    @NamedQuery(name = "ActividadHasHerramienta.findAll", query = "SELECT a FROM ActividadHasHerramienta a"),
    @NamedQuery(name = "ActividadHasHerramienta.findByActividadId", query = "SELECT a FROM ActividadHasHerramienta a WHERE a.actividadId = :actividadId")})
public class ActividadHasHerramienta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "actividad_id")
    private Integer actividadId;
    @JoinColumn(name = "actividad_id", referencedColumnName = "Id", insertable = false, updatable = false)
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private Rutina rutina;
    @JoinColumn(name = "Herramienta_Id", referencedColumnName = "Id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Herramienta herramientaId;

    public ActividadHasHerramienta() {
    }

    public ActividadHasHerramienta(Integer actividadId) {
        this.actividadId = actividadId;
    }

    public Integer getActividadId() {
        return actividadId;
    }

    public void setActividadId(Integer actividadId) {
        this.actividadId = actividadId;
    }

    public Rutina getRutina() {
        return rutina;
    }

    public void setRutina(Rutina rutina) {
        this.rutina = rutina;
    }

    public Herramienta getHerramientaId() {
        return herramientaId;
    }

    public void setHerramientaId(Herramienta herramientaId) {
        this.herramientaId = herramientaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (actividadId != null ? actividadId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ActividadHasHerramienta)) {
            return false;
        }
        ActividadHasHerramienta other = (ActividadHasHerramienta) object;
        if ((this.actividadId == null && other.actividadId != null) || (this.actividadId != null && !this.actividadId.equals(other.actividadId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.ActividadHasHerramienta[ actividadId=" + actividadId + " ]";
    }
    
}

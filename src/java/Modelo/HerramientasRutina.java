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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author FAMILIA TOVAR BUSTOS
 */
@Entity
@Table(name = "herramientas rutina")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HerramientasRutina.findAll", query = "SELECT h FROM HerramientasRutina h"),
    @NamedQuery(name = "HerramientasRutina.findByRutinaId", query = "SELECT h FROM HerramientasRutina h WHERE h.rutinaId = :rutinaId")})
public class HerramientasRutina implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "rutina_Id")
    private Integer rutinaId;
    @JoinColumn(name = "Herramienta_Id", referencedColumnName = "Id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Herramienta herramientaId;
    @JoinColumn(name = "rutina_Id", referencedColumnName = "Id", insertable = false, updatable = false)
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private Rutina rutina;

    public HerramientasRutina() {
    }

    public HerramientasRutina(Integer rutinaId) {
        this.rutinaId = rutinaId;
    }

    public Integer getRutinaId() {
        return rutinaId;
    }

    public void setRutinaId(Integer rutinaId) {
        this.rutinaId = rutinaId;
    }

    public Herramienta getHerramientaId() {
        return herramientaId;
    }

    public void setHerramientaId(Herramienta herramientaId) {
        this.herramientaId = herramientaId;
    }

    public Rutina getRutina() {
        return rutina;
    }

    public void setRutina(Rutina rutina) {
        this.rutina = rutina;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rutinaId != null ? rutinaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HerramientasRutina)) {
            return false;
        }
        HerramientasRutina other = (HerramientasRutina) object;
        if ((this.rutinaId == null && other.rutinaId != null) || (this.rutinaId != null && !this.rutinaId.equals(other.rutinaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.HerramientasRutina[ rutinaId=" + rutinaId + " ]";
    }
    
}

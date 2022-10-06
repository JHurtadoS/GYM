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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author FAMILIA TOVAR BUSTOS
 */
@Entity
@Table(name = "plan_nutricion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlanNutricion.findAll", query = "SELECT p FROM PlanNutricion p"),
    @NamedQuery(name = "PlanNutricion.findById", query = "SELECT p FROM PlanNutricion p WHERE p.id = :id"),
    @NamedQuery(name = "PlanNutricion.findByTipoAlimentacion", query = "SELECT p FROM PlanNutricion p WHERE p.tipoAlimentacion = :tipoAlimentacion")})
public class PlanNutricion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "tipo_alimentacion")
    private String tipoAlimentacion;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "planNutricion", fetch = FetchType.LAZY)
    private AlimentosDelPlanDeNutricion alimentosDelPlanDeNutricion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "plannutricionId", fetch = FetchType.LAZY)
    private Collection<Consumidor> consumidorCollection;

    public PlanNutricion() {
    }

    public PlanNutricion(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public AlimentosDelPlanDeNutricion getAlimentosDelPlanDeNutricion() {
        return alimentosDelPlanDeNutricion;
    }

    public void setAlimentosDelPlanDeNutricion(AlimentosDelPlanDeNutricion alimentosDelPlanDeNutricion) {
        this.alimentosDelPlanDeNutricion = alimentosDelPlanDeNutricion;
    }

    @XmlTransient
    public Collection<Consumidor> getConsumidorCollection() {
        return consumidorCollection;
    }

    public void setConsumidorCollection(Collection<Consumidor> consumidorCollection) {
        this.consumidorCollection = consumidorCollection;
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
        if (!(object instanceof PlanNutricion)) {
            return false;
        }
        PlanNutricion other = (PlanNutricion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.PlanNutricion[ id=" + id + " ]";
    }
    
}

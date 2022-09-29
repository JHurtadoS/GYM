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
@Table(name = "alimentos del plan de nutricion")
@NamedQueries({
    @NamedQuery(name = "AlimentosDelPlanDeNutricion.findAll", query = "SELECT a FROM AlimentosDelPlanDeNutricion a")})
public class AlimentosDelPlanDeNutricion implements Serializable {

    public AlimentosDelPlanDeNutricion(Integer plannutricionId, PlanNutricion planNutricion, Alimento alimentoId) {
        this.plannutricionId = plannutricionId;
        this.planNutricion = planNutricion;
        this.alimentoId = alimentoId;
    }

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "plan_nutricion_Id")
    private Integer plannutricionId;
    @JoinColumn(name = "plan_nutricion_Id", referencedColumnName = "Id", insertable = false, updatable = false)
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private PlanNutricion planNutricion;
    @JoinColumn(name = "alimento_Id", referencedColumnName = "Id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Alimento alimentoId;

    public AlimentosDelPlanDeNutricion() {
    }

    public AlimentosDelPlanDeNutricion(Integer plannutricionId) {
        this.plannutricionId = plannutricionId;
    }

    public Integer getPlannutricionId() {
        return plannutricionId;
    }

    public void setPlannutricionId(Integer plannutricionId) {
        this.plannutricionId = plannutricionId;
    }

    public PlanNutricion getPlanNutricion() {
        return planNutricion;
    }

    public void setPlanNutricion(PlanNutricion planNutricion) {
        this.planNutricion = planNutricion;
    }

    public Alimento getAlimentoId() {
        return alimentoId;
    }

    public void setAlimentoId(Alimento alimentoId) {
        this.alimentoId = alimentoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (plannutricionId != null ? plannutricionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AlimentosDelPlanDeNutricion)) {
            return false;
        }
        AlimentosDelPlanDeNutricion other = (AlimentosDelPlanDeNutricion) object;
        if ((this.plannutricionId == null && other.plannutricionId != null) || (this.plannutricionId != null && !this.plannutricionId.equals(other.plannutricionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.AlimentosDelPlanDeNutricion[ plannutricionId=" + plannutricionId + " ]";
    }
    
}

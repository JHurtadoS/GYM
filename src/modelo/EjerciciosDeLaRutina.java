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
@Table(name = "ejercicios de la rutina")
@NamedQueries({
    @NamedQuery(name = "EjerciciosDeLaRutina.findAll", query = "SELECT e FROM EjerciciosDeLaRutina e")})
public class EjerciciosDeLaRutina implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Rutina_id")
    private Integer rutinaid;
    @JoinColumn(name = "Ejercicios_Id", referencedColumnName = "Id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Ejercicio ejerciciosId;
    @JoinColumn(name = "Rutina_id", referencedColumnName = "Id", insertable = false, updatable = false)
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private Rutina rutina;

    public EjerciciosDeLaRutina(Integer rutinaid, Ejercicio ejerciciosId, Rutina rutina) {
        this.rutinaid = rutinaid;
        this.ejerciciosId = ejerciciosId;
        this.rutina = rutina;
    }

    public EjerciciosDeLaRutina() {
    }

    public EjerciciosDeLaRutina(Integer rutinaid) {
        this.rutinaid = rutinaid;
    }

    public Integer getRutinaid() {
        return rutinaid;
    }

    public void setRutinaid(Integer rutinaid) {
        this.rutinaid = rutinaid;
    }

    public Ejercicio getEjerciciosId() {
        return ejerciciosId;
    }

    public void setEjerciciosId(Ejercicio ejerciciosId) {
        this.ejerciciosId = ejerciciosId;
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
        hash += (rutinaid != null ? rutinaid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EjerciciosDeLaRutina)) {
            return false;
        }
        EjerciciosDeLaRutina other = (EjerciciosDeLaRutina) object;
        if ((this.rutinaid == null && other.rutinaid != null) || (this.rutinaid != null && !this.rutinaid.equals(other.rutinaid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.EjerciciosDeLaRutina[ rutinaid=" + rutinaid + " ]";
    }
    
}

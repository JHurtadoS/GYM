/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author juane
 */
@Embeddable
public class HistorialActividadesPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "Id", nullable = false)
    private int id;
    @Basic(optional = false)
    @Column(name = "consumidor_Id", nullable = false)
    private int consumidorId;

    public HistorialActividadesPK() {
    }

    public HistorialActividadesPK(int id, int consumidorId) {
        this.id = id;
        this.consumidorId = consumidorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getConsumidorId() {
        return consumidorId;
    }

    public void setConsumidorId(int consumidorId) {
        this.consumidorId = consumidorId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) consumidorId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistorialActividadesPK)) {
            return false;
        }
        HistorialActividadesPK other = (HistorialActividadesPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.consumidorId != other.consumidorId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.HistorialActividadesPK[ id=" + id + ", consumidorId=" + consumidorId + " ]";
    }
    
}

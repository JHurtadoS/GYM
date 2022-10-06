/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author FAMILIA TOVAR BUSTOS
 */
@Entity
@Table(name = "horariogym")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Horariogym.findAll", query = "SELECT h FROM Horariogym h"),
    @NamedQuery(name = "Horariogym.findById", query = "SELECT h FROM Horariogym h WHERE h.id = :id"),
    @NamedQuery(name = "Horariogym.findByHoradecierre", query = "SELECT h FROM Horariogym h WHERE h.horadecierre = :horadecierre"),
    @NamedQuery(name = "Horariogym.findByHoradeAbertura", query = "SELECT h FROM Horariogym h WHERE h.horadeAbertura = :horadeAbertura")})
public class Horariogym implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "Hora de cierre")
    @Temporal(TemporalType.TIME)
    private Date horadecierre;
    @Column(name = "Hora de Abertura")
    @Temporal(TemporalType.TIME)
    private Date horadeAbertura;

    public Horariogym() {
    }

    public Horariogym(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getHoradecierre() {
        return horadecierre;
    }

    public void setHoradecierre(Date horadecierre) {
        this.horadecierre = horadecierre;
    }

    public Date getHoradeAbertura() {
        return horadeAbertura;
    }

    public void setHoradeAbertura(Date horadeAbertura) {
        this.horadeAbertura = horadeAbertura;
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
        if (!(object instanceof Horariogym)) {
            return false;
        }
        Horariogym other = (Horariogym) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Horariogym[ id=" + id + " ]";
    }
    
}

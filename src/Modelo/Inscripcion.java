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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author juane
 */
@Entity
@Table(name = "inscripcion", catalog = "gimnasio", schema = "")
@NamedQueries({
    @NamedQuery(name = "Inscripcion.findAll", query = "SELECT i FROM Inscripcion i")})
public class Inscripcion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id", nullable = false)
    private Integer id;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "Documento_de_inscripcion", length = 255)
    private String documentodeinscripcion;
    @JoinColumn(name = "enfermero_id", referencedColumnName = "Id", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Enfermero enfermeroId;
    @JoinColumn(name = "consumidor_Id", referencedColumnName = "Id", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Consumidor consumidorId;

    public Inscripcion() {
    }

    public Inscripcion(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDocumentodeinscripcion() {
        return documentodeinscripcion;
    }

    public void setDocumentodeinscripcion(String documentodeinscripcion) {
        this.documentodeinscripcion = documentodeinscripcion;
    }

    public Enfermero getEnfermeroId() {
        return enfermeroId;
    }

    public void setEnfermeroId(Enfermero enfermeroId) {
        this.enfermeroId = enfermeroId;
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
        if (!(object instanceof Inscripcion)) {
            return false;
        }
        Inscripcion other = (Inscripcion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Inscripcion[ id=" + id + " ]";
    }
    
}

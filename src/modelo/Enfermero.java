/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author juane
 */
@Entity
@Table(name = "enfermero")
@NamedQueries({
    @NamedQuery(name = "Enfermero.findAll", query = "SELECT e FROM Enfermero e"),
    @NamedQuery(name = "Enfermero.findById", query = "SELECT e FROM Enfermero e WHERE e.id = :id"),
    @NamedQuery(name = "Enfermero.findByRegistroMedico", query = "SELECT e FROM Enfermero e WHERE e.registroMedico = :registroMedico"),
    @NamedQuery(name = "Enfermero.findByFechRegistro", query = "SELECT e FROM Enfermero e WHERE e.fechRegistro = :fechRegistro")})
public class Enfermero implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "registro_medico")
    private String registroMedico;
    @Column(name = "fech_registro")
    @Temporal(TemporalType.DATE)
    private Date fechRegistro;
    @JoinColumn(name = "Funcional_Id", referencedColumnName = "Id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Funcional funcionalId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "enfermeroId", fetch = FetchType.LAZY)
    private Collection<Inscripcion> inscripcionCollection;

    public Enfermero() {
    }

    public Enfermero(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRegistroMedico() {
        return registroMedico;
    }

    public void setRegistroMedico(String registroMedico) {
        this.registroMedico = registroMedico;
    }

    public Date getFechRegistro() {
        return fechRegistro;
    }

    public void setFechRegistro(Date fechRegistro) {
        this.fechRegistro = fechRegistro;
    }

    public Funcional getFuncionalId() {
        return funcionalId;
    }

    public void setFuncionalId(Funcional funcionalId) {
        this.funcionalId = funcionalId;
    }

    public Collection<Inscripcion> getInscripcionCollection() {
        return inscripcionCollection;
    }

    public void setInscripcionCollection(Collection<Inscripcion> inscripcionCollection) {
        this.inscripcionCollection = inscripcionCollection;
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
        if (!(object instanceof Enfermero)) {
            return false;
        }
        Enfermero other = (Enfermero) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Enfermero[ id=" + id + " ]";
    }
    
}

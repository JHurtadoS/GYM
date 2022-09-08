/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

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
 * @author FAMILIA TOVAR BUSTOS
 */
@Entity
@Table(name = "funcional")
@NamedQueries({
    @NamedQuery(name = "Funcional.findAll", query = "SELECT f FROM Funcional f"),
    @NamedQuery(name = "Funcional.findById", query = "SELECT f FROM Funcional f WHERE f.id = :id"),
    @NamedQuery(name = "Funcional.findByHoraDeEntrada", query = "SELECT f FROM Funcional f WHERE f.horaDeEntrada = :horaDeEntrada"),
    @NamedQuery(name = "Funcional.findByHoraDeSalida", query = "SELECT f FROM Funcional f WHERE f.horaDeSalida = :horaDeSalida")})
public class Funcional implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "HoraDeEntrada")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaDeEntrada;
    @Column(name = "HoraDeSalida")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaDeSalida;
    @JoinColumn(name = "usuario_id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario usuarioIdUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "funcionalId", fetch = FetchType.LAZY)
    private Collection<Enfermero> enfermeroCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "funcionalId", fetch = FetchType.LAZY)
    private Collection<Instructor> instructorCollection;

    public Funcional() {
    }

    public Funcional(Integer id, Date horaDeEntrada, Date horaDeSalida, Usuario usuarioIdUsuario, Collection<Enfermero> enfermeroCollection) {
        this.id = id;
        this.horaDeEntrada = horaDeEntrada;
        this.horaDeSalida = horaDeSalida;
        this.usuarioIdUsuario = usuarioIdUsuario;
        this.enfermeroCollection = enfermeroCollection;
    }

    
    public Funcional(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getHoraDeEntrada() {
        return horaDeEntrada;
    }

    public void setHoraDeEntrada(Date horaDeEntrada) {
        this.horaDeEntrada = horaDeEntrada;
    }

    public Date getHoraDeSalida() {
        return horaDeSalida;
    }

    public void setHoraDeSalida(Date horaDeSalida) {
        this.horaDeSalida = horaDeSalida;
    }

    public Usuario getUsuarioIdUsuario() {
        return usuarioIdUsuario;
    }

    public void setUsuarioIdUsuario(Usuario usuarioIdUsuario) {
        this.usuarioIdUsuario = usuarioIdUsuario;
    }

    public Collection<Enfermero> getEnfermeroCollection() {
        return enfermeroCollection;
    }

    public void setEnfermeroCollection(Collection<Enfermero> enfermeroCollection) {
        this.enfermeroCollection = enfermeroCollection;
    }

    public Collection<Instructor> getInstructorCollection() {
        return instructorCollection;
    }

    public void setInstructorCollection(Collection<Instructor> instructorCollection) {
        this.instructorCollection = instructorCollection;
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
        if (!(object instanceof Funcional)) {
            return false;
        }
        Funcional other = (Funcional) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Funcional{" + "id=" + id + ", horaDeEntrada=" + horaDeEntrada + ", horaDeSalida=" + horaDeSalida + ", usuarioIdUsuario=" + usuarioIdUsuario + '}';
    }

    
    
}

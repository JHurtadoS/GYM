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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author FAMILIA TOVAR BUSTOS
 */
@Entity
@Table(name = "consumidor")
@NamedQueries({
    @NamedQuery(name = "Consumidor.findAll", query = "SELECT c FROM Consumidor c"),
    @NamedQuery(name = "Consumidor.findById", query = "SELECT c FROM Consumidor c WHERE c.id = :id")})
public class Consumidor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @JoinTable(name = "consumidor_has_evento", joinColumns = {
        @JoinColumn(name = "consumidor_Id", referencedColumnName = "Id")}, inverseJoinColumns = {
        @JoinColumn(name = "evento_id", referencedColumnName = "Id")})
    @ManyToMany(fetch = FetchType.LAZY)
    private Collection<Evento> eventoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "consumidorId", fetch = FetchType.LAZY)
    private Collection<Inscripcion> inscripcionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "consumidorId", fetch = FetchType.LAZY)
    private Collection<HistorialActividades> historialActividadesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "consumidorId", fetch = FetchType.LAZY)
    private Collection<Cita> citaCollection;
    @JoinColumn(name = "plan_nutricion_Id", referencedColumnName = "Id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private PlanNutricion plannutricionId;
    @JoinColumn(name = "usuario_id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario usuarioIdUsuario;
    @JoinColumn(name = "id_Tipo", referencedColumnName = "Id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Tipo idTipo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "consumidorId", fetch = FetchType.LAZY)
    private Collection<Peticiones> peticionesCollection;

    public Consumidor() {
    }

    public Consumidor(Integer id, PlanNutricion plannutricionId, Usuario usuarioIdUsuario, Tipo idTipo) {
        this.id = id;
        this.plannutricionId = plannutricionId;
        this.usuarioIdUsuario = usuarioIdUsuario;
        this.idTipo = idTipo;
    }

    
    public Consumidor(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Collection<Evento> getEventoCollection() {
        return eventoCollection;
    }

    public void setEventoCollection(Collection<Evento> eventoCollection) {
        this.eventoCollection = eventoCollection;
    }

    public Collection<Inscripcion> getInscripcionCollection() {
        return inscripcionCollection;
    }

    public void setInscripcionCollection(Collection<Inscripcion> inscripcionCollection) {
        this.inscripcionCollection = inscripcionCollection;
    }

    public Collection<HistorialActividades> getHistorialActividadesCollection() {
        return historialActividadesCollection;
    }

    public void setHistorialActividadesCollection(Collection<HistorialActividades> historialActividadesCollection) {
        this.historialActividadesCollection = historialActividadesCollection;
    }

    public Collection<Cita> getCitaCollection() {
        return citaCollection;
    }

    public void setCitaCollection(Collection<Cita> citaCollection) {
        this.citaCollection = citaCollection;
    }

    public PlanNutricion getPlannutricionId() {
        return plannutricionId;
    }

    public void setPlannutricionId(PlanNutricion plannutricionId) {
        this.plannutricionId = plannutricionId;
    }

    public Usuario getUsuarioIdUsuario() {
        return usuarioIdUsuario;
    }

    public void setUsuarioIdUsuario(Usuario usuarioIdUsuario) {
        this.usuarioIdUsuario = usuarioIdUsuario;
    }

    public Tipo getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Tipo idTipo) {
        this.idTipo = idTipo;
    }

    public Collection<Peticiones> getPeticionesCollection() {
        return peticionesCollection;
    }

    public void setPeticionesCollection(Collection<Peticiones> peticionesCollection) {
        this.peticionesCollection = peticionesCollection;
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
        if (!(object instanceof Consumidor)) {
            return false;
        }
        Consumidor other = (Consumidor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Consumidor{" + "id=" + id + ", plannutricionId=" + plannutricionId + ", usuarioIdUsuario=" + usuarioIdUsuario + ", idTipo=" + idTipo + '}';
    }

    
    
}

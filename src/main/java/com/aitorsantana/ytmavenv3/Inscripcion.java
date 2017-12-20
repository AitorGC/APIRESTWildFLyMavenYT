/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aitorsantana.ytmavenv3;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DJ-Sa
 */
@Entity
@Table(name = "inscripcion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inscripcion.findAll", query = "SELECT i FROM Inscripcion i")
    , @NamedQuery(name = "Inscripcion.findByActividadId", query = "SELECT i FROM Inscripcion i WHERE i.actividadId = :actividadId")
    , @NamedQuery(name = "Inscripcion.findById", query = "SELECT i FROM Inscripcion i WHERE i.id = :id")
    , @NamedQuery(name = "Inscripcion.findByFecha", query = "SELECT i FROM Inscripcion i WHERE i.fecha = :fecha")
    , @NamedQuery(name = "Inscripcion.findByAceptado", query = "SELECT i FROM Inscripcion i WHERE i.aceptado = :aceptado")})
public class Inscripcion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ACTIVIDAD_ID")
    private int actividadId;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ACEPTADO")
    private boolean aceptado;
    @JoinColumn(name = "USUARIO_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Usuarios usuarioId;

    public Inscripcion() {
    }

    public Inscripcion(Integer id) {
        this.id = id;
    }

    public Inscripcion(Integer id, int actividadId, Date fecha, boolean aceptado) {
        this.id = id;
        this.actividadId = actividadId;
        this.fecha = fecha;
        this.aceptado = aceptado;
    }

    public int getActividadId() {
        return actividadId;
    }

    public void setActividadId(int actividadId) {
        this.actividadId = actividadId;
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

    public boolean getAceptado() {
        return aceptado;
    }

    public void setAceptado(boolean aceptado) {
        this.aceptado = aceptado;
    }

    public Usuarios getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuarios usuarioId) {
        this.usuarioId = usuarioId;
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
        return "com.aitorsantana.ytmavenv3.Inscripcion[ id=" + id + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aitorsantana.ytmavenv3;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DJ-Sa
 */
@Entity
@Table(name = "actividades")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Actividades.findAll", query = "SELECT a FROM Actividades a")
    , @NamedQuery(name = "Actividades.findById", query = "SELECT a FROM Actividades a WHERE a.id = :id")
    , @NamedQuery(name = "Actividades.findByNombre", query = "SELECT a FROM Actividades a WHERE a.nombre = :nombre")
    , @NamedQuery(name = "Actividades.findByLocalizacion", query = "SELECT a FROM Actividades a WHERE a.localizacion = :localizacion")
    , @NamedQuery(name = "Actividades.findByDescripcion", query = "SELECT a FROM Actividades a WHERE a.descripcion = :descripcion")
    , @NamedQuery(name = "Actividades.findByFechaIni", query = "SELECT a FROM Actividades a WHERE a.fechaIni = :fechaIni")
    , @NamedQuery(name = "Actividades.findByFechaFin", query = "SELECT a FROM Actividades a WHERE a.fechaFin = :fechaFin")
    , @NamedQuery(name = "Actividades.findByMaxInscritos", query = "SELECT a FROM Actividades a WHERE a.maxInscritos = :maxInscritos")
    , @NamedQuery(name = "Actividades.findByNumInscritos", query = "SELECT a FROM Actividades a WHERE a.numInscritos = :numInscritos")})
public class Actividades implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "LOCALIZACION")
    private String localizacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "FECHA_INI")
    private String fechaIni;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "FECHA_FIN")
    private String fechaFin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MAX_INSCRITOS")
    private int maxInscritos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUM_INSCRITOS")
    private int numInscritos;

    public Actividades() {
    }

    public Actividades(Integer id) {
        this.id = id;
    }

    public Actividades(Integer id, String nombre, String localizacion, String descripcion, String fechaIni, String fechaFin, int maxInscritos, int numInscritos) {
        this.id = id;
        this.nombre = nombre;
        this.localizacion = localizacion;
        this.descripcion = descripcion;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.maxInscritos = maxInscritos;
        this.numInscritos = numInscritos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(String fechaIni) {
        this.fechaIni = fechaIni;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getMaxInscritos() {
        return maxInscritos;
    }

    public void setMaxInscritos(int maxInscritos) {
        this.maxInscritos = maxInscritos;
    }

    public int getNumInscritos() {
        return numInscritos;
    }

    public void setNumInscritos(int numInscritos) {
        this.numInscritos = numInscritos;
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
        if (!(object instanceof Actividades)) {
            return false;
        }
        Actividades other = (Actividades) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aitorsantana.ytmavenv3.Actividades[ id=" + id + " ]";
    }
    
}

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
@Table(name = "monitores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Monitores.findAll", query = "SELECT m FROM Monitores m")
    , @NamedQuery(name = "Monitores.findById", query = "SELECT m FROM Monitores m WHERE m.id = :id")
    , @NamedQuery(name = "Monitores.findByDni", query = "SELECT m FROM Monitores m WHERE m.dni = :dni")
    , @NamedQuery(name = "Monitores.findByNombre", query = "SELECT m FROM Monitores m WHERE m.nombre = :nombre")
    , @NamedQuery(name = "Monitores.findByApellidos", query = "SELECT m FROM Monitores m WHERE m.apellidos = :apellidos")
    , @NamedQuery(name = "Monitores.findByDireccion", query = "SELECT m FROM Monitores m WHERE m.direccion = :direccion")
    , @NamedQuery(name = "Monitores.findByTelefono", query = "SELECT m FROM Monitores m WHERE m.telefono = :telefono")
    , @NamedQuery(name = "Monitores.findByEmail", query = "SELECT m FROM Monitores m WHERE m.email = :email")
    , @NamedQuery(name = "Monitores.findByTitulacion", query = "SELECT m FROM Monitores m WHERE m.titulacion = :titulacion")})
public class Monitores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "DNI")
    private String dni;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "APELLIDOS")
    private String apellidos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "DIRECCION")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TELEFONO")
    private int telefono;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "EMAIL")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "TITULACION")
    private String titulacion;

    public Monitores() {
    }

    public Monitores(Integer id) {
        this.id = id;
    }

    public Monitores(Integer id, String dni, String nombre, String apellidos, String direccion, int telefono, String email, String titulacion) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.titulacion = titulacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
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
        if (!(object instanceof Monitores)) {
            return false;
        }
        Monitores other = (Monitores) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aitorsantana.ytmavenv3.Monitores[ id=" + id + " ]";
    }
    
}

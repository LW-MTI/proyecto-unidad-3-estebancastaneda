/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ittepic.pmdapp.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Esteban
 */
@Entity
@Table(name = "dependencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dependencia.findAll", query = "SELECT d FROM Dependencia d")
    , @NamedQuery(name = "Dependencia.findByIddepe", query = "SELECT d FROM Dependencia d WHERE d.iddepe = :iddepe")
    , @NamedQuery(name = "Dependencia.findByClavedepe", query = "SELECT d FROM Dependencia d WHERE d.clavedepe = :clavedepe")
    , @NamedQuery(name = "Dependencia.findByNombredepe", query = "SELECT d FROM Dependencia d WHERE d.nombredepe = :nombredepe")})
public class Dependencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddepe")
    private Integer iddepe;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "clavedepe")
    private String clavedepe;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombredepe")
    private String nombredepe;
    @ManyToMany(mappedBy = "dependenciaList")
    private List<Categoriaplan> categoriaplanList;
    @ManyToMany(mappedBy = "dependenciaList")
    private List<Administracion> administracionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iddepe")
    private List<Actividad> actividadList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iddepe")
    private List<Departamento> departamentoList;

    public Dependencia() {
    }

    public Dependencia(Integer iddepe) {
        this.iddepe = iddepe;
    }

    public Dependencia(Integer iddepe, String clavedepe, String nombredepe) {
        this.iddepe = iddepe;
        this.clavedepe = clavedepe;
        this.nombredepe = nombredepe;
    }

    public Integer getIddepe() {
        return iddepe;
    }

    public void setIddepe(Integer iddepe) {
        this.iddepe = iddepe;
    }

    public String getClavedepe() {
        return clavedepe;
    }

    public void setClavedepe(String clavedepe) {
        this.clavedepe = clavedepe;
    }

    public String getNombredepe() {
        return nombredepe;
    }

    public void setNombredepe(String nombredepe) {
        this.nombredepe = nombredepe;
    }

    @XmlTransient
    public List<Categoriaplan> getCategoriaplanList() {
        return categoriaplanList;
    }

    public void setCategoriaplanList(List<Categoriaplan> categoriaplanList) {
        this.categoriaplanList = categoriaplanList;
    }

    @XmlTransient
    public List<Administracion> getAdministracionList() {
        return administracionList;
    }

    public void setAdministracionList(List<Administracion> administracionList) {
        this.administracionList = administracionList;
    }

    @XmlTransient
    public List<Actividad> getActividadList() {
        return actividadList;
    }

    public void setActividadList(List<Actividad> actividadList) {
        this.actividadList = actividadList;
    }

    @XmlTransient
    public List<Departamento> getDepartamentoList() {
        return departamentoList;
    }

    public void setDepartamentoList(List<Departamento> departamentoList) {
        this.departamentoList = departamentoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddepe != null ? iddepe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dependencia)) {
            return false;
        }
        Dependencia other = (Dependencia) object;
        if ((this.iddepe == null && other.iddepe != null) || (this.iddepe != null && !this.iddepe.equals(other.iddepe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.edu.ittepic.pmdapp.entidades.Dependencia[ iddepe=" + iddepe + " ]";
    }
    
}

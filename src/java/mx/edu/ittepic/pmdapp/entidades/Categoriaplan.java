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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
@Table(name = "categoriaplan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categoriaplan.findAll", query = "SELECT c FROM Categoriaplan c")
    , @NamedQuery(name = "Categoriaplan.findByIdcat", query = "SELECT c FROM Categoriaplan c WHERE c.idcat = :idcat")
    , @NamedQuery(name = "Categoriaplan.findByClavecat", query = "SELECT c FROM Categoriaplan c WHERE c.clavecat = :clavecat")
    , @NamedQuery(name = "Categoriaplan.findByNombrecat", query = "SELECT c FROM Categoriaplan c WHERE c.nombrecat = :nombrecat")
    , @NamedQuery(name = "Categoriaplan.findByNivelcat", query = "SELECT c FROM Categoriaplan c WHERE c.nivelcat = :nivelcat")
    , @NamedQuery(name = "Categoriaplan.findByRutacat", query = "SELECT c FROM Categoriaplan c WHERE c.rutacat = :rutacat")
    , @NamedQuery(name = "Categoriaplan.findByOrdencat", query = "SELECT c FROM Categoriaplan c WHERE c.ordencat = :ordencat")})
public class Categoriaplan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcat")
    private Integer idcat;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "clavecat")
    private String clavecat;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombrecat")
    private String nombrecat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nivelcat")
    private int nivelcat;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "rutacat")
    private String rutacat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ordencat")
    private int ordencat;
    @JoinTable(name = "participacion", joinColumns = {
        @JoinColumn(name = "idcat", referencedColumnName = "idcat")}, inverseJoinColumns = {
        @JoinColumn(name = "iddepe", referencedColumnName = "iddepe")})
    @ManyToMany
    private List<Dependencia> dependenciaList;
    @OneToMany(mappedBy = "idcatpadre")
    private List<Categoriaplan> categoriaplanList;
    @JoinColumn(name = "idcatpadre", referencedColumnName = "idcat")
    @ManyToOne
    private Categoriaplan idcatpadre;
    @JoinColumn(name = "idplan", referencedColumnName = "idplan")
    @ManyToOne(optional = false)
    private Plan idplan;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcat")
    private List<Actividad> actividadList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcat")
    private List<Objetivo> objetivoList;

    public Categoriaplan() {
    }

    public Categoriaplan(Integer idcat) {
        this.idcat = idcat;
    }

    public Categoriaplan(Integer idcat, String clavecat, String nombrecat, int nivelcat, String rutacat, int ordencat) {
        this.idcat = idcat;
        this.clavecat = clavecat;
        this.nombrecat = nombrecat;
        this.nivelcat = nivelcat;
        this.rutacat = rutacat;
        this.ordencat = ordencat;
    }

    public Integer getIdcat() {
        return idcat;
    }

    public void setIdcat(Integer idcat) {
        this.idcat = idcat;
    }

    public String getClavecat() {
        return clavecat;
    }

    public void setClavecat(String clavecat) {
        this.clavecat = clavecat;
    }

    public String getNombrecat() {
        return nombrecat;
    }

    public void setNombrecat(String nombrecat) {
        this.nombrecat = nombrecat;
    }

    public int getNivelcat() {
        return nivelcat;
    }

    public void setNivelcat(int nivelcat) {
        this.nivelcat = nivelcat;
    }

    public String getRutacat() {
        return rutacat;
    }

    public void setRutacat(String rutacat) {
        this.rutacat = rutacat;
    }

    public int getOrdencat() {
        return ordencat;
    }

    public void setOrdencat(int ordencat) {
        this.ordencat = ordencat;
    }

    @XmlTransient
    public List<Dependencia> getDependenciaList() {
        return dependenciaList;
    }

    public void setDependenciaList(List<Dependencia> dependenciaList) {
        this.dependenciaList = dependenciaList;
    }

    @XmlTransient
    public List<Categoriaplan> getCategoriaplanList() {
        return categoriaplanList;
    }

    public void setCategoriaplanList(List<Categoriaplan> categoriaplanList) {
        this.categoriaplanList = categoriaplanList;
    }

    public Categoriaplan getIdcatpadre() {
        return idcatpadre;
    }

    public void setIdcatpadre(Categoriaplan idcatpadre) {
        this.idcatpadre = idcatpadre;
    }

    public Plan getIdplan() {
        return idplan;
    }

    public void setIdplan(Plan idplan) {
        this.idplan = idplan;
    }

    @XmlTransient
    public List<Actividad> getActividadList() {
        return actividadList;
    }

    public void setActividadList(List<Actividad> actividadList) {
        this.actividadList = actividadList;
    }

    @XmlTransient
    public List<Objetivo> getObjetivoList() {
        return objetivoList;
    }

    public void setObjetivoList(List<Objetivo> objetivoList) {
        this.objetivoList = objetivoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcat != null ? idcat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categoriaplan)) {
            return false;
        }
        Categoriaplan other = (Categoriaplan) object;
        if ((this.idcat == null && other.idcat != null) || (this.idcat != null && !this.idcat.equals(other.idcat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.edu.ittepic.pmdapp.entidades.Categoriaplan[ idcat=" + idcat + " ]";
    }
    
}

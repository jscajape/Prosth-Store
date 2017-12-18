/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.proyecto.protesis.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author js_cm
 */
@Entity
@Table(name = "conductor")
@NamedQueries({
    @NamedQuery(name = "Conductor.findAll", query = "SELECT c FROM Conductor c")})
public class Conductor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_CONDUCTOR", nullable = false)
    private Integer codConductor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "APELLIDO", nullable = false, length = 100)
    private String apellido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CI", nullable = false)
    private long ci;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_NACIMIENTO", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LICENCIA", nullable = false)
    private BigInteger licencia;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "conductor", fetch = FetchType.EAGER)
    private List<Camion> camionList;

    public Conductor() {
    }

    public Conductor(Integer codConductor) {
        this.codConductor = codConductor;
    }

    public Conductor(Integer codConductor, String nombre, String apellido, long ci, Date fechaNacimiento, BigInteger licencia) {
        this.codConductor = codConductor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
        this.fechaNacimiento = fechaNacimiento;
        this.licencia = licencia;
    }

    public Integer getCodConductor() {
        return codConductor;
    }

    public void setCodConductor(Integer codConductor) {
        this.codConductor = codConductor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getCi() {
        return ci;
    }

    public void setCi(long ci) {
        this.ci = ci;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public BigInteger getLicencia() {
        return licencia;
    }

    public void setLicencia(BigInteger licencia) {
        this.licencia = licencia;
    }

    public List<Camion> getCamionList() {
        return camionList;
    }

    public void setCamionList(List<Camion> camionList) {
        this.camionList = camionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codConductor != null ? codConductor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Conductor)) {
            return false;
        }
        Conductor other = (Conductor) object;
        if ((this.codConductor == null && other.codConductor != null) || (this.codConductor != null && !this.codConductor.equals(other.codConductor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.proyecto.protesis.model.Conductor[ codConductor=" + codConductor + " ]";
    }
    
}

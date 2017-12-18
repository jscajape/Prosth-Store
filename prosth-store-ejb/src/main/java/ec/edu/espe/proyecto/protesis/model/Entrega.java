/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.proyecto.protesis.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "entrega")
@NamedQueries({
    @NamedQuery(name = "Entrega.findAll", query = "SELECT e FROM Entrega e")})
public class Entrega implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "COD_ENTREGA", nullable = false, length = 10)
    private String codEntrega;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "DESCRIPCION", nullable = false, length = 200)
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_SALIDA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSalida;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_LLEGADA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaLlegada;
    @JoinColumn(name = "COD_VENTA", referencedColumnName = "COD_VENTA", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Venta codVenta;
    @JoinColumns({
        @JoinColumn(name = "COD_CAMION", referencedColumnName = "COD_CAMION", nullable = false),
        @JoinColumn(name = "COD_CONDUCTOR", referencedColumnName = "COD_CONDUCTOR", nullable = false)})
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Camion camion;

    public Entrega() {
    }

    public Entrega(String codEntrega) {
        this.codEntrega = codEntrega;
    }

    public Entrega(String codEntrega, String descripcion, Date fechaSalida, Date fechaLlegada) {
        this.codEntrega = codEntrega;
        this.descripcion = descripcion;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
    }

    public String getCodEntrega() {
        return codEntrega;
    }

    public void setCodEntrega(String codEntrega) {
        this.codEntrega = codEntrega;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public Venta getCodVenta() {
        return codVenta;
    }

    public void setCodVenta(Venta codVenta) {
        this.codVenta = codVenta;
    }

    public Camion getCamion() {
        return camion;
    }

    public void setCamion(Camion camion) {
        this.camion = camion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codEntrega != null ? codEntrega.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Entrega)) {
            return false;
        }
        Entrega other = (Entrega) object;
        if ((this.codEntrega == null && other.codEntrega != null) || (this.codEntrega != null && !this.codEntrega.equals(other.codEntrega))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.proyecto.protesis.model.Entrega[ codEntrega=" + codEntrega + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.proyecto.protesis.model;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author js_cm
 */
@Entity
@Table(name = "modo_pago")
@NamedQueries({
    @NamedQuery(name = "ModoPago.findAll", query = "SELECT m FROM ModoPago m")})
public class ModoPago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_PAGO", nullable = false)
    private Integer codPago;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "TIPO_PAGO", nullable = false, length = 3)
    private String tipoPago;
    @Size(max = 200)
    @Column(name = "DESCRIPCION", length = 200)
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codPago", fetch = FetchType.EAGER)
    private List<DetalleVenta> detalleVentaList;

    public ModoPago() {
    }

    public ModoPago(Integer codPago) {
        this.codPago = codPago;
    }

    public ModoPago(Integer codPago, String tipoPago) {
        this.codPago = codPago;
        this.tipoPago = tipoPago;
    }

    public Integer getCodPago() {
        return codPago;
    }

    public void setCodPago(Integer codPago) {
        this.codPago = codPago;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<DetalleVenta> getDetalleVentaList() {
        return detalleVentaList;
    }

    public void setDetalleVentaList(List<DetalleVenta> detalleVentaList) {
        this.detalleVentaList = detalleVentaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPago != null ? codPago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModoPago)) {
            return false;
        }
        ModoPago other = (ModoPago) object;
        if ((this.codPago == null && other.codPago != null) || (this.codPago != null && !this.codPago.equals(other.codPago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.proyecto.protesis.model.ModoPago[ codPago=" + codPago + " ]";
    }
    
}

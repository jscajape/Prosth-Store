/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.proyecto.protesis.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author js_cm
 */
@Entity
@Table(name = "compra")
public class Compra implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "COD_COMPRA", nullable = false)
    private Integer codCompra;

    @Column(name = "FECHA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    
    @Column(name = "VALOR_TOTAL", nullable = false, precision = 8, scale = 2)
    private BigDecimal valorTotal;
    
    @JoinColumn(name = "COD_PROVEEDOR", referencedColumnName = "COD_PROVEEDOR", nullable = false)
    @ManyToOne
    private Proveedor codProveedor;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codCompra", fetch = FetchType.EAGER)
    private List<DetalleCompra> detalleCompraList;

    public Compra() {
    }

    public Compra(Integer codCompra) {
        this.codCompra = codCompra;
    }

    public Integer getCodCompra() {
        return codCompra;
    }

    public void setCodCompra(Integer codCompra) {
        this.codCompra = codCompra;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Proveedor getCodProveedor() {
        return codProveedor;
    }

    public void setCodProveedor(Proveedor codProveedor) {
        this.codProveedor = codProveedor;
    }

    public List<DetalleCompra> getDetalleCompraList() {
        return detalleCompraList;
    }

    public void setDetalleCompraList(List<DetalleCompra> detalleCompraList) {
        this.detalleCompraList = detalleCompraList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCompra != null ? codCompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compra)) {
            return false;
        }
        Compra other = (Compra) object;
        if ((this.codCompra == null && other.codCompra != null) || (this.codCompra != null && !this.codCompra.equals(other.codCompra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.proyecto.protesis.model.Compra[ codCompra=" + codCompra + " ]";
    }
    
}

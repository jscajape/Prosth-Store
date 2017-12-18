/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.proyecto.protesis.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author js_cm
 */
@Entity
@Table(name = "detalle_compra")
@NamedQueries({
    @NamedQuery(name = "DetalleCompra.findAll", query = "SELECT d FROM DetalleCompra d")})
public class DetalleCompra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "COD_DETALLE_COMPRA", nullable = false, length = 10)
    private String codDetalleCompra;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "VALOR_TOTAL", nullable = false, precision = 8, scale = 2)
    private BigDecimal valorTotal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VALOR_UNITARIO", nullable = false, precision = 8, scale = 2)
    private BigDecimal valorUnitario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CANTIDAD", nullable = false)
    private short cantidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "DESCRIPCION", nullable = false, length = 100)
    private String descripcion;
    @JoinColumn(name = "COD_PRODUCTO", referencedColumnName = "COD_PRODUCTO", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Producto codProducto;
    @JoinColumn(name = "COD_COMPRA", referencedColumnName = "COD_COMPRA", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Compra codCompra;

    public DetalleCompra() {
    }

    public DetalleCompra(String codDetalleCompra) {
        this.codDetalleCompra = codDetalleCompra;
    }

    public DetalleCompra(String codDetalleCompra, BigDecimal valorTotal, BigDecimal valorUnitario, short cantidad, String descripcion) {
        this.codDetalleCompra = codDetalleCompra;
        this.valorTotal = valorTotal;
        this.valorUnitario = valorUnitario;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
    }

    public String getCodDetalleCompra() {
        return codDetalleCompra;
    }

    public void setCodDetalleCompra(String codDetalleCompra) {
        this.codDetalleCompra = codDetalleCompra;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public short getCantidad() {
        return cantidad;
    }

    public void setCantidad(short cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Producto getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(Producto codProducto) {
        this.codProducto = codProducto;
    }

    public Compra getCodCompra() {
        return codCompra;
    }

    public void setCodCompra(Compra codCompra) {
        this.codCompra = codCompra;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codDetalleCompra != null ? codDetalleCompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleCompra)) {
            return false;
        }
        DetalleCompra other = (DetalleCompra) object;
        if ((this.codDetalleCompra == null && other.codDetalleCompra != null) || (this.codDetalleCompra != null && !this.codDetalleCompra.equals(other.codDetalleCompra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.proyecto.protesis.model.DetalleCompra[ codDetalleCompra=" + codDetalleCompra + " ]";
    }
    
}

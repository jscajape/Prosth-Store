/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.proyecto.protesis.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author js_cm
 */
@Entity
@Table(name = "detalle_compra")
public class DetalleCompra implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "COD_DETALLE_COMPRA", nullable = false, length = 10)
    private String codDetalleCompra;
   
    @Column(name = "VALOR_TOTAL", nullable = false, precision = 8, scale = 2)
    private BigDecimal valorTotal;

    @Column(name = "VALOR_UNITARIO", nullable = false, precision = 8, scale = 2)
    private BigDecimal valorUnitario;

    @Column(name = "CANTIDAD", nullable = false)
    private short cantidad;

    @Column(name = "DESCRIPCION", nullable = false, length = 100)
    private String descripcion;
    
    @JoinColumn(name = "COD_PRODUCTO", referencedColumnName = "COD_PRODUCTO", nullable = false)
    @ManyToOne
    private Producto codProducto;
    
    @JoinColumn(name = "COD_COMPRA", referencedColumnName = "COD_COMPRA", nullable = false)
    @ManyToOne
    private Compra codCompra;

    public DetalleCompra() {
    }

    public DetalleCompra(String codDetalleCompra) {
        this.codDetalleCompra = codDetalleCompra;
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

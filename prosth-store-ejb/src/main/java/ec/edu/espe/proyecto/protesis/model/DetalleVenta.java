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
@Table(name = "detalle_venta")
public class DetalleVenta implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "COD_DETALLE", nullable = false, length = 10)
    private String codDetalle;

    @Column(name = "DESCRIPCION", nullable = false, length = 100)
    private String descripcion;

    @Column(name = "CANTIDAD", nullable = false)
    private short cantidad;

    @Column(name = "VALOR_UNITARIO", nullable = false, precision = 8, scale = 2)
    private BigDecimal valorUnitario;

    @Column(name = "VALOR_TOTAL", nullable = false, precision = 8, scale = 2)
    private BigDecimal valorTotal;
    
    @JoinColumn(name = "COD_PRODUCTO", referencedColumnName = "COD_PRODUCTO", nullable = false)
    @ManyToOne
    private Producto codProducto;
    
    @JoinColumn(name = "COD_PAGO", referencedColumnName = "COD_PAGO", nullable = false)
    @ManyToOne
    private ModoPago codPago;
    
    @JoinColumn(name = "COD_VENTA", referencedColumnName = "COD_VENTA", nullable = false)
    @ManyToOne
    private Venta codVenta;

    public DetalleVenta() {
    }

    public DetalleVenta(String codDetalle) {
        this.codDetalle = codDetalle;
    }


    public String getCodDetalle() {
        return codDetalle;
    }

    public void setCodDetalle(String codDetalle) {
        this.codDetalle = codDetalle;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public short getCantidad() {
        return cantidad;
    }

    public void setCantidad(short cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Producto getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(Producto codProducto) {
        this.codProducto = codProducto;
    }

    public ModoPago getCodPago() {
        return codPago;
    }

    public void setCodPago(ModoPago codPago) {
        this.codPago = codPago;
    }

    public Venta getCodVenta() {
        return codVenta;
    }

    public void setCodVenta(Venta codVenta) {
        this.codVenta = codVenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codDetalle != null ? codDetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleVenta)) {
            return false;
        }
        DetalleVenta other = (DetalleVenta) object;
        if ((this.codDetalle == null && other.codDetalle != null) || (this.codDetalle != null && !this.codDetalle.equals(other.codDetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.proyecto.protesis.model.DetalleVenta[ codDetalle=" + codDetalle + " ]";
    }
    
}

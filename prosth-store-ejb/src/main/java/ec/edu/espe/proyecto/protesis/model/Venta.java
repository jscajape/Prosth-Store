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
import javax.persistence.JoinColumns;
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
@Table(name = "venta")
public class Venta implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "COD_VENTA", nullable = false)
    private Integer codVenta;

    @Column(name = "FECHA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    @Column(name = "VALOR_TOTAL", nullable = false, precision = 8, scale = 2)
    private BigDecimal valorTotal;
    
    @JoinColumns({
        @JoinColumn(name = "COD_USUARIO", referencedColumnName = "COD_USUARIO", nullable = false),
        @JoinColumn(name = "COD_TIPO_USUARIO", referencedColumnName = "COD_TIPO_USUARIO", nullable = false)})
    @ManyToOne
    private Usuario usuario;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codVenta", fetch = FetchType.EAGER)
    private List<DetalleVenta> detalleVentaList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codVenta", fetch = FetchType.EAGER)
    private List<Entrega> entregaList;

    public Venta() {
    }

    public Venta(Integer codVenta) {
        this.codVenta = codVenta;
    }

    public Integer getCodVenta() {
        return codVenta;
    }

    public void setCodVenta(Integer codVenta) {
        this.codVenta = codVenta;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<DetalleVenta> getDetalleVentaList() {
        return detalleVentaList;
    }

    public void setDetalleVentaList(List<DetalleVenta> detalleVentaList) {
        this.detalleVentaList = detalleVentaList;
    }

    public List<Entrega> getEntregaList() {
        return entregaList;
    }

    public void setEntregaList(List<Entrega> entregaList) {
        this.entregaList = entregaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codVenta != null ? codVenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Venta)) {
            return false;
        }
        Venta other = (Venta) object;
        if ((this.codVenta == null && other.codVenta != null) || (this.codVenta != null && !this.codVenta.equals(other.codVenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.proyecto.protesis.model.Venta[ codVenta=" + codVenta + " ]";
    }
    
}

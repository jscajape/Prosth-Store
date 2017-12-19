/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.proyecto.protesis.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author js_cm
 */
@Entity
@Table(name = "proveedor")
public class Proveedor implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "COD_PROVEEDOR", nullable = false)
    private Integer codProveedor;

    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;

    @Column(name = "DESCRIPCION", length = 200)
    private String descripcion;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codProveedor", fetch = FetchType.EAGER)
    private List<Compra> compraList;

    public Proveedor() {
    }

    public Proveedor(Integer codProveedor) {
        this.codProveedor = codProveedor;
    }

    public Integer getCodProveedor() {
        return codProveedor;
    }

    public void setCodProveedor(Integer codProveedor) {
        this.codProveedor = codProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Compra> getCompraList() {
        return compraList;
    }

    public void setCompraList(List<Compra> compraList) {
        this.compraList = compraList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codProveedor != null ? codProveedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proveedor)) {
            return false;
        }
        Proveedor other = (Proveedor) object;
        if ((this.codProveedor == null && other.codProveedor != null) || (this.codProveedor != null && !this.codProveedor.equals(other.codProveedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.proyecto.protesis.model.Proveedor[ codProveedor=" + codProveedor + " ]";
    }
    
}

/*
 * Protesis Store
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Protesis Store Corp.
 */
package ec.edu.espe.proyecto.protesis.model;

import ec.edu.espe.proyecto.protesis.enums.TipoPagoEnum;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Protesis Store Corp.
 */
@Entity
@Table(name = "modo_pago")
public class ModoPago implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "COD_PAGO", nullable = false)
    private Integer codPago;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO_PAGO", nullable = false, length = 3)
    private TipoPagoEnum tipo;

    @Column(name = "DESCRIPCION", length = 200)
    private String descripcion;

    public ModoPago() {
    }

    public ModoPago(Integer codPago) {
        this.codPago = codPago;
    }


    public Integer getCodPago() {
        return codPago;
    }

    public void setCodPago(Integer codPago) {
        this.codPago = codPago;
    }

    public TipoPagoEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoPagoEnum tipo) {
        this.tipo = tipo;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPago != null ? codPago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
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

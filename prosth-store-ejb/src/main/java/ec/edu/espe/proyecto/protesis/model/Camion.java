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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author js_cm
 */
@Entity
@Table(name = "camion")

public class Camion implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @EmbeddedId
    protected CamionPK camionPK;

    @Column(name = "PLACA", nullable = false, length = 20)
    private String placa;
  
    @Column(name = "MODELO", nullable = false, length = 100)
    private String modelo;
 
    @Column(name = "COLOR", nullable = false, length = 100)
    private String color;
    
    @Column(name = "MARCA", nullable = false, length = 100)
    private String marca;
    
    @JoinColumn(name = "COD_CONDUCTOR", referencedColumnName = "COD_CONDUCTOR", nullable = false, insertable = false, updatable = false)
    @ManyToOne
    private Conductor conductor;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "camion", fetch = FetchType.EAGER)
    private List<Entrega> entregaList;

    public Camion() {
    }

    public Camion(CamionPK camionPK) {
        this.camionPK = camionPK;
    }

    public Camion(int codCamion, int codConductor) {
        this.camionPK = new CamionPK(codCamion, codConductor);
    }

    public CamionPK getCamionPK() {
        return camionPK;
    }

    public void setCamionPK(CamionPK camionPK) {
        this.camionPK = camionPK;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
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
        hash += (camionPK != null ? camionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Camion)) {
            return false;
        }
        Camion other = (Camion) object;
        if ((this.camionPK == null && other.camionPK != null) || (this.camionPK != null && !this.camionPK.equals(other.camionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.proyecto.protesis.model.Camion[ camionPK=" + camionPK + " ]";
    }
    
}

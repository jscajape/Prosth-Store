/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.proyecto.protesis.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author js_cm
 */
@Embeddable
public class CamionPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_CAMION", nullable = false)
    private int codCamion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_CONDUCTOR", nullable = false)
    private int codConductor;

    public CamionPK() {
    }

    public CamionPK(int codCamion, int codConductor) {
        this.codCamion = codCamion;
        this.codConductor = codConductor;
    }

    public int getCodCamion() {
        return codCamion;
    }

    public void setCodCamion(int codCamion) {
        this.codCamion = codCamion;
    }

    public int getCodConductor() {
        return codConductor;
    }

    public void setCodConductor(int codConductor) {
        this.codConductor = codConductor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codCamion;
        hash += (int) codConductor;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CamionPK)) {
            return false;
        }
        CamionPK other = (CamionPK) object;
        if (this.codCamion != other.codCamion) {
            return false;
        }
        if (this.codConductor != other.codConductor) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.proyecto.protesis.model.CamionPK[ codCamion=" + codCamion + ", codConductor=" + codConductor + " ]";
    }
    
}

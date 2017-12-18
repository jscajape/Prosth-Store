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
import javax.validation.constraints.Size;

/**
 *
 * @author js_cm
 */
@Embeddable
public class UsuarioPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "COD_USUARIO", nullable = false, length = 10)
    private String codUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_TIPO_USUARIO", nullable = false)
    private int codTipoUsuario;

    public UsuarioPK() {
    }

    public UsuarioPK(String codUsuario, int codTipoUsuario) {
        this.codUsuario = codUsuario;
        this.codTipoUsuario = codTipoUsuario;
    }

    public String getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
    }

    public int getCodTipoUsuario() {
        return codTipoUsuario;
    }

    public void setCodTipoUsuario(int codTipoUsuario) {
        this.codTipoUsuario = codTipoUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codUsuario != null ? codUsuario.hashCode() : 0);
        hash += (int) codTipoUsuario;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioPK)) {
            return false;
        }
        UsuarioPK other = (UsuarioPK) object;
        if ((this.codUsuario == null && other.codUsuario != null) || (this.codUsuario != null && !this.codUsuario.equals(other.codUsuario))) {
            return false;
        }
        if (this.codTipoUsuario != other.codTipoUsuario) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.proyecto.protesis.model.UsuarioPK[ codUsuario=" + codUsuario + ", codTipoUsuario=" + codTipoUsuario + " ]";
    }
    
}

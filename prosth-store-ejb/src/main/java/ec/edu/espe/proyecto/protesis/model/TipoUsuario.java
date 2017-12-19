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
@Table(name = "tipo_usuario")
public class TipoUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "COD_TIPO_USUARIO", nullable = false)
    private Integer codTipoUsuario;

    @Column(name = "DESCRIPCION", nullable = false, length = 100)
    private String descripcion;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoUsuario", fetch = FetchType.EAGER)
    private List<Usuario> usuarioList;

    public TipoUsuario() {
    }

    public TipoUsuario(Integer codTipoUsuario) {
        this.codTipoUsuario = codTipoUsuario;
    }

    public Integer getCodTipoUsuario() {
        return codTipoUsuario;
    }

    public void setCodTipoUsuario(Integer codTipoUsuario) {
        this.codTipoUsuario = codTipoUsuario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codTipoUsuario != null ? codTipoUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoUsuario)) {
            return false;
        }
        TipoUsuario other = (TipoUsuario) object;
        if ((this.codTipoUsuario == null && other.codTipoUsuario != null) || (this.codTipoUsuario != null && !this.codTipoUsuario.equals(other.codTipoUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.proyecto.protesis.model.TipoUsuario[ codTipoUsuario=" + codTipoUsuario + " ]";
    }
    
}

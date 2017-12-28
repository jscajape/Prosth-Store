/*
 * Protesis Store
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Protesis Store Corp.
 */
package ec.edu.espe.proyecto.protesis.dao;

import ec.edu.espe.proyecto.protesis.model.Compra;
import ec.edu.espe.proyecto.protesis.model.Conductor;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Protesis Store Corp.
 */
@Stateless
public class ConductorFacade extends AbstractFacade<Conductor> {

    @PersistenceContext(unitName = "ec.edu.espe.proyecto.protesis_prosth-store-ejb_ejb_1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ConductorFacade() {
        super(Conductor.class);
    }
    
    public List<Conductor> findByCodigo(Integer codigo) {
        Query qry = this.em.createQuery("SELECT obj FROM Conductor obj WHERE obj.codigo=?1");
        qry.setParameter(1, codigo);
        return qry.getResultList();
    }
    
    public List<Conductor> findByNombre(String nombre) {
        Query qry = this.em.createQuery("SELECT obj FROM Conductor obj WHERE obj.nombre=?1");
        qry.setParameter(1, nombre);
        return qry.getResultList();
    }
    
    public List<Conductor> findByApellido(String apellido) {
        Query qry = this.em.createQuery("SELECT obj FROM Conductor obj WHERE obj.apellido=?1");
        qry.setParameter(1, apellido);
        return qry.getResultList();
    }
}

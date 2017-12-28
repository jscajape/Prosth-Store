/*
 * Protesis Store
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Protesis Store Corp.
 */
package ec.edu.espe.proyecto.protesis.dao;

import ec.edu.espe.proyecto.protesis.model.Entrega;
import ec.edu.espe.proyecto.protesis.model.Producto;
import java.math.BigDecimal;
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
public class ProductoFacade extends AbstractFacade<Producto> {

    @PersistenceContext(unitName = "ec.edu.espe.proyecto.protesis_prosth-store-ejb_ejb_1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductoFacade() {
        super(Producto.class);
    }
    
    public List<Producto> findByCodigo(Integer codigo) {
        Query qry = this.em.createQuery("SELECT obj FROM Producto obj WHERE obj.codigo=?1");
        qry.setParameter(1, codigo);
        return qry.getResultList();
    }
    
    public List<Producto> findByNombre(String nombre) {
        Query qry = this.em.createQuery("SELECT obj FROM Producto obj WHERE obj.nombre=?1");
        qry.setParameter(1, nombre);
        return qry.getResultList();
    }
    
    public List<Producto> findByPrecio(BigDecimal precio) {
        Query qry = this.em.createQuery("SELECT obj FROM Producto obj WHERE obj.precio=?1");
        qry.setParameter(1, precio);
        return qry.getResultList();
    }
    
    
}

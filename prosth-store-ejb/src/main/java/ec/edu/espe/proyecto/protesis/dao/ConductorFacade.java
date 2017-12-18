/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.proyecto.protesis.dao;

import ec.edu.espe.proyecto.protesis.model.Conductor;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author js_cm
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
    
}

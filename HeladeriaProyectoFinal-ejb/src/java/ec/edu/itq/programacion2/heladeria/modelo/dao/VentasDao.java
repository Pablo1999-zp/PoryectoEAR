/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.heladeria.modelo.dao;

import ec.edu.itq.programacion2.heladeria.modelo.generico.GenericoDao;
import ec.edu.itq.programacion2.heladeria.modelo.Ventas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author User
 */
@Stateless
public class VentasDao extends GenericoDao<Ventas> {

    @PersistenceContext(unitName = "HeladeriaProyectoFinal-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VentasDao() {
        super(Ventas.class);
    }
    
}

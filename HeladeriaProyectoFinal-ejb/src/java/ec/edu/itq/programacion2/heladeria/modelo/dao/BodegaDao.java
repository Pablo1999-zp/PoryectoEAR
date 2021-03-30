/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.heladeria.modelo.dao;

import ec.edu.itq.programacion2.heladeria.modelo.generico.GenericoDao;
import ec.edu.itq.programacion2.heladeria.modelo.Bodega;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



@Stateless
public class BodegaDao extends GenericoDao<Bodega> {

   
    public BodegaDao() {
        super(Bodega.class);
    }
    @PersistenceContext(unitName = "HeladeriaProyectoFinal-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}

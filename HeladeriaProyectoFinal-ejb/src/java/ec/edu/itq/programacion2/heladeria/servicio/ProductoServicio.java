/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.heladeria.servicio;

import ec.edu.itq.programacion2.heladeria.modelo.Produto;
import ec.edu.itq.programacion2.heladeria.modelo.dao.ProdutoDao;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author User
 */
@Stateless
@LocalBean
public class ProductoServicio {

 @EJB 
 private ProdutoDao produtoDao;
    
    public List<Produto> buscarProducto(){
    
        List<Produto> listaProduto = produtoDao.buscarProducto(); 
    return listaProduto;
    }
    
    
}

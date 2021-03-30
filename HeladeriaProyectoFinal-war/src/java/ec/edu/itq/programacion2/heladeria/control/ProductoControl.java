/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.heladeria.control;

import ec.edu.itq.programacion2.heladeria.modelo.Produto;
import ec.edu.itq.programacion2.heladeria.servicio.ProductoServicio;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;


@ViewScoped
@ManagedBean
public class ProductoControl implements Serializable{
@EJB 
private ProductoServicio productoServicio;
    

private List<Produto> listaproduto;


    public void init (){
    
    buscarProducto();
    }
    
    public void buscarProducto (){
      listaproduto = productoServicio.buscarProducto();
         
    }

    public List<Produto> getListaproduto() {
        return listaproduto;
    }


    
    public ProductoControl() {
    }
    
}

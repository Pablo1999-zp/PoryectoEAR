
package ec.edu.itq.programacion2.heladeria.modelo.dao;

import ec.edu.itq.programacion2.heladeria.modelo.generico.GenericoDao;
import ec.edu.itq.programacion2.heladeria.modelo.Produto;
import java.util.List;
import javax.ejb.Stateless;

import javax.persistence.Query;

/**
 *
 * @author User
 */
@Stateless
public class ProdutoDao extends GenericoDao<Produto> {

   

    public ProdutoDao() {
        super(Produto.class);
    }
    
    public List<Produto> listaProduto(){
        Query query = getEntityManager().createQuery("SELECT pr FROM Produto pr WHERE pr.estado=true ");
    List<Produto> listaProduto = query.getResultList() ;
    return listaProduto;
    
    }

    public List<Produto> buscarProducto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}

package ec.edu.itq.programacion2.heladeria.modelo;

import ec.edu.itq.programacion2.heladeria.modelo.Movimiento;
import ec.edu.itq.programacion2.heladeria.modelo.Produto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-29T19:48:38")
@StaticMetamodel(Bodega.class)
public class Bodega_ { 

    public static volatile SingularAttribute<Bodega, Integer> idbodega;
    public static volatile ListAttribute<Bodega, Movimiento> movimientoList;
    public static volatile SingularAttribute<Bodega, Produto> idproducto;

}
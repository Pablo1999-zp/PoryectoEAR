package ec.edu.itq.programacion2.heladeria.modelo;

import ec.edu.itq.programacion2.heladeria.modelo.Bodega;
import ec.edu.itq.programacion2.heladeria.modelo.Produto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-29T19:48:38")
@StaticMetamodel(Movimiento.class)
public class Movimiento_ { 

    public static volatile SingularAttribute<Movimiento, Bodega> idbodega;
    public static volatile SingularAttribute<Movimiento, Integer> idmovimiento;
    public static volatile SingularAttribute<Movimiento, Date> fechaMovimiento;
    public static volatile SingularAttribute<Movimiento, Produto> idproducto;

}
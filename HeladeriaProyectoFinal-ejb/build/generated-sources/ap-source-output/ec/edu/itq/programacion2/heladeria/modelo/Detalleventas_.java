package ec.edu.itq.programacion2.heladeria.modelo;

import ec.edu.itq.programacion2.heladeria.modelo.Produto;
import ec.edu.itq.programacion2.heladeria.modelo.Ventas;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-29T19:48:38")
@StaticMetamodel(Detalleventas.class)
public class Detalleventas_ { 

    public static volatile SingularAttribute<Detalleventas, Ventas> ventasIdventas;
    public static volatile SingularAttribute<Detalleventas, Integer> cantidad;
    public static volatile SingularAttribute<Detalleventas, BigDecimal> precioventa;
    public static volatile SingularAttribute<Detalleventas, Produto> productoIdproducto;
    public static volatile SingularAttribute<Detalleventas, Integer> iddetalleventas;

}
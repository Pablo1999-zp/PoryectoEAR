package ec.edu.itq.programacion2.heladeria.modelo;

import ec.edu.itq.programacion2.heladeria.modelo.Bodega;
import ec.edu.itq.programacion2.heladeria.modelo.Detalleventas;
import ec.edu.itq.programacion2.heladeria.modelo.Factura;
import ec.edu.itq.programacion2.heladeria.modelo.Movimiento;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-29T19:48:38")
@StaticMetamodel(Produto.class)
public class Produto_ { 

    public static volatile ListAttribute<Produto, Detalleventas> detalleventasList;
    public static volatile SingularAttribute<Produto, BigDecimal> precio;
    public static volatile SingularAttribute<Produto, Boolean> estado;
    public static volatile ListAttribute<Produto, Bodega> bodegaList;
    public static volatile ListAttribute<Produto, Factura> facturaList;
    public static volatile ListAttribute<Produto, Movimiento> movimientoList;
    public static volatile SingularAttribute<Produto, Integer> idproducto;
    public static volatile SingularAttribute<Produto, String> nombres;

}
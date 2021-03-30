package ec.edu.itq.programacion2.heladeria.modelo;

import ec.edu.itq.programacion2.heladeria.modelo.Cliente;
import ec.edu.itq.programacion2.heladeria.modelo.Detalleventas;
import ec.edu.itq.programacion2.heladeria.modelo.Vendedor;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-29T19:48:38")
@StaticMetamodel(Ventas.class)
public class Ventas_ { 

    public static volatile ListAttribute<Ventas, Detalleventas> detalleventasList;
    public static volatile SingularAttribute<Ventas, Boolean> estado;
    public static volatile SingularAttribute<Ventas, BigDecimal> monto;
    public static volatile SingularAttribute<Ventas, Integer> idventas;
    public static volatile SingularAttribute<Ventas, Date> fechaventa;
    public static volatile SingularAttribute<Ventas, Cliente> idcliente;
    public static volatile SingularAttribute<Ventas, Vendedor> idempleado;

}
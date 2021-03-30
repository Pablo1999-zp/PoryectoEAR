package ec.edu.itq.programacion2.heladeria.modelo;

import ec.edu.itq.programacion2.heladeria.modelo.Ventas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-29T19:48:38")
@StaticMetamodel(Vendedor.class)
public class Vendedor_ { 

    public static volatile SingularAttribute<Vendedor, Integer> idvendedor;
    public static volatile SingularAttribute<Vendedor, Boolean> estado;
    public static volatile SingularAttribute<Vendedor, String> apellido;
    public static volatile ListAttribute<Vendedor, Ventas> ventasList;
    public static volatile SingularAttribute<Vendedor, String> telefono;
    public static volatile SingularAttribute<Vendedor, String> nombre;

}
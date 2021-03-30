
package ec.edu.itq.programacion2.heladeria.control;

import ec.edu.itq.programacion2.heladeria.modelo.Cliente;
import ec.edu.itq.programacion2.heladeria.servicio.ClienteServicio;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;



@ManagedBean
@ViewScoped

public class ClienteControl {
    @EJB
    private ClienteServicio clienteServicio;

private String nombre;
private String apellido;
private String telefono;
private String correo;
private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public void guardar(){
        
      Cliente clienteNuevo = new Cliente();
      clienteNuevo.setNombre(nombre);
      clienteNuevo.setApellido(apellido);
      clienteNuevo.setTelefono(telefono);
      clienteNuevo.setCorreo(correo);
      clienteNuevo.setIdcliente(id);
      clienteServicio.guardar(clienteNuevo);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
}

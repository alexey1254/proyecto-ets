package es.iespuertodelacruz.ets;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteTest {
    private static final String direccion = "Calle 1";
    private static final int codigo = 001;
    private static final String apellido = "Perez";
    private static final String nombre = "Juan";
    private static final String dni = "12345Z";
    Cliente cliente;
    Persona persona;
    
    @BeforeEach
    public void BeforeEach() {
 
        if(persona==null){
            persona=new Persona(dni,nombre,apellido);
        }
        if(cliente==null){
            cliente=new Cliente(codigo,persona,direccion);
        }
    }

    @Test
    public void constructorClienteTest() {
        assertNotNull(cliente, "El objeto Cliente no puede ser nulo");
    }

    @Test
    public void getCodigoTest() {
        assertTrue(cliente.getCodigo()==codigo);
    }
    
    @Test
    public void setCodigoTest() {
        cliente.setCodigo(002);
        assertTrue(cliente.getCodigo()==002);
    }

    @Test
    public void getDatosTest() {
        assertTrue(cliente.getDatos().equals(persona));
    }    

    @Test
    public void setDatosTest() {
        Persona persona2=new Persona()
        cliente.setDatos(new Persona());
        assertTrue(cliente.getDatos().equals(new Persona()));
    }
    
    @Test
    public void getDireccionTest() {
        assertTrue(cliente.getDireccion().equals(direccion));
    }    

    @Test
    public void setDireccionTest() {
        String direccion2="Calle 2";
        cliente.setDireccion(direccion2);
        assertTrue(cliente.getDireccion().equals(direccion2));
    }
}
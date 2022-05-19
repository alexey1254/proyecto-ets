package es.iespuertodelacruz.ets;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.*;


public class ClienteTest {
    private static final int codigo = 001;
    private static final String dni = "12345Z";
    private static final String nombre = "Juan";
    private static final String apellido1 = "Perez";
    private static final String apellido2 = "Lopez";
    private static final String direccion = "Calle 1";
    Cliente cliente;
    
    @BeforeEach
    public void BeforeEach() {
 
        if(cliente==null){
            cliente=new Cliente(codigo,dni,nombre,apellido1,apellido2,direccion);
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
    public void setDniTest() {
        String dni="3243X";
        cliente.setDni(dni);
        //assertTrue(empleado.getCargo().equals(cargo));
    }

    @Test
    public void setNombreTest() {
        String nombre="Juana";
        cliente.setNombre(nombre);
       // assertTrue(empleado.getCargo().equals(cargo));
    }

    @Test
    public void setApellido1Test() {
        String apellido1="Lopez";
        cliente.setApellido1(apellido1);
        //assertTrue(empleado.getCargo().equals(cargo));
    }
    
    @Test
    public void setApellido2Test() {
        String apellido2="Díaz";
        cliente.setApellido2(apellido2);
        //assertTrue(empleado.getCargo().equals(cargo));
    }

    @Test
    public void setDireccionTest() {
        String direccion2="Calle 2";
        cliente.setDireccion(direccion2);
     //   assertTrue(cliente.getDireccion().equals(direccion2));
    }
}
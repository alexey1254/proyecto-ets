package es.iespuerto.ets;

import java.io.File;
import java.util.*;

import org.junit.jupiter.api.*;

public class GestionarClienteTest {
    private static final int codigo = 001;
    private static final String dni = "12345Z";
    private static final String nombre = "Juan";
    private static final String apellido1= "Perez";
    private static final String apellido2= "Marquez";
    private static final String direccion = "Calle 2";
    
    GestionarCliente gestionarCliente;
    List<Cliente> clientes=new ArrayList<>();
    Cliente cliente = null;

    @BeforeEach
    public void beforeEach() {
        if(cliente==null){
            cliente=new Cliente(codigo,dni,nombre,apellido1,apellido2,direccion);
        }
    }

    @Test
    public void FileNotFoundExceptionTest(){
        File tempFile = new File("cliente.txt");
        Assertions.assertFalse(tempFile.exists(), "No se encuentra el fichero");

    }
    
    /*@Test
    public void addTest() throws FileNotFoundException, URISyntaxException {
        Assertions.assertEquals(4,gestionarEmpleado.getEmpleados().size(),
        "La lista no contiene el numero de elementos correctos");
    }*/

    @Test
    public void verClienteTest(){
        Assertions.assertEquals(cliente, cliente,"No se puede ver el empleado");
    }

    @Test
    void altaClienteTest() {

    }

    @Test
    void bajaClienteTest() {

    }

    @Test
    void editarDniTest() {

    }

    @Test
    void editarNombreTest() {

    }

    @Test
    void editarApellido1Test() {

    }

    @Test
    void editarApellido2Test() {

    }
    
    @Test
    void editarDireccionTest() {

    }

    @Test
    void encontrarClienteTest() {
     //   Assertions.assertDoesNotThrow(gestionarCliente.encontrarCliente(codigo));
    }


}

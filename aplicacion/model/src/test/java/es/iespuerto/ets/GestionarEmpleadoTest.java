package es.iespuerto.ets;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.*;
import java.net.URISyntaxException;
import java.util.*;

import org.junit.jupiter.api.*;

public class GestionarEmpleadoTest {
  
    private static final int codigo = 001;
    private static final String dni = "12345Z";
    private static final String nombre = "Juan";
    private static final String apellido1= "Perez";
    private static final String apellido2= "Marquez";
    private static final String cargo = "Cajero";
    private static final int dia = 26;
    private static final int mes = 02;
    private static final int anio = 2020;
    
    GestionarEmpleado gestionarEmpleado;
    List<Empleado> empleados=new ArrayList<>();
    Empleado empleado = null;
    Fecha fecha;

    @BeforeEach
    public void beforeEach() {
        if(fecha==null){
            fecha=new Fecha(dia,mes,anio);
        }
        if(empleado==null){
            empleado=new Empleado(codigo,dni,nombre,apellido1,apellido2,fecha,cargo);
        }
    }

    @Test
    public void FileNotFoundExceptionTest(){
        File tempFile = new File("empleado.txt");
        Assertions.assertFalse(tempFile.exists(), "No se encuentra el fichero");

    }
    
    @Test
    public void addTest() throws FileNotFoundException, URISyntaxException {
        Assertions.assertEquals(4,gestionarEmpleado.getEmpleados().size(),
        "La lista no contiene el numero de elementos correctos");
    }

    @Test
    public void verEmpleadoTest(){
        Assertions.assertEquals(empleado, empleado,"No se puede ver el empleado");
    }

    @Test
    void altaEmpleadoTest() {

    }

    @Test
    void bajaEmpleadoTest() {

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
    void editarFechNacTest() {

    }

    @Test
    void editarCargoTest() {

    }

    @Test
    void encontrarEmpleadoTest() {
     //   Assertions.assertDoesNotThrow(gestionarEmpleado.encontrarEmpleado(codigo));
    }
}

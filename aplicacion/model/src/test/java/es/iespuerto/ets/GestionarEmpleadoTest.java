package es.iespuerto.ets;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.io.*;
import java.net.URISyntaxException;
import java.util.*;

import org.junit.jupiter.api.*;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class GestionarEmpleadoTest {
    MockedStatic<Utilidades> Utilities = Mockito.mockStatic(Utilidades.class);


    @Mock Scanner scanner;

    private static final int codigo = 001;
    private static final String dni = "12345Z";
    private static final String nombre = "Juan";
    private static final String apellido1 = "Perez";
    private static final String apellido2 = "Marquez";
    private static final String cargo = "Cajero";
    private static final int dia = 26;
    private static final int mes = 02;
    private static final int anio = 2020;

    GestionarEmpleado gestionarEmpleado;
    List<Empleado> empleados = null;
    Empleado empleado = null;
    Fecha fecha;

    @BeforeEach
    public void beforeEach() {
        MockitoAnnotations.initMocks(this);
        gestionarEmpleado = new GestionarEmpleado();

        try {
            Mockito.when(Utilidades.obtenerScannerFichero(Mockito.any())).thenReturn(scanner);
            Mockito.when(scanner.nextLine()).thenReturn("1,99973586S,Herminia,Emmens,Josipovitz,20/08/1981,cajero,0003");
            Mockito.when(scanner.hasNextLine()).thenReturn(true,false);
            empleados = gestionarEmpleado.leerEmpleados();
        } catch (Exception e) {
            Assertions.fail("Se ha producido un error en el test leerEmpleados");
        }
    }



    @Test
    void leerEmpleadosTest() {
        try {

            Assertions.assertNotNull(empleados, "La lista de empleados no debe de ser nula");
            Assertions.assertEquals(1,empleados.size(), "No se ha retornado un elemento");

        } catch (Exception e) {
           Assertions.fail("Se ha producido un error en el test leerEmpleados");
        }
    }

    @Test
    public void FileNotFoundExceptionTest() {
        File tempFile = new File("empleado.txt");
        Assertions.assertFalse(tempFile.exists(), "No se encuentra el fichero");

    }

    @Test
    public void verEmpleadoTest() {
        Assertions.assertEquals(empleado, empleado, "No se puede ver el empleado");
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
        // Assertions.assertDoesNotThrow(gestionarEmpleado.encontrarEmpleado(codigo));
    }
}

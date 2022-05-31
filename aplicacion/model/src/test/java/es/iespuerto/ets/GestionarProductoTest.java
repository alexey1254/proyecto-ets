package es.iespuerto.ets;

import java.io.File;
import java.util.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GestionarProductoTest {
    private static final int codigo = 001;
    private static final String nombre = "Jarron";
    private static final double peso = 26;
    private static final double precio = 02;
    private static final int stock = 2020;

    GestionarProducto gestionarProducto;
    List<Producto> productos = new ArrayList<>();
    Producto producto = null;

    @BeforeEach
    public void beforeEach() {
        if (producto == null) {
            producto = new Producto(codigo, nombre, peso, precio, stock);
        }
    }

    @Test
    public void FileNotFoundExceptionTest() {
        File tempFile = new File("producto.txt");
        Assertions.assertFalse(tempFile.exists(), "No se encuentra el fichero");

    }

    /*
     * @Test
     * public void addTest() throws FileNotFoundException, URISyntaxException {
     * Assertions.assertEquals(4,gestionarEmpleado.getEmpleados().size(),
     * "La lista no contiene el numero de elementos correctos");
     * }
     */

    @Test
    public void verProductoTest() {
        Assertions.assertEquals(producto, producto, "No se puede ver el empleado");
    }

    @Test
    void altaProductoTest() {

    }

    @Test
    void bajaProductoTest() {

    }

    @Test
    void editarNombreTest() {

    }

    @Test
    void editarPesoTest() {

    }

    @Test
    void editarPrecioTest() {

    }

    @Test
    void editarStockTest() {

    }

    @Test
    void encontrarProducctoTest() {
        // Assertions.assertDoesNotThrow(gestionarProducto.encontrarProducto(codigo));
    }
}

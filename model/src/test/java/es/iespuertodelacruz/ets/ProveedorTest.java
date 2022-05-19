package es.iespuertodelacruz.ets;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ProveedorTest {

    private static final int codigo = 001;
    private static final String cif = "123A";
    private static final String nombre = "Marina S.L";
    Proveedor proveedor;

    @BeforeEach
    public void BeforeEach() { 
        if(proveedor==null){
            proveedor=new Proveedor(codigo,cif,nombre);
        }
    }

    @Test
    public void constructorVacioProveedorTest() {
        Proveedor proveedorVacio = new Proveedor();
        assertNull(proveedorVacio.getCif(), "El objeto Proveedor debe ser nulo");
    }

    @Test
    void testGetCif() {
        assertSame(cif, proveedor.getCif(), "Se esperaba el cif  123A");
    }

    @Test
    void testGetCodigo() {
        assertEquals(codigo, proveedor.getCodigo(), "Se esperaba el codigo 001");
    }

    @Test
    void testGetNombre() {
        assertSame(nombre, proveedor.getNombre(), "Se esperaba el nombre Marina S.L");
    }

    @Test
    void testSetCif() {
        proveedor.setCif("1212R");
        assertEquals("1212R",proveedor.getCif(), "Se esperaba el cif 1212R");
    }

    @Test
    void testSetCodigo() {
        proveedor.setCodigo(1234);
        assertEquals(1234, proveedor.getCodigo(), "Se esperaba el codigo 1234");
    }

    @Test
    void testSetNombre() {
        proveedor.setNombre("Alejandrinio");
        assertEquals("Alejandrinio", proveedor.getNombre(), "Se esperaba el nombre Alejandrinio");
    }
}

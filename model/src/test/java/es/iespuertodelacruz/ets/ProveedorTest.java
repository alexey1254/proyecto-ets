package es.iespuertodelacruz.ets;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.iespuertodelacruz.ets.vista.Proveedor;


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
        Proveedor proveedor1 = new Proveedor();
        assertNotNull(proveedor1, "El objeto Proveedor debe ser nulo");
    }

    @Test
    public void constructorTresParametrosProveedorTest() {
        assertNotNull(proveedor, "El objeto Proveedor no puede ser nulo");
    }
    
    @Test
    public void getCodigoTest() {
        assertTrue(proveedor.getCodigo()==codigo);
    }    

    @Test
    public void setCodigoTest() {
        int codigo1=002;
        proveedor.setCodigo(codigo1);
        assertTrue(proveedor.getCodigo()==codigo1);
    }

    @Test
    public void getCifTest() {
        assertTrue(proveedor.getCif().equals(cif));
    }    

    @Test
    public void setCifTest() {
        String cif1="3821B";
        proveedor.setCif(cif1);
        assertTrue(proveedor.getCif().equals(cif1));
    }

    @Test
    public void getNombreTest() {
        assertTrue(proveedor.getNombre().equals(nombre));
    }    

    @Test
    public void setNombreTest() {
        String nombre1="Maderas Perez";
        proveedor.setNombre(nombre1);
        assertTrue(proveedor.getNombre().equals(nombre1));
    }

}

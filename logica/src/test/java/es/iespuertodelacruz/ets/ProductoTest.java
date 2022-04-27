package es.iespuertodelacruz.ets;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ProductoTest {
    private static final int codigo = 001;
    private static final double peso = 3000;
    private static final String nombre = "Bolso";
    Producto producto;
    
    @BeforeEach
    public void BeforeEach() { 
        if(producto==null){
            producto=new Producto(codigo,nombre,peso);
        }
    }

    @Test
    public void constructorVacioProductoTest() {
        Producto producto1 = new Producto();
        assertNotNull(producto1, "El objeto Producto debe ser nulo");
    }

    @Test
    public void constructorTresParametrosProductoTest() {
        assertNotNull(producto, "El objeto Producto no puede ser nulo");
    }
    
    @Test
    public void getCodigoTest() {
        assertTrue(producto.getCodigo()==codigo);
    }    

    @Test
    public void setCodigoTest() {
        int codigo1=002;
        producto.setCodigo(codigo1);
        assertTrue(producto.getCodigo()==codigo1);
    }

    @Test
    public void getNombreTest() {
        assertTrue(producto.getNombre().equals(nombre));
    }    

    @Test
    public void setNombreTest() {
        String nombre1="Cartera";
        producto.setNombre(nombre1);
        assertTrue(producto.getNombre().equals(nombre1));
    }

    @Test
    public void getPesoTest() {
        assertTrue(producto.getPeso()==peso);
    }    

    @Test
    public void setPesoTest() {
        double peso1=326.4;
        producto.setPeso(peso1);
        assertTrue(producto.getPeso()==peso1);
    }

}

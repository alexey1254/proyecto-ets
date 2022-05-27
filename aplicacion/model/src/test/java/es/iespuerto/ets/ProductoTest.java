package es.iespuertodelacruz.ets.model;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ProductoTest {
    private static final int codigo = 001;
    private static final String nombre = "Bolso";
    private static final double peso = 3500;
    private static final double precio = 30;
    private static final int stock = 34;
    Producto producto;
    
    @BeforeEach
    public void BeforeEach() { 
        if(producto==null){
            producto=new Producto(codigo,nombre,peso,precio,stock);
        }
    }

    @Test
    public void constructorProductoTest() {
        assertNotNull(producto, "El objeto Producto no puede ser nulo");
    }
    
    @Test
    public void getCodigoTest() {
        assertTrue(producto.getCodigo()==codigo);
    }    

    @Test
    public void getNombreTest() {
        assertTrue(producto.getNombre()==nombre);
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

    @Test
    public void getPrecioTest() {
        assertTrue(producto.getPrecio()==precio);
    }    

    @Test
    public void setPrecioTest() {
        double precio1=326.4;
        producto.setPrecio(precio1);
        assertTrue(producto.getPrecio()==precio1);
    }

    @Test
    public void getStockTest() {
        assertTrue(producto.getStock()==stock);
    }    

    @Test
    public void setStockTest() {
        int stock1=3;
        producto.setStock(stock1);
        assertTrue(producto.getStock()==stock1);
    }
}

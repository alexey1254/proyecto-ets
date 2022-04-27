package es.iespuertodelacruz.ets;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CompraTest {
    Compra compra;
    
    @BeforeEach
    public void BeforeEach() {
        if(compra==null){
            compra=new Compra(001,new Producto(),2,new Fecha(20, 02, 2020));
    }

    @Test
    public void constructorVacioCompraTest() {
        compra = new Compra();
        assertNotNull(compra, "El objeto Compra debe ser nulo");
    }

    @Test
    public void constructorCuatroParametrosCompraTest() {
        assertNotNull(compra, "El objeto Cliente no puede ser nulo");
    }

    @Test
    public void getNumFacturaTest() {
        assertTrue(compra.getNumFactura()==001);
    }
    
    @Test
    public void setNumFacturaTest() {
        compra.setNumFactura(002);
        assertTrue(compra.getNumFactura()==002);
    }

    @Test
    public void getProductoTest() {
        assertTrue(compra.getProducto().equals(new Producto()));
    }    

    @Test
    public void setProductoTest() {
        compra.setProducto(new Producto());
        assertTrue(compra.getProducto().equals(new Producto()));
    }
    
    @Test
    public void getCantidadTest() {
        assertTrue(compra.getCantidad()==2);
    }    

    @Test
    public void setCantidadTest() {
        compra.setCantidad(5);
        assertTrue(compra.getCantidad()==5);
    }

    @Test
    public void getFechaTest() {
        assertTrue(compra.getFecha().equals(new Fecha(20,02,2020)));
    }    

    @Test
    public void setFechaTest() {
        compra.setFecha(new Fecha(04,05,2021));
        assertTrue(compra.getFecha().equals(new Fecha(04,05,2021)));
    }

}

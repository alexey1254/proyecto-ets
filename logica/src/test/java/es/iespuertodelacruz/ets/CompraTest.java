package es.iespuertodelacruz.ets;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
*/
import org.junit.jupiter.api.*;

public class CompraTest {
    private static final int codigo = 001;
    private static final int cantidad = 2;
    private static final int codigoP = 001;
    private static final String nombre = "Bolsa";
    private static final int peso = 3500;
    private static final int dia = 26;
    private static final int mes = 02;
    private static final int anio = 2020;
    Compra compra;
    Producto producto;
    Fecha fecha;
    
    @BeforeEach
    public void BeforeEach() {
        if(producto==null){
            producto=new Producto(codigoP,nombre,peso);
        }
        if(fecha==null){
            fecha=new Fecha(dia,mes,anio);
        }
        if(compra==null){
            compra=new Compra(codigo,producto,cantidad,fecha);
        }
    }

    @Test
    public void constructorVacioCompraTest() {
        compra = new Compra();
        assertNotNull(compra, "El objeto Compra debe ser nulo");
    }

    @Test
    public void constructorCuatroParametrosCompraTest() {
        assertNotNull(compra, "El objeto Compra no puede ser nulo");
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
        Producto producto2=new Producto(002,"Cartera",200);
        compra.setProducto(producto2);
        assertTrue(compra.getProducto().equals(producto2));
    }
    
    @Test
    public void getCantidadTest() {
        assertTrue(compra.getCantidad()==2);
    }    

    @Test
    public void setCantidadTest() {
        int cantidad2=5;
        compra.setCantidad(cantidad2);
        assertTrue(compra.getCantidad()==cantidad2);
    }

    @Test
    public void getFechaTest() {
        assertTrue(compra.getFecha().equals(fecha));
    }    

    @Test
    public void setFechaTest() {
        Fecha fecha2=new Fecha(04,05,2021);
        compra.setFecha(fecha2);
        assertTrue(compra.getFecha().equals(fecha2));
    }

}

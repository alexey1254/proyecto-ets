package es.iespuerto.ets;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CompraTest {

    private static final int codigo = 001;
    private static final int cantidad = 2;
    private static final int codigoP = 001;
    private static final String nombre = "Bolsa";
    private static final double peso = 3500;
    private static final double precio = 30;
    private static final int stock = 34;
    private static final int dia = 26;
    private static final int mes = 02;
    private static final int anio = 2020;
    Compra compra;
    Producto producto;
    Fecha fecha;

    @BeforeEach
    public void BeforeEach() {
        if(producto==null){
            producto=new Producto(codigoP,nombre,peso,precio,stock);
        }
        if(fecha==null){
            fecha=new Fecha(dia,mes,anio);
        }
        if(compra==null){
            compra=new Compra(codigo,producto,cantidad,fecha);
        }
    }

    @Test
    void testGetCantidad() {
        assertEquals(cantidad, compra.getCantidad(), "Se esperaba la cantidad de 2");
    }

    @Test
    void testGetFecha() {
        assertEquals(fecha, compra.getFecha(), "Se esperaba la fecha 26/02/2020");
    }

    @Test
    void testGetNumFactura() {
        assertEquals(001, compra.getNumFactura(), "Se esperaba el numero de factura 001");
    }

    @Test
    void testGetProducto() {
        assertEquals(producto, compra.getProducto(), "Se esperaba el producto definido como variable local en el beforeEach");
    }

    @Test
    void testSetCantidad() {
        compra.setCantidad(4);
        assertEquals(4, compra.getCantidad(), "Se esperaba la cantidad de 4");
    }

    @Test
    void testSetFecha() {
        Fecha fechaTest = new Fecha(2, 3, 2001);
        compra.setFecha(fechaTest);
        assertEquals(fechaTest, compra.getFecha(), "Se esperaba la fecha 2/3/2001");
    }

    @Test
    void testSetNumFactura() {
        compra.setNumFactura(400);
        assertEquals(400, compra.getNumFactura(), "Se esperaba el numero de factura 400");
    }

    @Test
    void testSetProducto() {
        assertEquals(producto, compra.getProducto(), "Se esperaba el producto definido en el beforeEach");
    }
}

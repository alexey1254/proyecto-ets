package es.iespuertodelacruz.ets;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EnvioTest {
    private static final String codigoEnvio = "232S";
    private static final int codigoCliente = 02;
    private static final int codigoProducto = 02;
    private static final int codigoCompra = 02;
    
    private static final String nombreCliente = "Juan";
    private static final int peso = 1500;
    private static final int cantidad = 1;
    private static final String estado = "En camino";
    private static final String apellido1 = "Perez";
    private static final String nombreProducto = "Jarra";
    private static final String apellido2 ="Pepito";
    private static final String dni = "12345Z";
    private static final int dia = 26;
    private static final int mes = 02;
    private static final int anio = 2020;
    private static final String direccion = "Calle 1";
    private static final Double precio = 2.34;
    private static final int stock = 40;
    Compra compra;
    Fecha fecha;
    Cliente cliente;
    Producto producto;
    Envio envio;
    

    @BeforeEach
    public void BeforeEach() {
        if(cliente==null){
            cliente=new Cliente(codigoCliente,dni,nombreCliente, apellido1,apellido2,direccion);
        }
        if(fecha==null){
            fecha=new Fecha(dia,mes,anio);
        }
        if(producto==null){
            producto=new Producto(codigoProducto,nombreProducto,peso,precio,stock);
        }
        if(compra==null){
            compra=new Compra(codigoCompra,producto,cantidad,fecha);
        }
        if(envio==null){
            envio=new Envio(codigoEnvio,fecha,cliente,estado,compra);
        }
    }

    @Test
    public void constructorCincoParametrosEnvioTest() {
        assertNotNull(envio, "El objeto Envio no puede ser nulo");
    }

    @Test
    public void getCodigoTest() {
        assertEquals(codigoEnvio, envio.getCodigo(), "El metodo getCodigo no es correcto");
    }
    
    @Test
    public void setCodigoTest() {
        envio.setCodigo("002");
        assertEquals("002", envio.getCodigo(), "El metodo setCodigo no es correcto");
    }

    @Test
    public void getFechaTest() {
        assertEquals(fecha, envio.getFecha(), "El metodo getFecha no es correcto");
    }    

    @Test
    public void setFechaTest() {
        Fecha fechaTest = new Fecha(20, 8, 2001);
        envio.setFecha(fechaTest);
        assertEquals(fechaTest, envio.getFecha(), "El metodo setFecha no es correcto");
    }

    @Test
    public void getDestinatarioTest() {
        assertEquals(cliente, envio.getDestinatario(), "El getDestinatario no es correcto");
    }
    
    @Test
    public void setDestinatarioTest() {
        envio.setDestinatario(cliente);
        assertEquals(cliente, envio.getDestinatario(),"El metodo set destinatario no es correcto");
    }

    @Test
    public void getEstadoTest() {
        assertEquals(estado, envio.getEstado(), "El metodo getEstado no es correcto");
    }    

    @Test
    public void setEstadoTest() {
        String estado1="Enviado";
        envio.setEstado(estado1);
        assertEquals(estado1, envio.getEstado(), "El metodo setEstado no es correcto");
    }
    
    @Test
    public void getPedidoTest() {
        assertEquals(compra, envio.getPedido(), "El metodo getPedido no es correcto");
    }    

    @Test
    public void setPedidoTest() {
        envio.setPedido(compra);
        assertEquals(compra, envio.getPedido(), "El metodo setPedido no es correcto");
    }
}

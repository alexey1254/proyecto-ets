package es.iespuertodelacruz.ets;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EnvioTest {
    private static final int codigo = 001;
    private static final int peso = 1500;
    private static final int cantidad = 1;
    private static final String estado = "En camino";
    private static final String apellido = "Perez";
    private static final String nombre = "Juan";
    private static final String dni = "12345Z";
    private static final int dia = 26;
    private static final int mes = 02;
    private static final int anio = 2020;
    private static final String direccion = "Calle 1";
    Compra compra;
    Fecha fecha;
    Persona persona;
    Cliente cliente;
    Producto producto;
    Envio envio;
    

    @BeforeEach
    public void BeforeEach() {
        if(cliente==null){
            cliente=new Cliente(codigo,persona,direccion);
        }
        if(fecha==null){
            fecha=new Fecha(dia,mes,anio);
        }
        if(persona==null){
            persona=new Persona(dni,nombre,apellido);
        }
        if(producto==null){
            producto=new Producto(codigo,nombre,peso);
        }
        if(compra==null){
            compra=new Compra(codigo,producto,cantidad,fecha);
        }
        if(envio==null){
            envio=new Envio(codigo,fecha,cliente,estado,compra);
        }
    }

    @Test
    public void constructorVacioEnvioTest() {
        envio = new Envio();
        assertNotNull(envio, "El objeto Envio debe ser nulo");
    }

    @Test
    public void constructorCincoParametrosEnvioTest() {
        assertNotNull(envio, "El objeto Envio no puede ser nulo");
    }

    @Test
    public void getCodigoTest() {
        assertTrue(cliente.getCodigo()==codigo);
    }
    
    @Test
    public void setCodigoTest() {
        cliente.setCodigo(002);
        assertTrue(cliente.getCodigo()==002);
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

    @Test
    public void getDestinatarioTest() {
        assertTrue(envio.getDestinatario().equals(cliente));
    }
    
    @Test
    public void setDestinatarioTest() {
        Persona persona1=new Persona("12L","Maria",
        "Lopez");
        Cliente cliente1=new Cliente(002,persona1,"Calle 2");
        envio.setDestinatario(cliente1);
        assertTrue(envio.getDestinatario().equals(cliente1));
    }

    @Test
    public void getEstadoTest() {
        assertTrue(envio.getEstado().equals(estado));
    }    

    @Test
    public void setEstadoTest() {
        String estado1="Enviado";
        envio.setEstado(estado1);
        assertTrue(envio.getEstado().equals(estado1));
    }
    
    @Test
    public void getPedidoTest() {
        assertTrue(envio.getPedido().equals(compra));
    }    

    @Test
    public void setPedidoTest() {
        Producto producto1 = new Producto(002,"Carpeta",200);
        Fecha fecha1 = new Fecha(03,12,2019);
        Compra compra1=new Compra(002,producto1,4,fecha1);;
        envio.setPedido(compra1);
        assertTrue(envio.getPedido().equals(compra1));
    }

}

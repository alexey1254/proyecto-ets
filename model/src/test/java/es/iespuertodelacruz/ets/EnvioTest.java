package es.iespuertodelacruz.ets;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.iespuertodelacruz.ets.Cliente;
import es.iespuertodelacruz.ets.Compra;
import es.iespuertodelacruz.ets.Envio;
import es.iespuertodelacruz.ets.Fecha;
import es.iespuertodelacruz.ets.Producto;

class EnvioTest {
    Fecha fecha = new Fecha(21, 06, 2001);
    Producto producto = new Producto(001, "Papas", 10, 12, 21);
    Compra pedido = new Compra(001, producto, 12, new Fecha(29, 07, 2000));
    Cliente destinatario = new Cliente(002, "4553552X", "Ale", "Marrero", "Cabrera", "Pepe");
    Envio envio = new Envio(003, fecha, destinatario, "Nuevo", pedido);

    @Test
    void testGetCodigo() {
        assertEquals(003, envio.getCodigo(), "testGetCodigo, Se esperaba el codigo 003");
    }

    @Test
    void testGetDestinatario() {
        assertEquals(destinatario, envio.getDestinatario(), "testGetDestinatario, Se esperaba destinatario definido");
    }

    @Test
    void testGetEstado() {
        assertEquals("Nuevo", envio.getEstado(), "testGetEstado, Se esperaba el estado Nuevo");
    }

    @Test
    void testGetFecha() {
        assertEquals(fecha, envio.getFecha(), "testGetFecha, Se esperaba la fecha 21/06/2001");
    }

    @Test
    void testGetPedido() {
        assertEquals(pedido, envio.getPedido(), "testGetPedido, Se esperaba el pedido definido");
    }

    @Test
    void testSetCodigo() {
        envio.setCodigo(40);
        assertEquals(40, envio.getCodigo(), "testSetCodigo, Se esperaba el codigo 40");
    }

    @Test
    void testSetDestinatario() {
        Cliente destinatarioTest = new Cliente(4040, "123456X", "Pedro", "Javier", "Juanjo", "Avda plaza mayor");
        envio.setDestinatario(destinatarioTest);
        assertEquals(destinatarioTest, envio.getDestinatario(),
                "testSetDestinatario, Se esperaba el destinatario definido");
    }

    @Test
    void testSetEstado() {
        envio.setEstado("Viejo");
        assertEquals("Viejo", envio.getEstado(), "testSetEstado, Se esperaba el estado viejo");
    }

    @Test
    void testSetFecha() {
        Fecha nuevaFecha = new Fecha(10, 03, 1999);
        envio.setFecha(nuevaFecha);
        assertEquals(nuevaFecha, envio.getFecha(), "Se esperaba la fecha definida: 10/03/1999");
    }

    @Test
    void testSetPedido() {
        Compra pedidoNuevo = new Compra(002, producto, 12, new Fecha(29, 12, 2000));
        envio.setPedido(pedidoNuevo);
        assertEquals(pedidoNuevo, envio.getPedido(), "Se esperaba el pedido definido");
    }
}

package es.iespuertodelacruz.ets;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteTest {
    Cliente cliente;
    
    @BeforeEach
    public void BeforeEach() {
        if(cliente==null){
            cliente=new Cliente(001,new Persona(),"Calle 1");
    }

    @Test
    public void constructorClienteTest() {
        assertNotNull(cliente, "El objeto Cliente no puede ser nulo");
    }

    @Test
    public void getCodigoTest() {
        assertTrue(cliente.getCodigo().equals("001"));
    }
    
    @Test
    public void setCodigoTest() {
        cliente.setCodigo("002");
        assertTrue(cliente.getCodigo().equals("002"));
    }

    @Test
    public void getDatosTest() {
        assertTrue(cliente.getDatos().equals(new Persona()));
    }    

    @Test
    public void setDatosTest() {
        cliente.setDatos(new Persona());
        assertTrue(cliente.getDatos().equals(new Persona()));
    }
    
    @Test
    public void getDireccionTest() {
        assertTrue(cliente.getDireccion().equals("Calle 1"));
    }    

    @Test
    public void setDireccionTest() {
        cliente.setDireccion("Calle 2");
        assertTrue(cliente.getDireccion().equals("Calle 2"));
    }
}
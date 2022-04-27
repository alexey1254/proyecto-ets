package es.iespuertodelacruz.ets;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {
    private static final int codigo = 001;
    private static final String cargo = "Cajero";
    private static final String apellido = "Perez";
    private static final String nombre = "Juan";
    private static final String dni = "12345Z";
    private static final int dia = 26;
    private static final int mes = 02;
    private static final int anio = 2020;
    Empleado empleado;
    Persona persona;
    Fecha fecha;
    
    @BeforeEach
    public void BeforeEach() {
 
        if(persona==null){
            persona=new Persona(dni,nombre,apellido);
        }
        if(fecha==null){
            fecha=new Fecha(dia,mes,anio);
        }
        if(empleado==null){
            empleado=new Empleado(codigo,persona,fecha,cargo);
        }
    }

    @Test
    public void constructorDosParametrosEmpleadoTest() {
        Empleado empleado1=new Empleado(codigo, persona);
        assertNotNull(empleado1, "El objeto Empleado no puede ser nulo");
    }

    @Test
    public void constructorTresParametrosEmpleadoTest() {
        Empleado empleado2=new Empleado(codigo, persona,fecha);
        assertNotNull(empleado2, "El objeto Compra no puede ser nulo");
    }

    @Test
    public void constructorCuatroParametrosEmpleadoTest() {
        assertNotNull(empleado, "El objeto Compra no puede ser nulo");
    }

    @Test
    public void getCodigoTest() {
        assertTrue(empleado.getCodigo()==codigo);
    }
    
    @Test
    public void setCodigoTest() {
        int codigo=002;
        empleado.setCodigo(codigo);
        assertTrue(empleado.getCodigo()==codigo);
    }

    @Test
    public void getDatosTest() {
        assertTrue(empleado.getDatos().equals(persona));
    }    

    @Test
    public void setDatosTest() {
        Persona persona2=new Persona("1234J","Maria","Ramos");
        empleado.setDatos(persona2);
        assertTrue(empleado.getDatos().equals(persona2));
    }
    
    @Test
    public void getFechNacTest() {
        assertTrue(empleado.getFechNac().equals(fecha));
    }    

    @Test
    public void setFechNacTest() {
        Fecha fecha2=new Fecha(04,05,2021);
        empleado.setFechNac(fecha2);
        assertTrue(empleado.getFechNac().equals(fecha2));
    }

    @Test
    public void getCargoTest() {
        assertTrue(empleado.getCargo().equals(cargo));
    }
    
    @Test
    public void setCargoTest() {
        String cargo="Reponedor";
        empleado.setCargo(cargo);
        assertTrue(empleado.getCargo().equals(cargo));
    }
}
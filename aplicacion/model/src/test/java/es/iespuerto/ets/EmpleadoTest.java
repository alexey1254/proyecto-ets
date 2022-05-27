package es.iespuerto.ets;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {
    private static final int codigo = 001;
    private static final String dni = "12345Z";
    private static final String nombre = "Juan";
    private static final String apellido1 = "Perez";
    private static final String apellido2 = "Marquez";
    private static final String cargo = "Cajero";
    private static final int dia = 26;
    private static final int mes = 02;
    private static final int anio = 2020;
    Empleado empleado;
    Fecha fecha;

    @BeforeEach
    public void BeforeEach() {
        if (fecha == null) {
            fecha = new Fecha(dia, mes, anio);
        }
        if (empleado == null) {
            empleado = new Empleado(codigo, dni, nombre, apellido1, apellido2, fecha, cargo);
        }
    }

    @Test
    public void constructorSieteParametrosEmpleadoTest() {
        assertNotNull(empleado, "El objeto Empleado no puede ser nulo");
    }

    @Test
    public void getCodigoTest() {
        assertTrue(empleado.getCodigo() == codigo);
    }

    @Test
    public void getDniTest() {
        assertTrue(empleado.getDni() == dni);
    }

    @Test
    public void setDniTest() {
        String dni = "3243X";
        empleado.setDni(dni);
        assertTrue(empleado.getDni().equals(dni));
    }

    @Test
    public void getNombreTest() {
        assertTrue(empleado.getNombre() == nombre);
    }

    @Test
    public void setNombreTest() {
        String nombre = "Juana";
        empleado.setNombre(nombre);
        assertTrue(empleado.getNombre().equals(nombre));
    }

    @Test
    public void getApellido1Test() {
        assertTrue(empleado.getApellido1() == apellido1);
    }

    @Test
    public void setApellido1Test() {
        String apellido1 = "Lopez";
        empleado.setApellido1(apellido1);
        assertTrue(empleado.getApellido1().equals(apellido1));
    }

    @Test
    public void getApellido2Test() {
        assertTrue(empleado.getApellido2() == apellido2);
    }

    @Test
    public void setApellido2Test() {
        String apellido2 = "Díaz";
        empleado.setApellido2(apellido2);
        assertTrue(empleado.getApellido2().equals(apellido2));
    }

    @Test
    public void getFechNacTest() {
        assertTrue(empleado.getFechNac() == fecha);
    }

    @Test
    public void setFechNacTest() {
        Fecha fecha2 = new Fecha(04, 05, 2021);
        empleado.setFechNac(fecha2);
        assertTrue(empleado.getFechNac().equals(fecha2));
    }

    @Test
    public void getCargoTest() {
        assertTrue(empleado.getCargo() == cargo);
    }

    @Test
    public void setCargoTest() {
        String cargo = "Reponedor";
        empleado.setCargo(cargo);
        assertTrue(empleado.getCargo().equals(cargo));
    }
}
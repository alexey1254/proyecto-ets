package es.iespuertodelacruz.ets;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class FechaTest {
    private static final int dia = 26;
    private static final int mes = 02;
    private static final int anio = 2020;
    Fecha fecha;
    
    @BeforeEach
    public void BeforeEach() { 
        if(fecha==null){
            fecha=new Fecha(dia,mes,anio);
        }
    }

    @Test
    public void constructorVacioFechaTest() {
        Fecha fecha = new Fecha();
        assertNotNull(fecha, "El objeto Fecha debe ser nulo");
    }

    @Test
    public void constructorTresParametrosFechaTest() {
        assertNotNull(fecha, "El objeto Fecha no puede ser nulo");
    }
    
    @Test
    public void getDiaTest() {
        assertTrue(fecha.getDia()==dia);
    }    

    @Test
    public void setDiaTest() {
        int dia1=15;
        fecha.setDia(dia1);
        assertTrue(fecha.getDia()==dia1);
    }
    @Test
    public void getMesTest() {
        assertTrue(fecha.getMes()==mes);
    }    

    @Test
    public void setMesTest() {
        int mes1=05;
        fecha.setMes(mes1);
        assertTrue(fecha.getMes()==mes1);
    }
    @Test
    public void getAnioTest() {
        assertTrue(fecha.getAnio()==anio);
    }    

    @Test
    public void setAnioTest() {
        int anio1=2019;
        fecha.setDia(anio1);
        assertTrue(fecha.getDia()==anio1);
    }

}

package es.iespuertodelacruz.ets;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PersonaTest {
    private static final String dni = "2432G";
    private static final String nombre = "Ana";
    private static final String apellido = "Mola";
    Persona persona;
    
    @BeforeEach
    public void BeforeEach() { 
        if(persona==null){
            persona=new Persona(dni,nombre,apellido);
        }
    }

    @Test
    public void constructorVacioPersonaTest() {
        Persona persona1 = new Persona();
        assertNotNull(persona1, "El objeto Persona debe ser nulo");
    }

    @Test
    public void constructorUnParametroPersonaTest() {
        Persona persona2 = new Persona(dni);
        assertNotNull(persona2, "El objeto Persona no puede ser nulo");
    }

    @Test
    public void constructorDosParametrosPersonaTest() {
        Persona persona3 = new Persona(dni,nombre);
        assertNotNull(persona3, "El objeto Persona no puede ser nulo");
    }

    @Test
    public void constructorTresParametrosCompraTest() {
        assertNotNull(persona, "El objeto Persona no puede ser nulo");
    }
    
    @Test
    public void getDniTest() {
        assertTrue(persona.getDni().equals(dni));
    }    

    @Test
    public void setDniTest() {
        String dni1="12345J";
        persona.setDni(dni1);
        assertTrue(persona.getDni().equals(dni1));
    }
   
    @Test
    public void getNombreTest() {
        assertTrue(persona.getNombre().equals(nombre));
    }    

    @Test
    public void setNombreTest() {
        String nombre1="Juan";
        persona.setNombre(nombre1);
        assertTrue(persona.getNombre().equals(nombre1));
    }
    @Test
    public void getApellidoTest() {
        assertTrue(persona.getApellido().equals(apellido));
    }    

    @Test
    public void setApellidoTest() {
        String apellido1="Perez";
        persona.setApellido(apellido1);
        assertTrue(persona.getApellido().equals(apellido1));
    }

}

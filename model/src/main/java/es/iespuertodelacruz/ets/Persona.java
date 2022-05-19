package es.iespuertodelacruz.ets;

/**
 * Clase Persona que sera usada por la clase Cliente y Empleado
 * @author Grace
 */
public abstract class Persona {
    private String dni;
    private String nombre;
    private String apellido1;
    private String apellido2;
    
    /**
     * Constructor que recibe tres parametros
     * @param dni DNI de la persona
     * @param nombre Nombre de la persona
     * @param apellido1 Primer apellido de la persona
     */
    public Persona(String dni, String nombre, String apellido1) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
    }

    /**
     * Constructor que recibe cuatro parametros
     * @param dni DNI de la persona
     * @param nombre Nombre de la persona
     * @param apellido1 Primer apellido de la persona
     * @param apellido2 Segundo apellido de la persona
     */
    public Persona(String dni, String nombre, String apellido1, String apellido2) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    /**
     * Setter del dni de la persona
     * @param dni Nuevo dni de la persona
     */
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    /**
     * Setter del nombre de la persona
     * @param nombre Nuevo nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Setter del primer apellido de la persona
     * @param apellido1 Nuevo primer apellido de la persona
     */
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    /**
     * Setter del segundo apellido de la persona
     * @param apellido2 Nuevo segundo apellido de la persona
     */
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }


}

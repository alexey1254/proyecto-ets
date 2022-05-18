package es.iespuertodelacruz.ets.vista;

/**
 * Clase Persona que sera usada por la clase Cliente y Empleado
 * @author Grace
 */
public abstract class Persona {
    private String dni;
    private String nombre;
    private String apellido;
    
    /**
     * Constructor que recibe tres parametros
     * @param dni de la persona
     * @param nombre de la persona
     * @param apellido o apellidos de la persona
     */
    public Persona(String dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

}

package es.iespuertodelacruz.ets;

/**
 * Clase Persona que sera usada por la clase Cliente y Empleado
 *
 */
public class Persona {
    private String dni;
    private String nombre;
    private String apellido;
    
    /**
     * Constructor vacio de la clase
     */
    public Persona() {
    }

    /**
     * Constructor que recibe un parametro
     * @param dni de la persona
     */
    public Persona(String dni) {
        this.dni = dni;
    }

    /**
     * Constructor que recibe dos parmetros
     * @param dni de la persona
     * @param nombre de la persona
     */
    public Persona(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

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
    
    /**
     * Getter del dni de la persona
     * @return dni de la persona
     */
    public String getDni() {
        return dni;
    }

    /**
     * Setter del dni de la persona
     * @param dni de la persona
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Getter del nombre de la persona
     * @return nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter del nombre de la persona
     * @param nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter del apellido de la persona
     * @return apellido de la persona
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Setter del apellido de la persona
     * @param apellido de la persona
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}

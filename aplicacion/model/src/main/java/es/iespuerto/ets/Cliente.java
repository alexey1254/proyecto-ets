package es.iespuertodelacruz.ets.model;

/**
 * Clase Cliente.
 * 
 * @author Grace
 */
public class Cliente extends Persona {
    private int codigo;
    private String direccion;

    /**
     * Constructor que recibe tres parmetros
     * 
     * @param codigo    del cliente
     * @param datos     dni, nombre y/o apellido del cliente
     * @param direccion del cliente
     */
    public Cliente(int codigo, String dni, String nombre, String apellido1, String apellido2, String direccion) {
        super(dni, nombre, apellido1, apellido2);
        this.codigo = codigo;
        this.direccion = direccion;
    }

    /**
     * Getter del codigo del cliente
     * 
     * @return codigo del cliente
     */
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo=codigo;
    }

    /**
<<<<<<< HEAD:model/src/main/java/es/iespuertodelacruz/ets/Cliente.java
=======
     * Setter del dni del cliente
     * @param dni Nuevo dni del cliente
     */
    @Override
    public void setDni(String dni) {
        super.setDni(dni);
    }

    /**
     * Setter del nombre del cliente
     * @param nombre Nuevo nombre del cliente
     */
    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    /**
     * Setter del primer apellido del cliente
     * @param apellido1 Nuevo primer apellido del cliente
     */
    @Override
    public void setApellido1(String apellido1) {
        super.setApellido1(apellido1);
    }

    /**
     * Setter del segundo apellido del cliente
     * @param apellido2 Nuevo segundo apellido del cliente
     */
    @Override
    public void setApellido2(String apellido2) {
        super.setApellido2(apellido2);
    }

    /**
>>>>>>> ca85493f2cec4c0322aae499e6958fb09f9894de:aplicacion/model/src/main/java/es/iespuerto/ets/Cliente.java
     * Setter del cargo del cliente
     * 
     * @param direccion Nueva direccion del cliente
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

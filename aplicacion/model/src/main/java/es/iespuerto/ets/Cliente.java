package es.iespuerto.ets;

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
        this.codigo = codigo;
    }

    /**
     * Setter del cargo del cliente
     * 
     * @param direccion Nueva direccion del cliente
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

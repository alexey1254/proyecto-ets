package es.iespuertodelacruz.ets;

/**
 * Clase Cliente.
 * @author Grace
 */
public class Cliente {
    private int codigo;
    private Persona datos;
    private String direccion;
    
    /**
     * Constructor que recibe tres parmetros
     * @param codigo del cliente
     * @param datos dni, nombre y/o apellido del cliente
     * @param direccion del cliente
     */
    public Cliente(int codigo, Persona datos, String direccion) {
        this.codigo = codigo;
        this.datos = datos;
        this.direccion = direccion;
    }

    /**
     * Getter del codigo del cliente
     * @return codigo del cliente
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Setter del codigo del cliente
     * @param codigo del cliente
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    /**
     * Getter de los datos del cliente
     * @return datos del cliente
     */
    public Persona getDatos() {
        return datos;
    }

    /**
     * Setter de los datos del cliente
     * @param datos dni, nombre y/o apellido del cliente
     */
    public void setDatos(Persona datos) {
        this.datos = datos;
    }


    /**
     * Getter de la direccion del cliente
     * @return codigo del cliente
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Setter de la direccion del cliente
     * @param direccion del cliente
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

  

}

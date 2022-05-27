package es.iespuertodelacruz.ets.model;

/**
 * @author Alejandro
 * Clase proveedor
 */

public class Proveedor {
    private int codigo;
    private String cif;
    private String nombre;
    private String direccion;
    private int telefono;

    /**
     * Constructor vacio de la clase
     */
    public Proveedor() {

    }

    /**
     * Constructor con parametros
     * @param codigo del proveedor
     * @param cif del proveedor
     * @param nombre del proveedor
     */
    public Proveedor(int codigo, String cif, String nombre, String direccion, int telefono) {
        this.codigo = codigo;
        this.cif = cif;
        this.nombre = nombre;
        this.direccion=direccion;
        this.telefono=telefono;
    }

    /**
     * Getter del codigo
     * @return Codigo del proveedor
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Setter del codigo
     * @param codigo del proveedor
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Getter del cif del proveedor
     * @return cif del proveedor
     */
    public String getCif() {
        return cif;
    }

    /**
     * Setter del cif del proveedor
     * @param cif del proveedor
     */
    public void setCif(String cif) {
        this.cif = cif;
    }

    /**
     * Getter del nombre del proveedor
     * @return Nombre del proveedor
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter del nombre del proveedor
     * @param nombre del proveedor
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }    
}


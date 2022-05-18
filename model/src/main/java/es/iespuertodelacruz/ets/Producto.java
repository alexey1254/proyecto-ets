package es.iespuertodelacruz.ets.vista;

/**
 * Clase producto
 * @author Alejandro
 */

public class Producto {
    private int codigo;
    private String nombre;
    private double peso;

    /**
     * Constructor vacio
     */
    public Producto() {

    }

    /**
     * Constructor con parametros
     * @param codigo del producto
     * @param nombre del producto
     * @param peso del producto
     */

    public Producto(int codigo, String nombre, double peso) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.peso = peso;
    }

    /**
     * Getter del codigo
     * @return codigo del producto
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Setter del codigo del producto
     * @param codigo del producto
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Getter del nombre del producto
     * @return nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter del nombre del producto
     * @param nombre del producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter del peso del producto
     * @return peso del producto
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Setter del peso del producto
     * @param peso del producto
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }
}

package es.iespuerto.ets;

/**
 * Clase producto
 * @author Alejandro
 */

public class Producto {
    private int codigo;
    private String nombre;
    private double peso;
    private double precio;
    private int stock;
    

    /**
     * Constructor con cinco parametros
     * @param codigo Codigo del producto
     * @param nombre Nombre del producto
     * @param peso Peso del producto
     * @param precio Precio del producto
     * @param stock Unidades de producto disponible
     */
    public Producto(int codigo, String nombre, double peso, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.peso = peso;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     * Getter del codigo
     * @return codigo del producto
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Getter del nombre del producto
     * @return nombre del producto
     */
    public String getNombre() {
        return this.nombre;
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
    public Double getPeso() {
        return this.peso;
    }

    /**
     * Setter del peso del producto
     * @param peso del producto
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Getter del precio del producto
     * @return precio del producto
     */
    public Double getPrecio() {
        return this.precio;
    }
    
    /**
     * Setter del precio del producto
     * @param precio del producto
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Getter del stock del producto
     * @return stock del producto
     */
    public int getStock() {
        return this.stock;
    }
    
    /**
     * Setter del stock del producto
     * @param stock del producto
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
}

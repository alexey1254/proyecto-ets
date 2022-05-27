package es.iespuertodelacruz.ets.model;

/**
 * @author Alejandro
 * Clase compra
 */

public class Compra {
    private int numFactura;
    private Producto producto;
    private double cantidad;
    private Fecha fecha;

    /**
     * Constructor vacio
     */
    public Compra() {

    }

    /**
     * Constructor con parametros
     * @param numFactura de la compra
     * @param producto que se compra
     * @param cantidad que se compra
     * @param fecha de la compra
     */
    public Compra(int numFactura, Producto producto, double cantidad, Fecha fecha) {
        this.numFactura = numFactura;
        this.producto = producto;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    /**
     * Getter numero de factura
     * @return numero de factura
     */
    public int getNumFactura() {
        return numFactura;
    }

    /**
     * Setter del numero de factura
     * @param numFactura Numero de factura
     */
    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
    }

    /**
     * Getter del producto
     * @return producto que el cliente ha comprado
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * Setter del producto
     * @param producto que el cliente compra
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * Getter de cantidad
     * @return Cantidad del producto que compra
     */
    public double getCantidad() {
        return cantidad;
    }

    /**
     * Setter de cantidad
     * @param cantidad del producto que compra
     */
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Getter de la fecha de compra
     * @return fecha de la compra
     */
    public Fecha getFecha() {
        return fecha;
    }

    /**
     * Setter de la fecha de compra
     * @param fecha de la compra
     */
    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
    
    
}

package es.iespuerto.ets;

/**
 * @author Alejandro
 * Clase envio 
 */
public class Envio {
    private String codigo;
    private Fecha fecha;
    private Cliente destinatario;
    private String estado;
    private Compra pedido;

    /**
     * Constructor con parametros
     * @param codigo del envio
     * @param fecha del envio
     * @param destinatario del envio
     * @param estado del envio
     * @param pedido Lo que compro el cliente, su pedido
     */
    public Envio(String codigo, Fecha fecha, Cliente destinatario, String estado, Compra pedido) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.destinatario = destinatario;
        this.estado = estado;
        this.pedido = pedido;
    }

    /**
     * Getter del codigo del envio
     * @return Codigo del envio
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Setter del codigo del envio
     * @param codigo del envio
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Getter de fecha
     * @return Fecha del pedido
     */
    public Fecha getFecha() {
        return fecha;
    }

    /**
     * Setter de fecha
     * @param fecha de la compra
     */
    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    /**
     * Getter del destinatario
     * @return Destinatario
     */
    public Cliente getDestinatario() {
        return destinatario;
    }

    /**
     * Setter del destinatario
     * @param destinatario Destino a donde quieres que vaya el paquete
     */
    public void setDestinatario(Cliente destinatario) {
        this.destinatario = destinatario;
    }

    /**
     * Getter del estado
     * @return Estado del envio
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Setter del estado
     * @param estado del envio
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Getter del pedido
     * @return Pedido
     */
    public Compra getPedido() {
        return pedido;
    }

    /**
     * Setter del pedido
     * @param pedido del cliente
     */
    public void setPedido(Compra pedido) {
        this.pedido = pedido;
    }
}

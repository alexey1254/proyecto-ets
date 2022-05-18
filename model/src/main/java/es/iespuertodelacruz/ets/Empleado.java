package es.iespuertodelacruz.ets.vista;

/**
 * Clase Empleado.
 * @author Grace
 */
public class Empleado extends Persona {
    private int codigo;
    private Fecha fechNac;
    private String cargo;
    
    /**
     * Constructor que recibe dos parametros
     * @param codigo del empleado
     * @param datos dni, nombre y/o apellido del empleado
     */
    public Empleado(int codigo,String dni, String nombre,String apellido) {
        super(dni, nombre, apellido);
        this.codigo = codigo;
    }

    /**
     * Constructor que recibe tres parametros
     * @param codigo del empleado
     * @param datos dni, nombre y/o apellido del empleado
     * @param fechNac fecha de nacimiento del empleado
     */
    public Empleado(int codigo, String dni, String nombre,String apellido, Fecha fechNac) {
        super(dni, nombre, apellido);
        this.codigo = codigo;
        this.fechNac = fechNac;
    }

    /**
     * Constructor que recibe cuatro parametros
     * @param codigo del empleado
     * @param datos dni, nombre y/o apellido del empleado
     * @param fechNac fecha de nacimiento del empleado
     * @param cargo que ostenta el empleado
     */
    public Empleado(int codigo, String dni, String nombre,String apellido, Fecha fechNac, String cargo) {
        super(dni, nombre, apellido);
        this.codigo = codigo;
        this.fechNac = fechNac;
        this.cargo = cargo;
    }

    /**
     * Getter del codigo del empleado
     * @return codigo del empleado
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Setter del codigo del empleado
     * @param codigo del empleado
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    /**
     * Getter de la fecha de nacimiento del empleado
     * @return fecha de nacimiento
     */
    public Fecha getFechNac() {
        return fechNac;
    }

    /**
     * Setter de la fecha de nacimiento del empleado
     * @param fechNac fecha de nacimiento del empleado
     */
    public void setFechNac(Fecha fechNac) {
        this.fechNac = fechNac;
    }

    /**
     * Getter del ccargo que ostenta el cliente
     * @return cargo del cliente
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Setter del cargo del empleado
     * @param cargo del empleado
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}

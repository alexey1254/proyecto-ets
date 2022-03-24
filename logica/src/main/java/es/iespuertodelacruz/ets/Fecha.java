package es.iespuertodelacruz.ets;
/**
 * Clase Fecha que inicializa la variable fecha
 * @author Grace
 */

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    /**
     * Constructor vacio
     */
    public Fecha() {

    }

    /**
     * Constructor Fecha que recibe tres parametros
     * @param dia del mes
     * @param mes del anio
     * @param anio al que se refiere la fecha
     */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    /**
     * Getter del dia 
     * @return dia de la fecha a la que hace referencia
     */
    public int getDia() {
        return dia;
    }

    /**
     * Setter del dia
     * @param dia de la fecha a la que hace referencia
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * Getter del mes
     * @return mes de la fecha a la que hace referencia
     */
    public int getMes() {
        return mes;
    }

    /**
     * Setter del mes
     * @param mes de la fecha a la que hace referencia
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * Getter del anio
     * @return anio de la fecha a la que hace referencia
     */
    public int getAnio() {
        return anio;
    }

    /**
     * Setter del anio
     * @param anio de la fecha a la que hace referencia
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

}

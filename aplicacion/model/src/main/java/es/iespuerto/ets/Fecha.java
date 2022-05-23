package es.iespuertodelacruz.ets.model;
/**
 * Clase Fecha que inicializa la variable fecha
 * @author Grace
 */

public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    /**
     * Constructor de la clase que recibe tres parametros
     * @param dia dia correspondiente a la fecha indicada
     * @param mes mes correspondiente a la fecha indicada
     * @param anio anio correspondiente a la fecha indicada
     */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    /**
     * Comprueba si el mes es valido y el dia es valido, 
     * en ese caso devuelve verdadero.
     * 
     * @return Devuelve un valor booleano
     */
    public boolean valida() {
        return mesValido() && diaValido() ;
    }
  
    /**
     * Comprueba si el anio es bisiesto, devuelve verdadero si el anio es 
     * divisible por 400, o si el anio es divisible por 4 y no por 100
     * 
     * @return Devuelve un valor booleano
     */
    private boolean esBisiesto() {
        return (this.anio % 400 == 0) || ( (this.anio % 4 == 0) && (this.anio % 100 != 0) ) ; 
    }

    /**
     * Comprueba si es mes es valido, Devuelve verdadero si el mes esta entre 1
     * y 12 ambos incluidos, en otro caso falso
     * 
     * @return Devuelve un valor booleano
     */
    private boolean mesValido() {
        return (this.mes >= 1 && this.mes <= 12);
        
    }

    /**
     * Devuelve el numero de dias del mes de la fecha
     * 
     * @return Numero de dias del mes.
     */
    private int diasPorMes(){
        int[] diasMes=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
            
        if (esBisiesto()){
            diasMes[1]=29;
        }
        return diasMes[this.mes-1];
    }

    /**
     * Devuelve verdadero si el día está entre 1 y el número de días del mes
     * 
     * @return Devuelve un valor booleano
     */
    private boolean diaValido() {
        return this.dia>=1 && this.dia <= diasPorMes();
    }
}

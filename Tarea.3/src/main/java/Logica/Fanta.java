package Logica;

/**
 * Una bebida de tipo Fanta
 * @author Darwin Albornoz
 * @version versión 1, 20 de octubre de 2023
 */

public class Fanta extends Bebida{

    /**Metodo constructor clase Fanta.
     * @param s primero int
     */
    public Fanta(int s){
        super(s);
    }

    /**Metodo consumir
     * return un string con el nombre del producto "fanta".
     */
    public String consumir(){
        return "fanta";
    }
}

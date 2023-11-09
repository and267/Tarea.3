package Logica;

/**
 * Un dulce de tipo Super8
 * @author Darwin Albornoz
 * @version versión 1, 20 de octubre de 2023
 */
public class Super8 extends Dulce {

    /**Metodo constructor clase Super8.
    * @param s primero int
    */
    public Super8(int s){
        super(s);
    }

    /**Metodo consumir
    * return un string con el nombre del producto "super8".
    */
    public String consumir(){
        return "super8";
    }
}

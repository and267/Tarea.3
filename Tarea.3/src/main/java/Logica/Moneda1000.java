package Logica;

/**
 * Logica.Moneda con valor 1000.
 */
public class Moneda1000 extends Moneda {
    public Moneda1000(int serie){
        super(serie);
        super.valor = 1000;
    }
    public int getValor(){
        return super.valor;
    }
}
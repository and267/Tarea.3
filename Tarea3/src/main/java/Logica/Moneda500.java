package Logica;

/**
 * Logica.Moneda con valor 500.
 */
public class Moneda500 extends Moneda {
    public Moneda500(int serie){
        super(serie);
        super.valor = 500;
    }
    public int getValor(){
        return super.valor;
    }
}

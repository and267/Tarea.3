package Logica;

/**
 * Logica.Moneda con valor 100.
 */
public class Moneda100 extends Moneda {
    public Moneda100(int serie){
        super(serie);
        super.valor = 100;
    }
    public int getValor(){
        return super.valor;
    }
}

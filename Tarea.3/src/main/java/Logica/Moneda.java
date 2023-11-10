package Logica;

/**
 * Clase Logica.Moneda, usada por Logica.Comprador y Logica.Expendedor.
 */
public abstract class Moneda implements Comparable<Moneda>{

    protected int valor;
    protected int serie;

    public Moneda(int serie){
        this.serie = serie;
        System.out.println("Se creo una moneda de serie" + getSerie());
    }
    public int getSerie(){
        return serie;
    }

    public abstract int getValor();

    /**
     * Compara 2 monedas segun su valor.
     * @param m la moneda que se compara.
     * @return La diferencia de valor entre las 2 monedas.
     */
    public int compareTo(Moneda m) {
        return (this.getValor() - m.getValor());
    }
}
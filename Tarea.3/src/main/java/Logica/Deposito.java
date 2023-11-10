package Logica;

import java.util.ArrayList;

/** 
 * Un deposito de tipo generico que almacenara los productos (bebidas y dulces).
 * @author Darwin Albornoz
 * @version versión 2, 7 de noviembre de 2023.
 */
class Deposito<T>{
    private ArrayList<T> dep;
    
    //Metodo constructor clase Logica.Deposito<T>, que crea un objeto de tipo ArrayList<T> para el funcionamiento del deposito.
    public Deposito(){
        dep = new ArrayList<T>();
    }
    
    //Metodo addObj, agrega elementos en el deposito.
    public void addObj(T bar){
        dep.add(bar);
    }

    public int size(){
        return dep.size();
    }

    //Metodo getObj, retira elementos del deposito.
    public T getObj(){ 
        if (dep.size() == 0){
            return null;
        }
        else{
            T ret = dep.get(0);
            dep.remove(0);
            return ret;
        }
    }
}


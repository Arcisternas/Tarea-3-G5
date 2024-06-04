package tarea3.codigoInterno;
import java.awt.Image;
import java.util.ArrayList;
/**
 * Clase Deposito el cual se puede utilizar para guardar Monedas, Dulces y Bebidas
 * @author Ariel Cisternas
 */
public class Deposito<T>{
    /**Lista donde se guardaran los productos/monedas segun el tipo*/
    private ArrayList<T> almacen;

    /**Constructor que segun la clase, se crea una lista correspondiente de cada producto o moneda instanciada*/
    public Deposito() {
        almacen = new ArrayList<T>();
    }

    /**
     * Metodo donde se añaden los productos al almacen
     * @param t Serie de los productos o Moneda a guardar en el almacen
     * @return 
     */
    public void add(T t) {
        almacen.add(t);
    }
    /**
     * Metodo para obtener un producto/moneda
     * @return el producto/moneda o null si no existen mas productos de la misma categoria
     */
    public T get() {
        if(almacen.size() != 0) {
            return almacen.remove(0);
        }else{
            return null;
        }
    }

    public int size() {
        return almacen.size();
    }
    public T getP(int index){
        return almacen.get(index);
    }
    
}

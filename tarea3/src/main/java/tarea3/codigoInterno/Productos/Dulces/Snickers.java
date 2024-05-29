package tarea3.codigoInterno.Productos.Dulces;

public class Snickers extends Dulce{
    /**
     * Constructor del Dulce Snickers
     * @param serie asigna el valor de numero de serie invocando a la superclase
     */
    public Snickers(int serie){
        super(serie);
    }
    /**
     * Metodo que devuelve el nombre de la Bebida al Consumirse
     * @return Un String con el nombre, en este caso "snickers"
     */
    public String consumir(){
        return "snickers";
    } 
}

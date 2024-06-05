package tarea3.codigoInterno.Monedas;
/**
 * Clase de Moneda que se utiliza para pago y/o vuelto
 * @author Ariel Cisternas
 */
abstract public class Moneda implements Comparable<Moneda> {
    /**Constructor para inicializar la clase */
    public Moneda(int serie){}
    /**
     * Metodo en el cual se llama al numero de serie de la Moneda
     * @return el numero de serie
     */
    public Moneda getSerie(){
        return this;
    }
    /**
     * Metodo abstracto en el cual las subclases de Moneda le daran una funcionalidad para obtener su valor
     * @return un int con la cantidad correspondiente de la subclase
     */
    public abstract int getValor();
    /**
     * Metodo donde se compara el valor de la Moneda y el precio del producto
     * @param o Precio del Producto
     * @return un int del -1 al 1
     */
    public int compareTo(Moneda m){
        return this.getValor() - m.getValor();
    }
}
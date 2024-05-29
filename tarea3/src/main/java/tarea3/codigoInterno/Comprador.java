package tarea3.codigoInterno;

import tarea3.codigoInterno.Exeptions.NoHayProductoException;
import tarea3.codigoInterno.Exeptions.PagoIncorrectoException;
import tarea3.codigoInterno.Exeptions.PagoInsuficienteException;
/**
 * Clase de un Comprador que debe pedir un Producto e ingresar el pago
 * @author Maria Jesus Olivares
 */
class Comprador{
    /**int donde se almacena el vuelto de la compra*/
    private int vuelto;
    /**String del sonido que se produce al consumir el producto*/
    private String sonido;

    /**
     * Constructor donde se pide una moneda, el numero del producto y en cual expendedor.
     * Se realiza la compra con la moneda y el producto, entonces dentro del constructor se realiza un conteo interno
     * de 100 en 100 para el vuelto. Luego se consume el producto.
     * @param m Moneda con la que paga el comprador
     * @param queproducto int del que producto desea (1 al 5)
     * @param exp Expendedor que escoge el comprador en el cual va a comprar
     * @throws PagoInsuficienteException
     * @throws NoHayProductoException
     * @throws PagoIncorrectoException
     * @see Expendedor#comprarProducto(Moneda,int) Para comprar el Producto con una Moneda y el numero del producto (1 a 5)
     * @see Expendedor#getVuelto() Cantidad de monedas para el Ciclo del vuelto
     * @see Producto#consumir() Consumir el Producto
     */
    public Comprador(Moneda m, int queproducto, Expendedor exp) throws PagoInsuficienteException, NoHayProductoException, PagoIncorrectoException{
        Producto p = exp.comprarProducto(m, queproducto);

        if(p==null){
            sonido = null;
        }else{
            sonido = p.consumir();
        }

        vuelto = 0;

        for(int i = 0; i <exp.getVuelto(); i++){
            vuelto += 100;
        }
    }
    /**
     * Metodo donde se usa un getter del vuelto si era mayor o igual al precio
     * @return int del conteo en el constructor. Si la cantidad era exacta, retorna 0
     */
    public int cuantoVuelto(){
        return vuelto;
    }
    /**
     * Metodo donde se usa un getter para indicar lo que consume el comprador
     * @return String del Sonido o nombre del producto consumido (Si existe. Si no, retorna null)
     */
    public String queConsumiste(){
        return sonido;
    }
}
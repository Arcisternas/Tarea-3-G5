package tarea3.codigoInterno;

import tarea3.codigoInterno.Exeptions.*;
import tarea3.codigoInterno.Productos.*;
import tarea3.codigoInterno.Monedas.*;
/**
 * Clase de un Comprador que debe pedir un Producto e ingresar el pago
 * @author Maria Jesus Olivares
 */
public class Comprador{
    /**int donde se almacena el vuelto de la compra*/
    private int vuelto;
    /**String del sonido que se produce al consumir el producto*/
    private String sonido;
    private Deposito<Moneda100> cantidadmoneda100;
    private Deposito<Moneda500> cantidadmoneda500;
    private Deposito<Moneda1000> cantidadmoneda1000;
    private Deposito<Moneda1500> cantidadmoneda1500;
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
        cantidadmoneda100 = new Deposito<Moneda100>();
        cantidadmoneda500 = new Deposito<Moneda500>();
        cantidadmoneda1000 = new Deposito<Moneda1000>();
        cantidadmoneda1500 = new Deposito<Moneda1500>();
        llenarMonedas(100, 10);
        llenarMonedas(500, 10);
        llenarMonedas(1000, 10);
        llenarMonedas(1500, 10);

        exp.comprarProducto(m, queproducto);
        Producto p = exp.getProducto(); 

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
    public void llenarMonedas(int precio, int cantidad){
        if(precio == 100){
            for(int i = 0; i < cantidad; i++){
                cantidadmoneda100.add(new Moneda100(i));
            }
        }else if(precio == 500){
            for(int i = 0; i < cantidad; i++){
                cantidadmoneda500.add(new Moneda500(i));
            }
        }else if(precio == 1000){
            for(int i = 0; i < cantidad; i++){
                cantidadmoneda1000.add(new Moneda1000(i));
            }
        }else if(precio == 1500){
            for(int i = 0; i < cantidad; i++){
                cantidadmoneda1500.add(new Moneda1500(i));
            }
        }
    }
    public int getCantidadMonedas(int precio){
        if(precio == 100){
            return cantidadmoneda100.size();
        }else if(precio == 500){
            return cantidadmoneda500.size();
        }else if(precio == 1000){
            return cantidadmoneda1000.size();
        }else if(precio == 1500){
            return cantidadmoneda1500.size();
        }
        return 0;
    }
    public Moneda getMonedaSeleccionada(int precio){
        if(precio == 100){
            return cantidadmoneda100.get();
        }else if(precio == 500){
            return cantidadmoneda500.get();
        }else if(precio == 1000){
            return cantidadmoneda1000.get();
        }else if(precio == 1500){
            return cantidadmoneda1500.get();
        }
        return null;
    }
}
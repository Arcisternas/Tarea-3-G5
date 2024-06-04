package tarea3.codigoInterno;

import tarea3.codigoInterno.Exeptions.*;
import tarea3.codigoInterno.Productos.Bebidas.*;
import tarea3.codigoInterno.Productos.Dulces.*;
import tarea3.codigoInterno.Productos.*;

/**
 * Clase de Expendedor en el cual se guardan las monedas y productos, siendo posible comprar estos ultimos
 * @author Ariel Cisternas
 * @author Maria Jesus Olivares
 */
public class Expendedor {
    /**Depositos donde se guardan Dulces, Bebidas y Monedas por separado */
    private Deposito<Bebida> coca;
    private Deposito<Bebida> sprite;
    private Deposito<Bebida> fanta;
    private Deposito<Dulce> snickers;
    private Deposito<Dulce> super8;
    private Deposito<Moneda> vueltoM;
    private Deposito<Producto> producto;
    private Deposito<Moneda> exito;
    /**int del precio del producto */
    private int cuantocuesta;
    /**int de la cantidad de Monedas de 100 que hay que dar como vuelto */
    private int cantMonedas100;

    /**
     * Constructor que pide la cantidad a rellenar en los depositos y los instancia, al igual que a VueltoM
     * @param cuantas Productos a rellenar en cada Deposito (Si son 6, se rellenan 6 de cada tipo).
     * Ademas de utilizarse para generar la serie de cada producto
     */
    public Expendedor(int cuantas) {
        this.coca = new Deposito<Bebida>();
        this.sprite = new Deposito<Bebida>();
        this.fanta = new Deposito<Bebida>();
        this.snickers = new Deposito<Dulce>();
        this.super8 = new Deposito<Dulce>();
        this.producto = new Deposito<Producto>();
        this.exito = new Deposito<Moneda>();

        for (int i = 0; i < cuantas; i++) {
            coca.add(new CocaCola(i));
            sprite.add(new Sprite(cuantas + i));
            fanta.add(new Fanta(2*cuantas + i));
            snickers.add(new Snickers(3*cuantas + i));
            super8.add(new Super8(4*cuantas + i));
        }
        this.vueltoM = new Deposito<Moneda>();
    }
    /**
     * Metodo donde se utiliza un getter para proporcionar una cantidad de monedas e ir eliminando una por una las monedas utilizadas
     * @return int de la cantidad de Monedas de 100 a dar como vuelto
     */
    public int getVuelto(){
        vueltoM.get();
        return cantMonedas100;
    }

    /**
     * Metodo para Comprar un producto con una moneda y el numero correspondiente al producto (1 a 5).
     * Primero se revisa si no existe la moneda (null), si es asi, se lanza una excepción de pago incorrecto.
     * Luego, se realiza un switch case utilizando el Enum de los productos, revisando que la moneda ingresada sea mayor o igual al precio del producto seleccionado. En caso de ser efectivo, se remueve el producto del deposito, pero se guarda en p.
     * Por ultimo se revisa el producto ¿existe en el deposito? de no ser asi, se lanza una excepcion de no hay producto.
     * Se comparan la moneda con el precio, si no alcanza la moneda, entonces se lanza una excepción de pago insuficiente.
     * Si todo resulta bien, entonces se añaden las monedas de 100 en vueltoM para el conteo y se calculan cuantas deben devolverse.
     * @param m Moneda con la que se paga
     * @param cual Numero del producto seleccionado (1 a 5)
     * @return El producto escogido
     * @throws PagoInsuficienteException
     * @throws NoHayProductoException
     * @throws PagoIncorrectoException
     * @see LosProductos
     */
    public void comprarProducto(Moneda m, int cual) throws PagoInsuficienteException, NoHayProductoException, PagoIncorrectoException {
        //¿Se pagó correctamente?
        if(m == null) {
            Producto p = null;
            System.out.println(p+", "+ m);
            cantMonedas100 = 0;
            throw new PagoIncorrectoException("Moneda no valida");
        }
        Producto p = null;

        //¿el pago es mayor o igual al precio?
        switch (cual) {
            case 1:
                cuantocuesta = LosProductos.SNICKERS.getPrecio();
                if(m.compareTo(cuantocuesta) >= 0){
                    p=(Dulce)snickers.get();
                }
                break;
            case 2:
                cuantocuesta = LosProductos.SUPER8.getPrecio();
                if(m.compareTo(cuantocuesta) >= 0){
                    p=(Dulce)super8.get();
                }
                break;
            case 3:
                cuantocuesta = LosProductos.COCACOLA.getPrecio();
                if(m.compareTo(cuantocuesta) >= 0){
                    p=(Bebida)coca.get();
                }
                break;
            case 4:
                cuantocuesta = LosProductos.SPRITE.getPrecio();
                if(m.compareTo(cuantocuesta) >= 0){
                    p=(Bebida)sprite.get();
                }
                break;
            case 5:
                cuantocuesta = LosProductos.FANTA.getPrecio();
                if(m.compareTo(cuantocuesta) >= 0){
                    p=(Bebida)fanta.get();
                }
                break;
            default:
                break;
        }
        
        if(m.compareTo(cuantocuesta) == -1){  //¿El pago es menor al precio?
            vueltoM.add(m);
            p = null;
            System.out.println(p+", "+m.getValor());
            vueltoM.get();
            throw new PagoInsuficienteException("Dinero insuficiente");
            //¿Quedan productos disponibles?¿Es correcto el deposito?
        }else if(p == null){
            vueltoM.add(m);
            System.out.println(p+", "+m.getValor());
            vueltoM.get();
            throw new NoHayProductoException("El deposito esta vacio");
        } else if (m.compareTo(cuantocuesta) >= 0){//¿el pago es correcto?

            exito.add(m);
            cantMonedas100 = (m.getValor() - cuantocuesta) / 100;
            producto.add(p);

            for (int i = 0; i < cantMonedas100; i++) {
                Moneda sobrante = new Moneda100();
                vueltoM.add(sobrante);
            }
        }
    }
    public Producto getProducto(){
        return producto.get();
    }
}
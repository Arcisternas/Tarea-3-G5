package tarea3.codigoInterno;

import tarea3.codigoInterno.Exeptions.NoHayProductoException;
import tarea3.codigoInterno.Exeptions.PagoIncorrectoException;
import tarea3.codigoInterno.Exeptions.PagoInsuficienteException;
import tarea3.codigoInterno.Monedas.*;

/** 
 * Main: Un comprador que utiliza un expendedor para consumir Bebidas o Dulces
 * @author Maria Jesus Olivares
 */

public class Main {
    /**
     * Se realizan pruebas creando un expendedor con una cantidad especifica para cada producto y se crea al comprador y moneda.
     * Se realiza un try/catch con distintos valores para cada prueba (1.Moneda>=precio, 2.Moneda < Precio, 3. lo mismo que 1, 4. Moneda no es valida, 5. Moneda == Precio, 6. No hay mas producto)
     * @param args
     * @throws PagoInsuficienteException
     * @throws NoHayProductoException
     * @throws PagoIncorrectoException
     */
    public static void main(String[] args) throws PagoInsuficienteException, NoHayProductoException, PagoIncorrectoException {      
        Expendedor exp = new Expendedor(2);
        Comprador c = null; 
        Moneda m = null;

        //1. Moneda >= Precio
        try {
            m = new Moneda1500(0);
            c = new Comprador(m, 1, exp);
        } catch (PagoInsuficienteException | NoHayProductoException | PagoIncorrectoException e) {
            e.printStackTrace();
        }
        
        if (c != null && m != null) {
            System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        }

        c = null; 
        m = null;
        //2.Moneda < Precio
        try {
            m = new Moneda100(0);
            c = new Comprador(m, 1, exp);
        } catch (PagoInsuficienteException | NoHayProductoException | PagoIncorrectoException e) {
            e.printStackTrace();
        }
        
        if (c != null && m != null) {
            System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        }

        c = null; 
        m = null;
        
        //3.Moneda >= precio
        try {
            m = new Moneda1500(0);
            c = new Comprador(m, 1, exp);
        } catch (PagoInsuficienteException | NoHayProductoException | PagoIncorrectoException e) {
            e.printStackTrace();
        }
        
        if (c != null && m != null) {
            System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        }

        c = null; 
        m = null;
        
        //4.Moneda no es valida
        try {
            m = null;
            c = new Comprador(m, 1, exp);
        } catch (PagoInsuficienteException | NoHayProductoException | PagoIncorrectoException e) {
            e.printStackTrace();
        }
        
        if (c != null && m != null) {
            System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        }

        c = null; 
        m = null;

        //5. Moneda == Precio
        try {
            m = new Moneda1000(0);
            c = new Comprador(m, 3, exp);
        } catch (PagoInsuficienteException | NoHayProductoException | PagoIncorrectoException e) {
            e.printStackTrace();
        }
        
        if (c != null && m != null) {
            System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        }

        c = null; 
        m = null;

        //6. No hay mas producto
         try {
            m = new Moneda1500(0);
            c = new Comprador(m, 1, exp);
        } catch (PagoInsuficienteException | NoHayProductoException | PagoIncorrectoException e) {
            e.printStackTrace();
        }
        
        if (c != null && m != null) {
            System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        }
    }
}
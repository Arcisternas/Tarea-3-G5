package tarea3.codigoGrafico;

import java.awt.*;
import javax.swing.*;
import tarea3.codigoInterno.*;
import tarea3.codigoInterno.Monedas.*;
import tarea3.codigoInterno.Exeptions.*;

/**
 * Clase(Panel) del Comprador
 * @author Ariel Cisternas
 * @author María Jesús Olivares
 */

public class PanelComprador extends JPanel{
    private Image cuadrocomprador;
    private PanelMonedas monedas;
    protected static Comprador comprador;
    private Expendedor exp;

    /**
     * Constructor donde se define su visual y se inicializa las Monedas
     */
    public PanelComprador(){
        try {
            exp = new Expendedor(10);
            comprador = new Comprador(new Moneda1500(0),2,exp);
            // rest of your code
        } catch (PagoInsuficienteException | NoHayProductoException | PagoIncorrectoException e) {
            e.printStackTrace();}

        setLayout(new BorderLayout());
        setSize(340, 750);
        cuadrocomprador = new ImageIcon(getClass().getResource("/imagenes/ventana/cp.png")).getImage();
        monedas = new PanelMonedas(); // llamada de monedas
        add(monedas, BorderLayout.CENTER);
        setOpaque(false);
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(cuadrocomprador, 0, 0, 340, 750, this);
        monedas.paintComponent(g);
    }
    /**
     * Metodo que utiliza un metodo anterior de Monedas
     * @return int valor de la moneda
     */
    public int getValorDeMoneda(){
        return monedas.getValorMonedaSeleccionada();
    }
    /**
     * Metodo que utiliza un metodo anterior de Monedas
     * @return Moneda valor de la moneda
     */
    public Moneda getMonedaDeMoneda(){
        return monedas.getMonedaSelecc();
    }
    /**
     * Metodo que utiliza un metodo anterior de Monedas
     * remueve una moneda del deposito que simula un "monedero"
     */
    public void removeValorMoneda(){
        monedas.removeValor();
    }
}

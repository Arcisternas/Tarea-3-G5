package tarea3.codigoGrafico;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import tarea3.codigoInterno.*;
import tarea3.codigoInterno.Monedas.*;
import tarea3.codigoInterno.Exeptions.*;;

public class PanelComprador extends JPanel{
    private Image cuadrocomprador;
    private PanelMonedas monedas;
    protected static Comprador comprador;
    private Expendedor exp;
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
        monedas = new PanelMonedas();
        add(monedas, BorderLayout.CENTER);
        setOpaque(false);
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(cuadrocomprador, 0, 0, 340, 750, this);
        monedas.paintComponent(g);
    }
    public int getValorDeMoneda(){
        return monedas.getValorMonedaSeleccionada();
    }
}

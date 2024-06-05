package tarea3.codigoGrafico;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class PanelComprador extends JPanel{
    private Image cuadrocomprador;
    private PanelMonedas monedas;
    public PanelComprador(){
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
}

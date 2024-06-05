package tarea3.codigoGrafico;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class PanelComprador extends JPanel{
    private JPanel panelComprador = new JPanel();
    private JLabel Precios;
    private Image titulo;
    public PanelComprador(){
        //this.setSize(350, 800);
        //this.setBackground(Color.CYAN);
        titulo = new ImageIcon(getClass().getResource("/imagenes/ventana/clean_customer_prices.png")).getImage();
        setOpaque(false);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(titulo, 0, 0, getWidth(), getHeight(), this);
    }
}

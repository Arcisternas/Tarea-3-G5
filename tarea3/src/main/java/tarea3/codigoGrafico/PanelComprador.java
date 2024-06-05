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
        titulo = new ImageIcon(getClass().getResource("/imagenes/ventana/cp.png")).getImage();
        setOpaque(false);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(titulo, 0, 0, 340, 750, this);
    }
}

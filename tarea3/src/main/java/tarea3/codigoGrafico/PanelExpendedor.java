package tarea3.codigoGrafico;

import tarea3.codigoInterno.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class PanelExpendedor extends JPanel{
    private Image fondoBase;
    private Expendedor exp;
    private PanelProductos panpr;
    private BotonesExp be;

    public PanelExpendedor(){
        setLayout(new BorderLayout());
        fondoBase = new ImageIcon(getClass().getResource("/imagenes/ventana/expendedor.png")).getImage();
        this.exp = new Expendedor(10);
        this.panpr = new PanelProductos();
        this.be = new BotonesExp(panpr);
        this.add(panpr);
        this.add(be);
      
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(fondoBase, 340, 0, 660, 750, this);
        panpr.paintComponent(g);
    }

}

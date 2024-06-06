package tarea3.codigoGrafico;

import tarea3.codigoInterno.*;
import tarea3.codigoInterno.Monedas.Moneda;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class PanelExpendedor extends JPanel{
    private Image fondoBase;
    private Expendedor exp;
    private PanelProductos panpr;
    private BotonesExp be;
    private int selecc;
    private PanelComprador pc;
  

    public PanelExpendedor(PanelComprador pc){
        setLayout(new BorderLayout());
        fondoBase = new ImageIcon(getClass().getResource("/imagenes/ventana/expendedor.png")).getImage();
        this.exp = new Expendedor(6);
        this.panpr = new PanelProductos(exp);
        this.pc = pc;
        this.be = new BotonesExp(panpr, pc);
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

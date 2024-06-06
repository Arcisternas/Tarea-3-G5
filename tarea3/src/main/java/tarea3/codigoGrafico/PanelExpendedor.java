package tarea3.codigoGrafico;

import tarea3.codigoInterno.*;

import java.awt.*;
import javax.swing.*;


/**
 * Clase(Panel) del la maquina expendedora
 * @author Maria Jesus Olivares
 */
public class PanelExpendedor extends JPanel{
    private Image fondoBase;
    private Expendedor exp;
    private PanelProductos panpr;
    private BotonesExp be;
  
    /**
     * Constructor donde se inician los primeros new
     * @param pc Panel del Comprador
     */
    public PanelExpendedor(PanelComprador pc){
        setLayout(new BorderLayout());
        fondoBase = new ImageIcon(getClass().getResource("/imagenes/ventana/expendedor.png")).getImage();
        this.exp = new Expendedor(6);
        this.panpr = new PanelProductos(exp); //se inicializa primero el panel de productos
        this.be = new BotonesExp(panpr, pc); //se ingresa el panel de producto junto al del comprador para que no exista problemas de usar sus metodos dentro de los botones
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

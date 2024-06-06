package tarea3.codigoGrafico;

import java.awt.*;
import javax.swing.*;

import tarea3.codigoInterno.Monedas.Moneda;

import java.awt.event.*;

public class BotonesExp extends JPanel implements ActionListener{
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JButton boton5;
    private final PanelProductos panpr;
    private final PanelComprador pc;
    private Moneda selecc;
    private int val;

    public BotonesExp(final PanelProductos panpr, final PanelComprador pc){
        this.panpr = panpr;
        this.pc = pc;
        setLayout(null);
        setBounds(5, 80, 330, 315);
        boton1 = new JButton();
        boton2 = new JButton();
        boton3 = new JButton();
        boton4 = new JButton();
        boton5 = new JButton();
        boton1.setBounds(811, 250, 33, 33);
        boton2.setBounds(852, 250, 33, 33);
        boton3.setBounds(811, 285, 33, 33);
        boton4.setBounds(852, 285, 33, 33);
        boton5.setBounds(811, 318, 33, 33);

        boton1.putClientProperty("value", 1);
        boton2.putClientProperty("value", 2);
        boton3.putClientProperty("value", 3);
        boton4.putClientProperty("value", 4);
        boton5.putClientProperty("value", 5);
        
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                JButton b = (JButton) e.getSource();
                val = (int) b.getClientProperty("value");
                selecc = pc.getMonedaDeMoneda();
                panpr.getImagenProducto(val, selecc);
                if(panpr.seCompra()){
                    pc.removeValorMoneda();
                }
                repaint();
            }
        };
        boton1.addActionListener(listener);
        boton2.addActionListener(listener);
        boton3.addActionListener(listener);
        boton4.addActionListener(listener);
        boton5.addActionListener(listener);
        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);
        add(boton5);
        setOpaque(false);
    }
    public int getval(){
        return val;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
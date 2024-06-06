package tarea3.codigoGrafico;

import javax.swing.*;

import tarea3.codigoInterno.Monedas.Moneda;

import java.awt.event.*;

/**
 * Una Clase(Panel) de tipo Botones para la maquina expendedora
 * @author Maria Jesus Olivares
 */

public class BotonesExp extends JPanel implements ActionListener{

    //se definen botones
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JButton boton5;
    //y los parametros a utilizar para el action listener junto a auxiliares
    private Moneda selecc;
    private int val;

    /**
     * Constructor de los botones, en el se inicializa el panel numerico para la compra
     * @param panpr Panel de Productos
     * @param pc    Panel del Comprador
     */
    public BotonesExp(final PanelProductos panpr, final PanelComprador pc){
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

        //se le asigna un valor de tipo int a los botones que estaran en el panel

        boton1.putClientProperty("value", 1);
        boton2.putClientProperty("value", 2);
        boton3.putClientProperty("value", 3);
        boton4.putClientProperty("value", 4);
        boton5.putClientProperty("value", 5);

        //Se hace new del ActionListener para activar los botones
        
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                JButton b = (JButton) e.getSource();
                val = (int) b.getClientProperty("value");   //valor int del boton
                selecc = pc.getMonedaDeMoneda();            //valor de la moneda seleccionada en el panel del comprador
                panpr.getImagenProducto(val, selecc);       //se compra el producto
                if(panpr.seCompra()){   //si se compra se remueve la moneda del "monedero"
                    pc.removeValorMoneda();
                    
                }else{                  //si no, no se imprime el producto
                    panpr.seDibuja();
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
    /**
     * metodo que retorna el valor del boton presionado
     * @return valor del boton
     */
    public int getval(){
        return val;
    }
    @Override
    public void actionPerformed(ActionEvent e) {}
}
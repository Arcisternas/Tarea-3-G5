package tarea3.codigoGrafico;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

import tarea3.codigoInterno.Monedas.*;

public class PanelMonedas extends JPanel{
    private JButton botonMoneda100;
    private JButton botonMoneda500;
    private JButton botonMoneda1000;
    private JButton botonMoneda1500;
    private ImageIcon moneda100;
    private ImageIcon moneda500;
    private ImageIcon moneda1000;
    private ImageIcon moneda1500;
    private int mon100;
    private int mon500;
    private int mon1000;
    private int mon1500;
    private VentanaMonedaSeleccionada ventanaMonedaSeleccionada;
    private Moneda monedaSeleccionada;
    private int valorMonedaSeleccionada;
    private Boolean ventanaabierta = false;
    public PanelMonedas() {
        mon100 = PanelComprador.comprador.getCantidadMonedas(100);
        mon500 = PanelComprador.comprador.getCantidadMonedas(500);
        mon1000 = PanelComprador.comprador.getCantidadMonedas(1000);
        mon1500 = PanelComprador.comprador.getCantidadMonedas(1500);
        setLayout(null);
        setBounds(5, 80, 330, 315);
        botonMoneda100 = new JButton();
        botonMoneda500 = new JButton();
        botonMoneda1000 = new JButton();
        botonMoneda1500 = new JButton();
        botonMoneda100.setBounds(50, 120, 70, 70);
        botonMoneda500.setBounds(50, 275, 70, 70);
        botonMoneda1000.setBounds(210, 120, 70, 70);
        botonMoneda1500.setBounds(210, 275, 70, 70);
        moneda100 = new ImageIcon(getClass().getResource("/imagenes/monedas/100.png"));
        moneda500 = new ImageIcon(getClass().getResource("/imagenes/monedas/500.png"));
        moneda1000 = new ImageIcon(getClass().getResource("/imagenes/monedas/1000.png"));
        moneda1500 = new ImageIcon(getClass().getResource("/imagenes/monedas/1500.png"));
        botonMoneda100.setIcon(new ImageIcon(moneda100.getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH)));
        botonMoneda500.setIcon(new ImageIcon(moneda500.getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH)));
        botonMoneda1000.setIcon(new ImageIcon(moneda1000.getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH)));
        botonMoneda1500.setIcon(new ImageIcon(moneda1500.getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH)));
        add(botonMoneda100);
        add(botonMoneda500);
        add(botonMoneda1000);
        add(botonMoneda1500);
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton) e.getSource();
                if (b == botonMoneda100) {
                    valorMonedaSeleccionada = 100;
                    
                } else if (b == botonMoneda500) {
                    valorMonedaSeleccionada = 500;
                    
                } else if (b == botonMoneda1000) {
                    valorMonedaSeleccionada = 1000;
                    
                } else if (b == botonMoneda1500) {
                    valorMonedaSeleccionada = 1500;
                    
                }
                seleccionarMoneda(valorMonedaSeleccionada);
            }
        };
        
        botonMoneda100.addActionListener(listener);
        botonMoneda500.addActionListener(listener);
        botonMoneda1000.addActionListener(listener);
        botonMoneda1500.addActionListener(listener);
        setOpaque(false);

    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(213,203,245));
        g.setFont(new Font("Arial", Font.BOLD, 15));
        g.drawString("Cantidad: "+ mon100, 40, 205);
        g.drawString("Cantidad: " + mon500, 40, 360);
        g.drawString("Cantidad: "+ mon1000, 200, 205);
        g.drawString("Cantidad: " + mon1500, 200, 360);
        g.setFont(new Font("Arial", Font.PLAIN, 20));
        g.drawString("$100", 60, 115);
        g.drawString("$500", 60, 270);
        g.drawString("$1000", 215, 115);
        g.drawString("$1500", 215, 270);
    }
    public void seleccionarMoneda(int precio){
        monedaSeleccionada = PanelComprador.comprador.getMonedaSeleccionada(precio);
        if (ventanaabierta == true) {
            ventanaMonedaSeleccionada.dispose();
            ventanaabierta = false;
        }
        ventanaMonedaSeleccionada = new VentanaMonedaSeleccionada(monedaSeleccionada);
        ventanaabierta = true;
    }
    public Moneda getMonedaSelecc(){
        return monedaSeleccionada;
    }
    public int getValorMonedaSeleccionada(){
        
        return valorMonedaSeleccionada;
    }
}

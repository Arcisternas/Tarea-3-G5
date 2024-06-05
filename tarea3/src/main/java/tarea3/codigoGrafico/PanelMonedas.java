package tarea3.codigoGrafico;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
public class PanelMonedas extends JPanel{
    private JButton botonMoneda100;
    private JButton botonMoneda500;
    private JButton botonMoneda1000;
    private JButton botonMoneda1500;
    private ImageIcon moneda100;
    private ImageIcon moneda500;
    private ImageIcon moneda1000;
    private ImageIcon moneda1500;
    public PanelMonedas() {
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
        setOpaque(false);

    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(213,203,245));
        g.setFont(new Font("Arial", Font.BOLD, 15));
        g.drawString("Cantidad: ", 40, 205);
        g.drawString("Cantidad: ", 40, 360);
        g.drawString("Cantidad: ", 200, 205);
        g.drawString("Cantidad: ", 200, 360);
        g.setFont(new Font("Arial", Font.PLAIN, 20));
        g.drawString("$100", 60, 115);
        g.drawString("$500", 60, 270);
        g.drawString("$1000", 215, 115);
        g.drawString("$1500", 215, 270);
    }
}

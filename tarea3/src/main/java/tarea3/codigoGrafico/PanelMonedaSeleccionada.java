package tarea3.codigoGrafico;

import javax.swing.*;
import java.awt.*;
import tarea3.codigoInterno.Monedas.*;

public class PanelMonedaSeleccionada extends JPanel {
    private Moneda monedaSeleccionada;
    private Image moneda;
    public PanelMonedaSeleccionada(Moneda monedaSeleccionada){ 
        this.monedaSeleccionada = monedaSeleccionada;
        if (monedaSeleccionada.getValor() == 100) {
            moneda = new ImageIcon(getClass().getResource("/imagenes/monedas/100.png")).getImage();
        }
        else if (monedaSeleccionada.getValor() == 500) {
            moneda = new ImageIcon(getClass().getResource("/imagenes/monedas/500.png")).getImage();
        }
        else if (monedaSeleccionada.getValor() == 1000) {
            moneda = new ImageIcon(getClass().getResource("/imagenes/monedas/1000.png")).getImage();
        }
        else if (monedaSeleccionada.getValor() == 1500) {
            moneda = new ImageIcon(getClass().getResource("/imagenes/monedas/1500.png")).getImage();
        }
        setBackground(new Color(213,203,245));
        setLayout(new BorderLayout());
        setBounds(0, 0, 250, 250);
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setFont(new Font("Arial", Font.BOLD, 15));
        g.drawString("Valor: " + monedaSeleccionada.getValor(), 75, 135);
        g.drawImage(moneda, 65, 35,100,100, this);
    }
}

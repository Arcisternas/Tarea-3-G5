package tarea3.codigoGrafico;

import javax.swing.*;
import tarea3.codigoInterno.Monedas.*;

/**
 * Jframe con una Ventana de la moneda que fue seleccionada previamente
 * @author Ariel Cisternas
 */

public class VentanaMonedaSeleccionada extends JFrame{
    public VentanaMonedaSeleccionada(Moneda monedaSeleccionada){
        super();
        setLayout(null);
        setBounds(5, 80, 250, 250);
        this.setTitle("Moneda Seleccionada");
        this.setResizable(false);
        this.setVisible(true);
        PanelMonedaSeleccionada pm = new PanelMonedaSeleccionada(monedaSeleccionada);
        this.add(pm);
    }
}

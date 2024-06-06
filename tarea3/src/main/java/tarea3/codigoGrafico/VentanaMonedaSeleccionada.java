package tarea3.codigoGrafico;

import javax.swing.*;
import java.awt.*;
import tarea3.codigoInterno.Monedas.*;

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

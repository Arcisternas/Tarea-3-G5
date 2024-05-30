package tarea3.codigoGrafico;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    public Ventana(){
        super();
        this.setTitle("Maquina Expendedora");
        PanelPrincipal pp = new PanelPrincipal();
        setContentPane(pp);

        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setVisible(true);
    }
}

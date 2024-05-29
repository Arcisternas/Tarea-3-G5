package tarea3.codigoGrafico;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    public Ventana(){
        super();
        this.setTitle("Maquina Expendedora");
        PanelExpendedor pe = new PanelExpendedor("/imagenes/ventana/base.png");
        setContentPane(pe);

        this.setLayout(new BorderLayout());
        this.setForeground((Color.WHITE));

        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800,600);
        this.setVisible(true);
    }
}

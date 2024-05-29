package tarea3.codigoGrafico;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    public Ventana(){
        super();
        this.setTitle("Maquina Expendedora");
        this.setLayout(new BorderLayout());


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400,300);
        this.setVisible(true);
    }
}

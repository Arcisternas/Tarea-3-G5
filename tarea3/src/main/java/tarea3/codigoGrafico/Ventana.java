package tarea3.codigoGrafico;

import javax.swing.*;
import java.awt.*;

/**
 * Jframe de Ventana donde se dibuja todo lo que es la expendedora y el comprador
 * @author Maria Jesus Olivares
 */

public class Ventana extends JFrame {
    public Ventana(){
        super();
        this.setLayout(new BorderLayout());
        this.setTitle("Maquina Expendedora");
        PanelPrincipal pp = new PanelPrincipal();
        this.add(pp,BorderLayout.CENTER);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1000,789);
        this.setResizable(false);
        this.setVisible(true);
        
    }
}

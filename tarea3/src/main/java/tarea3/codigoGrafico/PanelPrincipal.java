package tarea3.codigoGrafico;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {//se ve en el centro de la ventana
    private PanelComprador com;
    private PanelExpendedor exp;
  
    public PanelPrincipal () {
        setSize(1000, 750);
        com = new PanelComprador();
        exp = new PanelExpendedor(com);
        setLayout(new BorderLayout());
        this.add(com, BorderLayout.CENTER);
        this.add(exp, BorderLayout.CENTER);
        setOpaque(false);

    }
    @Override
    public void paintComponent (Graphics g) { //todo se dibuja a partir de este método
        super.paintComponent(g); //llama al método paint al que hace override en la super clase
        com.paintComponent(g); //llama al metodo paintComponent definido en el PanelComprador
        exp.paintComponent(g); //llama al metodo paintComponent definido en el PanelExpendedor
    }
}

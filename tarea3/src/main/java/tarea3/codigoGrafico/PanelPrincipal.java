package tarea3.codigoGrafico;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {//se ve en el centro de la ventana
    private PanelComprador com;
    private PanelExpendedor exp;
    JPanel panelPrincipal = new JPanel();
  
    public PanelPrincipal () {
        exp = new PanelExpendedor();
        this.setBackground(Color.white);
        com = new PanelComprador();
        this.add(exp);
        this.add(com);
    }
    @Override
    public void paintComponent (Graphics g) { //todo se dibuja a partir de este método
        super.paintComponent(g); //llama al método paint al que hace override en la super clase
        com.paintComponent(g); //llama al metodo paintComponent definido en el PanelComprador
        exp.paintComponent(g); //llama al metodo paintComponent definido en el PanelExpendedor
    }
}

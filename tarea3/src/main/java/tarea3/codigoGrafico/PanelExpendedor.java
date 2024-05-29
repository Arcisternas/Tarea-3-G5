package tarea3.codigoGrafico;

import java.awt.*;
import javax.swing.*;

public class PanelExpendedor extends JPanel {
    private Image fondoBase;

    public PanelExpendedor(String resource){
        fondoBase = new ImageIcon(getClass().getResource(resource)).getImage();
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(fondoBase, 0, 0, getWidth(), getHeight(), this);
    }

}

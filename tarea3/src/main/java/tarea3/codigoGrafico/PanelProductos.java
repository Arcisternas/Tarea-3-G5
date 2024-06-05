package tarea3.codigoGrafico;

import tarea3.codigoInterno.*;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class PanelProductos extends JPanel {
    private Deposito<ImageIcon> Coca;
    private Deposito<ImageIcon> Sprite;
    private Deposito<ImageIcon> Fanta;
    private Deposito<ImageIcon> Snickers;
    private Deposito<ImageIcon> Super8;
    
    public PanelProductos(){
        this.Coca = new Deposito<>();
        this.Sprite = new Deposito<>();
        this.Fanta  = new Deposito<>();
        this.Snickers = new Deposito<>();
        this.Super8 = new Deposito<>();

        for (int i = 0; i < 6; i++) {
            
            Coca.add(new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/productos/coca.png")).getImage()));
            Sprite.add(new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/productos/sprite.png")).getImage()));
            Fanta.add(new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/productos/fanta.png")).getImage()));
            Snickers.add(new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/productos/snickers.png")).getImage()));
            Super8.add(new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/productos/super8.png")).getImage()));
            
        }
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        int x1 = 455;
        int x2 = 590;
        int x3 = x1;
        int x4 = x2;
        int x5 = x1;

        for(int i = 0; i < 6 ;i++){
            if(Coca.size() > i){
                Image image = Coca.getP(i).getImage();
                g.drawImage(image, x1, 155, 60, 60, this);
                x1 += 20;
            }
            if(Sprite.size() > i){
                Image image = Sprite.getP(i).getImage();
                g.drawImage(image, x2, 155, 60, 60, this);
                x2 += 20;
            }
            if(Fanta.size() > i){
                Image image = Fanta.getP(i).getImage();
                g.drawImage(image, x3, 225, 60, 60, this);
                x3 += 20;
            }
           if(Snickers.size() > i){
                Image image = Snickers.getP(i).getImage();
                g.drawImage(image, x4, 225, 60, 60, this);
                x4 += 20;
            }
            if(Super8.size() > i){
                Image image = Super8.getP(i).getImage();
                g.drawImage(image, x5, 296, 60, 60, this);
                x5 += 20;
            }
        }
        
    }
    public void getImagenProducto(int num){
        switch (num) {
            case 1:
                Coca.get();
                break;
            
            case 2:
                Sprite.get();
                break;

            case 3:
                Fanta.get();
                break;

            case 4:
                Snickers.get();
                break;

            case 5:
                Super8.get();
                break;

            default:
                break;
        }
    }
}

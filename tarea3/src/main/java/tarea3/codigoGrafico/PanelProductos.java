package tarea3.codigoGrafico;

import tarea3.codigoInterno.*;
import tarea3.codigoInterno.Monedas.Moneda;

import javax.swing.*;
import java.awt.*;

/**
 * Clase(Panel) de los Productos para Visualizarlos en la maquina expendedora
 * @author Maria Jesus Olivares
 */

public class PanelProductos extends JPanel {
    //Depositos
    private Deposito<ImageIcon> Coca;
    private Deposito<ImageIcon> Sprite;
    private Deposito<ImageIcon> Fanta;
    private Deposito<ImageIcon> Snickers;
    private Deposito<ImageIcon> Super8;
    //auxiliares para detectar compra, si dibujar un producto y el numero correspondiente
    private boolean compra;
    private boolean dibujar;
    private int num;
    
    /**
     * Constructor donde se dibujan los productos en el expendedor
     * @param exp
     */
    public PanelProductos(Expendedor exp){
        this.compra = false;
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
        int xfijo = 570;
        int yfijo = 613;

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
        if(dibujar){    //si dibujar es true, en la base de la maquina, se dibuja el producto entregado
            switch (num) {
                case 1:
                    Image dibujo = (new ImageIcon(getClass().getResource("/imagenes/productos/coca.png")).getImage());
                    g.drawImage(dibujo, xfijo, yfijo, 60, 60, this);
                    
                    break;
                case 2:
                    dibujo = (new ImageIcon(getClass().getResource("/imagenes/productos/sprite.png")).getImage());
                    g.drawImage(dibujo, xfijo, yfijo, 60, 60, this);
                   
                    break;
                case 3:
                    dibujo = new ImageIcon(getClass().getResource("/imagenes/productos/fanta.png")).getImage();
                    g.drawImage(dibujo, xfijo, yfijo, 60, 60, this);
                    
                    break;
                case 4:
                    dibujo = new ImageIcon(getClass().getResource("/imagenes/productos/snickers.png")).getImage();
                    g.drawImage(dibujo, xfijo, yfijo, 60, 60, this);
                    
                    break;
                case 5:
                    dibujo = new ImageIcon(getClass().getResource("/imagenes/productos/super8.png")).getImage();
                    g.drawImage(dibujo, xfijo, yfijo, 60, 60, this);
                    
                    break;
            
                default:
                    break;
            }
        }
    }
    /**
     * Metodo que se utiliza para comprar los productos
     * @param num int del panel numerico
     * @param selecc Moneda seleccionada para pagar
     */
    public void getImagenProducto(int num, Moneda selecc){
        this.num = num;
        switch (num) {
            case 1:
                if(Coca.size() != 0 && (selecc.getValor() >= LosProductos.COCACOLA.getPrecio())){
                    Coca.get();
                    compra = true; //compra efectiva
                    dibujar = true; //se dibuja
                }
                break;
            
            case 2:
                if(Sprite.size() != 0 && (selecc.getValor() >= LosProductos.SPRITE.getPrecio())){
                    Sprite.get();
                    compra = true;
                    dibujar = true;
                } 
                break;

            case 3:
                if(Fanta.size() != 0 && (selecc.getValor() >= LosProductos.FANTA.getPrecio())){
                    Fanta.get();
                    compra = true;
                    dibujar = true;
                } 
                break;

            case 4:
                if(Snickers.size() != 0 && (selecc.getValor() >= LosProductos.SNICKERS.getPrecio())){
                    Snickers.get();
                    compra = true;
                    dibujar = true;
                }
                break;

            case 5:
                if(Super8.size() != 0 && (selecc.getValor() >= LosProductos.SUPER8.getPrecio())){
                    Super8.get();
                    compra = true;
                    dibujar = true;
                }
                break;

            default:
                break;
        }
    }
    /**
     * Metodo que retorna un booleano si se compra y se reinicia su valor
     * @return boolean de seCompra
     */
    public boolean seCompra(){
        boolean se = compra;
        compra = false;
        return se;
    }
    /**
     * Metodo que retorna un booleano si se dibuja y se reinicia su valor
     * @return boolean de seDibuja
     */
    public boolean seDibuja(){
        boolean se = dibujar;
        dibujar = false;
        return se;
    }
}

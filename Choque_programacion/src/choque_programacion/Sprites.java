package choque_programacion;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class Sprites {
    private Image imgfinal;
    private int x;
    private int y;
    private int dx;
    private int numero;
    private Timer timer;
    public Sprites(){
        x=200;
        y=200;
        dx=800;
        numero=1;
    }
    public void SegundoPersonaje(){
        if(numero<6){
            numero++;
        }
        else{
            numero=0;
        }
        ImageIcon sprite2 = new ImageIcon(this.getClass().getResource("/frames/"+numero+" inversa.jpg"));
        imgfinal = sprite2.getImage();
        
    }
    public void PrimerPersonaje(){
        if(numero<6){
            numero++;
        }
        else{
            numero=0;
        }
        ImageIcon sprite1 = new ImageIcon(this.getClass().getResource("/frames/"+numero+".jpg"));
        imgfinal = sprite1.getImage();
        
    }
    public void ManchaSangre(){
        ImageIcon mancha= new ImageIcon(this.getClass().getResource("/frames/mancha sangre.jpg"));
        imgfinal= mancha.getImage();
    }
    public void Moverprimero(){
        if(x>=1200){
            x=0;
        }
        else{
            x+=10;
        }
    }
    
    public void Moversegundo(){
        if(dx<=0 ){
            dx=1200;
        }
        else{
            dx-=10;
        }
    }
    public void Comprobarchoque(JPanel pa,Timer timer){
        if(dx==(x+300) ){
            Label la =new Label("CHOQUE");
            la.setLocation(500,250);
            la.setForeground(Color.red);
            la.setBackground(Color.black);
            la.setFont(new Font("calibri",1,20));
            la.setSize(200, 150);
            pa.add(la);
            Detenerimagenes(timer);
        }
    }
    public void Detenerimagenes(Timer t){
            t.stop();
    }
            
    public Image getImage(){
        return imgfinal;
    }
    public int getx(){
        return x;
    }
    
    public int gety(){
        return y;
    }
    public int getdx(){
        return dx;
    }

}

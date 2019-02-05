package choque_programacion;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class imagenes extends JPanel implements ActionListener{
    private final Sprites Persona1;
    private final Sprites Persona2;
    private final Sprites mancha;
    private final Timer timer;
    public imagenes(){
        Persona1 = new Sprites();
        
        
        Persona2 = new Sprites();
        
        mancha= new Sprites();
        
        timer = new Timer(70, this);
        timer.start();
        this.setBackground(Color.white);
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Persona1.PrimerPersonaje();
        Persona2.SegundoPersonaje();
        mancha.ManchaSangre();
        Graphics2D g2d = (Graphics2D)g;
        g2d.drawImage(Persona1.getImage(), Persona1.getx(),Persona1.gety(), this);
        g2d.drawImage(Persona2.getImage(), Persona2.getdx(),Persona2.gety(), this);
        Toolkit.getDefaultToolkit().sync();
        g.dispose();
        Persona1.Moverprimero();
        Persona2.Moversegundo();
        Persona1.Comprobarchoque(this,timer);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        repaint();
    }
}

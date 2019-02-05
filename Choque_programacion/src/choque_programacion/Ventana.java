
package choque_programacion;

import java.awt.Color;
import static java.awt.Color.white;
import javax.swing.JFrame;

public class Ventana extends JFrame{
    
    public Ventana(){
        setSize(1500,800);
        setBackground(white);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Choque Imagenes");
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(true);
        add(new imagenes());
    }
    
    
}

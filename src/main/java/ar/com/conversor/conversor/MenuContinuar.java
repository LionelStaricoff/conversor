
package ar.com.conversor.conversor;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class MenuContinuar {
     private final String [] respuesta ={"si, quiero", "no, gracias"};
     
     public final int menu(String img){
       return  JOptionPane.showOptionDialog(null,  "Queres continuar\n usando el programa","Menu", WIDTH, HEIGHT, new ImageIcon(img), respuesta, null);
           
     }
    
}

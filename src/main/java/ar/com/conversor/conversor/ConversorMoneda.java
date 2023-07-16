
package ar.com.conversor.conversor;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *<p> menu para hacer conversion de monedas</p>
 * @author ellaion
 */
public class ConversorMoneda {
    private int opcion;
    
    private final String [] opcionMenu ={"Pesos Colombanos a Dolar", "Dolar a Pesos Colombianos"};
    
    ConversorMoneda(){
        
         while(this.opcion ==0){
         String menu = (String)JOptionPane.showInputDialog(null,"Menu","Elegir",JOptionPane.QUESTION_MESSAGE,new ImageIcon("/home/ellaion/Documentos/Alura/conversor/src/main/java/ar/com/conversor/img/fondo.jpeg"),this.opcionMenu,this.opcionMenu[0]);
           
         this.opcion = new MenuContinuar().menu("/home/ellaion/Documentos/Alura/conversor/src/main/java/ar/com/conversor/img/fondo.jpeg");
             }
    }
}

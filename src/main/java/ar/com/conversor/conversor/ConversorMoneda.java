
package ar.com.conversor.conversor;

import ar.com.util.Herramientas;
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
    private final float DOLAR = 4000;
    private final float EURO = 4496;
    private final String [] opcionMenu ={"Pesos Colombanos a Dolar", "Dolar a Pesos Colombianos",
                                          "Pesos Colombanos a Euro","Euro a Pesos Colombianos"};
    
    ConversorMoneda(){
        
         while(this.opcion ==0){
         String menu = (String)JOptionPane.showInputDialog(null,"Menu","Elegir",JOptionPane.QUESTION_MESSAGE,new ImageIcon("/home/ellaion/Documentos/Alura/conversor/src/main/java/ar/com/conversor/img/cambioFlecha.jpg"),this.opcionMenu,this.opcionMenu[0]);
             convertirMoneda(menu);
         this.opcion = new MenuContinuar().menu("/home/ellaion/Documentos/Alura/conversor/src/main/java/ar/com/conversor/img/cambio2.jpeg");
             }
    }
    
    public void convertirMoneda(String opcion){
        String img = "/home/ellaion/Documentos/Alura/conversor/src/main/java/ar/com/conversor/img/cambio.jpg";
        switch(opcion){
            case "Pesos Colombanos a Dolar":
                Herramientas.ventanaResultado(opcion,Herramientas.ventanaIngreseValor() / this.DOLAR,img);
               break;
                
            case "Dolar a Pesos Colombianos":
                Herramientas.ventanaResultado(opcion,Herramientas.ventanaIngreseValor() * this.DOLAR,img);
                break;
                
                 case "Pesos Colombanos a Euro":
                Herramientas.ventanaResultado(opcion,Herramientas.ventanaIngreseValor() / this.EURO,img);
                break;
                
                 case "Euro a Pesos Colombianos":
                Herramientas.ventanaResultado(opcion,Herramientas.ventanaIngreseValor() * this.EURO,img);
                break;
            default :
                 JOptionPane.showMessageDialog( null,"Opsion incorrecta");
        }
        
    }
    
    
  
    
    
 
}


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
        switch(opcion){
            case "Pesos Colombanos a Dolar":
                ventanaResultado(opcion,ventanaIngreseValor() / this.DOLAR);
               break;
                
            case "Dolar a Pesos Colombianos":
                ventanaResultado(opcion,ventanaIngreseValor() * this.DOLAR);
                break;
                
                 case "Pesos Colombanos a Euro":
                ventanaResultado(opcion,ventanaIngreseValor() / this.EURO);
                break;
                
                 case "Euro a Pesos Colombianos":
                ventanaResultado(opcion,ventanaIngreseValor() * this.EURO);
                break;
            default :
                 JOptionPane.showMessageDialog( null,"Opsion incorrecta");
        }
        
    }
     /**
     * <p> ventana para mostrar el resultado</p>
     */
    public void ventanaResultado(String titulo,float numero){
        JOptionPane.showMessageDialog(null,"El resultado es\n" +numero,titulo, HEIGHT, new ImageIcon("/home/ellaion/Documentos/Alura/conversor/src/main/java/ar/com/conversor/img/cambio.jpg"));
    }
    
    /**
     * <p> ventana para ingresar el valor para procesar</p>
     */
    public float ventanaIngreseValor(){
         int resultado = 0;
         String dato;
         boolean validar = true;
        while(validar){
          //  Component parentComponent,
      //  Object message, String title, int messageType, Icon icon
          dato = JOptionPane.showInputDialog("ingresa el valor a convertir");
      if(Herramientas.isNumber(dato) ){
         resultado =  Integer.parseInt(dato);
         validar = false;
      }else{
          JOptionPane.showMessageDialog( null,"error , ingrese solo numeros");
      }
        }
      return resultado;
    }
    
    
 
}


package ar.com.util;

import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *<h1> clase para utilidades varias </h1>
 * @author ellaion
 */
public class Herramientas {
    
    
    
     /**
     * <p> ventana para mostrar el resultado</p>
     */
    public static void ventanaResultado(String titulo,float numero,String img){
        JOptionPane.showMessageDialog(null,"El resultado es\n" +numero,titulo, HEIGHT, new ImageIcon(img));
    }
    
      /**
     * <p> ventana para ingresar el valor para procesar</p>
     */
    public static float ventanaIngreseValor(){
         int resultado = 0;
         String dato;
         boolean validar = true;
        while(validar){
          
          dato = JOptionPane.showInputDialog("Ingresa el valor a convertir");
      if(Herramientas.isNumber(dato) ){
         resultado =  Integer.parseInt(dato);
         validar = false;
      }else{
          JOptionPane.showMessageDialog( null,"error , ingrese solo numeros");
      }
        }
      return resultado;
    }
    
    
    /**
 *<h1> clase para saber si es in numero </h1>
 */
      public static boolean isNumber(String numero){
       return numero.matches("[0-9]*");
   }
    
           /**
 *<h1> clase para hacer test unitarios entre  dos booleanos</h1>
 * 
 */ 
    public void probar(boolean programa,boolean resultado){
        if (programa==resultado){
            System.out.println("paso la prueba");
        }else {
              System.out.println("no paso la prueba");
        }
    }
    
    public void probar(int programa,int resultado){
        if (programa==resultado){
            System.out.println("paso la prueba");
        }else {
              System.out.println("no paso la prueba");
        }
    }
    
    public void probar(String programa,String resultado){
        if (programa==resultado){
            System.out.println("paso la prueba");
        }else {
              System.out.println("no paso la prueba");
        }
    }
}

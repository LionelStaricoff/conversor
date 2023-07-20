
package ar.com.conversor.conversor;

import ar.com.util.Herramientas;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *<h1>Conversor de grados centigrador a Grados Farenheit</h1>
 * @author ellaion
 */
public class GradosCentrigradosAGradosFarenheit {

    private final String img = "/home/ellaion/Documentos/Alura/conversor/src/main/java/ar/com/conversor/img/grados.jpg";
 
     private final String [] opcionMenu ={"Grados Centrigrados a Grados Farenheit",
     "Grados Farenheit a Grados Centrigrados"};
     private int opcion;
    public GradosCentrigradosAGradosFarenheit() {
        
          while(this.opcion ==0){
         String menu = (String)JOptionPane.showInputDialog(null,"Menu","Elegir",JOptionPane.QUESTION_MESSAGE,new ImageIcon(this.img),this.opcionMenu,this.opcionMenu[0]);
            menuMedidas(menu);
         this.opcion = new MenuContinuar().menu(this.img);
             }
    }

    private void menuMedidas(String menu) {
  
         switch(menu){
  
         case "Grados Centrigrados a Grados Farenheit":
                Herramientas.ventanaResultado(menu,Herramientas.ventanaIngreseValor() *1800 +32,this.img);
                break;
         case "Grados Farenheit a Grados Centrigrados":
                Herramientas.ventanaResultado(menu,convertirFarenheitACentrigrados(Herramientas.ventanaIngreseValor()) ,this.img);
                break;
            default :
                 JOptionPane.showMessageDialog( null,"Opsion incorrecta");
         }
    }
    
    public float convertirFarenheitACentrigrados(float numero){
  
        return (numero-32) / 1800;
    }
}


package ar.com.conversor.conversor;

import ar.com.util.Herramientas;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *<h1>Clase para conversion de medidas, metros, centimetros, milimetros</h1>
 * @author ellaion
 */
public class ConversorDeMedidas {
private final String img = "/home/ellaion/Documentos/Alura/conversor/src/main/java/ar/com/conversor/img/unidadesDeMedida.jpg";
 
     private final String [] opcionMenu ={"Metros a Centimetros","Metros a Milimetros",
         "Centimetros a Metros","Centimetros a Milimetros",
         "Milimetros a Metros", "Milimetros a Centimetros"};
     private int opcion;
    public ConversorDeMedidas() {

           while(this.opcion ==0){
         String menu = (String)JOptionPane.showInputDialog(null,"Menu","Elegir",JOptionPane.QUESTION_MESSAGE,new ImageIcon(this.img),this.opcionMenu,this.opcionMenu[0]);
            menuMedidas(menu);
         this.opcion = new MenuContinuar().menu(this.img);
             }
    }

    /**
     * <p>Metodo para el menu de medidas</p>
     * @param menu 
     */
    private void menuMedidas(String menu) {
        switch(menu){
        
          case "Metros a Centimetros":
                Herramientas.ventanaResultado(menu,Herramientas.ventanaIngreseValor() * 100,this.img);
                break;
          case "Metros a Milimetros":
                Herramientas.ventanaResultado(menu,Herramientas.ventanaIngreseValor() * 1000,this.img);
                break;
          case "Centimetros a Metros":
                Herramientas.ventanaResultado(menu,Herramientas.ventanaIngreseValor() / 100,this.img);
                break;
          case "Centimetros a Milimetros":
                Herramientas.ventanaResultado(menu,Herramientas.ventanaIngreseValor() * 10,this.img);
                break;
          case "Milimetros a Metros":
                Herramientas.ventanaResultado(menu,Herramientas.ventanaIngreseValor() / 1000,this.img);
                break;
          case "Milimetros a Centimetros":
                Herramientas.ventanaResultado(menu,Herramientas.ventanaIngreseValor() / 10,this.img);
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
}

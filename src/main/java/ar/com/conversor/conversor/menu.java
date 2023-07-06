
package ar.com.conversor.conversor;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author ellaion
 */
public class menu extends JFrame{
    private int opcion;
    // JLabel ventana;
     String [] respuesta ={"si, quiero", "no, gracias"};
      String [] opcionMenu ={"conversor de moneda", "clima"};
    String img = "/src/main/java/ar/com/conversor/img/fondo.jpeg";
    
    
    public menu(){
     /*   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
        setTitle("Menu Principal"); 
*/

       // ventana = new JLabel();

       // ventana.setIcon(new ImageIcon(this.img));
        
        //add(this.ventana);
        
             while(this.opcion ==0){
                 
            
            String menu = ""+JOptionPane.showInputDialog(null,"Menu","Elegir",JOptionPane.QUESTION_MESSAGE,null,this.opcionMenu,this.opcionMenu[0]);
                 System.out.println(menu);
            this.opcion = JOptionPane.showOptionDialog(rootPane, null, "Queres continuar usando el programa", WIDTH, HEIGHT, null, respuesta, EXIT_ON_CLOSE);
           
             }
        
    }
}

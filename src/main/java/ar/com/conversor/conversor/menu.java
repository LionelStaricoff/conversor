
package ar.com.conversor.conversor;


import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author ellaion
 */
public class menu {
    private int opcion;
     private final String [] opcionMenu ={"Conversor de Moneda", 
         "Encriptador de Contraseña", "Conversor de Medidas", "Consulta de Peso", 
         "Conversor de Grados Centrigrados a Grados Farenheit"};

    
    
    public menu(){
     


      
        
             while(this.opcion ==0){
                 
            
           String menu = (String)JOptionPane.showInputDialog(null,"Menu","Elegir",JOptionPane.QUESTION_MESSAGE,new ImageIcon("/home/ellaion/Documentos/Alura/conversor/src/main/java/ar/com/conversor/img/fondo.jpeg"),this.opcionMenu,this.opcionMenu[0]);
                 eleccionDelMenu(menu);
            this.opcion = new MenuContinuar().menu("/home/ellaion/Documentos/Alura/conversor/src/main/java/ar/com/conversor/img/fondo.jpeg");
        
             }
        
    }
    public void eleccionDelMenu(String opcionMenu){
        switch(opcionMenu){
          
            case  "Conversor de Moneda":
                new ConversorMoneda();   
                break;
                
            case "Encriptador de Contraseña":
                new EncriptadorDeContraseña();
                break;
                
            case "Conversor de Medidas":
                new ConversorDeMedidas();
                break;
                
                
                default:
                    System.exit(0);
        }
        
    }
}
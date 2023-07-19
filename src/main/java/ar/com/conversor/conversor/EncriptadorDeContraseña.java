
package ar.com.conversor.conversor;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author ellaion
 */
public class EncriptadorDeContraseña {

     private final String [] opcionMenu ={"Encriptar clave","Desencriptar clave"};
     private int opcion;
    
     public EncriptadorDeContraseña() {
         
           while(this.opcion ==0){
         String menu = (String)JOptionPane.showInputDialog(null,"Menu","Elegir",JOptionPane.QUESTION_MESSAGE,new ImageIcon("/home/ellaion/Documentos/Alura/conversor/src/main/java/ar/com/conversor/img/desencriptado3d.jpg"),this.opcionMenu,this.opcionMenu[0]);
            menuClaves(menu);
         this.opcion = new MenuContinuar().menu("/home/ellaion/Documentos/Alura/conversor/src/main/java/ar/com/conversor/img/encriptar.jpg");
             }
    }

    private void menuClaves(String menu) {
        int clipboard;
        String frase;
        switch(menu){
            
            case "Encriptar clave":
              frase =  encriptar();
              clipboard = JOptionPane.showConfirmDialog(null,frase,"Copiar al clipboard?", JOptionPane.YES_NO_CANCEL_OPTION);
               if(clipboard==0) copiarAlClipBoard(frase);
              break;
            case "Desencriptar clave":
                frase = desencriptar();
               clipboard = JOptionPane.showConfirmDialog( null,frase,"Copiarlo al clipboard?", JOptionPane.YES_NO_CANCEL_OPTION);
               if(clipboard==0) copiarAlClipBoard(frase);
               break;
            default :
                 JOptionPane.showMessageDialog( null,"Opsion incorrecta");
        }
         }

    private String encriptar() {
       
      String dato = JOptionPane.showInputDialog("Ingresa la frase a Encriptar");
     dato = dato.toLowerCase();
     dato = dato.replaceAll("a", "ai");
     dato = dato.replaceAll("e", "enter");
     dato = dato.replaceAll("i", "imes");
     dato = dato.replaceAll("o", "ober");
     dato = dato.replaceAll("u", "ufat");
      return dato;
    }

    private String desencriptar() {
            String dato = JOptionPane.showInputDialog("Ingresa la frase a Desencriptar");
      dato = dato.toLowerCase();
      dato = dato.replaceAll("ai","a");
      dato = dato.replaceAll( "enter","e");
      dato =dato.replaceAll("imes","i");
      dato =dato.replaceAll("ober","o");
      dato = dato.replaceAll("ufat","u");
      return dato;
      }

    private void copiarAlClipBoard(String frase) {
    
        StringSelection selection = new StringSelection(frase);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, selection);
    }
    
}


package ar.com.util;

/**
 *<h1> clase para utilidades varias </h1>
 * @author ellaion
 */
public class Herramientas {
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

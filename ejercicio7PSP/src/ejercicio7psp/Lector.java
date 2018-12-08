
package ejercicio7psp;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Lector extends Thread{
    
    private Buzon buzon;

    public Lector(Buzon buzon) {
        this.buzon = buzon;
    }
    
    /**
     * Neste fio creamos un bucle que chama 5 veces ao método ler da clase Buzón
     */

    @Override
    public void run() {
         
        for(int i = 0; i<5 ; i++){
            try {
                buzon.ler();
            } catch (InterruptedException ex) {
                Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    
    
}

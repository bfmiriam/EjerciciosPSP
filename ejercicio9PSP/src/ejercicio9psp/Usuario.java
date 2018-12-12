
package ejercicio9psp;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Usuario extends Thread{
    
    public int piso;
    public Ascensor ascensor;

    public Usuario(int piso, Ascensor ascensor) {
        this.piso = piso;
        this.ascensor = ascensor;
    }
    
    /**
     * El usuario pide el ascensor desde la planta en la que se encuentra
     */
    @Override
    public void run() {
        
        try {
            ascensor.pedirAscensor(piso);
        } catch (InterruptedException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
}

package ejercicio7psp;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Escritor extends Thread {

    private Buzon buzon;

    public Escritor(Buzon buzon) {
        this.buzon = buzon;
    }

    /**
     * Neste fio creamos un bucle que chama 5 veces ao método escribir da clase Buzón
     */
    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            try {
                buzon.escribir();
            } catch (InterruptedException ex) {
                Logger.getLogger(Escritor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}

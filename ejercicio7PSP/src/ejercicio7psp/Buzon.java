package ejercicio7psp;

import javax.swing.JOptionPane;

public class Buzon {
    
    private boolean cheo = false;
    private String mensaxe;

    /**
     * Creamos un método sincronizado para escribir a mensaxe. Polo tanto se xa 
     * hay unha mensaxe no buzon non nos permite escribir unha nova. Se non hai 
     * mensaxes, escribímola.
     * @throws InterruptedException 
     */
    public synchronized void escribir() throws InterruptedException {
        
        if(cheo == true){
            wait();
        }
        mensaxe = String.valueOf(JOptionPane.showInputDialog("Escriba a mensaxe:"));
        cheo = true;
         notify();
    }
    /**
     * método sincronizado para ler mensaxes. Se o buzon esta baleiro non permite
     * leer. Polo contrario, se está cheo, mostra a mensaxe escrita.
     * @throws InterruptedException 
     */
    
    public synchronized void ler() throws InterruptedException {
        
        if(cheo == false){
            wait();
        }
        JOptionPane.showMessageDialog(null, mensaxe);
        cheo = false;
        notify();
    }

}


package ejercicio2psp;


public class Fio extends Thread {
    
    public String nombre;

    public Fio(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Este método sobrescribe o método run()
     * Creamos un bucle que itera 5 veces, e en cada volta mostra o seu nome, 
     * número de iteración e antes de dar a seguinte volta, dúrmese durante un
     * segundo
     */
    @Override
    public void run() {
   
        System.out.println(nombre + " comeza...");
        for (int i = 1; i <= 5; i++) {
            System.out.println(nombre + "--> " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("error");
            }

        }
        System.out.println(nombre + " termina...");
    }
    
    
    
}

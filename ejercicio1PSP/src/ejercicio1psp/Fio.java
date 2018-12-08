package ejercicio1psp;

public class Fio extends Thread {

    public String nombre;

    
    public Fio(String nombre) {
        super(nombre);
        this.nombre = nombre;
    }
    
    /**
     *Este método sobrescribe o método run()
     * Creamos un bucle que itera 10 veces collendo o nome do fío e mostrando o
     * número de iteración correspondente, unha vez mostrada a mensaxe dúrmese 
     * durante unha cantidade de tempo aleatorio. Imprime unha mensaxe cando 
     * remata o fío 
     */
    @Override
    public void run() {
        System.out.println(nombre + " comeza...");
        for (int i = 1; i <= 10; i++) {
            System.out.println(nombre + "--> " + i);
            try {
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                System.out.println("error");
            }

        }
        System.out.println(nombre + " termina...");

    }
}

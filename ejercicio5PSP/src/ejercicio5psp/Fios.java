package ejercicio5psp;

public class Fios extends Thread {

    String nome;

    public Fios(String nome) {
        this.nome = nome;
    }
    /**
     * Simplemente mostrará unha mensaxe que indica o nome do fío
     */
    @Override
    public void run() {

        System.out.println("Ola, son o fío número " + nome);

    }

}

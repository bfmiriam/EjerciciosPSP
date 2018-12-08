package ejercicio3psp;

public class Fio extends Thread {

    static int c;

    public Fio(int c){
        this.c = c;
    }
    /**
     * Comezamos executando o fío pai e iterándoo 10 veces nun bucle cun intervalo
     * de tempo aleatorio. Unha vez iterado creamos un fio fillo dentro do mesmo
     * bucle e bloqueamos o fio pai con un join para que non amose a mensaxe final
     * ata que o fillo termine de executarse. Así faremos o mesmo 4 veces para ter
     * os 5 fíos
     */
    public void run() {

        try {
            System.out.println("Empieza hilo " + c);
            for (int i = 0; i < 10; i++) {
                sleep((long) ((Math.random() * (600)) + 100));
                System.out.println("hilo" + c + "-->" + i);
                if (i == 9 && c <= 4) {

                    c++;
                    Fio hiloHijo = new Fio(c);
                    hiloHijo.start();
                    hiloHijo.join();
                }
            }
            System.out.println("El hilo " + c + " ha terminado");
            c--;
        } catch (InterruptedException ex) {
            System.out.println("Error: " + ex);

        }
    }
}

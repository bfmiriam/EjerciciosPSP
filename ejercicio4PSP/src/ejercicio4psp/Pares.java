package ejercicio4psp;

public class Pares extends Thread {

    /**
     * Creamos o primeiro fio e facemos un bucle que suma nun acumulador todos os
     * números pares do 0 ao 1000
     */
    @Override
    public void run() {

        int sumPar = 0;
        for (int j = 0; j <= 1000; j++) {
            if (j % 2 == 0) {
                sumPar = sumPar + j;
            }
        }
        System.out.println("Suma de los 1000 primeros números pares :" + sumPar);

    }

}

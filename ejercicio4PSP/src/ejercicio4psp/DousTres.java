package ejercicio4psp;

public class DousTres extends Thread {

    /**
     * Creamos o terceiro fio e facemos un bucle que suma nun acumulador todos os
     * números rematados en 2 ou 3
     */
    @Override
    public void run() {
        
        int sum = 0;
        for (int n = 0; n <= 1000; n++) {
            if ((n % 10 == 2) || (n % 10 == 3)) {
                sum = sum + n;

            }
        }
        System.out.println("Suma de los 1000 primeros números terminados en 2-3 : " + sum);

    }

}

package ejercicio4psp;

public class Impares extends Thread {

    /**
     * Creamos o segundo fio e facemos un bucle que suma nun acumulador todos os
     * números impares do 0 ao 1000
     */
    @Override
    public void run() {
        
        int sumImp = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 != 0) {
                sumImp = sumImp + i;
            }
        }
        System.out.println("Suma de los 1000 primeros números impares : " + sumImp);
    }

}

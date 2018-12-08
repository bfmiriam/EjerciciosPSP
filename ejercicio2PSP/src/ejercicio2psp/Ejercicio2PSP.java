
package ejercicio2psp;


public class Ejercicio2PSP {

    /**
     * Programa que crea 4 fíos, os executa e espera a que estes terminen. Os 
     * fíos escriben 5 veces o número de iteración do bucle e o seu nome. En 
     * cada iteración, despois de escribir o seu nome, bloquéanse durante un 
     * segundo e volven a estar dispoñibles para a súa execución.
     */
    
    public static void main(String[] args) {

        //Instanciamos os catro fíos
       Fio fio1 = new Fio("Fio 1");
       Fio fio2 = new Fio("Fio 2");
       Fio fio3 = new Fio("Fio 3");
       Fio fio4 = new Fio("Fio 4");
       
       //Iniciamos os catro fíos
       fio1.start();
       fio2.start();
       fio3.start();
       fio4.start();
    }
    
}

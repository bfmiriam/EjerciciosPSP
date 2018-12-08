package ejercicio4psp;

public class Ejercicio4PSP {

    /**
     * Realiza un programa en java que execute tres fíos de forma concurrente.
     * Un de eles debe sumar os números pares del 1 ao 1000, outro os impares, 
     * e outro, os que terminen en dous ou en tres.
     * @param args
     * @throws InterruptedException 
     */
    public static void main(String[] args) throws InterruptedException {

        /**
         * Instanciamos e iniciamos os tres fios que executarán a suma dos pares, impares, 
         * e terminados en 2 e 3
         */
        Pares FioP = new Pares();
        Impares FioImp = new Impares();
        DousTres FioTres = new DousTres();
        FioP.start();
        FioImp.start();
        FioTres.start();
    }

}

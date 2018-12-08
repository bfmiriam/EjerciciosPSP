package ejercicio5psp;

public class Ejercicio5PSP {

    /**
     * Escribe unha clase que cree dous fíos e force que a escritura do segundo
     * sexa sempre anterior á escritura por pantalla do primeiro. Exemplo de
     * ejecución: Ola, son o fío número 2 Ola, son o fío número 1 a) faino con
     * join b )faino con prioridades
     *
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {

        //Instanciamos dous fios
        Fios FioUn = new Fios("1");
        Fios FioDous = new Fios("2");
        /**
         * Iniciamos en primer lugar o fío que queremos que se execute primeiro
         * e asignámoslle un join para que non cambie de fío ata que este
         * termine
         */

        FioDous.start();
        FioDous.join();
        FioUn.start();

        /**
         * Ordenar con prioridade. Non sempre funciona porque o sistema
         * operativo non está obrigado a ter en conta a prioridade do fío, xa
         * que traballa a nivel procesos
         */
        Fios FioTres = new Fios("3");
        Fios FioCatro = new Fios("4");

        FioTres.setPriority(10);    //Maior prioridade
        FioCatro.setPriority(1);    //Menor prioridade

        FioTres.start();
        FioCatro.start();

    }

}

package ejercicio9psp;

public class Ejercicio9PSP {

    /**
     * Desenvolve un programa empregando fíos que simule o comportamento dun
     * ascensor nun edificio de 20 plantas. Cando alguén chama o ascensor desde
     * un piso, irá a ese piso cando poda (se está parado, vai nese intre, se
     * está en marcha, só poderá ir cando teña rematado o seu percorrido, xa
     * sexa de subida ou de baixada). Para poder controlar este movemento,
     * precisamos coñecer cal é o piso no que se atopa o ascensor.
     *
     * @param args
     */
    public static void main(String[] args) {
        
        /**
         * Instanciamos un objeto tipo ascensor y varios hilo tipo usuario para
         * probar el funcionamiento del ascensor
         */
        Ascensor asc = new Ascensor();
        
        Usuario us = new Usuario(4,asc);
        Usuario usu = new Usuario(12,asc);
        Usuario usua = new Usuario(20,asc);
        
        //Iniciamos los hilos
        us.start();
        usu.start();
        usua.start();

    }

}

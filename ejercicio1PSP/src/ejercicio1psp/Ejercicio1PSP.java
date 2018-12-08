package ejercicio1psp;

public class Ejercicio1PSP {

    /* Programa en Java que cree dous fíos e os executa. Os fíos escriben dez veces
    un número de iteración do bucle e seu nome. En cada iteración, despois de 
    escribir o seu nome, se bloquean durante un tempo aleatorio de segundos e
    después volven a estar dispoñibles para a súa execución.*/
    
    public static void main(String[] args) {

        //Instanciamos dous fíos cos nomes correspondentes
        Fio fio1 = new Fio("Fio 1");
        Fio fio2 = new Fio("Fio 2");

        //Iniciamos os dous fíos
        fio1.start();
        fio2.start();

    }

}

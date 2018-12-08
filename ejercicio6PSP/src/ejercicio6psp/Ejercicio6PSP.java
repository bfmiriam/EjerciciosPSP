package ejercicio6psp;

public class Ejercicio6PSP {

    /**
     * Simular a caixa dunha empresa con dous fíos. Un simulará o ingreso, ca
     * compra de artigos por parte de clientes e o outro a extracción de cartos
     * da caixa co pago a proveedores. A conta terá un capital inicial. Realizar
     * 10 ingresos e 5 extraccións.
     *
     * @param args
     */
    public static void main(String[] args) {

        /**
         * Instanciamos un fío para os ingresos e outro para as retiradas e 
         * iniciámolos. A cantidade tanto a ingresar como a retirar vai ser 1.
         */
        Conta conta = new Conta();
        Ingreso ing = new Ingreso(conta,1);
        Retirada ret = new Retirada(conta,1);
        
        ing.start();
        ret.start();

    }

}

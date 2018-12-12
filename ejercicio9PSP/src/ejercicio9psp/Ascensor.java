
package ejercicio9psp;


public class Ascensor {
   private int estacionado =20;
   private boolean ascensorOcupado = false;
    
   /**
    * Si el ascensor está ocupado  esperamos, si no compara el piso en el que nos
    * encontramos, lo compara con la planta en la que está el ascensor, nos indica
    * si está subiendo o bajando, y cambia de planta al ascensor. Cambiamos el
    * boleano para poder volver a pedir es ascensor
    * @param piso
    * @throws InterruptedException 
    */
    public synchronized void ascensorEnMovemento(int piso) throws InterruptedException{
        if(ascensorOcupado==true){
            wait();
        }
        if(piso>estacionado){
            System.out.println("El ascensor está subiendo");
            estacionado = piso;
        }else{
            System.out.println("El ascensor está bajando");
            estacionado = piso;
        }
        System.out.println("Es ascensor ha llegado a la planta " + estacionado );
        ascensorOcupado = false;
        notify();
        
    }
    /**
     * Pedimos el ascensor desde la planta indicada, si el ascensor está en movimiento
     * esperamos, cuando termine nos redirige al metodo "ascensorEnMovemento()"
     * @param piso
     * @throws InterruptedException 
     */
    public synchronized void pedirAscensor(int piso) throws InterruptedException{
        if(ascensorOcupado ==true){
            wait();
        }
        ascensorEnMovemento(piso);
        notify();
        
    }
}

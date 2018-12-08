package ejercicio6psp;

public class Conta {

    private double capital = 1000;
    private boolean retirando = false;
    private boolean ingresando = true;

    /**
     * permite recoller o capital
     * @return 
     */
    public double getCapital() {
        return capital;
    }
    /**
     * permite cambiar o capital
     * @param capital 
     */
    public void setCapital(double capital) {
        this.capital = capital;
    }

    /**
     * Metodo para ingresar diñeiro, sincronizado co método de retirar. Isto 
     * permite que non se poidan facer ambas cousas á vez, impedindo que haxa 
     * erros coa cantidade de capital dispoñible. Se se está retirando espérase,
     * e ao terminar de ingresar notifícase.
     * @param cantidad
     * @throws InterruptedException 
     */
    public synchronized void ingresar(double cantidad) throws InterruptedException {
        ingresando = true;
        while (retirando == true) {
            wait();
        }
        capital = capital + cantidad;
        ingresando = false;
        System.out.println("Saldo: " + capital + " -->INGRESO");
        notify();

    }

     /**
     * Metodo para retirar diñeiro, sincronizado co método de ingresar. Isto 
     * permite que non se poidan facer ambas cousas á vez, impedindo que haxa 
     * erros coa cantidade de capital dispoñible. Se se está ingresando espérase,
     * e ao terminar de retirar notifícase.
     * @param cantidad
     * @throws InterruptedException 
     */
    public synchronized void retirar(double cantidad) throws InterruptedException {
        retirando = true;
        while (ingresando == true) {
            wait();
        }
        capital = capital - cantidad;
        retirando = false;
        System.out.println("Saldo: " + capital + " --> RETIRADA");
        notify();

    }

}

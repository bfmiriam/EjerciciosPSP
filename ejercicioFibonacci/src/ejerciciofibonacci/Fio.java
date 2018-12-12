package ejerciciofibonacci;

public class Fio extends Thread {

    int n1 = 1; 
    int n2 = 1;
    int n3;
    
    public void run() {
        
        System.out.println(n1);
        for (int i = 0; i < 10; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            System.out.println(n1);
        }
    }
}
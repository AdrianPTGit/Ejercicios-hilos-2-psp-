package Ejercicio_1_TIC_TAC;

public class Tic implements Runnable{

    @Override
    public void run() {
        while (true){
            System.out.println("Tic");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

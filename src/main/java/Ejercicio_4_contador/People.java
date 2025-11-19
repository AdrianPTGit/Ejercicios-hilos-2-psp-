package Ejercicio_4_contador;

public class People implements Runnable{
    private  Counter counter;

    public People(Counter counter){
        this.counter = counter;
    }

    public Counter getCounter() {
        return counter;
    }

    public void setCounter(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

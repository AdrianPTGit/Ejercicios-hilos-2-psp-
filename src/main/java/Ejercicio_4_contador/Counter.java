package Ejercicio_4_contador;

public class Counter{

    private int numero=0;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public synchronized int increment(){
        numero++;
        return numero;
    }
}

package Ejercicio_3_dividir_en_hilos;

/**
 * Ejercicio 3: Dividir una operación en hilos
 * El objetivo de este ejercicio es transformar un programa de un solo hilo, que realiza una
 * operación matemática, a un programa multihilo que aprovecha de forma más eficiente un
 * procesador multihilo.
 */

public class Ejercicio_3 implements Runnable{
       private double resultado;
        private int operacion;

    public Ejercicio_3(int operacion) {
        this.operacion = operacion;
    }

    public double getResultado() {
        return resultado;
    }

    public int getOperacion() {
        return operacion;
    }

    @Override
    public void run() {
        if(operacion == 1){
            resultado = 1*2;
        } else if(operacion == 2){
            resultado = 1+2;
        }
    }
}

package Ejercicio_3_dividir_en_hilos;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Ejercicio_3 suma = new Ejercicio_3(2);
        Ejercicio_3 multiplicacion = new Ejercicio_3(1);

        Thread t1 = new Thread(suma);
        Thread t2 = new Thread(multiplicacion);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        double operacion1 = suma.getResultado();
        double operacion2 = multiplicacion.getResultado();

        double resultado = operacion1/operacion2;

        System.out.println("Resultado: " + resultado);
    }
}

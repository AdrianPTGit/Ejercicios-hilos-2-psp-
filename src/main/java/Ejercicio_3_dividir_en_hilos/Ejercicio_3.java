// Definición del paquete donde se encuentra la clase
package Ejercicio_3_dividir_en_hilos;

/**
 * Ejercicio 3: Dividir una operación en hilos
 * El objetivo de este ejercicio es transformar un programa de un solo hilo, que realiza una
 * operación matemática, a un programa multihilo que aprovecha de forma más eficiente un
 * procesador multihilo.
 */

// Definición de la clase Ejercicio_3 que implementa Runnable para poder ejecutarse como hilo
public class Ejercicio_3 implements Runnable {

    // Variable para almacenar el resultado de la operación que realizará el hilo
    private double resultado;

    // Variable que indica qué operación se realizará
    // 1 = multiplicación, 2 = suma (según la implementación actual)
    private int operacion;

    // Constructor que recibe el tipo de operación que debe realizar el hilo
    public Ejercicio_3(int operacion) {
        this.operacion = operacion;
    }

    // Método getter para obtener el resultado de la operación
    public double getResultado() {
        return resultado;
    }

    // Método getter para obtener el tipo de operación
    public int getOperacion() {
        return operacion;
    }

    // Método run() que se ejecuta cuando se inicia el hilo
    @Override
    public void run() {
        // Si la operación es 1, realiza multiplicación
        if (operacion == 1) {
            resultado = 1 * 2;
        }
        // Si la operación es 2, realiza suma
        else if (operacion == 2) {
            resultado = 1 + 2;
        }
    }
}
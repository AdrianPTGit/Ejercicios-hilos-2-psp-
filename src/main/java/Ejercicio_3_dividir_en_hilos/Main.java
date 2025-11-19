// Definición del paquete donde se encuentra la clase Main
package Ejercicio_3_dividir_en_hilos;

// Clase principal que contiene el método main
public class Main {
    public static void main(String[] args) throws InterruptedException {

        // Crear objetos de la clase Ejercicio_3 para realizar operaciones
        // 2 = suma, 1 = multiplicación según la implementación de Ejercicio_3
        Ejercicio_3 suma = new Ejercicio_3(2);
        Ejercicio_3 multiplicacion = new Ejercicio_3(1);

        // Crear hilos a partir de los objetos de tipo Runnable
        Thread t1 = new Thread(suma);
        Thread t2 = new Thread(multiplicacion);

        // Iniciar la ejecución de los hilos en paralelo
        t1.start();
        t2.start();

        // Esperar a que ambos hilos terminen antes de continuar
        t1.join();
        t2.join();

        // Obtener los resultados calculados por cada hilo
        double operacion1 = suma.getResultado();
        double operacion2 = multiplicacion.getResultado();

        // Calcular el resultado final dividiendo los resultados de los hilos
        double resultado = operacion1 / operacion2;

        // Mostrar el resultado final por consola
        System.out.println("Resultado: " + resultado);

        // Crear un objeto de la clase Hilo para realizar otra operación (división)
        Hilo hilo = new Hilo(2, 3, "/");

        // Iniciar el hilo Hilo, que ejecutará su cálculo en paralelo
        hilo.start();
    }
}
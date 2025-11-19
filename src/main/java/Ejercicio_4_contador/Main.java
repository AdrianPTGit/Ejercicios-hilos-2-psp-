// Definición del paquete donde se encuentra la clase
package Ejercicio_4_contador;

/**
 * Ejercicio 4: Contador
 * Simula el comportamiento de un grupo de personas (por ejemplo, 10) que intentan
 * incrementar de una en una la cantidad de un contador compartido.
 *
 * Se utilizan tres clases:
 * 1. Main.java: Crea los objetos y lanza la simulación.
 * 2. People.java: Representa a las personas/hilos que incrementan el contador.
 * 3. Counter.java: Objeto compartido entre todos los hilos para llevar la cuenta.
 */
public class Main {

    /**
     * Método principal que inicia la simulación
     */
    public static void main(String[] args) throws InterruptedException {
        // Crear una única instancia de Counter que será compartida por todos los hilos
        Counter c1 = new Counter();

        // Crear un arreglo para almacenar los hilos
        Thread[] hilos = new Thread[10];

        // Bucle para crear 10 hilos, cada uno representando a una persona
        for (int i = 0; i < 10; i++) {
            // Crear un objeto People, pasando la referencia del contador compartido
            People p = new People(c1);

            // Crear un hilo asociado al objeto People
            hilos[i] = new Thread(p);

            // Iniciar la ejecución del hilo
            hilos[i].start();
        }

        // Bucle para esperar a que todos los hilos terminen antes de continuar
        for (Thread t : hilos) {
            t.join(); // join() bloquea el hilo principal hasta que el hilo actual termine
        }

        // Una vez que todos los hilos han terminado, imprimir el valor final del contador
        System.out.println("Valor final del contador: " + c1.getNumero());
    }
}
// Definición del paquete donde se encuentra la clase
package Ejercicio_4_contador;

// Clase People implementa Runnable para poder ejecutarse como hilo
public class People implements Runnable {

    // Contador compartido que todos los hilos usarán
    private Counter counter;

    // Constructor que recibe la referencia del contador compartido
    public People(Counter counter) {
        this.counter = counter; // Asignar la referencia al atributo interno
    }

    // Getter para obtener la referencia del contador (opcional)
    public Counter getCounter() {
        return counter;
    }

    // Setter para cambiar la referencia del contador (opcional)
    public void setCounter(Counter counter) {
        this.counter = counter;
    }

    // Método run() que se ejecuta cuando se inicia el hilo
    @Override
    public void run() {
        // Bucle que incrementa el contador 1000 veces
        for (int i = 0; i < 1000; i++) {
            counter.increment(); // Incrementa el contador de forma sincronizada
        }
    }
}
// Definición del paquete donde se encuentra la clase
package Ejercicio_4_contador;

// Clase Counter representa un contador compartido entre varios hilos
public class Counter {

    // Variable que almacena el valor actual del contador
    private int numero = 0;

    // Método getter para obtener el valor actual del contador
    public int getNumero() {
        return numero;
    }

    // Método setter para asignar un valor al contador (opcional)
    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Método para incrementar el contador en 1
    // synchronized garantiza que solo un hilo pueda ejecutar este método a la vez,
    // evitando problemas de concurrencia
    public synchronized int increment() {
        numero++;          // Incrementa el valor del contador
        return numero;     // Devuelve el valor actualizado (opcional)
    }
}
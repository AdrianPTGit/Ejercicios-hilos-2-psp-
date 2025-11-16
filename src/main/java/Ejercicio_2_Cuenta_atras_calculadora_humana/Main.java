package Ejercicio_2_Cuenta_atras_calculadora_humana;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // Se crea un objeto Calculadora, que será la lógica que propondrá sumas al usuario
        Calculadora calculadora = new Calculadora();

        // Se crea un hilo que ejecutará el código de la calculadora en paralelo
        Thread hiloCalculadora = new Thread(calculadora);

        // Se inicia el hilo de la calculadora
        hiloCalculadora.start();

        // --- CUENTA ATRÁS ---
        // Bucle que realiza una cuenta atrás desde 50 hasta 0
        for (int i = 10; i >= 0; i--) {

            // Imprime en pantalla el tiempo restante
            System.out.println("Cuenta atrás: " + i + " Segundos");

            // El hilo principal se detiene 4 segundos antes de mostrar el siguiente número
            Thread.sleep(2000);
        }

        // Cuando la cuenta atrás llega a 0, el tiempo se acaba
        System.out.println("\n Tiempo terminado. Interrumpiendo hilo de cálculo...");

        // Se interrumpe el hilo de la calculadora, lo que provoca que su bucle principal termine
        hiloCalculadora.interrupt();
    }
}
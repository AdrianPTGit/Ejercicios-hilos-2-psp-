package Ejercicio_2_Cuenta_atras_calculadora_humana;

// La clase Calculadora implementa Runnable para ejecutarse como un hilo independiente
public class Calculadora implements Runnable {

    // Contador de puntuación (número de aciertos del usuario)
    private int puntuacion = 0;

    @Override
    public void run() {

        // Bucle que se ejecuta mientras el hilo NO haya sido interrumpido
        while (!Thread.currentThread().isInterrupted()) {

            // Se generan dos números aleatorios entre 0 y 10
            int a = (int) (Math.random() * 11);
            int b = (int) (Math.random() * 11);

            // Se muestra la operación al usuario
            System.out.println("\nLa operación es: " + a + " + " + b);

            // Se crea un objeto Humano con la operación generada
            Humano humano = new Humano(a, b);

            // Se crea un hilo para que el humano responda de forma independiente
            Thread hiloHumano = new Thread(humano);

            // Iniciar el hilo del humano
            hiloHumano.start();

            try {
                // El hilo de la calculadora espera hasta que Humano termine de responder
                hiloHumano.join();
            } catch (InterruptedException e) {
                // Si el hilo principal interrumpe la calculadora, se muestra mensaje y se corta el bucle
                System.out.println("\n Juego detenido.");
                break;
            }

            // Si el humano respondió correctamente, se suma 1 punto
            if (humano.isCorrecto()) {
                puntuacion++;
            }
        }

        // Al salir del bucle (fin del tiempo), se muestra la puntuación final
        System.out.println("\nPuntuación final: " + puntuacion);
    }
}
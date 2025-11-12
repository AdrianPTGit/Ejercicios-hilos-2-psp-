package Ejercicio_1_TIC_TAC;
/*
 * Ejecuta un script Java que lance dos hilos, dado que:
 *
 * 1. Uno de los hilos debe visualizar en pantalla en un bucle infinito la palabra "TIC".
 *
 * 2. El otro hilo debe visualizar en pantalla en un bucle infinito la palabra "TAC".
 *
 * Requisitos dentro de cada hilo:
 *
 * - Dentro del bucle de cada hilo utiliza el método sleep(milisegundos) para que nos dé
 *   tiempo a ver las palabras que se visualizan cuando se ejecute.
 *   Ejemplo: Thread.sleep(500);
 * - Añade un bloque try-catch y captura la excepción InterruptedException.
 *
 * Desde la función main:
 *
 * - Inicia la ejecución de ambos hilos.
 * - Comprueba su resultado.
 *
 *   Pregunta: ¿Se visualizan los textos "TIC" y "TAC" de forma ordenada
 *   (es decir: TIC TAC TIC TAC TIC TAC...)?
 */
public class Main {
    public static void main(String[] args)  {

    Tic tic = new Tic();
    Thread hiloTic = new Thread(tic);
    hiloTic.start();

    Tac tac = new Tac();
    Thread hiloTac= new Thread(tac);
    hiloTac.start();

        try {
            hiloTic.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            hiloTac.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

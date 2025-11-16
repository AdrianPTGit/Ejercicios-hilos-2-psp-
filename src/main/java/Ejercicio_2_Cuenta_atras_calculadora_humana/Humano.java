package Ejercicio_2_Cuenta_atras_calculadora_humana;

import java.util.Scanner;

// La clase Humano implementa Runnable para poder ejecutarse en un hilo separado
public class Humano implements Runnable {

    // Variables que almacenan los dos números de la suma
    private int a, b;

    // Variable que indica si el usuario ha respondido correctamente
    private boolean correcto = false;

    // Constructor que recibe los valores de la operación
    public Humano(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Método getter para saber si el usuario acertó
    public boolean isCorrecto() {
        return correcto;
    }

    @Override
    public void run() {

        // Scanner para leer la respuesta del usuario desde el teclado
        System.out.println("Respuesta: ");
        Scanner sc = new Scanner(System.in);

        // Se muestra la operación al usuario
        System.out.print("¿Cuánto es " + a + " + " + b + "? ");

        // El usuario introduce su respuesta
        int respuesta = sc.nextInt();

        // Se comprueba si la respuesta es correcta
        correcto = (respuesta == a + b);

        // Se informa al usuario del resultado
        if (correcto)
            System.out.println("Correcto");
        else
            System.out.println("Incorrecto (era " + (a + b) + ")");
    }
}

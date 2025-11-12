package Ejercicio_2_Cuenta_atras_calculadora_humana;
/*
1. Un hilo irá proponiendo sumas aleatorias al Humano.
   - El usuario debe contestar.
   - Si la respuesta es correcta, se suma +1 a la puntuación general.
 */
public class Calculadora implements Runnable{
    @Override
    public void run() {
        while(true){
            /*
            Math.random() genera un número double entre 0.0 y 1.0.
            Multiplicamos por 101 para incluir el 100.
            Convertimos a int con (int).
             */
            int numero = (int) (Math.random() * 101); // 0 a 100 inclusive
            int numero2 = (int) (Math.random() * 101); // 0 a 100 inclusive

            System.out.println("La operacion es: " + numero + " + " + numero2);


        }
    }
}

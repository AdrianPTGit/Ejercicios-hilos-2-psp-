package Ejercicio_2_Cuenta_atras_calculadora_humana;
/*
Ejercicio 2: Cuenta atrás - Calculadora Humana

Objetivo:
Ejecutar un script Java que realice las siguientes tareas utilizando al menos 1 hilo
adicional al hilo principal.

Tareas:

1. Un hilo irá proponiendo sumas aleatorias al usuario.
   - El usuario debe contestar.
   - Si la respuesta es correcta, se suma +1 a la puntuación general.

2. El hilo principal realizará una cuenta atrás de 10 segundos.
   - Cuando finalice, interrumpirá al otro hilo.
   - Se mostrará la puntuación obtenida.
*/
public class Main {
    public static void main(String[] args) {

            Calculadora c1 = new Calculadora();
            Thread hiloCalculadora = new Thread(c1);

            hiloCalculadora.start();
    }
}

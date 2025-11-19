package Ejercicio_4_contador;

/**
 * Ejercicio 4: Contador
 * Simula el comportamiento de un grupo de personas (por ejemplo, 10) que intentan
 * incrementar de una en una la cantidad de un contador compartido. Crea 3 clases:
 * 1. Main.java: Instancia todos los objetos y comienza la simulación.
 * 2. Person.java: Estos son los hilos o runnable que se encargan de incrementar el
 * contador.
 * 3. Counter.java: Este es el objeto compartido entre todas las personas.
 */
public class Main {

    /**
     * Instancia del contador (solo un contador).
     * ● Declarar todas las personas que tienen acceso al contador (al menos 10 personas).
     * ● Iniciar la simulación.
     * ● Esperar a que todos los hilos terminen y luego imprimir el resultado final del
     * contador
     */

    public static void main(String[] args) throws InterruptedException {
        Counter c1 = new Counter();



        People people1 = new People(c1);
        People people2 = new People(c1);
        People people3 = new People(c1);
        People people4 = new People(c1);
        People people5 = new People(c1);
        People people6 = new People(c1);
        People people7 = new People(c1);
        People people8 = new People(c1);
        People people9 = new People(c1);
        People people10 = new People(c1);

        Thread p1 = new Thread(people1);
        p1.start();
        p1.join();
        Thread p2 = new Thread(people2);
        p2.start();
        p2.join();
        Thread p3 = new Thread(people3);
        p3.start();
        p3.join();
        Thread p4 = new Thread(people4);
        p4.start();
        p4.join();
        Thread p5 = new Thread(people5);
        p5.start();
        p5.join();
        Thread p6 = new Thread(people6);
        p6.start();
        p6.join();
        Thread p7 = new Thread(people7);
        p7.start();
        p7.join();
        Thread p8 = new Thread(people8);
        p8.start();
        p8.join();
        Thread p9 = new Thread(people9);
        p9.start();
        p9.join();
        Thread p10 = new Thread(people10);
        p10.start();
        p10.join();

        // Mostrar el valor final del contador
        System.out.println("Valor final del contador: " + c1.getNumero());
    }
}

// Definición del paquete donde se encuentra la clase
package Ejercicio_3_dividir_en_hilos;

// Definición de la clase Hilo que extiende Thread, permitiendo ejecutar código en paralelo
public class Hilo extends Thread {

    // Variables privadas que guardan los operandos, la operación y el resultado
    private double num1;
    private double num2;
    private String operacion;
    private double resultado;

    // Constructor de la clase Hilo, recibe dos números y una operación como parámetros
    public Hilo(double num1, double num2, String operacion) {
        this.num1 = num1;
        this.num2 = num2;
        this.operacion = operacion;

        // Se calcula el resultado en función de la operación recibida
        // Comparación usando equals para comparar contenido de strings
        if (operacion.equals("+")){
            resultado = num1 + num2;  // Suma
        } else if(operacion.equals("-")){
            resultado = num1 - num2;  // Resta
        } else if(operacion.equals("*")) {
            resultado = num1 * num2;  // Multiplicación
        } else if(operacion.equals("*")) {  // Esta línea está duplicada y se puede eliminar
            resultado = num1 * num2;
        }

        // Muestra por consola el resultado calculado por el hilo
        System.out.println("resultado Hilo: " + resultado);
    }

    // Métodos getter y setter para acceder y modificar num1
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    // Métodos getter y setter para acceder y modificar num2
    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    // Métodos getter y setter para acceder y modificar la operación
    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    // Métodos getter y setter para acceder y modificar el resultado
    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
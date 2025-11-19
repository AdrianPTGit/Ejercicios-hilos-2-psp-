package Ejercicio_3_dividir_en_hilos;

public class Hilo extends Thread{

    private double num1;
    private double num2;
    private String operacion;
    private double resultado;

    public Hilo(double num1, double num2, String operacion) {
        this.num1 = num1;
        this.num2 = num2;
        this.operacion = operacion;

        if (operacion.equals("+")){
            resultado = num1 + num2;
        } else if(operacion.equals("-")){
            resultado = num1 - num2;
        } else if(operacion.equals("*")) {
            resultado = num1 * num2;
        }else if(operacion.equals("*")) {
            resultado = num1 * num2;
        }

        System.out.println("resultado Hilo: "+ resultado);
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}

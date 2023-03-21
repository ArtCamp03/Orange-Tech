package edu.dio.metodos;

public class Calculadora {
    public static void soma(double numero1, double numero2){
        double result = numero1 + numero2;
        System.out.println("valor1 + valor2 =" + result);
    }

    public static void subtrai(double numero1, double numero2){
        double result = numero1 - numero2;
        System.out.println("valor1 - valor2 =" + result);
    }

    public static void divisao(double numero1, double numero2){
        double result = numero1 / numero2;
        System.out.println("valor1 / valor2 =" + result);
    }

    public static void multiplicacao(double numero1, double numero2){
        double result = numero1 * numero2;
        System.out.println("valor1 * valor2 =" + result);
    }
}

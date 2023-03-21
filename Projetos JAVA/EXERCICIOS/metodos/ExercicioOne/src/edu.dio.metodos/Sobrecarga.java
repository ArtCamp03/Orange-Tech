package edu.dio.metodos;

public class Sobrecarga {
    public static void are(double lado){
        System.out.println("Area do quadrado:" + lado + lado);
    }

    public static void are(double lado1, double lado2){
        System.out.println("Area do retangulo:" + lado1 + lado2);
    }

    public static void are(double baseMaior, double baseMenor, double altura){
        System.out.println("Area do trapezio:" + ((baseMaior+baseMenor)* altura) /  2);
    }
}

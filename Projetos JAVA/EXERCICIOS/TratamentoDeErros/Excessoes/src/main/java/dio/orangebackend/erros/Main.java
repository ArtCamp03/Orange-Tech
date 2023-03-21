package dio.orangebackend.erros;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");

        try{
            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado: "+resultado);
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Entrada Invalida, Informe um numero inteiro !"+ e.getMessage());
            // e.printStackTrace();
        } finally {
            System.out.println("Chegou no finally !");
        }

        System.out.println("O codigo continua ...");
    }

    public static int dividir(int a, int b){
        return a / b;
    }
}

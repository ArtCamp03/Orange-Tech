package dio.orangebackend.erros;

import javax.swing.*;

public class ExceptionCustomizada2 {
    public static void main(String[] args) {
        int[] numerador = {4,5,6,3};
        int[] denominador = {2,5,8,9};

        for(int i = 0; i < denominador.length; i++){
            try{
                if(numerador[i] %2 != 0) throw new DivisaoNaoExataException("Divisao nao exata !",numerador[i],denominador[i]);

                int resultado = numerador[i] /denominador[i];
                System.out.println(resultado);
            } catch (DivisaoNaoExataException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        System.out.println("O programa continua ...");
    }
}

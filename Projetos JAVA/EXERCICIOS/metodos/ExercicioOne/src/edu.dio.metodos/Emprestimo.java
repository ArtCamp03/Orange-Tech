package edu.dio.metodos;

public class Emprestimo {
    public static int getDuasParcelas(){
        return 2;
    }

    public static int getTresParcelas(){
        return 3;
    }

    public static double getTaxaDuasParcelas(){
        return 0.3;
    }

    public static double getTaxaTresParcelas(){
        return 4.5;
    }

    public static void calcular(double valor, int parcelas){
        if(parcelas == 2){
            double valorFinal = valor + (valor * getTaxaDuasParcelas());
            System.out.println("Valor final do emprestimo para duas parcelas: R$"+valorFinal);
        }else if(parcelas == 3){
            System.out.println("Valor final do emprestimo para tres parcelas: R$"+valorFinal);
        }else{
            System.out.println("Quantidade de parcelas nao aceita");
        }
    }
}

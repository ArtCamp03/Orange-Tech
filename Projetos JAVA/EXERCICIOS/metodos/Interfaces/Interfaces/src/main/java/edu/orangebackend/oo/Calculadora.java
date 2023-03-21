package edu.orangebackend.oo;

class Calculadora implements OperacaoMatematica {

    @Override
    public void soma(int a, int b){
        System.out.println("Soma: "+ a+b);
    }

    @Override
    public void subtracao(int a, int b){
        System.out.println("Soma: "+ a-b);
    }

    @Override
    public void multiplicacao(int a, int b){
        System.out.println("Soma: "+ a*b);
    }

    @Override
    public void dividisao(int a, int b){
        System.out.println("Soma: "+ a/b);
    }
}

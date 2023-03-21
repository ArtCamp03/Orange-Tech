package edu.dio.orangebackend;

public class Main {
    public static void main(String[] args) {

        // upCast -> classe filha transforma em classe mae
        Carro car = (Carro) new Veiculo();

        // downCast -> classe mae transformar se em classe filha (OPERAÇAO PERIGOSA)
        Veiculo veiculo = (Veiculo) new Carro();

     }
}

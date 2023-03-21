package edu.dio.orangebackend;

public class Main {
    public static void main(String[] args) {
        // upcasts
        Funcionario faxineiro = new Faxineiro();
        Funcionario vendedor = new Vendedor();
        Funcionario gerente = new Gerente();

        // downcasts -> Gerente gerente = (Gerente) new Funcionario()
        Vendedor vendedor1 = (Vendedor) new Funcionario();
    }
}

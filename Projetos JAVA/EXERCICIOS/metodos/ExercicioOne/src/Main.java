import edu.dio.metodos.Calculadora;
import edu.dio.metodos.Mensagem;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Exercicio 1");
        Calculadora.soma(2.5, 3.0);
        Calculadora.subtrai(2.5, 3.0);
        Calculadora.divisao(2.5, 3.0);
        Calculadora.multiplicacao(2.5, 3.0);

        System.out.println("Exercicio 2");
        Mensagem.obterMenssagem(5);
        Mensagem.obterMenssagem(13);
        Mensagem.obterMenssagem(19);

        System.out.println("Exercicio 3");
    }
}

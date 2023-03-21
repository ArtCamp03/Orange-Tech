package dio.orangebackend.debug;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Jose", "Carlos","Marcos","Henrique"};

        int media = calculaMediaDaTurma(alunos, scan);

        System.out.printf("Media da turma %d", media);
    }

    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner){
        double soma = 0;

        for(String aluno : alunos){
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextInt();
            soma += nota;
        }

        return soma / alunos.length;
    }
}

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        //exercicio1();
        //exercicio2();
        //exercicio3();
        //exercicio4();
        //exercicio5();
        exercicio6();
    }

    private static void exercicio1() {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true){
            nome = scan.next();
            idade = scan.nextInt();

            if(nome.equals("0"))break;
            System.out.println("Nome: "+ nome);
            System.out.println("Idade: "+ idade);
        }

        System.out.println("Continua aki...");
    }

    private static void exercicio2(){
        Scanner scan = new Scanner(System.in);
        int nota;

        while(true){
            System.out.println("Digite uma nota de 0 a 10: ");
            nota = scan.nextInt();

            if(nota >= 0 && nota <= 10 )break;
            System.out.println("Valor invalido !! ");
        }

        System.out.println("Valor valido !");
    }

    private static void exercicio3(){
        Scanner scan = new Scanner(System.in);
        int numero;
        int media = 0;
        int maior = 0;
        int cont = 0;

        do{
            System.out.println("numero: ");
            numero = scan.nextInt();
            
            if(numero > maior){
                maior = numero;
            }

            media = media + numero;

            cont += 1;
        }while(cont < 5);

        System.out.println("Maior numero eh: " + maior + "Media: " + media/5);
    }

    private static void exercicio4(){
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qtdConsoants = 0;

        int count = 0;

        do{
            System.out.println("Letra: ");
            String letra = scan.next();

            if( !(letra.equalsIgnoreCase("a") |
            letra.equalsIgnoreCase("e") |
            letra.equalsIgnoreCase("i") |
            letra.equalsIgnoreCase("o") |
            letra.equalsIgnoreCase("u")
            )){
                consoantes[count] = letra;
                qtdConsoants++;
            }
            count++;
        }while(count < consoantes.length);

        for (String consoante : consoantes) {
            if(consoante != null){
                System.out.println(consoante + " ");
            }
        }
    }

    private static void exercicio5(){
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        // numeros aleatorios
        System.out.println("Numeros aleatorios: ");
        for(int numero : numerosAleatorios){
            System.out.print(numero + " ");
        }

        // numeros sucessores
        System.out.println("\nNumeros sucessores: ");
        for(int numero : numerosAleatorios){
            System.out.print((numero+1) + " ");
        }
    }

    private static void exercicio6(){
        Random random = new Random();

        int[][] N = new int[4][4];

        for(int i = 0; i < N.length; i++){
            for(int j = 0; j < N[i].length; j++){
                N[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for(int[] linha : N){
            for(int coluna: linha){
                System.out.println(coluna + " ");
            }
            System.out.println();
        }

    }

}

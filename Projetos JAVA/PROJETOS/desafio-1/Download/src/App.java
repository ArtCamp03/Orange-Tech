import java.util.Scanner; 
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();
        
        // TODO: Crie a condição necessária para que, de acordo com o tamanho, seja printado no console barras representando o download
        for(int i = 0; i < tamanho; i++){
            System.out.print("/");
        }
    }
}

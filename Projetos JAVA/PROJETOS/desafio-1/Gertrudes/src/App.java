import java.util.Scanner; 
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidas = 3;
        int resul = (paginas/paginasLidas);
        
        // TODO: Crie a condição necessária para que Getrudes saiba em quanto tempo terminará seus livros
        System.out.println(resul);
    }
}

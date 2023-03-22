import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Paradgmas e objetos");
        curso1.setCargaHoraria(82);

        Curso curso2 = new Curso();
        curso2.setTitulo("Kotlin");
        curso2.setDescricao("Programaçao Orientada a Objetos");
        curso2.setCargaHoraria(62);

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Paradgmas da Programação");
        mentoria1.setDescricao("Utilizando Java");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);

    }
}

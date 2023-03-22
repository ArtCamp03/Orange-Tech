import br.com.dio.desafio.*;

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

        // Polimorfismo
        Conteudo conteudo1 = new Curso();
        Conteudo conteudo2 = new Mentoria();

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Paradgmas da Programação");
        mentoria1.setDescricao("Utilizando Java");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devArtur = new Dev();
        devArtur.setNome("Artur");
        devArtur.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Artur" + devArtur.getConteudosEscritos());
        devArtur.progredir();
        System.out.println("--");
        System.out.println("Conteudos inscritos Artur" + devArtur.getConteudosEscritos());
        System.out.println("Conteudos concluidos Artur" + devArtur.getConteudosConcluidos());

        System.out.println("--------------");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Maria" + devMaria.getConteudosEscritos());
        devMaria.progredir();
        System.out.println("--");
        System.out.println("Conteudos inscritos Maria" + devMaria.getConteudosEscritos());
        System.out.println("Conteudos concluidos Maria" + devMaria.getConteudosConcluidos());
    }
}

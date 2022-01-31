import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devBruno = new Dev();
        devBruno.setNome("Bruno");
        devBruno.InscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos inscritos Bruno\n" + devBruno.getConteudosInscritos());
        devBruno.Progedir();
        devBruno.Progedir();
        System.out.println("\nConteúdos inscritos Bruno\n" + devBruno.getConteudosInscritos());
        System.out.println("\nConteúdos concluídos Bruno\n" + devBruno.getConteudosConcluidos());
        System.out.println("\nXP\n" + devBruno.CalcularTotalXp());

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.InscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos inscritos João\n" + devJoao.getConteudosInscritos());
        devJoao.Progedir();
        System.out.println("\nConteúdos inscritos João\n" + devJoao.getConteudosInscritos());
        System.out.println("\nConteúdos concluídos João\n" + devJoao.getConteudosConcluidos());
        System.out.println("\nXP\n" + devJoao.CalcularTotalXp());



    }
}

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
    
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Desenvolvimento de aplicações em Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Desenvolvimento de aplicações em JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria em Java");
        mentoria.setData(LocalDate.now());


       /*/ System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devNayara = new Dev();
        devNayara.setNome("Nayara");
        devNayara.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Iscritos Nayara: " + devNayara.getConteudosInscritos());

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Iscritos João: " + devJoao.getConteudosInscritos());

    }
}

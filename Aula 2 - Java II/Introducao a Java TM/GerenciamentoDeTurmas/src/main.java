import java.time.LocalDate;

public class main {
    public static void main(String[] args) throws Exception {
        
        Estudante thomaz = new Estudante("Thomaz", LocalDate.parse("1999-05-07"), 303718, 8);
        Estudante victor = new Estudante("Victor", LocalDate.parse("1999-09-24"), 12345, 7);
        Estudante ze = new Estudante("Zé", LocalDate.parse("1998-12-07"), 78935, 9);
        Estudante pg = new Estudante("PG", LocalDate.parse("1999-08-12"), 21620, 8);
        Estudante luka = new Estudante("Luka", LocalDate.parse("1999-04-06"), 89150, 7);
        Estudante luciano = new Estudante("Luciano", LocalDate.parse("1998-06-23"), 051021, 9);

        Disciplina bm = new Disciplina("Bases Matematicas", 90);
        Disciplina pi = new Disciplina("Processamento da Informação", 120);
        Disciplina tq = new Disciplina("Transformações Químicas", 100);

        Disciplina[] disciplinas = new Disciplina[6];
        Estudante[] estudantes = new Estudante[6];


        disciplinas[0] = bm;
        disciplinas[1] = pi;

        estudantes[0] = thomaz;
        estudantes[1] = victor;
        estudantes[2] = ze;

        Turma t1 = new Turma(3, 'C', disciplinas , estudantes);


        disciplinas[0] = tq;
        disciplinas[1] = bm;

        estudantes[0] = pg;
        estudantes[1] = luka;
        estudantes[2] = luciano;

        Turma t2 = new Turma(3, 'A', disciplinas, estudantes);
        

        Turma[] turmas = new Turma[2];
        turmas[0] = t1;
        turmas[1] = t2;

        for(Turma turma : turmas) {
            System.out.println(
                "Série: " + turma.getSerie() + "\n" +
                "Código Identificador: " + turma.getCodigoIdentificador() + "\n" +
                "Disciplinas: {"
            );

            for(Disciplina d : turma.getDisciplinas()) {
                if(d != null) {
                    System.out.println(
                        "\tNome: " + d.getNome() + "\n" +
                        "\tCarga Horária: " + d.getCargaHoraria() + "\n"
                    );
                }
            }
            System.out.println("}");
            System.out.println("Alunos: {");

            for(Estudante e : turma.getEstudantes()) {
                if(e != null) {
                    System.out.println(
                        "\tNome: " + e.getNome() + "\n" +
                        "\tMatrícula: " + e.getNumeroMatricula() + "\n" +
                        "\tData Nascimento: " + e.getDataNascimento() + "\n"
                    );
                }
            }
            System.out.println("}\n");
        }
        
    }
}

public class Turma {
    
    private int serie;
    private char codigoIdentificador;
    private Disciplina[] disciplinas;
    private Estudante[] estudantes;

    public Turma(
        int serie,
        char codigoIdentificador,
        Disciplina[] disciplinas,
        Estudante[] estudantes
    ) {
        this.serie = serie;
        this.codigoIdentificador = codigoIdentificador;
        this.disciplinas = disciplinas;
        this.estudantes = estudantes;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public char getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(char codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }

    public Disciplina[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }
}

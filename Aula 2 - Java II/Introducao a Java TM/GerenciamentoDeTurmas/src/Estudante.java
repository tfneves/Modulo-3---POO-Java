import java.time.LocalDate;

public class Estudante {
    
    private String nome;
    private LocalDate dataNascimento;
    private int numeroMatricula;
    private int serie;

    public Estudante(
        String nome,
        LocalDate dataNascimento,
        int numeroMatricula,
        int serie
    ) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.numeroMatricula = numeroMatricula;
        this.serie = serie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }
}

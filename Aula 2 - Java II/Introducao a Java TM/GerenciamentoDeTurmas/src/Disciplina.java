public class Disciplina {
    
    private String nome;
    private int cargaHoraria;

    public Disciplina(
        String nome,
        int cargaHoraria
    ) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return this.cargaHoraria;
    }
}

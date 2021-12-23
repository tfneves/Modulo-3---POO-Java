public class Pessoa implements Precedente<Pessoa> {

    private String nome;
    private String cpf;

    @Override
    public int precedeA(Pessoa p) {
        return this.nome.compareTo(p.nome);
    }

    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

public class Celular implements Precedente<Celular>{
    
    private int numero;
    private String proprietario;

    public Celular(int numero, String proprietario){
        this.numero = numero;
        this.proprietario = proprietario;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }


    @Override
    public int precedeA(Celular c) {
        return this.proprietario.compareTo(c.proprietario);
    }
}

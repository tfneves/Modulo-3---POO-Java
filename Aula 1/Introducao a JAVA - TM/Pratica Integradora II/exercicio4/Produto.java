package exercicio4;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;
    private static double valorTotal;

    public String getNome(){
        return this.nome;
    }

    public Produto setNome(String nome){
        this.nome = nome;
        return this;
    }


    public double getPreco(){
        return this.preco;
    }

    public Produto setPreco(double preco){
        this.preco = preco;
        return this;
    }


    public int getQuantidade(){
        return this.quantidade;
    }

    public Produto setQuantidade(int quantidade){
        this.quantidade = quantidade;
        return this;
    }


    public static double getValorTotal(){
        return valorTotal;
    }

    public static void setValorTotal(double valor_total){
        valorTotal += valor_total;
    }
}

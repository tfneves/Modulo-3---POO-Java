package exercicio4;

public class main {
    public static void main(String[] args) {
        
        Produto[] produtos = new Produto[3];
        
        produtos[0] = new Produto()
            .setNome("Arroz")
            .setPreco(10.99)
            .setQuantidade(2);

        produtos[1] = new Produto()
            .setNome("Feijão")
            .setPreco(14.49)
            .setQuantidade(1);

        produtos[2] = new Produto()
            .setNome("Tomate")
            .setPreco(9.99)
            .setQuantidade(5);

        for (Produto produto : produtos) {
            System.out.println(
                produto.getNome() + "\n" +
                "R$" + produto.getPreco() + "\n" +
                "Quantidade:" + produto.getQuantidade() + "\n"
            );
            Produto.setValorTotal(produto.getPreco());
        }

        System.out.println("Valor Total: " + Produto.getValorTotal());
    }
}

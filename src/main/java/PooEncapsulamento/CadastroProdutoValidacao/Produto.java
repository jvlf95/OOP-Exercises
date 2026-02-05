package PooEncapsulamento.CadastroProdutoValidacao;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        if(preco < 0){
            System.out.println("[ERRO] O preço não pode ser negativo");
            this.preco = 0.00;
        }else{
            this.preco = preco;
        }
    }

    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }

    public void verProduto(){
        System.out.println("Nome: " + getNome() +
                "\nPreço: R$" + getPreco());
    }
}

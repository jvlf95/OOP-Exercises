package ProgramacaoOrientadaObjeto.RelatorioProduto;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade){
        setNome(nome);
        setPreco(preco);
        setQuantidade(quantidade);
    }

    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public int getQuantidade(){
        return quantidade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public void exibirInfo(){
        System.out.printf("\nNome: %s" +
                "Preço: R$%.2f" +
                "Quantidade Disponível: %d", nome, preco, quantidade);
    }
}


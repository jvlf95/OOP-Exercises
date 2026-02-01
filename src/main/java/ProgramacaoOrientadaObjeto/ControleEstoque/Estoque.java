package ProgramacaoOrientadaObjeto.ControleEstoque;


import java.util.List;

public class Estoque{
    private List<Produto> produtos;
    private int quantitativeTotal;

    public Estoque(List<Produto> produtos){
        this.produtos = produtos;
    }

    public int getQuantidadeTotal(){
        return quantitativeTotal;
    }

    public void setQuantidadeTotal(int quantidadeTotal){
        this.quantitativeTotal += quantidadeTotal;
    }

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    public void produtosAdicionados(){
        for(Produto produto : produtos){
            System.out.println("\nNome: " + produto.getNome() +
                    "\nPreço: R$" + produto.getPreco() +
                    "\nQuantidade: " + produto.getQuantidade() + " unidades" +
                    "\nValor total em estoque: R$" + produto.valorTotalProduto());
        }
    }

    public void retirarProduto(String nome, int quantidade){
        for(Produto produto : produtos){
            if(nome.equals(produto.getNome())){
                if(produto.getQuantidade() > quantidade){
                    produto.setQuantidade(produto.getQuantidade() - quantidade);
                    System.out.println("Quantidade de " + produto.getNome() + " atualizada para "
                            + produto.getQuantidade() + " unidades");
                }else{
                    System.out.println("Quantidade insuficiente no estoque!");
                    System.out.println("Você pediu " + quantidade + " mas so há " + produto.getQuantidade());
                }
            }else{
                System.out.println("Produto não encontrado!");
            }
        }
    }


}

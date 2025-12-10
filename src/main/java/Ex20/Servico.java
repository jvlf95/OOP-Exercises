package Ex20;

public class Servico implements Vendaval{
    private double preco;
    private int quantidade;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    @Override
    public double precoTotal() {
        return getPreco() * getQuantidade();
    }

    @Override
    public double aplicarDesconto() {
        if (precoTotal() >= 500){
            return precoTotal() - (precoTotal() * 0.10);
        }else{
            return precoTotal();
        }
    }
}

package POO.Ex19;

public class ProdutoFisico implements Calculavel{
    private double preco;

    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }


    @Override
    public double precoFinal() {
        preco -= (preco * 0.05);
        return preco;
    }
}

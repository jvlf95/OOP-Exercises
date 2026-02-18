package PooHerancaPolimorfismoInterface.SistemaPagamento;

public class CartaoCredito extends Pagamento implements CalcularTaxa{

    public CartaoCredito(double valor){
        super(valor);
    }


    @Override
    public double calcularTaxa() {
        return getValor() * 0.03;
    }

    public void exibirTaxa(){
        System.out.println("Taxa de R$" + calcularTaxa() +
                " para R$" + getValor() + " || " +
                "Valor total de R$" + (getValor() - calcularTaxa()));
    }
}

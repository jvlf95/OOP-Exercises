package PooHerancaPolimorfismoInterface.SistemaPagamento;

public class BoletoBancario extends Pagamento implements CalcularTaxa{

    public BoletoBancario(double valor){
        super(valor);
    }


    @Override
    public double calcularTaxa() {
        return getValor() * 0.01;
    }

    public void exibirTaxa(){
        System.out.println("Taxa de R$" + calcularTaxa() +
                " para R$" + getValor() + " || " +
                "Valor total de R$" + (getValor() - calcularTaxa()));
    }
}

package PooHerancaPolimorfismoInterface.SistemaPagamento;

public class Pix extends Pagamento{

    public Pix(double valor){
        super(valor);
    }

    public void exibirTaxa(){
        System.out.println("Taxa de R$0,00" +
                " para R$" + getValor() + " || " +
                "Valor total de R$" + getValor());
    }

}

package PooHerancaPolimorfismoInterface.SistemaBancario;

public class Deposito extends OpcaoBancaria{

    public Deposito(String nomeDoTitular, double valor) {
        super(nomeDoTitular, valor);
    }

    public void executar(double valor) {
        System.out.println(getNomeDoTitular() + " depositou R$" +
                valor);
    }


}

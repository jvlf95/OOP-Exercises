package PooHerancaPolimorfismoInterface.SistemaBancario;

public class Saque extends OpcaoBancaria{

    public Saque(String nomeDoTitular, double valor) {
        super(nomeDoTitular, valor);
    }

    public void executar(double valor){
        System.out.println(getNomeDoTitular() + " sacou R$" +
                valor);
    }
}

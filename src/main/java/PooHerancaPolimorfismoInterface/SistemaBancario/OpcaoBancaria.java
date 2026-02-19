package PooHerancaPolimorfismoInterface.SistemaBancario;

public abstract class OpcaoBancaria implements AcaoBancaria{
    private String nomeDoTitular;
    private double valor;

    public OpcaoBancaria(String nomeDoTitular, double valor){
        this.nomeDoTitular = nomeDoTitular;
        this.valor = valor;
    }

    public String getNomeDoTitular(){
        return nomeDoTitular;
    }
    public double getValor(){
        return valor;
    }

    public void executar(){}
}

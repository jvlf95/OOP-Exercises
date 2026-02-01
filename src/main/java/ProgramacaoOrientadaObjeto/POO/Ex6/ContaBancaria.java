package ProgramacaoOrientadaObjeto.POO.Ex6;

public class ContaBancaria {
    private int numConta;
    private double saldo;
    public String titular;

    public int getNumConta(){
        return numConta;
    }
    public double getSaldo(){
        return saldo;
    }
    public String getTitular(){
        return titular;
    }

    public void setNumConta(int numConta){
        this.numConta = numConta;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void exibirConta(){
        System.out.println("Nome titular: " + getTitular());
        System.out.println("Número da conta: " + getNumConta());
        System.out.println("Saldo disponível: R$" + getSaldo());
    }
}

package ProgramacaoOrientadaObjeto.ZerandoSaldo;

public class Conta {
    private String titular;
    private int numeroConta;
    private double saldo;

    public Conta(String titular, int numeroConta){
        setTitular(titular);
        setNumeroConta(numeroConta);
        setSaldo(300);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibirDados(){
        System.out.printf("\nTitular: %s" +
                "\nNúmero da Conta: %d" +
                "\nSaldo Atual: R$%.2f", titular, numeroConta, saldo);
    }

    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("\nSaldo atualizado: R$" + getSaldo());
    }

    public void sacar(double valor){
        if(getSaldo() < valor){
            System.out.println("[ERROR] saldo insuficiente!");
        }else{
            this.saldo -= valor;
            System.out.println("Saldo Atualizado: R$" + getSaldo());
        }

    }

    public void zerarConta(){
        setSaldo(0.0);
        System.out.println("Saldo zerado!");
    }
}

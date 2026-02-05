package PooEncapsulamento.ControleSaldoBancario;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private int numeroConta;

    public ContaBancaria(String titular){
        this.titular = titular;
        this.saldo = 0.00;
        this.numeroConta = (int) (Math.random() * 1000);
    }

    public String getTitular(){
        return titular;
    }
    public double getSaldo(){
        return saldo;
    }
    public int getNumeroConta(){
        return numeroConta;
    }

    public void sacar(double valor){
        if(valor > getSaldo()){
            System.out.println("Saldo insuficiente, operação cancelada!");
        }else if(valor < 0){
            System.out.println("Valor negativo, operação cancelada!");
        }else{
            this.saldo = getSaldo() - valor;
        }
    }

    public void depositar(double valor){
        if(valor < 0){
            System.out.println("Valor negativo, operação cancelada!");
        }else{
            this.saldo = getSaldo() + valor;
        }
    }

    public void verConta(){
        System.out.println("\n-------------------------------------" +
                "\nNúmero da conta: " + getNumeroConta() +
                "\nTitular: " + getTitular() +
                "\nSaldo: R$" + getSaldo() +
                "\n-------------------------------------");
    }



}

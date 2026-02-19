package PooHerancaPolimorfismoInterface.SistemaBancario;

public class Main {
    public static void main(String[]args){
        Deposito deposito = new Deposito("João", 100);
        Saque saque = new Saque("João", 100);

        deposito.executar(100);
        saque.executar(100);
    }
}

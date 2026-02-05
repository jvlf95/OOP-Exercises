package POO.ZerandoSaldo;

public class Main {
    public static void main(String []args){
        Conta c1 = new Conta("João Vitor", 2569);

        c1.exibirDados();
        c1.depositar(200);
        c1.sacar(100);
        c1.zerarConta();
    }
}

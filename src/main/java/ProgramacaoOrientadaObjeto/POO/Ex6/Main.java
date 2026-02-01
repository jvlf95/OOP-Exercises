package ProgramacaoOrientadaObjeto.POO.Ex6;

public class Main {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();

        c1.setTitular("João");
        c1.setNumConta(1234);
        c1.depositar(100.00);
        c1.exibirConta();

    }
}

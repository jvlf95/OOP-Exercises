package POO.Ex20;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto();

        p1.setPreco(20);
        p1.setQuantidade(4);
        System.out.println("Total a pagar: R$" + p1.aplicarDesconto());

        Servico s1 = new Servico();

        s1.setPreco(100);
        s1.setQuantidade(6);
        System.out.println("Total a pagar: R$" + s1.aplicarDesconto());

    }
}

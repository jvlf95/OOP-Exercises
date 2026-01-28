package POO.Ex19;

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro();
        ProdutoFisico p1 = new ProdutoFisico();

        l1.setPreco(35.90);
        p1.setPreco(75.90);
        System.out.println("Preço final no livro de R$" + l1.getPreco() + " com disconto de 10% R$" + l1.precoFinal());
        System.out.println("Preço final no produto físico de R$" + p1.getPreco() + " com disconto de 5% R$" + p1.precoFinal());
    }
}

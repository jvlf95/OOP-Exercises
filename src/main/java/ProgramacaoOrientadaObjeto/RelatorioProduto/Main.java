package ProgramacaoOrientadaObjeto.RelatorioProduto;

public class Main {
    public static void main(String []args){
        Produto p1 = new Produto("Leite", 5.50, 20);
        Produto p2 = new Produto("Maça", 3.35, 30);
        Produto p3 = new Produto("Carne", 25, 25);

        p1.exibirInfo();
        p2.exibirInfo();
        p3.exibirInfo();
    }
}

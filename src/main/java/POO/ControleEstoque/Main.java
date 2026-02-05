package POO.ControleEstoque;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner leitura = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();
        Estoque estoque = new Estoque(produtos);

        String resposta = " ";

        System.out.println("Controle de Estoque");

        while(!resposta.equalsIgnoreCase("não")){
            System.out.println("Adicione produtos no estoque");
            System.out.print("Nome: ");
            String nomeProduto = leitura.nextLine();
            System.out.print("Preço: R$");
            double precoProduto = leitura.nextDouble();
            System.out.print("Quantidade: ");
            int quantidadeProduto = leitura.nextInt();
            leitura.nextLine();

            Produto produto = new Produto(nomeProduto, precoProduto, quantidadeProduto);
            estoque.adicionarProduto(produto);

            System.out.println("Deseja adicionar outro produto? ");
            resposta = leitura.nextLine();

        }

        estoque.produtosAdicionados();

        System.out.println("Escolha um produto para retirar do estoque");
        System.out.print("Nome: ");
        String nome = leitura.nextLine();
        System.out.print("Quantidade: ");
        int quantidade = leitura.nextInt();

        estoque.retirarProduto(nome, quantidade);





    }
}

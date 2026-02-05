package POO.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner leitura = new Scanner(System.in);
        List<Produto> carrinho = new ArrayList<>();

        String resposta = " ";
        double precoTotalCarrinho = 0;

        System.out.println("Carrinho de compras");

        while(!resposta.equalsIgnoreCase("não")){
            System.out.println("Adicione um item para seu carrinho de compras");
            System.out.print("Nome: ");
            String nomeProduto = leitura.nextLine();
            System.out.print("Preço: R$");
            double precoProduto = leitura.nextDouble();
            System.out.print("Quantidade: ");
            int quantidadeProduto = leitura.nextInt();
            leitura.nextLine();

            Produto produto = new Produto(nomeProduto, precoProduto, quantidadeProduto);
            carrinho.add(produto);

            precoTotalCarrinho += produto.valorTotalProduto();

            System.out.print("\nDeseja adicionar outro produto? ");
            resposta = leitura.nextLine();

        }
        System.out.println("Itens comprados:");

        for(Produto item : carrinho){
            System.out.println("----------------------------------------");
            System.out.println("\nNome: " + item.getNome() +
                    "\nPreço: R$" + item.getPreco() +
                    "\nQuantidade: " + item.getQuantidade() + " unidades");
            System.out.println("----------------------------------------");
        }

        System.out.printf("\nValor total a pagar R$%.2f", precoTotalCarrinho);

    }
}

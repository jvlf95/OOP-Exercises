package PooEncapsulamento.ControleSaldoBancario;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe o nome do titular para abrir a conta");
        System.out.print("Titular: ");
        String titular = leitura.nextLine();
        ContaBancaria conta = new ContaBancaria(titular);
        System.out.println("Parabéns! Conta aberta!");

        int escolha = 0;

        while(escolha != 4){
            System.out.println("""
                    \nSelecione uma das seguintes opções:
                    1 - Ver informações da sua conta
                    2 - Sacar um valor
                    3 - Depositar um valor
                    4 - Sair
                    """);
            System.out.print("Opção: ");
            escolha = leitura.nextInt();
            leitura.nextLine();

            switch(escolha){
                case 1:
                    conta.verConta();
                    break;
                case 2:
                    System.out.println("Informe um valor para sacar");
                    System.out.print("Valor: ");
                    double valorSacar = leitura.nextDouble();
                    leitura.nextLine();
                    conta.sacar(valorSacar);
                    break;
                case 3:
                    System.out.println("Informe um valor para depositar");
                    System.out.print("Valor: ");
                    double valorDepositar = leitura.nextDouble();
                    leitura.nextLine();
                    conta.depositar(valorDepositar);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }


        }

    }
}

package PooEncapsulamento.ControleSenha;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner leitura = new Scanner(System.in);

        System.out.println("Realize seu cadastro");
        System.out.print("Nome: ");
        String nome = leitura.nextLine();
        System.out.print("Senha: ");
        String senha = leitura.nextLine();

        Usuario usuario = new Usuario(nome, senha);

        System.out.println("Deseja altrar sua senha?");
        String resposta = leitura.nextLine();

        if(resposta.equalsIgnoreCase("sim")){
            System.out.print("Informe sua senha atual: ");
            String senhaAtual = leitura.nextLine();
            usuario.alterarSenha(senhaAtual);
        }

    }
}

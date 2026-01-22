package LacosRepeticao.MonitorandoTentativasLogin;

import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner leitura = new Scanner(System.in);

        String senha = "";

        System.out.println("Crie uma senha para o sistema");
        System.out.print("Nova senha:  ");
        String novaSenha = leitura.nextLine();
        System.out.print("Confirme sua senha:  ");
        String confirmarSenha = leitura.nextLine();

        boolean senhasIguais = false;

        if (novaSenha.equals(confirmarSenha)){
            senhasIguais = true;
            System.out.println("Senha criada!");
        }

        while(!senhasIguais){
            System.out.println("As senhas devem ser iguais!");
            System.out.print("Confirme sua senha:  ");
            confirmarSenha = leitura.nextLine();

            if (confirmarSenha.equals(novaSenha)){
                senhasIguais = true;
                System.out.println("Senha criada!");
            }
        }

        System.out.print("Coloque sua senha de acesso: ");
        senha = leitura.nextLine();

        boolean senhaAcesso = false;

        if(senha.equals(novaSenha)){
            System.out.println("Bem vindo, entrando no sistema...");
            senhaAcesso = true;
        }

        int totalTentativas = 3;

        while(!senhaAcesso){
            System.out.println("Senha incorreta! Após 3 tentativas a senha será bloquada!");
            System.out.println("Tentativas restantes: " + totalTentativas);
            totalTentativas--;
            System.out.print("Coloque a senha: ");
            senha = leitura.nextLine();


            if(senha.equals(novaSenha)){
                System.out.println("Bem vindo, entrando no sistema...");
                senhaAcesso = true;
            }

            if(totalTentativas == 0){
                System.out.println("Tentativas experidas, senha bloqueda! Contate o suporte!");
                break;
            }
        }









    }
}

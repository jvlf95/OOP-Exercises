package PooEncapsulamento.ValidacaoLogin;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner leitura = new Scanner(System.in);
        Login login  = new Login("João", "Jo123");

        int tentativasRestantes = 3;
        int tentativas = 0;
        while(tentativasRestantes != 0){
            System.out.println("\nDigite suas credenciais de acesso");
            System.out.print("Usuário: ");
            String usuario = leitura.nextLine();
            System.out.print("Senha: ");
            String senha = leitura.nextLine();

            if(!login.validarLogin(usuario, senha)){
                tentativasRestantes--;
                tentativas++;
                System.out.println("Tentativas restantes: " + tentativasRestantes);
            }else{
                tentativas++;
                break;
            }
        }
        if(tentativasRestantes == 0){
            System.out.println("\nAcesso bloqueado!");
        }

        System.out.println("\nTentativas necessárias para acesso: " + tentativas);
    }
}

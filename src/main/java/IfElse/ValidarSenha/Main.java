package IfElse.ValidarSenha;

import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner tec = new Scanner(System.in);
        int senhaCerta = 123456;
        int tentativas = 0;
        int suaSenha = 0;


        while(suaSenha != senhaCerta){
            System.out.println("Coloque a senha do sistema: ");
            suaSenha = tec.nextInt();

            if(suaSenha == senhaCerta){
                System.out.println("Acesso Liberado!");
                break;
            }else{
                System.out.println("Senha errada tente novamente!");
                tentativas++;
            }

            if(tentativas == 3){
                System.out.println("Excesso de tentativas erradas, senha bloqueada!");
            }

        }


    }
}

package LacosRepeticao.VerificarNomeValido;

import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner leitura = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String nome = leitura.nextLine();

        while(!nomeValido(nome)){
            System.out.print("Informe seu nome novamente: ");
            nome = leitura.nextLine();
        }

        System.out.println("Cadastrando nome...");

    }

    public static boolean nomeValido(String nome){
        if(nome.length() < 3){
            System.out.println("O nome deve ter mais de 3 caracteres!");
            return false;
        }
        return true;
    }
}

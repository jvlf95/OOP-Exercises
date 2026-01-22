package LacosRepeticao.ControleAcessoConvidados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        List<String> convidados = new ArrayList<>();
        convidados.add("João");

        Scanner leitura = new Scanner(System.in);
        System.out.println("Acesso a lista de convidados");


        while(true){
            System.out.println("----------------------------------------------------");
            System.out.println("\nDigite [ver] para acessar a lista de convidados" +
                    "\nDigite [sair] para encerrar o programa" +
                    "\nDigite o nome de alguém para adicionar na lista");
            System.out.print("Digite aqui: ");
            String entrada = leitura.nextLine();
            System.out.println("----------------------------------------------------");


            if(entrada.equalsIgnoreCase("ver")){
                System.out.println("Lista completa");
                System.out.println(convidados);
            }else if(entrada.equalsIgnoreCase("sair")){
                break;
            }else if(convidados.contains(entrada)){
                System.out.println("Convidado já adicionado");
            }else{
                System.out.println("Convidado adicionado com sucesso!");
                convidados.add(entrada);
            }


        }

        System.out.println("Saindo...");
    }
}

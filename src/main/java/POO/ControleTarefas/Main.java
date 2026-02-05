package POO.ControleTarefas;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner leitura = new Scanner(System.in);
        List<Tarefa> tarefas = new ArrayList<>();

        System.out.println("Controle de Tarefas");

        String resposta = " ";

        while (!resposta.equalsIgnoreCase("não")) {
            System.out.print("Descrição: ");
            String descricao = leitura.nextLine();
            System.out.print("Concluída? ");
            String concluida = leitura.nextLine();
            boolean conclusao = true;

            if(concluida.equalsIgnoreCase("sim")){
                conclusao = true;
            }else if(concluida.equalsIgnoreCase("não")){
                conclusao = false;
            }

            Tarefa tarefa = new Tarefa(descricao, conclusao);
            tarefas.add(tarefa);

            System.out.println("Deseja adicionar outra tarefa?");
            System.out.print("Digite: ");
            resposta = leitura.nextLine();
        }

        for(Tarefa item : tarefas){
            System.out.println("Descrição da tarefa: " + item.getDescricao() +
                    " --- Concluída? " + item.getConcluida());
        }


    }
}

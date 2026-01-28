package DataHora.DataHoraAtual;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner leitura = new Scanner(System.in);
        List<String> listaAtividades = new ArrayList<>();

        while(true) {
            System.out.println("Gerenciador de atividade");
            System.out.println("Escreva uma nova atividade: ");
            String atividade = leitura.nextLine();
            listaAtividades.add(atividade);
            LocalDateTime dataHoraAtual = LocalDateTime.now();
            DateTimeFormatter horaFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy --- HH:mm:ss" );

            System.out.println("Dejesa criar outra tarefa?");
            String resposta = leitura.nextLine();

            if(resposta.equalsIgnoreCase("nao")){
                for(String item : listaAtividades){
                    System.out.println("Atividade : " + item +
                            " /// Horário da criação: " + dataHoraAtual.format(horaFormatada));
                }
                System.out.println("Saindo...");
                break;
            }


        }

    }
}

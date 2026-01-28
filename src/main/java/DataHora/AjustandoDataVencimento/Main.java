package DataHora.AjustandoDataVencimento;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        LocalDate dataVencimento = LocalDate.of(2026,2,25);

        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("A data de vencimento da sua faturada está marcada para" +
                " o dia " + dataVencimento.format(dataFormatada) + " ,deseja " +
                "alterar?");
        String resposta = leitura.nextLine();

        if(resposta.equalsIgnoreCase("sim")){
            System.out.println("Em quantos meses?");
            int numMeses = leitura.nextInt();
            LocalDate novoVencimento = dataVencimento.plusMonths(numMeses);
            System.out.println("Nova data de vencimento da fatura: " +
                    novoVencimento.format(dataFormatada));
        }else{
            System.out.println("Data Original: " + dataVencimento.format(dataFormatada));
        }
    }
}

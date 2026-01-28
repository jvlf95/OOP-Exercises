package DataHora.FormatandoDataHoraRelatorios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[]args){
        LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println("Data e hora atuais do sistema: " + dataHoraAtual);

        DateTimeFormatter dataHoraAtualFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy --- HH:mm:ss");
        System.out.println("Data e hora atuais do sistema formatadas: " + dataHoraAtual.format(dataHoraAtualFormatada));

    }
}

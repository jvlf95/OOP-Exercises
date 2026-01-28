package DataHora.CalculandoDataEntrega;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[]args){
        LocalDate dataInicio = LocalDate.now();
        LocalDate dataFinal = dataInicio.plusDays(30);

        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Data Início do projeto: " + dataInicio.format(dataFormatada) +
                "\nData de Entrega: " + dataFinal.format(dataFormatada));
    }
}

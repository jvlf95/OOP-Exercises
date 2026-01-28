package LembretePagamento;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[]args){
        LocalDate dataVencimento = LocalDate.of(2026,10,25);
        LocalDate dataAlerta = dataVencimento.minusDays(5);

        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Period periodo = Period.between(dataAlerta,dataVencimento);

        System.out.println("Data Vencimento: " + dataVencimento.format(dataFormatada));
        System.out.println(periodo.getDays() + " dias antes do vencimento, será disparado um alerta, " +
                "no dia " + dataAlerta.format(dataFormatada));
    }
}

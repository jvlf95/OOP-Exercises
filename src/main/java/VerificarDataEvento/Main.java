package VerificarDataEvento;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner leitura = new Scanner(System.in);
        LocalDate dataAtual = LocalDate.now();

        System.out.println("Informe a data de um evento");
        System.out.print("Dia: ");
        int dia = leitura.nextInt();
        System.out.print("Mês: ");
        int mes = leitura.nextInt();
        System.out.print("Ano: ");
        int ano = leitura.nextInt();

        LocalDate dataEvento = LocalDate.of(ano, mes,  dia);

        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Period periodo = Period.between(dataAtual,dataEvento);

        System.out.println("Data Atual: " + dataAtual.format(dataFormatada) +
                "\nData Evento: " + dataEvento.format(dataFormatada));

        if(dataEvento.isEqual(dataAtual)){
            System.out.println("O evento é hoje!");
        }else if(dataEvento.isBefore(dataAtual)){
            System.out.println("O evento já aconteceu, há exatos " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias.");
        }else if(dataEvento.isAfter(dataAtual)){
            System.out.println("O evento ainda vai acontecer, faltam " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias.");
        }

    }
}

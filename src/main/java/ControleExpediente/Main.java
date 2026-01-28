package ControleExpediente;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner leitura = new Scanner(System.in);
        DateTimeFormatter horaFormatada = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("Marcação de ponto");
        System.out.print("Hora: ");
        int hora = leitura.nextInt();
        System.out.print("Minuto: ");
        int minuto = leitura.nextInt();

        LocalTime horaInicio = LocalTime.of(hora,minuto);

        System.out.println("Informe sua carga horária");
        System.out.print("Hora: ");
        int cargaHora = leitura.nextInt();
        System.out.print("Minuto: ");
        int cargaMinuto = leitura.nextInt();

        LocalTime cargaHoraria = LocalTime.of(cargaHora, cargaMinuto);

        LocalTime horaSaida = horaInicio.plusHours(cargaHora).plusMinutes(cargaMinuto);

        System.out.println("Horário de saída previsto: " + horaSaida.format(horaFormatada));

        System.out.println("Quantas horas você trabalhou hoje?");
        System.out.print("Hora: ");
        int horaTrabalho = leitura.nextInt();
        System.out.print("Minuto: ");
        int minutoTrabalho = leitura.nextInt();

        LocalTime horasTrabalhadas = LocalTime.of(horaTrabalho, minutoTrabalho);

        Duration duracao = Duration.between(horasTrabalhadas, cargaHoraria);

        if(horasTrabalhadas.equals(cargaHoraria)){
            System.out.println("você saiu no horário!");
        }else if(horasTrabalhadas.isBefore(cargaHoraria)){
            System.out.println("Você saiu antes do horário e está devendo " + duracao.toHours() + " horas e " + duracao.toMinutesPart() + " minutos!");
        }else if(horasTrabalhadas.isAfter(cargaHoraria)){
        System.out.println("Você passou do horário e precisa gastar " + duracao.toHours() +  "horas e " + duracao.toMinutesPart() + " minutos!");
        }

    }
}

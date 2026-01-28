package DataHora.DiferencaEntreHoras;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[]args){
        LocalTime horaAtual = LocalTime.now();
        LocalTime horaDormir = LocalTime.of(23,30,00);

        DateTimeFormatter horaFormatada = DateTimeFormatter.ofPattern("HH:mm:ss");

        Duration duracao = Duration.between(horaAtual, horaDormir);

        System.out.println("Hora Atual: " + horaAtual.format(horaFormatada) +
                "\nHora de Dormir: " + horaDormir.format(horaFormatada) +
                "\nTempo de Atividade Restante: " + duracao.toHours() +
                " Horas, " + duracao.toMinutesPart() + " minutos e " +
                duracao.toSecondsPart() + " segundos.");
    }
}

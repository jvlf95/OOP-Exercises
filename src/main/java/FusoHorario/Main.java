package FusoHorario;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime horaAtual = ZonedDateTime.now();
        ZonedDateTime horaTokyo = horaAtual.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));

        DateTimeFormatter horaFormatada = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("Hora atual em São Paulo: " + horaAtual.format(horaFormatada));
        System.out.println("Hora atual em Toky: " + horaTokyo.format(horaFormatada));
    }
}

package DataHora.ControleHoraDormir;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner leitura = new Scanner(System.in);
        DateTimeFormatter horaFormatada = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("***Controle da hora de dormir***");
        System.out.println("Digite hora e minuto do horário que você acorda");
        System.out.print("Hora: ");
        int horaAcorda = leitura.nextInt();
        System.out.print("Minuto: ");
        int minutoAcorda = leitura.nextInt();

        LocalTime horarioAcorda = LocalTime.of(horaAcorda, minutoAcorda);

        System.out.println("Digite hora e minuto do horário que você dorme");
        System.out.print("Hora: ");
        int horaDorme = leitura.nextInt();
        System.out.print("Minuto: ");
        int minutoDorme = leitura.nextInt();

        LocalTime horarioDorme = LocalTime.of(horaDorme, minutoDorme);

        Duration duracao = Duration.between(horarioDorme, horarioAcorda);
        Duration duracaoSonoIdeal = Duration.ofHours(7);

        if(duracao.toHoursPart() < duracaoSonoIdeal.toHours()){
            System.out.println("Seu tempo de sono está ruim!" +
                    "\nSeu tempo de sono: " + duracao.toHoursPart() +
                    "\nTempo ideal: " + duracaoSonoIdeal.toHours());
        }else if(duracao.toHours() > duracaoSonoIdeal.toHours()){
            System.out.println("Você está dormindo demais! " +
                    "\nSeu tempo de sono: " + duracao.toHoursPart() +
                    "\nTempo ideal: " + duracaoSonoIdeal.toHours());
        }else{
            System.out.println("Seu tempo de sono está ideal!");
        }


    }
}

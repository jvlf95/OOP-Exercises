package LacosRepeticao.ContagemDegraus;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o número de degraus da escada: ");
        int degraus = leitura.nextInt();

        for(int i = 1; i <=degraus; i++){
            System.out.println("Subindo o " + i + "° degrau!");
        }
    }
}

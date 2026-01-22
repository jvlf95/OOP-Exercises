package LacosRepeticao.PuladoNumerosQueTerminamEm5;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número e veja sua contagem ignorando números terminados em 5");
        System.out.print("Número: ");
        int numero = leitura.nextInt();

        for(int i = 0; i <= numero; i++){
            if(i % 10 == 5){
                System.out.println("Pulando número...");
                continue;
            }
            System.out.println(i);
        }
    }
}

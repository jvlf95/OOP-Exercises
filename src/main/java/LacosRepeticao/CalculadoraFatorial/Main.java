package LacosRepeticao.CalculadoraFatorial;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número e descubra o seu valor fatorial: ");
        int num = leitura.nextInt();

        int numFatorial = 1;

        for(int i = 1; i <= num; i++){
            numFatorial *= i;
        }

        System.out.println("Fatorial de " + num + " = " + numFatorial);
    }
}

package Ex35;

import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner tec = new Scanner(System.in);
        System.out.println("Conversor de moedas!");
        System.out.print("Coloque um valor em reais para converter: R$");
        double real = tec.nextDouble();

        double dolar = real / 5.25;

        System.out.printf("R$%.2f é convertido para $%.2f", real, dolar);
    }
}

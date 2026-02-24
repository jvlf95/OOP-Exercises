package StringsERegex.FormatandoNumeros;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um número decimal: ");
        double numero = leitura.nextDouble();
        leitura.nextLine();

        numeroFormatado(numero);

    }

    public static void numeroFormatado(double numero){
        System.out.printf(" %f formatado em duas casas decimais " +
                " = %.2f", numero, numero);
    }
}

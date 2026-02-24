package StringsERegex.ConvertendoMaiusculaMinuscula;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner leitura = new Scanner(System.in);

        System.out.print("Insira um texto: ");
        String texto = leitura.nextLine();

        System.out.println("Texto original: " + texto);
        System.out.println("Texto em maiúsuclo: " + texto.toUpperCase());
        System.out.println("Texto em minúsculo: " + texto.toLowerCase());
    }
}

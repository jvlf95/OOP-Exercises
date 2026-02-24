package StringsERegex.RemovendoEspacoEmBranco;

import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite um nome de uma pessoa: ");
        String nome = leitura.nextLine();

        String nomeFormatado = nome.trim();
        System.out.println(nomeFormatado);
    }
}

package StringsERegex.ExtraindoParteDeString;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite um nome de um arquivo com sua " +
                "extensão: ");
        String nomeArquivo = leitura.nextLine();

        String nomeArquivoFormatado = " ";

        int posicaoPonto = nomeArquivo.lastIndexOf(".");
        if(posicaoPonto != -1){
            nomeArquivoFormatado = nomeArquivo.substring(0, posicaoPonto);
            System.out.println("Nome do arquivo com extensão: " + nomeArquivo);
            System.out.println("Nome do arquivo sem extensão: " + nomeArquivoFormatado);
        }else{
            System.out.println("Arquivo não possui extensão!");
        }

    }
}

package StringsERegex.SubstituindoParteDeString;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner leitura = new Scanner(System.in);

        System.out.print("Insira um texto: ");
        String texto = leitura.nextLine();

        System.out.print("Escolha uma palavra presente no texto" +
                "que deseja substituir: ");
        String palavraEscolhida = leitura.nextLine();

        String palavraSubstituta = " ";

        if(texto.contains(palavraEscolhida)){
            System.out.print("Digite a palavra substituta: ");
            palavraSubstituta = leitura.nextLine();

            System.out.println("Texto após a troca : " + texto.replace(palavraEscolhida,
                    palavraSubstituta));
        }else{
            System.out.println(palavraEscolhida + " não foi " +
                    "encontrada no texto!");
        }


    }
}

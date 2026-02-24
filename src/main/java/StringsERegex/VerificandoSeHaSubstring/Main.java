package StringsERegex.VerificandoSeHaSubstring;

import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = leitura.nextLine();

        System.out.print("Digite uma palavra para saber se " +
                "está no texto: ");
        String palavra = leitura.nextLine();

        if(texto.contains(palavra)){
            System.out.println(palavra + " foi encontrada na posição " +
                    texto.indexOf(palavra));
        }else{
            System.out.println(palavra + " não foi encontrada no " +
                    "texto!");
        }
    }
}

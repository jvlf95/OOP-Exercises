package StringsERegex.ValidandoCodigosDeReferencia;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String [] args){
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite um código de um produto (Ex: ABC-1234): ");
        String codigo = leitura.nextLine();

        Pattern pattern = Pattern.compile("^[A-Z]{3}-\\d{4}$");
        Matcher matcher = pattern.matcher(codigo);

        if(matcher.find()){
            System.out.println(matcher.group());
        }

    }
}

package StringsERegex.ExtraindoHashtag;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[]arguments){
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = leitura.nextLine();

        encontrarHashtag(texto);
    }

    public static void encontrarHashtag(String texto){
        Pattern pattern = Pattern.compile("#\\w+");
        Matcher matcher = pattern.matcher(texto);

        List<String> hashtags = new ArrayList<>();


        while(matcher.find()){
            hashtags.add(matcher.group());
        }

        if(hashtags.isEmpty()){
            System.out.println("Não foram encontradas hashtags!");
        }else{
            System.out.println("Hashtags encontradas: " + hashtags);
        }
    }
}

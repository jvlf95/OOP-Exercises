package StringsERegex.ValidandoCpf;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[]args){
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu CPF (XXX.XXX.XXX-XX): ");
        String cpf = leitura.nextLine();

        validarCpf(cpf);


    }

    public static void validarCpf(String cpf){
        Pattern pattern = Pattern.compile("^\\d{3}.\\d{3}.\\d{3}-\\d{2}$");
        Matcher matcher = pattern.matcher(cpf);

        if(matcher.find()){
            System.out.println("O CPF " + cpf + " é válido!");
        }else{
            System.out.println("O CPF " + cpf + " não é válido!");
        }
    }
}

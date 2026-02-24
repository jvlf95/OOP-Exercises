package StringsERegex.ValidandoSenha;

import java.util.Scanner;

public class Main {
    public static void main(String[]arguments){
        Scanner leitura = new Scanner(System.in);

        System.out.println("Crie uma nova senha");
        System.out.println("""
                A senha deve ter pelo menos:
                - 8 caracteres
                - uma letra maiúscula
                - uma letra minúscula
                - um número
                - um caractere especial
                """);
        System.out.print("Senha: ");
        String senha = leitura.nextLine();

        validarSenha(senha);
    }

    public static void validarSenha(String senha){
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%&])[a-zA-Z\\d!@#$%&]{8,}$";

        if(senha.matches(regex)){
            System.out.println("Senha válida!");
        }else if(!senha.matches(".*[a-z].*")){
            System.out.println("Senha inválida! Falta ter pelo menos uma letra minúscula");
        }else if(!senha.matches(".*[A-Z].*")){
            System.out.println("Senha inválida! Falta ter pelo menos uma letra maiúscula");
        }else if(!senha.matches(".*\\d.*")){
            System.out.println("Senha inválida! Falta ter pelo menos um número");
        }else if(!senha.matches(".*[!@#$%&].*")) {
            System.out.println("Senha inválida! Falta ter pelo menos um caractere especial");
        }else{
            System.out.println("Senha inválida! A senha deve ter pelo menos 8 caracteres");
        }
    }
}

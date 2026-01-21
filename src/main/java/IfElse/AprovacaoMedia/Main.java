package IfElse.AprovacaoMedia;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite suas notas");
        System.out.println("Nota 1:");
        double nota1 = tec.nextDouble();
        System.out.println("Nota 2:");
        double nota2 = tec.nextDouble();

        double media = (nota1 + nota2) / 2;
        System.out.println("Média: " + media);

        if(media < 5.0){
            System.out.println("Reprovado!");
        }else if(media >= 5.0 && media <= 6.9){
            System.out.println("Recuperação!");
        }else{
            System.out.println("Aprovado!");
        }
    }

}

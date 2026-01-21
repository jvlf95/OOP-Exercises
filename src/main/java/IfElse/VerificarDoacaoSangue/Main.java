package IfElse.VerificarDoacaoSangue;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);

        System.out.println("Verificação para doar sangue");
        System.out.print("Informe sua idade: ");
        int idade = tec.nextInt();
        System.out.print("Informe seu peso: ");
        double peso = tec.nextDouble();

        boolean podeDoar = idade >= 18 && idade <= 65 && peso >= 50;

        if(podeDoar){
            System.out.println("Você pode dar sangue!");
        }else{
            System.out.println("Você não pode doar sangue!");
        }
    }
}

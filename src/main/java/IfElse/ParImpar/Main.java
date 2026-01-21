package IfElse.ParImpar;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = tec.nextInt();

        if(num % 2 == 0){
            System.out.println(num + " é par!");
        }else{
            System.out.println(num + " é ímpar!");
        }
    }
}

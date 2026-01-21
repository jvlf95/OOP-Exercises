package IfElse.ComparandoNumeros;


import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite dois números");
        System.out.print("Número: ");
        int num1 = tec.nextInt();
        System.out.print("Número: ");
        int num2 = tec.nextInt();

        if(num1 > num2){
            System.out.println(num1 + " é maior que " + num2);
        }else if (num2 > num1){
            System.out.println(num2 + " é maior que " + num1);
        }else{
            System.out.println("Os números são iguais");
        }
    }
}

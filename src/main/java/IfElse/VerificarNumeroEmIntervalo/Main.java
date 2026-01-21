package IfElse.VerificarNumeroEmIntervalo;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);

        System.out.print("Digite um valor de empréstimo (1000 à 5000): R$");
        double emprestimo = tec.nextDouble();

        if(emprestimo >= 1000 || emprestimo <= 5000){
            System.out.println("Valor aceito, emprestimo em processo...");
        }else{
            System.out.println("Valor fora do permitido (1000 à 5000), cancelando operação...");
        }
    }
}

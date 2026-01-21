package IfElse.VerificarDesconto;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);

        System.out.print("Digite o valor do seu produto: R$");
        double valor = tec.nextDouble();

        double desconto = valor * 0.10;

        if(valor >= 100.00){
            System.out.println("Desconto aplicado, valor final: R$" + (valor - desconto));
        }else{
            System.out.println("Valor sem desconto: R$" + valor);
        }
    }
}

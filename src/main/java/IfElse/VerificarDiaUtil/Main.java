package IfElse.VerificarDiaUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);

        System.out.print("Informe um dia da semana: ");
        String dia = tec.nextLine();

        if(dia.equalsIgnoreCase("Segunda")){
            System.out.println("Dia útil");
        }else if(dia.equalsIgnoreCase("Terça")){
            System.out.println("Dia útil");
        }else if(dia.equalsIgnoreCase("Quarta")){
            System.out.println("Dia útil");
        }else if(dia.equalsIgnoreCase("Quinta")){
            System.out.println("Dia útil");
        }else if(dia.equalsIgnoreCase("Sexta")){
            System.out.println("Dia útil");
        }else if(dia.equalsIgnoreCase("Sábado")){
            System.out.println("Não dia útil");
        }else if(dia.equalsIgnoreCase("Domingo")){
            System.out.println("Não é dia útil");
        }else{
            System.out.println("Inválido");
        }
    }
}

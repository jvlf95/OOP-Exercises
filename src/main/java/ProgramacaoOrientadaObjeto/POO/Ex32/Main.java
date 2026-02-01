package ProgramacaoOrientadaObjeto.POO.Ex32;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner tec = new Scanner(System.in);

        Livro l1 = new Livro("Avatar", "joao", 300, 90.0, "Ficção");
        Livro l2 = new Livro("Shureki", "joao", 150, 100.0, "Não Ficção");
        Livro l3 = new Livro("Carros", "joao", 200, 70.0, "Tecnologia");
        Livro l4 = new Livro("Up", "joao", 400, 85.0, "História");

        System.out.println("Digite [F] para trazer um livro de ficção, [N] para não ficção, [T] para tecnologia ou [H] para história: ");
        String letra = tec.nextLine();

        if (letra.equalsIgnoreCase("F")){
            System.out.println(l1);
        }else if(letra.equalsIgnoreCase("N")){
            System.out.println(l2);
        }else if(letra.equalsIgnoreCase("T")){
            System.out.println(l3);
        }else if(letra.equalsIgnoreCase("H")){
            System.out.println(l4);
        }else{
            System.out.println("Opção inválida!");
        }



    }
}

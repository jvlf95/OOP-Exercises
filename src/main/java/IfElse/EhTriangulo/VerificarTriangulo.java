package IfElse.EhTriangulo;

import java.util.Scanner;

public class VerificarTriangulo {
    public static void main(String []args){
        Scanner tec = new Scanner(System.in);

        System.out.println("Informe 3 lados de um triângulo");
        System.out.print("Lado: ");
        int lado1 = tec.nextInt();
        System.out.print("Lado: ");
        int lado2 = tec.nextInt();
        System.out.print("Lado: ");
        int lado3 = tec.nextInt();

        boolean ehTriangulo = (lado1 + lado2) > lado3;

        if(ehTriangulo){
            System.out.println("É um triângulo!");
        }else{
            System.out.println("Não é um triângulo!");
        }
    }
}

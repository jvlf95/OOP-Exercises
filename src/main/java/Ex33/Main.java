package Ex33;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite um preço:");
        double preco = tec.nextDouble();

        if (preco <= 50){
            System.out.println("Categoria do produto: econômico");
        }else if (preco >= 50.01 && preco <= 200){
            System.out.println("Categoria do produto: intermediário");
        }else{
            System.out.println("Categoria do produto: premium");
        }
    }
}

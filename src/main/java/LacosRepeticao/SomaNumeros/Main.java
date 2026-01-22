package LacosRepeticao.SomaNumeros;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner leitura = new Scanner(System.in);

        int[] valores = {10, 20, 30, 40, 50};

        int somaTotal = 0;


        for(int i = 0; i < valores.length; i++){
            somaTotal += valores[i];
        }

        System.out.println("Valor total das receitas: " + somaTotal);


    }
}

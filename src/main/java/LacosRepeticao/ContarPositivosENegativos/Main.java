package LacosRepeticao.ContarPositivosENegativos;

import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner leitura = new Scanner(System.in);

        System.out.println("Contagem de números positivos e negativos");
        String saida = " ";
        int positivos = 0;
        int negativos = 0;

        while(true){
            System.out.print("Digite um número (positivo ou negativo) ou 'sair' para encerrar: ");
            saida = leitura.nextLine();

            try {
                if (!saida.equalsIgnoreCase("sair")) {
                    if (Integer.parseInt(saida) < 0) {
                        negativos++;
                    } else {
                        positivos++;
                    }
                } else {
                    break;
                }
            }catch(NumberFormatException e){
                System.out.println("Entrada inválida, digite apenas números inteiros ou 'sair'");
            }


        }

        System.out.println("Total de posivitos: " + positivos);
        System.out.println("Total de negativos: " + negativos);
    }
}

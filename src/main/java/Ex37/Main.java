package Ex37;

import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner tec = new Scanner(System.in);
        System.out.println("Consumo médio do veículo (Km/L):");
        double consumoMedio = tec.nextDouble();
        System.out.println("Capacidade total do tanque (L):");
        double capacidadeTanque = tec.nextDouble();
        System.out.println("Quantidade de combustível disponível (L):");
        double quantidadeCombustivel = tec.nextDouble();
        System.out.println("Distância da viagem (Km):");
        double distancia = tec.nextDouble();

        double autonomiaMaxima = consumoMedio * capacidadeTanque;
        double autonomiaAtual = consumoMedio * quantidadeCombustivel;

        System.out.println("Quantos Km pode percorrer com o tanque cheio: " + autonomiaMaxima);
        System.out.println("Quantos Km pode percorrer com " + quantidadeCombustivel + " litros atuais: " + autonomiaAtual);

        if(autonomiaAtual < distancia){
            System.out.println("O veículo não vai chegar ao local com a quantidade de combustível atual, reabasteça!");
        }




    }
}

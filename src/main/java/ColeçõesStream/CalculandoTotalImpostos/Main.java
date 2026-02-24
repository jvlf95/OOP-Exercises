package ColeçõesStream.CalculandoTotalImpostos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> values = new ArrayList<>();

        double random = 0;

        System.out.print("All Values:");

        for(int i = 0; i <= 5; i++){
            random = (Math.random() * 1000);
            values.add(random);

            System.out.printf("\n%.2f", values.get(i));
        }

        double totalValue = values.stream()
                .reduce(0.0, Double::sum);

        System.out.printf("\n\nTotal value without tax: R$%.2f", totalValue);

        double tax = totalValue * 0.08;

        System.out.printf("\n\nTotal value with tax: R$%.2f", (totalValue - tax));


    }
}

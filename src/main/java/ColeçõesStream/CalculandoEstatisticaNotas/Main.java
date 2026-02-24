package ColeçõesStream.CalculandoEstatisticaNotas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> notes = new ArrayList<>();

        double random = 0;

        System.out.print("All notes: ");

        for (int i = 0; i <= 10; i++) {
            random = Math.random() * 10;
            notes.add(random);

            System.out.printf("\n%.2f", notes.get(i));
        }

        double totalNotes = notes.stream()
                .reduce(0.0, Double::sum);

        double average = totalNotes / notes.size();

        System.out.printf("\nAverage of the classe: %.2f", average);

        double lowestNote = notes.stream()
                .min(Double::compare).get();

        System.out.printf("\nLowest note: %.2f", lowestNote);

        double highestNote = notes.stream()
                .max(Double::compare).get();

        System.out.printf("\nHighest note: %.2f", highestNote);
    }
}

package ColeçõesStream.CalculandoQuadradoDosNumeros;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for(int i = 0; i <= 10; i++){
            numbers.add(i);
        }

        List<Integer> numbersSquare = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println("List of numbers: " + numbers);
        System.out.println("List of squared numbers: " + numbersSquare);

    }
}

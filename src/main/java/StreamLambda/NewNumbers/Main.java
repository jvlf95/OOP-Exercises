package StreamLambda.NewNumbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[]args){
        List<Integer> numbers = Arrays.asList(1, 4 ,5, 3, 11, 7 ,10);

        List<Integer> newNumbers = numbers.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * 2)
                .sorted()
                .collect(Collectors.toList());

        newNumbers.forEach(System.out::println);
    }
}

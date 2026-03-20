package StreamLambda.EvenNumbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[]args){
        List<Integer> numbers = Arrays.asList(2,5,6,23,10,1,4,65,32,8);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 ==0)
                .sorted()
                .collect(Collectors.toList());

        evenNumbers.forEach(System.out::println);
    }
}

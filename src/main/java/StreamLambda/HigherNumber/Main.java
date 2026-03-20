package StreamLambda.HigherNumber;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[]args){
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        Optional<Integer> max = numbers.stream()
                .max(Integer::compareTo);

        max.ifPresent(System.out::println);



    }
}

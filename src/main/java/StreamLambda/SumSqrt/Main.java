package StreamLambda.SumSqrt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[]args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        int sumSqrt = numbers.stream()
                .filter(n -> n % 2 == 0).mapToInt(n -> n * n).sum();

        System.out.println(sumSqrt);
    }
}

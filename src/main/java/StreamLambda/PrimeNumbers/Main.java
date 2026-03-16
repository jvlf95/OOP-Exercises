package StreamLambda.PrimeNumbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[]args) {
        List<List<Integer>> numbers = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(5, 6, 7, 8),
                Arrays.asList(9, 10, 11, 12)
        );

        /*

        List<Integer> primeNumbers = new ArrayList<>();

        for(int i = 0; i < numbers.size(); i++){
            for(int j = 0; j < numbers.get(i).size(); j++){
                if(isPrime(numbers.get(i).get(j))){
                    primeNumbers.add(numbers.get(i).get(j));
                }
            }
        }

        primeNumbers.forEach(System.out::println);

         */



        List<Integer> primeNumbers = numbers.stream()
                .flatMap(n -> n.stream())
                .filter(p -> isPrime(p))
                .sorted()
                .collect(Collectors.toList());

        primeNumbers.forEach(System.out::println);



    }


    public static boolean isPrime(int n){
        if(n < 2){
            return false;
        }

        int squareN = (int) (Math.sqrt(n));

        for(int i = 2; i <= squareN; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;

    }

}









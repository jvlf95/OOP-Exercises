package StreamLambda.UpperCaseLetters;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[]args){
        List<String> words = Arrays.asList("java", "stream", "lambda");

        words.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("\nUpper case words: ");
        List<String> upperCaseWords = words.stream()
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        upperCaseWords.forEach(System.out::println);
    }
}

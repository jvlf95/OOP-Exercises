package StreamLambda.RemoveDuplicates;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[]args){
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana");

        System.out.println("Original list: ");
        words.forEach(System.out::println);

        System.out.println("Without duplicates: ");
        words.stream()
                .distinct()
                .forEach(System.out::println);
    }
}

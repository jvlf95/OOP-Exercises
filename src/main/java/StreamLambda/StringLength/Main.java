package StreamLambda.StringLength;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[]args){
        List<String> words = Arrays.asList("java", "stream", "lambda", "code");

        Map<Integer, List<String>> group = words.stream()
                .collect(Collectors.groupingBy(w -> w.length()));

        System.out.println(group);

    }
}

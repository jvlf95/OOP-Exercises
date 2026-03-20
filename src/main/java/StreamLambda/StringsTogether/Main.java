package StreamLambda.StringsTogether;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[]args){
        List<String> names = Arrays.asList("João", "Lavinia", "José");

        String result = names.stream()
                .collect(Collectors.joining(","));

        System.out.println(result);

    }
}

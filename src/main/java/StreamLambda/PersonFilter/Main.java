package StreamLambda.PersonFilter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[]args){
        List<Person> people = Arrays.asList(
                new Person("João Vitor", 23),
                new Person("Lavínia", 20),
                new Person("José", 7)
        );

        people.stream()
                .filter(p -> p.getAge() > 18)
                .sorted(Comparator.comparing(p -> p.getName()))
                .forEach(p -> System.out.println(
                        "Name: " + p.getName()
                ));
    }
}

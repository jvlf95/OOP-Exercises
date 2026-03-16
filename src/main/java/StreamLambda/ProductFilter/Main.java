package StreamLambda.ProductFilter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[]args){
        List<Product> products = Arrays.asList(
                new Product("Smartphone", 800, "Eletronic"),
                new Product("Notebook", 1500, "Eletronic"),
                new Product("Mouse", 25, "Eletronic"),
                new Product("Keyboard", 200, "Eletronic"),
                new Product("Monitor", 900, "Eletronic"),
                new Product("Shirt", 150, "Clothes"),
                new Product("Pants", 200, "Clothes")
        );

        List<Product> productLowPrice = products.stream()
                .filter(p -> p.getCategory().equals("Eletronic"))
                .sorted(Comparator.comparing(p -> p.getPrice()))
                .limit(3)
                .collect(Collectors.toList());

        productLowPrice.forEach(System.out::println);

    }
}

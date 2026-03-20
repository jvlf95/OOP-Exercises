package StreamLambda.ListProducts;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[]args){
        List<Product> products = Arrays.asList(
                new Product("Smartphone", 800.0, "Eletronics"),
                new Product("Notebook", 1500.0, "Eletronics"),
                new Product("Keyboard", 200.0, "Eletronics"),
                new Product("Chair", 300.0, "Forniture"),
                new Product("Table", 700.0, "Forniture")
        );

        // filter Eletronics low price
        List<Product> eletronicsLowPrice = products.stream()
                .filter(p -> p.getCategory().equals("Eletronics") && p.getPrice() < 1000.0)
                .sorted(Comparator.comparing(Product::getPrice))
                .collect(Collectors.toList());

        System.out.println("Eletronics lower than R$1000,00: ");
        eletronicsLowPrice.forEach(System.out::println);

        // group by category
        Map<String, List<Product>> groupCategory = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));

        System.out.println("-------------------------------------------------");
        System.out.println(groupCategory);

        // sum per category
        Map<String, Long> sumCategory = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory,
                        Collectors.counting()));

        System.out.println("-------------------------------------------------");

        System.out.println(sumCategory);

        // higher price per category
        Map<String, Optional<Product>> higherPriceCategory = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory,
                        Collectors.maxBy(Comparator.comparingDouble(Product::getPrice))));

        System.out.println("-------------------------------------------------");

        System.out.println(higherPriceCategory);

        // summ by category
        Map<String, Double> summByCategory = products.stream()
                .collect(Collectors.groupingBy(p -> p.getCategory(),
                        Collectors.summingDouble(p -> p.getPrice())));

        System.out.println("-------------------------------------------------");

        System.out.println(summByCategory);
    }
}

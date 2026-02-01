package ProgramacaoOrientadaObjeto.POO.Ex23;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Milk", 8.50);
        Product p2 = new Product("Bread", 5);
        Product p3 = new Product("Meat", 20);

        ArrayList<Product> productList = new ArrayList<>();
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);

        for (Product item : productList){
            System.out.println(item);
        }

    }
}

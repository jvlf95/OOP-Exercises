package POO.Ex31;

import POO.Ex31.Model.Person;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Your informations in JSON");
        System.out.println("What's your name: ");
        String name = scan.nextLine();
        System.out.println("How old are you: ");
        int age = scan.nextInt();
        System.out.println("What's your size: ");
        double size = scan.nextDouble();
        System.out.println("What's your weight: ");
        double weight = scan.nextDouble();

        Person p1 = new Person(name,age,size,weight);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        String json = gson.toJson(p1);
        System.out.println("Your Json is ready!");
        System.out.println(json);

        try {
            File file = new File("Person.json");
            FileWriter writer = new FileWriter(file);
            writer.write(json);
            writer.close();
        }catch(IOException e){
            System.out.println("[ERROR]");
        }


    }
}

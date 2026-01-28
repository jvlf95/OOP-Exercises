package POO.Ex21;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("João");
        stringList.add("Lavínia");
        stringList.add("José");

        // foreach
        for (String item : stringList){
            System.out.println("Name: " + item);
        }


    }
}

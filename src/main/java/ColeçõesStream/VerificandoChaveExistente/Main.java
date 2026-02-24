package ColeçõesStream.VerificandoChaveExistente;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        Map<Integer, String> clients = new HashMap<>();
        clients.put(1, "João");
        clients.put(2, "Lavínia");
        clients.put(3, "Maria");
        clients.put(4, "José");
        clients.put(5, "Sem");

        System.out.print("Choose a ID to find client's name: ");
        int id = read.nextInt();
        read.nextLine();

        if(clients.containsKey(id)){
            System.out.println("ID: " + id +
                    "\nName: " + clients.get(id));
        }else{
            System.out.println("ID " + id + " not found!");
        }
    }
}

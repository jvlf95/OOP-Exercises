package ColeçõesStream.CriandoMapClientes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        Map<Integer, String> clientes = new HashMap<>();
        clientes.put(1, "João Vitor");
        clientes.put(2, "Maria");
        clientes.put(3, "Lavínia");
        clientes.put(4, "José");

        System.out.print("Insira um número de ID 1 a 4 para saber o " +
                "cliente: ");
        int id = leitura.nextInt();
        leitura.nextLine();

        System.out.println("Cliente com ID " + id + " = " +
                clientes.get(id));

        leitura.close();
    }
}

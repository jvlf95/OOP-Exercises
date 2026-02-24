package ColeçõesStream.RemovendoElementos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        List<String> estudantes = new ArrayList<>();
        estudantes.add("Joana");
        estudantes.add("Lucas");
        estudantes.add("Pedro");
        estudantes.add("Antônio");

        System.out.println("Lista atual: " + estudantes);

        System.out.println("Remova Pedro da lista");
        System.out.print("Digite: ");
        String nome = leitura.nextLine();

        estudantes.remove(nome);

        System.out.println("Lista atualizada: " + estudantes);

    }
}

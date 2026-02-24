package ColeçõesStream.AcessandoElementos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> funcionarios = new ArrayList<>();
        funcionarios.add("João Vitor");
        funcionarios.add("Lavínia");
        funcionarios.add("Maria");

        System.out.println("Total de funcionarios: " + funcionarios.size()
        + " funcionários");

        System.out.println("Segundo funcionário da lista: " +
                funcionarios.get(1));

    }
}

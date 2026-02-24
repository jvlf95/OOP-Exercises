package ColeçõesStream.SelecionandoNomesCurtos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("João Vitor");
        employees.add("Maria");
        employees.add("Lavínia");
        employees.add("José");
        employees.add("Sem");

        List<String> employeesShortName = employees.stream()
                .filter(e -> e.length() <= 5)
                .collect(Collectors.toList());

        System.out.println("All employees: " + employees);
        System.out.println("All employees with short name: " +
                employeesShortName);


    }
}

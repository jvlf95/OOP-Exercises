package ColeçõesStream.ElementosUnicosNaLista;


import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> nomes = new HashSet<>();
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Lavína");
        nomes.add("José");
        nomes.add("Maria");

        System.out.println("Lista: " + nomes);


    }
}

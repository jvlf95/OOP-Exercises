package ColeçõesStream.AdicionandoElementosEmLista;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<String> funcionarios = new ArrayList<>();
        funcionarios.add("João Vitor");
        funcionarios.add("Maria");
        funcionarios.add("José");
        funcionarios.add("Lavínia");

        for(String funcionario : funcionarios){
            System.out.println("Nome: " + funcionario);
        }

    }
}

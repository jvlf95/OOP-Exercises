package POO.CorringindoCadastro;

public class Main {
    public static void main(String[]args){
        Colaborador c1 = new Colaborador("João Vitor", "Técnico Suporte TI", "Admin");

        c1.corrigirCadastro("Analista de Suporte TI", "Super Admin");
    }
}

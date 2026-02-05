package POO.ResumoLivro;

public class Main {
    public static void main(String[]args){
        Livro livro1 = new Livro("Programação", "João Vitor", 300);
        Livro livro2 = new Livro("Recursos Humanos", "Lavínia", 200);

        livro1.exibirResumo();
        livro2.exibirResumo();

    }
}

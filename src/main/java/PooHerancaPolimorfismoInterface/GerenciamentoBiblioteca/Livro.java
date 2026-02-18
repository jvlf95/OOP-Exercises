package PooHerancaPolimorfismoInterface.GerenciamentoBiblioteca;

public class Livro extends Midia{
    private String autor;

    public Livro(String titulo, int anoLancamento, String autor){
        super(titulo, anoLancamento);
        this.autor = autor;
    }

    public String getAutor(){
        return autor;
    }

    @Override
    public void exibirInfo(){
        System.out.println("\n-----------------" +
                "\nLIB-" + getTitulo().substring(0, 3) +
                 getAnoPublicacao() + "|Livro: '" + getTitulo() + "' - Autor: " + getAutor() +
                "\n-----------------");
    }
}

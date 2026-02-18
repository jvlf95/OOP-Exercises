package PooHerancaPolimorfismoInterface.GerenciamentoBiblioteca;

public class Midia {
    private String titulo;
    private int anoPublicacao;

    public Midia(String titulo, int anoPublicacao){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo(){
        return titulo;
    }
    public int getAnoPublicacao(){
        return anoPublicacao;
    }

    public void exibirInfo(){}
}

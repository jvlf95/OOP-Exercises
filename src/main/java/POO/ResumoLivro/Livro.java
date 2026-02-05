package POO.ResumoLivro;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Livro(String titulo, String autor, int numeroPaginas){
        setTitulo(titulo);
        setAutor(autor);
        setNumeroPaginas(numeroPaginas);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void exibirResumo(){
        System.out.printf("\n%s foi escrito por %s e possui um total de %d páginas.", titulo, autor, numeroPaginas);
    }
}

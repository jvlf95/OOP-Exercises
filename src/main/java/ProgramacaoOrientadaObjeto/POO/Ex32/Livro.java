package ProgramacaoOrientadaObjeto.POO.Ex32;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private double preco;
    private String categoria;

    public Livro(String titulo, String autor, int numeroPaginas, double preco, String categoria){
        setTitulo(titulo);
        setAutor(autor);
        setNumeroPaginas(numeroPaginas);
        setPreco(preco);
        setCategoria(categoria);
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString(){
        return "Título: " + getTitulo() +
                "\nAutor: " + getAutor() +
                "\nNúmero de páginas: " + getNumeroPaginas() +
                "\nPreço: " + getPreco() +
                "\nCategoria: " + getCategoria();
    }
}

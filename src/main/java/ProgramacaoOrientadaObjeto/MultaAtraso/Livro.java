package ProgramacaoOrientadaObjeto.MultaAtraso;

public class Livro {
    private String titulo;
    private int diasAtraso;

    public Livro(String titulo, int diasAtraso){
        setTitulo(titulo);
        setDiasAtraso(diasAtraso);
    }

    public int getDiasAtraso() {
        return diasAtraso;
    }

    public void setDiasAtraso(int diasAtraso) {
        this.diasAtraso = diasAtraso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double multaAtraso(){
        return 2.50 * getDiasAtraso();
    }

    public void exibirSituacao(){
        System.out.printf("\nNome do Livro: %s" +
                "\nDias de Atraso: %d" +
                "\nValor da Multa: R$%.2f",getTitulo(), getDiasAtraso(), multaAtraso());
    }
}

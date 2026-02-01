package ProgramacaoOrientadaObjeto.POO.Ex3;

public class Musica {
    private String titulo;
    private String artista;
    private int anoLancamento;
    private double avaliacao;
    private int numAvaliacao;

    public Musica(String t, String a, int ano){
        setTitulo(t);
        setArtista(a);
        setAnoLancamento(ano);
   }

    public String getTitulo(){
        return titulo;
    }
    public String getArtista(){
        return artista;
    }
    public int getAnoLancamento(){
        return anoLancamento;
    }
    public double getAvaliacao(){
        return avaliacao;
    }
    public int getNumAvaliacao(){
        return numAvaliacao;
    }

    public void setTitulo(String t){
        titulo = t;
    }
    public void setArtista(String a){
        artista = a;
    }
    public void setAnoLancamento(int a){
        anoLancamento = a;
    }
    public void setAvaliacao(double a){
        avaliacao += a;
    }
    public void setNumAvaliacao(int a){
        numAvaliacao++;
    }

    //métodos
    public void exibirFichaTec(){
        System.out.println("Título: " + getTitulo());
        System.out.println("Artista: " + getArtista());
        System.out.println("Ano de lançamento: " + getAnoLancamento());
        System.out.printf("Avaliação: %.2f", getMediaAvaliacao());
        System.out.println("\nNúmero de avaliações: " + getNumAvaliacao());
    }

    public void avaliarMusica(double a){
        setAvaliacao(a);
        setNumAvaliacao(1);
    }

    public double getMediaAvaliacao(){
        return (getAvaliacao() / getNumAvaliacao());
    }


}

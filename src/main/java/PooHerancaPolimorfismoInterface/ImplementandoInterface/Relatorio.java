package PooHerancaPolimorfismoInterface.ImplementandoInterface;

public class Relatorio implements Imprimivel{
    private String titulo;
    private String conteudo;

    public Relatorio(String titulo, String conteudo){
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    public String getTitulo(){
        return this.titulo;
    }
    public String getConteudo(){
        return this.conteudo;
    }


    @Override
    public void imprimir() {
        System.out.println("\nTítulo: " + getTitulo() +
                "\nConteúdo: " + getConteudo());
    }
}

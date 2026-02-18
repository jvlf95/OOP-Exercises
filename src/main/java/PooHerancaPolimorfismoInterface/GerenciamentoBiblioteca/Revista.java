package PooHerancaPolimorfismoInterface.GerenciamentoBiblioteca;

public class Revista extends Midia{
    private String edicao;

    public Revista(String titulo, int anoLancamento, String edicao){
        super(titulo, anoLancamento);
        this.edicao = edicao;
    }

    public String getEdicao(){
        return edicao;
    }
}

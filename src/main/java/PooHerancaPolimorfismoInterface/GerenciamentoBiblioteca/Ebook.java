package PooHerancaPolimorfismoInterface.GerenciamentoBiblioteca;

public class Ebook extends Midia{
    private String formato;

    public Ebook(String titulo, int anoLancamento, String formato){
        super(titulo, anoLancamento);
        this.formato = formato;
    }

    public String getFormato(){
        return formato;
    }
}

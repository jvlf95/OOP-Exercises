package PooEncapsulamento.AgendaContatos;

public class Contato {
    private String nome;
    private long telefone;

    public Contato(String nome, long telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome(){
        return nome;
    }
    public long getTelefone(){
        return telefone;
    }
}

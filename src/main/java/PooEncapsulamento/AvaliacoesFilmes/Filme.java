package PooEncapsulamento.AvaliacoesFilmes;

import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String titulo;
    private List<Integer> avaliacoes = new ArrayList<>();
    private int somaAvaliacoes;
    private int numAvaliacoes;

    public Filme(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return titulo;
    }
    public int getNumAvaliacoes(){
        return numAvaliacoes;
    }

    public double mediaAvaliacoes(){
        return somaAvaliacoes / numAvaliacoes;
    }

    public void avaliarFilme(int avaliacao){
        if(avaliacao < 1 && avaliacao > 5){
            System.out.println("Valor inválido, apenas entre 1 e 5");
        }else{
            numAvaliacoes++;
            somaAvaliacoes += avaliacao;
            avaliacoes.add(avaliacao);
        }
    }

    public void fichaTecnica(){
        System.out.println("Título: " + getTitulo() +
                "\nMédia das avaliações: " + mediaAvaliacoes() +
                "\nNúmero de avaliacções: " + getNumAvaliacoes() +
                "\nTodas a avaliações: " + avaliacoes);
    }
}

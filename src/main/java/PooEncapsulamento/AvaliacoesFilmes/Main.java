package PooEncapsulamento.AvaliacoesFilmes;

public class Main {
    public static void main(String [] args){
        Filme filme = new Filme("Shureki");


        for(int i = 0; i < 30; i++){
            int avaliacao = (int) (1 + Math.random() * 5);
            filme.avaliarFilme(avaliacao);
        }

        filme.fichaTecnica();
    }
}

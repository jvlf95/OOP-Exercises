package PooEncapsulamento.SistemaPontoAlunos;

public class Aluno {
    private String nome;
    private int nivel;
    private int pontos;

    public Aluno(String nome){
        this.nome = nome;
        this.pontos = 0;
        this.nivel = 1;
    }

    public String getNome() {
        return nome;
    }

    public int getStatus() {
        return nivel;
    }

    public int getPontos() {
        return pontos;
    }

    public void ganharPontos(){
        pontos += 10;
        nivelAluno();
    }

    public int nivelAluno(){
        return this.nivel = (getPontos()/100) + 1;
    }

    public void statusAluno(){
        System.out.println("Nome: " + getNome() +
                "\nPontos: " + getPontos() +
                "\nNível: " + nivelAluno());
    }
}

package ProgramacaoOrientadaObjeto.CalculandoNotas;

public class Aluno {
    private String nome;
    private String turma;
    private double nota1;
    private double nota2;

    public Aluno(String nome, String turma, double nota1, double nota2){
        setNome(nome);
        setTurma(turma);
        setNota1(nota1);
        setNota2(nota2);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void exibirAluno(){
        System.out.println("------------------------------------" +
                "\nNome Aluno: " + getNome() +
                "\nTurma: " + getTurma() +
                "\nNota 1: " + getNota1() +
                "\nNota 2: " + getNota2() +
                "\nMédia Final: " + getMedia() +
                "\nSituação: " + getAprovacao() +
                "\n------------------------------------");
    }

    public double getMedia(){
        return (getNota1() + getNota2()) / 2;
    }

    public String getAprovacao(){
        if(getMedia() >= 7){
            return "Aprovado";
        }
        return "Reprovado";
    }
}

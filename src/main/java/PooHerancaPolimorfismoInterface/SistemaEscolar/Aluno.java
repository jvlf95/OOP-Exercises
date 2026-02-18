package PooHerancaPolimorfismoInterface.SistemaEscolar;

public class Aluno extends Pessoa{
    private double nota1;
    private double nota2;
    private double notaFinal;

    public Aluno(String nome, int idade, double nota1, double nota2){
        super(nome, idade);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double getNota1(){
        return nota1;
    }
    public double getNota2(){
        return nota2;
    }

    public double getNotaFinal(){
        return (getNota1() + getNota2()) / 2;
    }

    @Override
    public void exibirInfo(){
        System.out.printf("\n-----------------------------------" +
                "\nNome do Aluno: %s" +
                "\nIdade: %d" +
                "\nNota 1: %.2f" +
                "\nNota 2: %.2f" +
                "\nNota Final: %.2f" +
                "\n-----------------------------------"
                , getNome(), getIdade(), getNota1(), getNota2(), getNotaFinal());
    }

}

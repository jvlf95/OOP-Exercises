package PooHerancaPolimorfismoInterface.SistemaEscolar;

public class Docente extends Pessoa{
    private String disciplina;

    public Docente(String nome, int idade, String disciplina){
        super(nome, idade);
        this.disciplina = disciplina;
    }

    public String getDisciplina(){
        return disciplina;
    }

    @Override
    public void exibirInfo(){
        System.out.printf("\n-----------------------------------" +
                "\nNome: %s" +
                "\nIdade: %d" +
                "\nProfessor de %s" +
                "\n-----------------------------------"
                , getNome(), getIdade(), getDisciplina());
    }
}

package PooHerancaPolimorfismoInterface.IdentificandoEstudante;

public class Bolsista extends Aluno{
    private String tipo;


    public Bolsista(String nome) {
        super(nome);
        this.tipo = "Bolsista";
    }

    @Override
    public void identificarAluno() {
        System.out.printf("\nNome: %s" +
                "\nTipo: %s" , getNome(), tipo);
    }
}

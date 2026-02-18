package PooHerancaPolimorfismoInterface.IdentificandoEstudante;

public class Regular extends Aluno{
    private String tipo;

    public Regular(String nome){
        super(nome);
        this.tipo = "Regular";
    }

    @Override
    public void identificarAluno(){
        System.out.printf("\nNome: %s" +
                "\nTipo: %s", getNome(), tipo);
    }
}

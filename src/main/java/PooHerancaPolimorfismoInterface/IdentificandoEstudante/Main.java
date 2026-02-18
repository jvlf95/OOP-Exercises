package PooHerancaPolimorfismoInterface.IdentificandoEstudante;

public class Main {
    public static void main(String []args){
        Aluno aluno1 = new Bolsista("João");
        Aluno aluno2 = new Regular("José");

        aluno1.identificarAluno();
        aluno2.identificarAluno();

    }
}

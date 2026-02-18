package PooHerancaPolimorfismoInterface.SistemaEscolar;

public class Main {
    public static void main(String []args){
        Aluno aluno1 = new Aluno("João Vitor", 23, 5.8, 8.5);
        Aluno aluno2 = new Aluno("José", 7, 7.4, 6.5);
        Docente docente = new Docente("Maria", 40, "Português");

        aluno1.exibirInfo();
        aluno2.exibirInfo();
        docente.exibirInfo();
    }
}

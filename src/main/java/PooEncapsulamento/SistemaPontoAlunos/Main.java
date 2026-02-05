package PooEncapsulamento.SistemaPontoAlunos;

public class Main {
    public static void main(String []args){
        Aluno aluno = new Aluno("João");

        for(int i = 0; i <10; i++){
            aluno.ganharPontos();
        }

        aluno.statusAluno();
    }
}

package PooEncapsulamento.RegistroNotas;

public class Main {
    public static void main(String[]args){
        Disciplina disciplina = new Disciplina("Matemática");

        disciplina.adicionarNota(5.5);
        disciplina.adicionarNota(9);
        disciplina.adicionarNota(-2);
        disciplina.adicionarNota(41);
        disciplina.adicionarNota(8.9);
        disciplina.adicionarNota(3.5);
        disciplina.adicionarNota(7);
        disciplina.exibirDisciplina();

    }
}

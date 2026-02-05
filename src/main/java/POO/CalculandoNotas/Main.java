package POO.CalculandoNotas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner leitura = new Scanner(System.in);
        List<Aluno> listaAluno = new ArrayList<>();
        Professor p1 = new Professor("joaovlf", "Jo123@");

        System.out.println("Portal do Professor - Lançamento de Médias");
        System.out.print("Usuário: ");
        String usuario = leitura.nextLine();
        System.out.print("Senha: ");
        String senha = leitura.nextLine();

        while(!p1.validarAcesso(usuario, senha)){
            System.out.println("Usuário / Senha inválidos, tente novamente.");
            System.out.print("Usuário: ");
            usuario = leitura.nextLine();
            System.out.print("Senha: ");
            senha = leitura.nextLine();
        }

        String resposta = " ";

        while(!resposta.equalsIgnoreCase("não")) {
            System.out.println("\nInforme as informação do aluno");
            System.out.print("Nome: ");
            String nomeAluno = leitura.nextLine();
            System.out.print("Turma: ");
            String turmaAluno = leitura.nextLine();
            System.out.print("Nota 1: ");
            double nota1 = leitura.nextDouble();
            System.out.print("Nota 2: ");
            double nota2 = leitura.nextDouble();
            leitura.nextLine();
            Aluno aluno1 = new Aluno(nomeAluno, turmaAluno, nota1, nota2);
            listaAluno.add(aluno1);

            System.out.println("Deseja adicionar mais algum?");
            System.out.print("Digite: ");
            resposta = leitura.nextLine();
        }



        for(Aluno item : listaAluno){
            System.out.printf("\nNome: " + item.getNome() + " " + item.getAprovacao() + " com %.1f", item.getMedia());
        }




    }
}

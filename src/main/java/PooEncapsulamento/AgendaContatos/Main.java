package PooEncapsulamento.AgendaContatos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String []args) throws IOException {
        Scanner leitura = new Scanner(System.in);
        ListaContatos contatos = new ListaContatos();

        String resposta = " ";

        while(!resposta.equals("não")){
            System.out.println("Adicione um contato para a agenda");
            System.out.print("Nome: ");
            String nomeContato = leitura.nextLine();
            System.out.print("Telefone: ");
            long telefoneContato = leitura.nextLong();
            leitura.nextLine();

            Contato contato = new Contato(nomeContato, telefoneContato);
            contatos.addContato(contato);

            System.out.println("Deseja adicionar mais algum?");
            System.out.print("Digite: ");
            resposta = leitura.nextLine();
        }

        contatos.listarContatos();

        FileWriter writer = new FileWriter("C:\\Users\\joaov\\OneDrive\\Desktop\\Contatos.txt");
        writer.write(contatos.listarContatos());
        writer.close();


    }
}

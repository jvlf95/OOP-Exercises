package PooEncapsulamento.AgendaContatos;

import java.util.ArrayList;
import java.util.List;

public class ListaContatos {
    private List<Contato> contatos = new ArrayList<>();
    private int totalContatos;

    public int getTotalContatos(){
        return totalContatos;
    }

    public void addContato(Contato contato){
        contatos.add(contato);
        totalContatos++;
    }

    public String listarContatos(){
        String lista = " ";
        for(Contato contato : contatos){
            lista += "------------------------------" +
                    "\nNome: " + contato.getNome() +
                    "\nTelefone: " + contato.getTelefone() +
                    "\n------------------------------";
        }
        return lista + "\nTotal de contatos: " + getTotalContatos();
    }
}

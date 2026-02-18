package EnviandoMensagem;

public class Main {
    public static void main(String []args){
        Contato contato = new Contato("Maria");
        Contato contato2 = new Contato("João");
        Mensagem mensagem = new Mensagem();

        mensagem.novaMensagem(contato);
        mensagem.novaMensagem(contato2);

    }
}

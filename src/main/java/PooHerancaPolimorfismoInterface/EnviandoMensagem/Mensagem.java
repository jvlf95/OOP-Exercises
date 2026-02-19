package PooHerancaPolimorfismoInterface.EnviandoMensagem;

public class Mensagem implements MensagemPersonalizada{

    @Override
    public void novaMensagem(Contato contato) {
        if(contato.getNome().equals("João")){
            System.out.println("Olá! Bom dia " +
                    contato.getNome());
        }else{
            System.out.println("Olá " + contato.getNome() + "!");
        }



    }
}

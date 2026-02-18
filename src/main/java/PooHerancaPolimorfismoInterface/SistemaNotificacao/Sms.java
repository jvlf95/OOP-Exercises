package PooHerancaPolimorfismoInterface.SistemaNotificacao;

public class Sms extends Notificacao{
    private String texto;

    public Sms(String destinatario, String mensagem, String texto){
        super(destinatario, mensagem);
        this.texto = texto;
    }

    public String getTexto(){
        return texto;
    }
}

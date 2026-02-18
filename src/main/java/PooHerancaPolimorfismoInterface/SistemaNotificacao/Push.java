package PooHerancaPolimorfismoInterface.SistemaNotificacao;

public class Push extends Notificacao{
    private String titulo;
    private String mensagemPush;

    public Push(String destinatario, String mensagem, String titulo, String mensagemPush){
        super(destinatario, mensagem);
        this.mensagemPush = mensagemPush;
        this.titulo = titulo;
    }

    public String getTitulo(){
        return titulo;
    }
    public String getMensagemPush(){
        return mensagemPush;
    }
}

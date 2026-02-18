package PooHerancaPolimorfismoInterface.SistemaNotificacao;

public class Email extends Notificacao implements EnviarNotificacao{
    private String assunto;
    private String corpoEmail;

    public Email(String destinatario, String mensagem, String assunto, String corpoEmail){
        super(destinatario, mensagem);
        this.assunto = assunto;
        this.corpoEmail = corpoEmail;
    }

    public String getAssunto(){
        return assunto;
    }
    public String getCorpoEmail(){
        return corpoEmail;
    }

    @Override
    public void enviar() {
        System.out.printf("\n----------------------" +
                "\nDestintário: %s" +
                "\nMensagem: %s" +
                "\nAssunto: %s" +
                "\nCorpo do Email: %s" +
                "\n----------------------", getDestinatario(), getMensagem(), getAssunto(), getCorpoEmail());
    }
}

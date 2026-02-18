package PooHerancaPolimorfismoInterface.SistemaNotificacao;

public class Main {
    public static void main(String[]args){
        Email email = new Email("Uninove", "Olá faculdade", "Diploma 2025",
                "Boa tarde, entro em contato para saber mais sobre meu diploma");

        email.enviar();
    }
}

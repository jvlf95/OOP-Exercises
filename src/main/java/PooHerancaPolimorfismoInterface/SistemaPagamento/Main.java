package PooHerancaPolimorfismoInterface.SistemaPagamento;

public class Main {
    public static void main(String[]args){
        CartaoCredito cartaoCredito = new CartaoCredito(80.50);
        BoletoBancario boletoBancario = new BoletoBancario(80.50);
        Pix pix = new Pix(80.50);

        cartaoCredito.exibirTaxa();
        boletoBancario.exibirTaxa();
        pix.exibirTaxa();
    }
}

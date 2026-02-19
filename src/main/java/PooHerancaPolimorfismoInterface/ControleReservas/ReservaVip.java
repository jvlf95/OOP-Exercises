package PooHerancaPolimorfismoInterface.ControleReservas;

public class ReservaVip extends Reserva{

    public ReservaVip(int quantidadePessoas, String data) {
        super(quantidadePessoas, data);
    }

    public void reservar(){
        System.out.println("Reserva VIP confirmada com atendimento exclusivo");
    }
}

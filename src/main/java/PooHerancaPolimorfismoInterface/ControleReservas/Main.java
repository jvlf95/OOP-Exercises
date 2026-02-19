package PooHerancaPolimorfismoInterface.ControleReservas;

public class Main {
    public static void main(String[]args){
        Reserva reserva = new Reserva(2, "10/05/2026");
        ReservaVip reservaVip = new ReservaVip(2, "20/10/2026");

        reserva.reservar();
        reserva.reservar("02/10/2026");
        reserva.reservar("02/10/2026", 2);

        reservaVip.reservar();
    }
}

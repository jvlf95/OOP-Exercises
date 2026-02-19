package PooHerancaPolimorfismoInterface.ControleReservas;

public class Reserva {
    private int quantidadePessoas;
    private String data;

    public Reserva(int quantidadePessoas, String data){
        this.quantidadePessoas = quantidadePessoas;
        this.data = data;
    }

    public int getQuantidadePessoas(){
        return quantidadePessoas;
    }
    public String getData(){
        return data;
    }

    public void reservar(){
        System.out.println("Reserva feita!");
    }

    public void reservar(String data){
        System.out.println("Reseva feita para o dia " + data);
    }

    public void reservar(String data, int quantidadePessoas){
        System.out.println("Reserva feita para " + quantidadePessoas + " pessoas no dia " + data);
    }
}

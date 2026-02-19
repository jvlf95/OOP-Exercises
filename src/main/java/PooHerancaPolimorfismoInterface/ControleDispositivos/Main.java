package PooHerancaPolimorfismoInterface.ControleDispositivos;

public class Main {
    public static void main(String[]args){
        Luz luz = new Luz();
        ArCondicionado arCondicionado = new ArCondicionado();

        luz.ligar();
        luz.ligar();
        luz.desligar();
        luz.desligar();

        arCondicionado.ligar();
        arCondicionado.ligar();
        arCondicionado.desligar();
        arCondicionado.desligar();

    }
}

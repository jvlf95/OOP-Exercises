package PooHerancaPolimorfismoInterface.ControleDispositivos;

public class ArCondicionado extends Dispositivo{
    private String nome = "Ar Condicionado";

    @Override
    public void ligar() {
        if(getEstado() == true){
            System.out.println(this.nome + " já está ligado!");
        }else{
            System.out.println(this.nome + " ligado");
            setEstado(true);
        }
    }

    @Override
    public void desligar() {
        if(getEstado() == false){
            System.out.println(this.nome + " já está desligado!");
        }else{
            System.out.println(this.nome + " desligado");
            setEstado(false);
        }
    }
}

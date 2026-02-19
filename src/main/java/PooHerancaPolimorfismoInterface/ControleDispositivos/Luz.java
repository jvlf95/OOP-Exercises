package PooHerancaPolimorfismoInterface.ControleDispositivos;

public class Luz extends Dispositivo{
    private String nome = "Luz";

    @Override
    public void ligar() {
        if(getEstado() == true){
            System.out.println(this.nome + " já está ligada!");
        }else{
            System.out.println(this.nome + " ligada");
            setEstado(true);
        }
    }

    @Override
    public void desligar() {
        if(getEstado() == false){
            System.out.println(this.nome + " já está desligada!");
        }else{
            System.out.println(this.nome + " desligada");
            setEstado(false);
        }
    }
}

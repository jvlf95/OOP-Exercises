package PooHerancaPolimorfismoInterface.ControleDispositivos;

public class Dispositivo implements Controlavel{
    private boolean estado = false;

    public boolean getEstado(){
        return this.estado;
    }
    public void setEstado(boolean estado){
        this.estado = estado;
    }


    @Override
    public void ligar() {

    }

    @Override
    public void desligar() {

    }
}

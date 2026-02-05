package PooEncapsulamento.ControleNivelBateria;

public class Dispositivo {
    private int bateria;

    public Dispositivo(int bateria){
        this.bateria = bateria;
    }

    public int getBateria(){
        return bateria;
    }

    public void statusBateria(){
        if(getBateria() <= 20){
            System.out.println("Bateria fraca -- " + getBateria() + "%");
        }else if(getBateria() <= 79){
            System.out.println("Bateria ok -- " + getBateria() + "%");
        }else{
            System.out.println("Bateria cheia -- " + getBateria() + "%");
        }
    }
}

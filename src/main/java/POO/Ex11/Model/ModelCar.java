package POO.Ex11.Model;

public class ModelCar extends Car{
    private double speed;


    public double getSpeed(){
        return speed;
    }

    public void setSpeed(double speed){
        this.speed = speed;
    }

    public void showSpeed(){
        System.out.println("Model: " + getModel() + " Speed: " + getSpeed() + " Km/h");
    }
}

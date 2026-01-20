package Ex24;

public class Circle implements Form{
    private int radius;
    private double pi = 3.14;

    public Circle(int radius){
        setRadius(radius);
    }

    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return pi * (radius * radius);
    }

    @Override
    public String toString(){
        return "Area circle radius " + getRadius() + " = " + getArea();
    }
}

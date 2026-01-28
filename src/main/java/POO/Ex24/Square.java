package POO.Ex24;

public class Square implements Form{
    private int side;

    public Square(int side){
        setSide(side);
    }

    public int getSide(){
        return side;
    }

    public void setSide(int side){
        this.side = side;
    }


    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString(){
        return "Area square side " + getSide() + " = " + getArea();
    }

}

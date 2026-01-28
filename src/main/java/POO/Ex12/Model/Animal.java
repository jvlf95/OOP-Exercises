package POO.Ex12.Model;

public class Animal {
    private String name;
    private double size;
    private boolean walkFourLegs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public boolean isWalkFourLegs() {
        return walkFourLegs;
    }

    public void setWalkFourLegs(boolean walkFourLegs) {
        this.walkFourLegs = walkFourLegs;
    }

    public void makeSound(){
        System.out.println("Doing noise...");
    }

    public void showDetails(){
        System.out.println("Name: " + getName());
        System.out.println("Size: " + getSize() + " cm");
        System.out.println("Walk in four legs: " + isWalkFourLegs());
    }
}

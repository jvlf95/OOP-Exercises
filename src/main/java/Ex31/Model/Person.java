package Ex31.Model;

public class Person {
    private String name;
    private int age;
    private double size;
    private double weight;

    public Person(String name, int age, double size, double weight ){
        setName(name);
        setAge(age);
        setSize(size);
        setWeight(weight);
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getSize(){
        return size;
    }
    public double getWeight(){
        return weight;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setSize(double size){
        this.size = size;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }

}

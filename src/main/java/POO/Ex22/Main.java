package POO.Ex22;

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Animal animal = (Animal) d1;

        if (animal instanceof Dog){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}

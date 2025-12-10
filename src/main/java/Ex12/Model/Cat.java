package Ex12.Model;

public class Cat extends Animal{

    @Override
    public void makeSound(){
        System.out.println("Meaw Meaw Meaw Meaw");
    }

    public void scratchTable(){
        System.out.println("Scraching table");
    }
}

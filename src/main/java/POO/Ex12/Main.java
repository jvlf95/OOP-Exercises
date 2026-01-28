package POO.Ex12;

import POO.Ex12.Model.Cat;
import POO.Ex12.Model.Dog;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        myDog.setName("Rex");
        myDog.setSize(60);
        myDog.setWalkFourLegs(true);
        myDog.showDetails();
        myDog.makeSound();
        myDog.wagTail();

        System.out.println("---------------------------");

        myCat.setName("Jhon");
        myCat.setSize(40);
        myCat.setWalkFourLegs(true);
        myCat.showDetails();
        myCat.makeSound();
        myCat.scratchTable();

    }
}

package ProgramacaoOrientadaObjeto.POO.Ex12.Model;

public class Dog extends Animal{

    @Override
    public void makeSound(){
        System.out.println("Au Au Au Au");
    }

    public void wagTail(){
        System.out.println("Wagging tail");
    }

}

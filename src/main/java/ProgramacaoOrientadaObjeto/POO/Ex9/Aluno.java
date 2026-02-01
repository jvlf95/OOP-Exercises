package ProgramacaoOrientadaObjeto.POO.Ex9;

public class Aluno {
    private String name;
    private double note1;
    private double note2;
    private double medium;

    public String getName(){
        return name;
    }
    public double getNote1(){
        return note1;
    }
    public double getNote2(){
        return note2;
    }
    public double getMedium(){
        return (getNote1() + getNote2()) / 2;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setNote1(double note1){
        this.note1 = note1;
    }
    public void setNote2(double note2){
        this.note2 = note2;
    }

    public void showStudent(){
        System.out.println("Name: " + getName());
        System.out.println("Note 1: " + getNote1());
        System.out.println("Note 2: " + getNote2());
        System.out.println("Medium: " + getMedium());
    }

}

package ProgramacaoOrientadaObjeto.POO.Ex27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Title t1 = new Title("Avatar");
        Title t2 = new Title("Shureki");
        Title t3 = new Title("The Boys");
        Title t4 = new Title("Nemo");

        List<Title> list = new ArrayList<>();
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);

        for (Title item : list){
            System.out.println("Name: " + item.getName());
        }

        System.out.println("Ordered List");
        Collections.sort(list);
        for (Title item : list){
            System.out.println(item);
        }

    }
}

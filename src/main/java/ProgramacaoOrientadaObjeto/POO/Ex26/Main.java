package ProgramacaoOrientadaObjeto.POO.Ex26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();



        for (int i = 0; i < 10; i++){
            int rand = (int) (Math.random() * 50);
            numberList.add(rand);
        }


        System.out.println(numberList);

        Collections.sort(numberList);

        System.out.println(numberList);




    }
}

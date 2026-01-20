package Ex24;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Square q1 = new Square(10);
        Square q2 = new Square(15);

        Circle c1 = new Circle(8);
        Circle c2 = new Circle(10);

        ArrayList<Form> formsList = new ArrayList<>();
        formsList.add(q1);
        formsList.add(q2);
        formsList.add(c1);
        formsList.add(c2);

        for (Form item : formsList){
            System.out.println(item);
        }
    }
}

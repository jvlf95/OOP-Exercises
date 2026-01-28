package POO.Ex11;

import POO.Ex11.Model.ModelCar;

public class Main {
    public static void main(String[] args) {
        ModelCar myCar = new ModelCar();

        myCar.setModel("BMW");
        myCar.setPriceYear1(100000.00);
        myCar.setPriceYear2(150000.00);
        myCar.setPriceYear3(152000.00);
        myCar.setSpeed(100.00);

        myCar.showDetails();
        myCar.showHigherPrice();
        myCar.showSpeed();

    }
}

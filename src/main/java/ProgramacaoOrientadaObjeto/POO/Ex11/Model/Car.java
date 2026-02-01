package ProgramacaoOrientadaObjeto.POO.Ex11.Model;

public class Car {
    private String model;
    private double priceYear1;
    private double priceYear2;
    private double priceYear3;


    public String getModel() {
        return model;
    }

    public double getPriceYear1() {
        return priceYear1;
    }

    public double getPriceYear2() {
        return priceYear2;
    }

    public double getPriceYear3() {
        return priceYear3;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPriceYear1(double priceYear1) {
        this.priceYear1 = priceYear1;
    }

    public void setPriceYear2(double priceYear2) {
        this.priceYear2 = priceYear2;
    }

    public void setPriceYear3(double priceYear3) {
        this.priceYear3 = priceYear3;
    }

    public void showHigherPrice() {
        if (getPriceYear1() > getPriceYear2() && getPriceYear1() > getPriceYear3()) {
            System.out.println("The higher price in 3 year was " + getPriceYear1());
        } else if (getPriceYear2() > getPriceYear1() && getPriceYear2() > getPriceYear3()) {
            System.out.println("The higher price in 3 year was " + getPriceYear2());
        } else {
            System.out.println("The higher price in 3 year was " + getPriceYear3());
        }
    }

    public void showDetails() {
        System.out.println("Model: " + getModel());
        System.out.println("Price first year $" + getPriceYear1());
        System.out.println("Price second year $" + getPriceYear2());
        System.out.println("Price third year $" + getPriceYear3());
    }


}

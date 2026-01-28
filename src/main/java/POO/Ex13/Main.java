package POO.Ex13;

import POO.Ex13.Model.CurrentAccount;


public class Main {
    public static void main(String[] args) {
        CurrentAccount c1 = new CurrentAccount();

        c1.setPersonName("João Vitor");
        c1.setNumber(24862);
        c1.makeDeposit(1000.00);
        c1.makeDeposit(500.00);
        c1.withdraw(100.00);
        c1.dicountRate();




    }
}

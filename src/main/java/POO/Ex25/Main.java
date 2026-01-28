package POO.Ex25;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(1298, "João");
        BankAccount b2 = new BankAccount(6472, "Lavínia");
        BankAccount b3 = new BankAccount(8205, "Sem Augusto");
        BankAccount b4 = new BankAccount(6893, "José");


        b1.deposit(500);
        b2.deposit(800);
        b3.deposit(5000);
        b4.deposit(200);

        ArrayList<BankAccount> accountList = new ArrayList<>();
        accountList.add(b1);
        accountList.add(b2);
        accountList.add(b3);
        accountList.add(b4);

        BankAccount higherBalance = accountList.get(0);

        for (int i  = 0; i < accountList.size(); i++){
            System.out.println(accountList.get(i));

            if (accountList.get(i).getBalance() > higherBalance.getBalance()){
                higherBalance = accountList.get(i);
            }


        }
        System.out.println("");
        System.out.println(higherBalance.getAccountHolder() + " has the highest balance R$ " + higherBalance.getBalance());

    }
}

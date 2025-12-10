package Ex13.Model;

public class CurrentAccount extends BankAccount{

    public void dicountRate(){
        double rate = (0.5 / 100) * getBalance();
        System.out.println("Balance with rate: $" + (getBalance() - rate));
    }
}

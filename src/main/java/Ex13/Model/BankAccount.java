package Ex13.Model;

public class BankAccount {
    private String personName;
    private int number;
    private double balance;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void showBalance(){
        System.out.println("Balance: " + getBalance());
    }

    public void makeDeposit(double value){
        if (value < 0){
            System.out.println("[ERROR] Value bellow zero!");
        }else{
            balance += value;
            System.out.println("Current Balance: $" + getBalance());
        }
    }

    public void withdraw(double value){
        if (value < 0){
            System.out.println("[ERROR] Value bellow zero!");
        }else if (value > getBalance()){
            System.out.println("[ERROR] Value higher than balance");
        }else{
            balance -= value;
            System.out.println("Current Balance: $" + getBalance());
        }
    }
}

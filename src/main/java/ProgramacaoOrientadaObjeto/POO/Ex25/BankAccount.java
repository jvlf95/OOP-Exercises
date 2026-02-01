package ProgramacaoOrientadaObjeto.POO.Ex25;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String accountHolder;

    public BankAccount(int accountNumber, String accountHolder){
        setAccountNumber(accountNumber);
        setAccountHolder(accountHolder);
    }

    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public String getAccountHolder(){
        return accountHolder;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }

    public void deposit(double balance){
        this.balance += balance;
    }

    @Override
    public String toString(){
        return "Account Holder: " + getAccountHolder() + " || Account Number: " + getAccountNumber() + " || Current Balance: R$ " + getBalance();
    }

}

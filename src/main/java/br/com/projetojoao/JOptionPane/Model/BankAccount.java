package br.com.projetojoao.JOptionPane.Model;
import javax.swing.JOptionPane;

public class BankAccount {
    private String clientName;
    private int accountNumber;
    private double balance;

    public BankAccount(String clientName){
        this.clientName = clientName;
        this.accountNumber = (int) (100 + Math.random() * 900);
        this.balance = 0.00;
    }

    public String getClientName(){
        return clientName;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }

    public void cashDeposit(double value){
        if(value <= 0){
            JOptionPane.showMessageDialog(null, "Value cannot be lower than 0 or 0", "[ERROR]",
                    JOptionPane.ERROR_MESSAGE);
        }else{
            this.balance += value;
            JOptionPane.showMessageDialog(null, "Current balance R$" + getBalance(), "Success",
                    JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public void cashWithdrawal(double value){
        if(getBalance() < value){
            JOptionPane.showMessageDialog(null, "No cash enough in account", "[ERROR]",
                    JOptionPane.ERROR_MESSAGE);
        }else if(value <= 0){
            JOptionPane.showMessageDialog(null, "Value cannot be lower than 0 or 0", "[ERROR]",
                    JOptionPane.ERROR_MESSAGE);
        }else{
            this.balance -= value;
            JOptionPane.showMessageDialog(null, "Current balance R$" + getBalance(), "Success",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void pix(double value, String contact){
        if(getBalance() < value){
            JOptionPane.showMessageDialog(null, "No balance enoguh", "[ERROR]",
                    JOptionPane.ERROR_MESSAGE);
        }else if(value <= 0){
            JOptionPane.showMessageDialog(null, "Value cannot be lower than 0 or 0", "[ERROR]",
                    JOptionPane.ERROR_MESSAGE);
        }else{
            this.balance -= value;
            JOptionPane.showMessageDialog(null, "Contact Name: " + contact +
                    "\nValue: R$" + value +
                    "\nCurrent Balance: R$" + getBalance(), "Success",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void accountInfo(){
        JOptionPane.showMessageDialog(null, "Client Name: " + getClientName() +
                "\nAccount Number: " + getAccountNumber() +
                "\nBalance: R$" + getBalance(), "Informations", JOptionPane.INFORMATION_MESSAGE);

    }
}

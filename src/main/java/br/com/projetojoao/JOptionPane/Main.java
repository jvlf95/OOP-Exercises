package br.com.projetojoao.JOptionPane;

import br.com.projetojoao.JOptionPane.Model.BankAccount;
import javax.swing.JOptionPane;
import java.io.FileWriter;

public class Main {
    public static void main(String[]arguments){
        String name = JOptionPane.showInputDialog(null, "To opening your account, write your name: ",
                "Beginning", JOptionPane.INFORMATION_MESSAGE);

        BankAccount b1 = new BankAccount(name);

        int response = 0;

        while(response != 1){

            String[] options = {"Deposit", "Withdrawal", "PIX"};

            int option = JOptionPane.showOptionDialog(null, "Choose one of the options bellow: ",
                    "Operations", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            if(option == 0){
                double value = Double.parseDouble(JOptionPane.showInputDialog(null, "Deposit a value",
                        "Deposit", JOptionPane.QUESTION_MESSAGE));
                b1.cashDeposit(value);
            }else if(option == 1){
                double value = Double.parseDouble(JOptionPane.showInputDialog(null, "Take a value",
                        "Withdrawal", JOptionPane.QUESTION_MESSAGE));
                b1.cashWithdrawal(value);
            }else{
                String contact = JOptionPane.showInputDialog(null, "Write a contact to send a pix",
                        "PIX", JOptionPane.QUESTION_MESSAGE);
                double value = Double.parseDouble(JOptionPane.showInputDialog(null, "Send a value",
                        "PIX", JOptionPane.QUESTION_MESSAGE));
                b1.pix(value, contact);

            }


            response = JOptionPane.showConfirmDialog(null,  "Do you want to make another operation?",
                    "Question", JOptionPane.YES_NO_OPTION ,JOptionPane.QUESTION_MESSAGE);
        }

        b1.accountInfo();

    }
}

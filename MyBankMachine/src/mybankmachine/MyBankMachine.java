package mybankmachine;

import javax.swing.*;

/**
 *
 */
public class MyBankMachine {

    public static void main(String[] args) {
        String bankType = JOptionPane.showInputDialog(
                "What type of bank do you use?\nFor example: BMO");
        double myBalance = Double.parseDouble(JOptionPane.showInputDialog(
                "What is your bank balance?"));

        //initialize bank account
        ATM ba = new ATM(bankType, myBalance);

        boolean done = false;
        while (done == false) {
            String choice = JOptionPane.showInputDialog(
                    "ATM Menu:\n"
                    + "Current " + bankType + " Balance: $"
                    + ba.showBalance()
                    + "\n1 : Deposit\n"
                    + "2 : Withdraw\n"
                    + "3 : Calculate daily interest\n"
                    + "4 : Exit ATM");

            if (choice.equals("1")) {
                double myDeposit = Double.parseDouble(JOptionPane.showInputDialog(
                        "How much money do you want to deposit?"));
                ba.addBal(myDeposit);

            } else if (choice.equals("2")) {
                double myWithdraw = Double.parseDouble(JOptionPane.showInputDialog(
                        "How much money do you want to withdraw?"));
                ba.subtractBal(myWithdraw);

            } else if (choice.equals("3")) {
                double myAIR = Double.parseDouble(JOptionPane.showInputDialog(
                        "What is your annual iterest rate?"));
                int myTime = Integer.parseInt(JOptionPane.showInputDialog(
                        "How many days for the investement?"));
                ba.calcInterest(myBalance, myAIR, myTime);

            } else if (choice.equals("4")) {
                System.exit(0);
            } else {
                choice = JOptionPane.showInputDialog(
                        "ATM Menu:\n"
                        + "Current Balance: $"
                        + ba.showBalance()
                        + "\n1 : Deposit\n"
                        + "2 : Withdraw\n"
                        + "3 : Calculate daily interest\n"
                        + "4 : Exit ATM");
            }
        }
    }
}

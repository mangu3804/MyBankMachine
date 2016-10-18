package mybankmachine;

import javax.swing.*;

/**
 * 
 */
public class MyBankMachine {
  public static void main(String[] args) {
    ATM ba;

    //Ask for random bank
    String choice = JOptionPane.showInputDialog(
      "Creating bank object:\n"
      + "1 - Enter the type of bank you use\n"
      + "2 - Generate a random bank");

    if(choice.equals("2")){
      //Use the default constructor
      ba = new ATM();
    } else if(choice.equals("1")) {
      //Ask user bank type
      String bankType = JOptionPane.showInputDialog(
        "What type of bank do you use?\nFor example: BMO");
      ba = new ATM(bankType);
    } else {
      System.out.println("Invalid selection! Generating random"
        + " bank.");
      ba = new ATM();
    }
    
    //Ask for the initial balance
    double myBalance = Double.parseDouble(JOptionPane.showInputDialog(
        "What is your bank balance?"));
        ba.setBalance(myBalance);
    
    //Ask for the amount of the annual interest rate
    double myAnnualInterestRate = Double.parseDouble(JOptionPane.showInputDialog(
        "What is your annual iterest rate?"));
        ba.setAIR(myAnnualInterestRate);
    
    //Ask for the number of days to leave the balance invested
    int myTime = Integer.parseInt(JOptionPane.showInputDialog(
        "How many days for the investement?"));
        ba.setTime(myTime);
    
/*
    //Menu to add apps
    boolean done = false;
    String myApp;
    while(!done) {
      myApp = JOptionPane.showInputDialog(
        "Please type the name of an app to add to your phone.\n"
        + "Type DONE when finished");
      if(myApp.equalsIgnoreCase("done")){
        done = true;
      } else {
        ba.addApp(myApp);
      }
    }

    //Display phone with app list
    JOptionPane.showMessageDialog(null, ba);
  }
            */
}
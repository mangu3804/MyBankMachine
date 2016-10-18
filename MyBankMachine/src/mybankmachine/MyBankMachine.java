package mybankmachine;

import javax.swing.*;

public class MyBankMachine {
  public static void main(String[] args) {
    MyBankMachine ba;

    //Ask for random phone
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
        atm.addApp(myApp);
      }
    }

    //Display phone with app list
    JOptionPane.showMessageDialog(null, atm);
*/
  }
}
package mybankmachine;

import java.util.*;

/**
 * ATM Class
 * @author mangu3804
 */
public class ATM {
    
    double p,i;
    int t;
    int numApps;
    ArrayList<String> appList;
     String typeOfBank;

  /**
   * constructor
   * pre: none
   * post: 
   */
  public ATM(String bnkType, double balance) {
    typeOfBank = bnkType;
    p = balance;
  }
  
  //Set balance
  public void calcInterest(double myBalance, double myAIR, int myTime) {
      p = myBalance;
      i = myAIR; //Set interest rate
      t = myTime; //Set number of compound periods
  }
  
  public void addBal(double balanceDep){
      p =+ balanceDep;
  }

  public void remBal(double balanceWith){
      p =+ balanceWith;
  }

  public String toString() {
    String output = "The following apps are installed on your "
      +typeOfBank+":\n";
    for(int i = 0; i < numApps; i++){
      output += "App #" + i + " - " + appList.get(i) + "\n";
    }
    return output;
  }
}
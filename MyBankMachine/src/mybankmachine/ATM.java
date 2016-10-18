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
  public ATM() {
    appList = new ArrayList<String>();
    numApps = 0;

    //No bank type was sent - pick random
    int randType = (int)(Math.random() * 3 + 1);
    if(randType == 1){
      typeOfBank = "BMO";
    }
    else if(randType == 2) {
      typeOfBank = "TD";
    }
    else {
      typeOfBank = "RBC";
    }
  }

  /**
   * constructor
   * pre: none
   * post: 
   */
  public ATM(String bnkType) {
    appList = new ArrayList<String>();
    numApps = 0;
    typeOfBank = bnkType;
  }
  
  //Set balance
  public void setBalance(double myBalance) {
      p = myBalance;
  }
  
  //Set interest rate
  public void setAIR(double myAIR) {
      i = myAIR;
  }
  
  //Set number of compound periods
  public void setTime(int myTime) {
      t = myTime;
  }
  
  /*
  public void addApp(String appName){
    appList.add(appName);
    numApps++;
  }

  public void removeApp(int location){
    appList.remove(location);
    numApps--;
  }

  public String toString() {
    String output = "The following apps are installed on your "
      +typeOfBank+":\n";
    for(int i = 0; i < numApps; i++){
      output += "App #" + i + " - " + appList.get(i) + "\n";
    }
    return output;
  }
  */
}
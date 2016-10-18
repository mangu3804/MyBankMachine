package mybankmachine;

import java.util.*;

public class ATM {
  int numApps;
  ArrayList<String> appList;
  String typeOfBank;

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

  public ATM(String bnkType) {
    appList = new ArrayList<String>();
    numApps = 0;
    typeOfBank = bnkType;
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
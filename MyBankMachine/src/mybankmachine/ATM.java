package mybankmachine;

import java.util.*;

/**
 * ATM Class
 *
 * @author mangu3804
 */
public class ATM {

    double p, i;
    int t;
    int numApps;
    ArrayList<String> appList;
    String typeOfBank;

    /**
     * constructor pre: none post:
     */
    public ATM(String bnkType, double balance) {
        typeOfBank = bnkType;
        p = balance;
    }

    //Calculate interest
    public double calcInterest(double myBalance, double myAIR, int myTime) {
        p = myBalance;
        i = myAIR; //Set interest rate
        t = myTime; //Set number of compound periods
        p = Math.pow((p * (1 + i)), t);
        return p;
    }

    public void addBal(double balanceDep) {
        p += balanceDep;
    }

    public void subtractBal(double balanceWith) {
        p -= balanceWith;
    }

    //Display balance
    public double showBalance() {
        double balance = p;
        return balance;
    }

    public String toString() {
        String output = "The following apps are installed on your "
                + typeOfBank + ":\n";
        for (int i = 0; i < numApps; i++) {
            output += "App #" + i + " - " + appList.get(i) + "\n";
        }
        return output;
    }
}

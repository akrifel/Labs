/* 
Main.java
Lab 1: InterestOfDeposit
Ariel Khavasov
I dont remember when i wrote this!
This is a program that shows interestRates of a set deposit over x amount of years
*/
import java.io.Console;
import java.util.*;
import java.text.DecimalFormat;


public class InterestOfDeposit {
    // inform user what program will compute
    static void printIntro() 
    {
        System.out.println("Welcome to Cool Bank Name Inc, Please type in your balance, interest rate, and amount of years you would like your balance to be calculated for");
    }
    // This method is responsible for printing the headers for the table and
    // generating the content of the table – it should call
    // printRow to print each individual row of the table
    static void printTable(int numRows, double balance, double interest) {
        double newBalance = balance;
        for (int i = 0; i <= numRows; i++) {
            if (i == 0)
            {
                System.out.println("Year\tBalance \t Interest\tNew Balance");
                System.out.println("----\t------- \t --------\t-----------");
            } 
            else 
            {
                printRow(i, newBalance, calcInterest(interest, newBalance));
                newBalance = newBalance * (1 + (interest / 100));
            }
        }
    }
    // This method is responsible for printing a single row of the table
    static void printRow(int rowNum, double balance, double interest) {
        DecimalFormat fmt = new DecimalFormat("0.00");
        DecimalFormat money = new DecimalFormat("$0.00");
        System.out.println(rowNum + "\t" + money.format(balance) + " \t " + fmt.format(interest) + "\t \t " + money.format((balance * (1 + (interest / 100)))));
    }
    // This method calculates and returns the amount of interest
    static double calcInterest(double rateOfChange, double balance) {
        return balance * (rateOfChange / 100);
    }
    public static void main(String[] args) {
        printIntro();
        Scanner sonsole = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("0.00");
        double balance;
        System.out.print("Please Enter The Initial Balance: ");
        double iBalance = sonsole.nextDouble();
        balance = iBalance;
        System.out.print("Please Enter the Inteset Rate: ");
        double interestRate = sonsole.nextDouble();
        System.out.print("Please Enter The Number Of Years: ");
        int numOfYears = sonsole.nextInt();
        printTable(numOfYears, balance, interestRate);
    }
}

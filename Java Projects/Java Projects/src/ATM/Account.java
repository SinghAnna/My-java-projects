package ATM;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
     private int customerNumber;
     private int pinNumber;
     private double checkingBalance = 0;
     private double savingBalance = 0;

     Scanner input = new Scanner(System.in);
     DecimalFormat moneyFormat = new DecimalFormat("'₹'###,##0.00");

     public void setCustomerNumber(int customerNumber){
         this.customerNumber = customerNumber;
     }

     public int getCustomerNumber(){
         return customerNumber;
     }

     public void setPinNumber(int pinNumber){
         this.pinNumber = pinNumber;
     }

     public  int getPinNumber(){
         return pinNumber;
     }

     public double getCheckingBalance(){
          return checkingBalance;
     }

     public double getSavingBalance(){
         return savingBalance;
     }

     public void calCheckingWithdraw(double amount){
           checkingBalance = (checkingBalance - amount);
     }

     public void calSavingWithdraw(double amount){
         savingBalance = (savingBalance - amount);
     }

    public void calCheckingDeposit(double amount){
         checkingBalance = (checkingBalance + amount);
    }

    public void calSavingDeposit(double amount){
         savingBalance = (savingBalance + amount);
    }

    public void getCheckingWithdrawInput(){
        System.out.println("Checking Account balance: "+ moneyFormat.format(checkingBalance));
        System.out.print("Amount you want to withdraw form Checking Account: ");
        double amount = input.nextDouble();

        if (checkingBalance - amount >=0){
            calCheckingWithdraw(amount);
            System.out.println("New Checking Account Balance: "+ moneyFormat.format(checkingBalance));
        }
        else {
            System.out.println("Not Enough Money to Withdraw");
        }
    }

     public void getSavingWithdrawInput(){
         System.out.println("Saving Account balance: "+ moneyFormat.format(savingBalance));
         System.out.print("Amount you Want to Withdraw from Saving Account: ");
         double amount = input.nextDouble();

         if (savingBalance - amount >= 0){
             calSavingWithdraw(amount);
             System.out.println("New Saving Account Balance: " + moneyFormat.format(savingBalance));
         }
         else {
             System.out.println("Not Enough Money to Withdraw");
         }
     }

      public void getCheckingDepositInput(){
          System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
          System.out.print("Amount you want to deposit to checking Account: ");
          double amount = input.nextDouble();

          if (checkingBalance + amount >= 0) {
              calCheckingDeposit(amount);
              System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
          }
          else {
              System.out.println("No money to Deposit");
          }
      }

      public void getSavingDepositInput(){
          System.out.println("Saving Account Balance: "+ moneyFormat.format(savingBalance));
          System.out.print("Amount you want to deposit to Saving Account: ");
          double amount = input.nextDouble();

          if (checkingBalance + amount >= 0){
              calSavingDeposit(amount);
              System.out.println("New Saving Account Balance: " + moneyFormat.format(savingBalance));
          }
          else {
              System.out.println("No Money to Deposit");
          }
      }
}

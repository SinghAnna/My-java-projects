package Basic_Bank_System;


import java.util.HashMap;
import java.util.Map;

class Bank{
    private final Map<String,Account> accounts;

    public Bank(){
        this.accounts = new HashMap<>();
    }

    public void addAccount(String accountNumber, String customerName, double balance){
        Account account = new Account(accountNumber,customerName,balance);
        accounts.put(accountNumber,account);
    }
       public void displayAccountInfo(String accountNumber){
        if (accounts.containsKey(accountNumber)){
            Account account = accounts.get(accountNumber);
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Customer Name: "+ account.getCustomerName());
            System.out.println("Balance: ₹"+account.getBalance());
        }else {
            System.out.println("Account not found!");
        }
       }
    
       public void performTransaction(String accountNumber,double amount){
        if (accounts.containsKey(accountNumber)){
            Account account = accounts.get(accountNumber);
            account.deposit(amount);
            System.out.println("Transaction successful. Update balance: ₹"+ account.getBalance());
        }
        else {
            System.out.println("Account not found!");
        }
       }
}

class Account{
    private final String accountNumber;
    private final String customerName;
    private double balance;

   public Account(String accountNumber,String customerName,double balance){
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();

         // Adding a few accounts
        bank.addAccount("101","Anant Singh",2000.0);
        bank.addAccount("102","Satyam Singh",1000.0);

        //Performing transactions
        bank.performTransaction("102",500.0);

        bank.displayAccountInfo("101");
        bank.displayAccountInfo("102");
    }
}

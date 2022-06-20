package com.kenzie.app;

import java.util.Locale;
import java.util.Random;

public class Account {
    //create class instance variables here
    private String userName;
    private String accountId;
    private double balance;

    //implement the following class constructors
    public Account(String userName) {
        this.userName = userName;

        Random rand = new Random();
        int id = rand.nextInt(999999);
        String idNumber =  String.format("%06d", id);
        this.accountId = userName.toLowerCase().substring(0, 3).concat(idNumber);

        this.balance = 0.0;
    }

    public Account(String userName, String accountId) {
        this.userName = userName;
        this.accountId = accountId;
        this.balance = 0.0;
    }

    public Account(String userName, String accountId, double balance) {
        this.userName = userName;
        this.accountId = accountId;
        this.balance = balance;
    }

    public String getUserName() {
        // return the user name of the current account
        return userName;
    }

    public String getAccountId() {
        // return the account id fo the current account
        return accountId;
    }

    public double getBalance() {
        // return the current balance of the account
        return balance;
    }

    public void makeDeposit(double amount) {
        // Add the given amount to the balance of the account
        balance += amount;
    }

    public double makeWithdrawal(double amount) {
        // If the account has enough money, then withdraw the given amount
        // If the account does not have enough money, then return 0 and do not modify the balance
        // Otherwise return the amount that was withdrawn
       if(balance >= amount){
           balance -= amount;
       }else{
           return 0;
       }
       return amount;
    }
}

package com.company;

public class eWallet {
    private int balance;

    public int getBalance() {
        return balance;
    }
    public void deposit(int Money) {
        balance+=Money;
        System.out.println("Success! Your current balance is "+balance);
    }
    public void withdraw(int amountOfMoney) {
        if (balance < amountOfMoney) {
            System.out.println("Invalid Input! Your current balance ("+balance+") isn't sufficient to withdraw "+amountOfMoney);
        }
        else {
            balance -= amountOfMoney;
            System.out.println("You have withdrawn "+amountOfMoney+", your current balance is "+balance);
        }
    }
}

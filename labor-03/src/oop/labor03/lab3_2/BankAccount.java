//ezt atmasoltuk a 2.laborbol

package oop.labor03.lab3_2;

public class BankAccount {

    private double balance;
    private String accountNumber;

    //Constructor
    public BankAccount(String accountNumber){
        //Robi resze
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    //getters
    public double getBalance(){

        return this.balance;
    }

    public String getAccountNumber(){

        return this.accountNumber;
    }

    public void deposit(double amount) {
        if(amount>0)
        {
            balance += amount;
        }

    }

    public boolean withdraw(double amount){
        //Peter
        if(amount <= balance){
            balance-=amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        //OTP000001 account number, your balance is: 1000 EUR.
        String Account = this.accountNumber;
        Account+= " account number, your balance is: ";
        Account+=this.balance;
        Account+=" EUR.";
        return Account;
        //return this.accountNumber + " account number, your balance is: " + this.balance + " EUR.";

    }
}

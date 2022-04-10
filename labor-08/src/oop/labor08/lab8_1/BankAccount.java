//ezt atmasoltuk a 2.laborbol

package oop.labor08.lab8_1;

public class BankAccount {

    protected double balance;
    protected final String accountNumber;
    public static final String PREFIX = "OTP";
    public static final int ACCOUNT_NUMBER_LENGHT = 10;
    private static int numAccounts = 0;
    //Constructor

    /**
     * szamlaszamot generalunk
     * OTP - a prefix, numAccount szamaval vegzodjon
     * @return
     */

    protected BankAccount() {
        ++numAccounts;
        this.accountNumber = createAccountNumber();
    }

    private String createAccountNumber() {
       int zeros = ACCOUNT_NUMBER_LENGHT - PREFIX.length() - String.valueOf(numAccounts).length();
       return PREFIX + "0".repeat(zeros) + numAccounts;
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

package oop.labor08.lab8_1;

public class CheckingAccount extends BankAccount{
    private double overdraftLimit;
    public CheckingAccount(double overdraftLimit){

        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if(balance +overdraftLimit - amount >= 0){
            balance-=amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+"\n\tCheckingAccount: " + "overdraftLimit = " + overdraftLimit ;
    }
}

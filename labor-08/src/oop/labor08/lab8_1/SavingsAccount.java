package oop.labor08.lab8_1;

public class SavingsAccount extends BankAccount{
    private double interestRate;
    public SavingsAccount(double interestRate){
        //itt automatikusan meghivodik a super() mert nincsenek parameterei a BankAccountnak
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public void addInterestRate(){
        this.balance = balance + (balance * interestRate);
    }

    @Override
    public String toString() {
        return super.toString()+"\n\tSavingsAccount: " +
                "interestRate = " + interestRate;
    }
}

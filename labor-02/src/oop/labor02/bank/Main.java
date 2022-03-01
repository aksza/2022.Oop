package oop.labor02.bank;

public class Main {
    public static void main(String[] args) {
        //1.
        BankAccount account1 = new BankAccount("OTP00001");
        //2.
        System.out.println(account1.getAccountNumber() + ": "+account1.getBalance());
        //3.
        account1.deposit(1000);
        //4.
        System.out.println(account1.getAccountNumber() + ": "+account1.getBalance());
        //5.
        boolean result = account1.withdraw(500);
        if(!result){
            System.out.println("You don't have sufficient founds for this withdraw");
        }
        //6.
        // 3 fele keppen lehet kiiratni:
        // System.out.println(account1.getAccountNumber()+ ": "+ account1.getBalance());
        System.out.println(account1.toString());
        //System.out.println(account1);
        //eredmeny: OTP000001 account number, your balance is: 1000 EUR.
        //7.
        result = account1.withdraw(1000);
        if(!result){
            System.out.println("You don't have sufficient founds for this withdraw");
        }
        //8.
        System.out.println(account1.toString());
        //9.
        BankAccount account2 = new BankAccount("OTP00002");
        //10.
        System.out.println(account2.toString());
        //11.
        account2.deposit(2000);
        //12.
        System.out.println(account2.toString());
    }
}

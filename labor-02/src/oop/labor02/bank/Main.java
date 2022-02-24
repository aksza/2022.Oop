package oop.labor02.bank;

public class Main {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("OTP00001");
        System.out.println(account1.getAccountNumber());
        System.out.println(account1.getBalance());
        account1.deposit(2000);
        account1.withdraw(1000);

        boolean result = account1.withdraw(2500);
        if(!result){
            System.out.println("You don't have sufficient founds for this withdraw");
        }
        System.out.println(account1.getAccountNumber()+ ": "+ account1.getBalance());
        System.out.println(account1.toString());
        System.out.println(account1);
        //OTP000001 account number, your balance is: 1000 EUR.


    }
}

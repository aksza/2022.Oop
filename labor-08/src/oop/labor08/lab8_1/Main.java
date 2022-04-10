package oop.labor08.lab8_1;

public class Main {
    public static void main(String[] args) {
        /*
        SavingsAccount savingsAccount = new SavingsAccount(9.3);
        System.out.println(savingsAccount);
        savingsAccount.deposit(457);
        System.out.println(savingsAccount);
        savingsAccount.withdraw(234);
        System.out.println(savingsAccount);
        savingsAccount.addInterestRate();
        System.out.println(savingsAccount);
        CheckingAccount checkingAccount = new CheckingAccount(20);
        System.out.println(checkingAccount);
        checkingAccount.deposit(48);
        System.out.println(checkingAccount);
        checkingAccount.withdraw(69);
        System.out.println(checkingAccount);
*/
        Bank bank1 = new Bank("OTP");
        bank1.addCustomer(new Customer("Suciu","Aksza"));
        bank1.addCustomer(new Customer("Simon","Peter"));
        bank1.getCustomer(1).addAccount(new SavingsAccount(9));
        bank1.getCustomer(1).addAccount(new CheckingAccount(40));
        bank1.getCustomer(2).addAccount(new SavingsAccount(2));
        bank1.getCustomer(2).addAccount(new CheckingAccount(50));
        bank1.getCustomer(1).getAccount("OTP0000001").deposit(70);
        bank1.getCustomer(1).getAccount("OTP0000002").deposit(30);
        bank1.getCustomer(2).getAccount("OTP0000003").deposit(150);
        bank1.getCustomer(2).getAccount("OTP0000004").deposit(56);
        System.out.println(bank1.getCustomer(1));
        System.out.println(bank1.getCustomer(2));
        ((SavingsAccount)bank1.getCustomer(1).getAccount("OTP0000001")).addInterestRate();
        ((SavingsAccount)bank1.getCustomer(2).getAccount("OTP0000003")).addInterestRate();
        System.out.println(bank1.getCustomer(1));
        System.out.println(bank1.getCustomer(2));
        bank1.getCustomer(1).getAccount("OTP0000001").withdraw(79);
        bank1.getCustomer(1).getAccount("OTP0000002").withdraw(25);
        bank1.getCustomer(2).getAccount("OTP0000003").withdraw(90);
        bank1.getCustomer(2).getAccount("OTP0000004").withdraw(105);
        System.out.println(bank1.getCustomer(1));
        System.out.println(bank1.getCustomer(2));
    }
}

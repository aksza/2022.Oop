package oop.labor03.lab3_2;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Suciu","Aksza");
        Customer customer2 = new Customer("Suciu","Lidia");
        customer1.addAccount(new BankAccount("OTP0001"));
        customer1.addAccount(new BankAccount("OTP0002"));
        customer1.addAccount(new BankAccount("OTP0003"));
        customer1.addAccount(new BankAccount("OTP0004"));
        customer1.addAccount(new BankAccount("OTP0005"));
        customer2.addAccount(new BankAccount("BRD0001"));
        customer2.addAccount(new BankAccount("BRD0002"));
        customer2.addAccount(new BankAccount("BRD0003"));
        customer2.addAccount(new BankAccount("BRD0004"));
        customer2.addAccount(new BankAccount("BRD0005"));
        customer2.addAccount(new BankAccount("BRD0006"));
        customer2.addAccount(new BankAccount("BRD0007"));
        customer2.addAccount(new BankAccount("BRD0008"));
        customer2.addAccount(new BankAccount("BRD0009"));
        System.out.println(customer1);
        System.out.println(customer2);
        Random rand = new Random();
        customer1.getAccount("OTP0001").deposit(rand.nextInt(100000));
        customer1.getAccount("OTP0002").deposit(rand.nextInt(100000));
        customer1.getAccount("OTP0003").deposit(rand.nextInt(100000));
        customer1.getAccount("OTP0004").deposit(rand.nextInt(100000));
        customer1.getAccount("OTP0005").deposit(rand.nextInt(100000));
        customer2.getAccount("BRD0001").deposit(rand.nextInt(100000));
        customer2.getAccount("BRD0002").deposit(rand.nextInt(100000));
        customer2.getAccount("BRD0003").deposit(rand.nextInt(100000));
        customer2.getAccount("BRD0004").deposit(rand.nextInt(100000));
        customer2.getAccount("BRD0005").deposit(rand.nextInt(100000));
        customer2.getAccount("BRD0006").deposit(rand.nextInt(100000));
        customer2.getAccount("BRD0007").deposit(rand.nextInt(100000));
        customer2.getAccount("BRD0008").deposit(rand.nextInt(100000));
        customer2.getAccount("BRD0009").deposit(rand.nextInt(100000));
        System.out.println(customer1);
        System.out.println(customer2);
        customer1.closeAccount("OTP0001");
        System.out.println(customer1);
        customer2.closeAccount("BRD0009");
        System.out.println(customer2);
    }
}

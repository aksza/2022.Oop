package oop.labor03.lab3_1;

public class Main {
    public static void main(String[] args){
        //test
        Customer customer1 = new Customer("John","BLACK");
        //System.out.println(customer1.toString());
        //System.out.println(customer1);
        /*ez igy nemjo
        BankAccount account1 = new BankAccount("OTP00001");
        customer1.setAccount(account1);

         */
        customer1.setAccount(new BankAccount("OTP00001"));
        System.out.println(customer1);
        customer1.getAccount().deposit(1000);
        System.out.println(customer1);
        /*
        System.out.println(customer1.getFirstName()+" "+customer1.getLastName());

        customer1.closeAccount();
        System.out.println(customer1);
         */
        Customer customer2 = new Customer("Mary","WHITE");
        // nem jo
        // BankAccount account2 = new BankAccount("OTP00002");
        customer2.setAccount(new BankAccount("OTP00002"));
        System.out.println(customer2);
        customer2.closeAccount();
        System.out.println(customer2);
        customer2.setLastName(customer1.getLastName());
        System.out.println(customer2);
        customer2.setAccount(customer1.getAccount());
        System.out.println(customer1);
        System.out.println(customer2);

    }
}

package oop.labor06.lab6_1;

import oop.labor06.lab6_1.BankAccount;

import java.util.ArrayList;

public class Customer {
    //constants
    private final String firstName;
    private String lastName;
    private final int id;
    private static int numCustomers = 0;
    private ArrayList<BankAccount> accounts = new ArrayList<>();
    //constructor
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = ++numCustomers;
    }
    //setter
    public void addAccount(BankAccount account){
        this.accounts.add(account);
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    //getter

    public int getId() {
        return id;
    }
    public BankAccount getAccount(String accountNumber){
        for(BankAccount i:accounts){
            // i - re  atirni !!!
            if(i.getAccountNumber().equals(accountNumber)){
                return i;
            }
        }
        return null;
    }
    public ArrayList<String> getAccountNumbers(){
        ArrayList<String> accountNumbers = new ArrayList<>();
        for(BankAccount account:accounts){
            accountNumbers.add(account.getAccountNumber());
        }
        return accountNumbers;
    }
    public int getNumAccounts(){
        return accounts.size();
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    //methods
    public void closeAccount(String accountNumber){
            int nr = 0;
            for (BankAccount i:accounts) {
                // i- re atirni !!!
                if (i.getAccountNumber().equals(accountNumber)) {
                    accounts.remove(nr);
                    System.out.println("Bank account "+accountNumber+" closed successfuly");
                    return;
                }
                nr++;
            }
            System.out.println("Account not found");

    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();

        result.append(firstName).append(' ').append(lastName).append(" accounts:\n");
        for(BankAccount i:accounts){
            result.append("\tBankAccount(id = '").append(this.id).append("', accountNumber = '").append(i.getAccountNumber()).append("', balance = ").append(i.getBalance()).append(")\n");
        }
        return result.toString();
    }
}

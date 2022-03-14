package oop.labor04.lab4_2;

import java.util.ArrayList;

public class Customer {
    //constants
    private final String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts = new ArrayList<>();
    //constructor
    public Customer(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //setter
    public void addAccount(BankAccount account){
        this.accounts.add(account);
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    //getter
    public BankAccount getAccount(String accountNumber){
        for(BankAccount i:accounts){
            // i - re  atirni !!!
            if(i.getAccountNumber().equals(accountNumber)){
                return i;
            }
        }
        return null;
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
            result.append("\tBankAccount(accountNumber = '").append(i.getAccountNumber()).append("', balance = ").append(i.getBalance()).append(")\n");
        }
        return result.toString();
    }
}

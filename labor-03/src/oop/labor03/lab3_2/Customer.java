package oop.labor03.lab3_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Customer {
    //constants
    public static final int MAX_ACCOUNTS = 10;  //static - mindenki elerheti, final - nem modosithato
    //variables
    private int numAccounts;
    private final String firstName;
    private String lastName;
    private final BankAccount[] accounts = new BankAccount[MAX_ACCOUNTS];
    //constructor
    public Customer(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //setter
    public void addAccount(BankAccount account){
        if(this.numAccounts < MAX_ACCOUNTS) {
            this.numAccounts++;
            this.accounts[numAccounts - 1] = account;
        }
        else System.out.println("Cannot add more account");
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    //getter
    public BankAccount getAccount(String accountNumber){
        for(int i=0;i<this.numAccounts; ++i){
            if(this.accounts[i].getAccountNumber().equals(accountNumber)){
                return this.accounts[i];
            }
        }
        return null;
    }
    public int getNumAccounts(){
        return this.numAccounts;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    //methods
    public void closeAccount(String accountNumber){
        int index = -2;
        if(numAccounts > 0) {
            index = -1;
            for (int i = 0; i < this.numAccounts; ++i) {
                if (this.accounts[i].getAccountNumber().equals(accountNumber)) {
                    index = i;
                    break;
                }
            }
            if(index >= 0){

                if (numAccounts - 1 - index >= 0)
                {System.arraycopy(this.accounts, index + 1, this.accounts, index, numAccounts - 1 - index);
                numAccounts--;}
                return;
            }


        }
            System.out.println("Account not found");
    }

    @Override
    public String toString(){
        StringBuffer result = new StringBuffer();
        result.append(firstName + ' ' + lastName + " accounts:\n");
        for(int i = 0; i< numAccounts; ++i){
            result.append("\t" + accounts[i].toString() + "\n");
        }
        return result.toString();
    }
}

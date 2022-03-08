package oop.labor03.lab3_1;

public class Customer {
    //variables
    private String firstName;
    private String lastName;
    private BankAccount account;
    public Customer(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //setter
    public void setAccount(BankAccount account){
        this.account = account;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    //getter
    public BankAccount getAccount(){
        return this.account;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    //methods
    public void closeAccount(){
        this.account = null;
    }

    @Override
    public String toString(){
        String customer = "COSTUMER\nName: ";
        customer += this.firstName;
        customer += " ";
        customer += this.lastName;
        customer += "\n";
        if(account !=null) {
            customer += account.toString();
        }
        else {
            customer += "This customer does not have an account";
        }
        return customer;
    }
}

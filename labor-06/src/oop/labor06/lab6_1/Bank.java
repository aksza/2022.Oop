package oop.labor06.lab6_1;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Bank {
    private final String name;
    private ArrayList<Customer> customers;

    public Bank(String name){
        this.name = name;
        this.customers = new ArrayList<>();
    }
    public Customer getCustomer(int id) {
        for(Customer customer:customers){
            if(id == customer.getId()){
                return customer;
            }
        }
        return null;
    }
    public void addCustomer(Customer customer){
        this.customers.add(customer);
    }
    public int numCustomers(){
        return customers.size();
    }
    //ezeket a classon kivul is meg tudom hivni
    public void printCustomersToFile(String fileName){
        try(PrintStream printStream = new PrintStream(fileName)){
            printCustomers(printStream);
        }
        catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
    }
    public void printCustomersToStdOut(){
        printCustomers(System.out);
    }
    private void printCustomers(PrintStream ps){
        //Itt vana konkret kiiratas
        ps.println("ID, Firstname, Last name, Number of bank accounts");
        for( Customer customer: customers ){
            ps.println( customer.getId()+", " + customer.getFirstName() +", "+
                    customer.getLastName()+", "+customer.getNumAccounts());
        }
        ps.close();
    }

}

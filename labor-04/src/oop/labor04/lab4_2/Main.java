package oop.labor04.lab4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<Customer> customerArrayList = readFile("lab4_2_input.txt");
        for (Customer customer : customerArrayList) {
            System.out.println(customer);
        }
        /*customerArrayList.get(0).closeAccount("OTP1");
        System.out.println(customerArrayList.get(0));
         */
        System.out.println(customerArrayList.get(2).getAccount("OTP5"));
        System.out.println(customerArrayList.get(2).getNumAccounts());
        System.out.println(customerArrayList.get(1).getNumAccounts());
        customerArrayList.get(1).addAccount(new BankAccount("OTP6"));
        for (Customer customer : customerArrayList) {
            System.out.println(customer);
        }

    }
    public static ArrayList<Customer> readFile(String fileName){
        ArrayList<Customer> customers = new ArrayList<>();
        try (Scanner scanner = new Scanner( new File(fileName))){
            //read and process the lines
            int nrOfCustomers = 0;
            while(scanner.hasNextLine())
            {
                String line = scanner.nextLine();

                String[] items = line.split(", ");
                if(items[0].equals("Customer")){
                    String firstName = items[1].trim();
                    String lastName = items[2].trim();
                    customers.add(new Customer(firstName,lastName));
                    nrOfCustomers++;
                }
                else{
                    customers.get(nrOfCustomers-1).addAccount(new BankAccount(items[1]));
                    customers.get(nrOfCustomers-1).getAccount(items[1]).deposit(Double.parseDouble(items[2]));
                }
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return customers;
    }
}

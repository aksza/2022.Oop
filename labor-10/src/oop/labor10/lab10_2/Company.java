package oop.labor10.lab10_2;

import jdk.nio.mapmode.ExtendedMapMode;
import oop.labor10.lab10_1.MyDate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;


public class Company {
    private String name;
    private ArrayList<Employee> employees;
    public Company(String name){
        this.name = name;
        this.employees = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void hire(Employee emp){
        if(!employees.contains(emp)){
            employees.add(emp);
        }
    }
    public void hireAll(String file){
        try (Scanner scanner = new Scanner(new File(file))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                // trim: eliminates leading and trailing spaces
                String firstName = items[0].trim(); // a trim a folosleges spaceket kihagyja
                String lastName = items[1].trim();
                int salary = Integer.parseInt(items[2].trim());
                int year = Integer.parseInt(items[3].trim());
                int month = Integer.parseInt(items[4].trim());
                int day = Integer.parseInt(items[5].trim());
                if(items.length == 7){
                    Employee emp = new Manager(firstName,lastName,salary,new MyDate(year,month,day),items[6].trim());
                    if(!employees.contains(emp)){
                        employees.add(emp);
                    }
                }
                else {
                    Employee emp = new Employee(firstName,lastName,salary,new MyDate(year,month,day));
                    if(!employees.contains(emp)){
                        employees.add(emp);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void fire(int id){
        employees.removeIf(e -> e.getID() == id);
    }

    public void printAll(PrintStream printStream){
        for(Employee e:employees){
            printStream.println(e);
        }
    }
    public void printManagers(PrintStream printStream){
        for(Employee e:employees){
            if(e instanceof Manager) {
                printStream.println(e);
            }
        }
    }
    void sortByComparator(Comparator<Employee> employeeComparator){
        employees.sort(employeeComparator);
    }
}

package oop.labor10.lab10_2;

import oop.labor10.lab10_1.MyDate;

import javax.swing.*;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Company company = new Company("Microsoft");

        company.hire(new Manager("Patricia", "Schifler", 6000, new MyDate(2002, 3, 5), "frontend"));
        company.hire(new Employee("Robert", "Ambarus", 4000, new MyDate(2002, 4, 11)));
        company.hire(new Employee("Kinga", "Olah", 4000, new MyDate(1999, 6, 21)));
        company.hire(new Employee("Johanna", "Rigmanyi", 4000, new MyDate(2000, 12, 22)));

        System.out.println("Employees");

        company.printAll(System.out);

        company.sortByComparator(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getBirthDate().compareTo(o2.getBirthDate());
            }
        });
        System.out.println("Sorted by birth date");
        company.printAll(System.out);


    }
}

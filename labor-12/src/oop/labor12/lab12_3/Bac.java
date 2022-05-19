package oop.labor12.lab12_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Bac {
    private HashMap<Integer,Student> students;
    public Bac(String fileName){
        students = new HashMap<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(" ");
                // trim: eliminates leading and trailing spaces
                int id = Integer.parseInt(items[0].trim());
                String firstName = items[1].trim(); // a trim a folosleges spaceket kihagyja
                String lastName = items[2].trim();
                // Convert String → int: Integer.parseInt( String)
                students.put(id,new Student(id,lastName,firstName));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void addMarks(String filename,Subject subject){
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(" ");
                // trim: eliminates leading and trailing spaces
                int id = Integer.parseInt(items[0].trim());
                double grade = Double.parseDouble(items[1].trim());
                // Convert String → int: Integer.parseInt( String)
                students.get(id).add(new Mark(subject,grade));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void print(){
        AtomicInteger pass = new AtomicInteger();
        TreeSet<String>  notpassed = new TreeSet<>();
        students.forEach((id, student)->{
            if(student.passed()){
                pass.getAndIncrement();
            }
            else{
                notpassed.add(student.getFirstName()+" "+student.getLastName());
            }
        });
        System.out.println("number of passed students: "+ pass.get());
        for (String not:notpassed) {
            System.out.println(not);
        }
    }
}

package oop.labor11.lab11_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("students.csv"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                try {
                    // trim: eliminates leading and trailing spaces
                    String neptun = items[0].trim(); // a trim a folosleges spaceket kihagyja
                    String firstName = items[1].trim();
                    String lastName = items[2].trim();
                    int credits = Integer.parseInt(items[3].trim());
                    int birthYear = Integer.parseInt(items[4].trim());
                    int birthMonth = Integer.parseInt(items[4].trim());
                    int birthDay = Integer.parseInt(items[4].trim());
                    // Convert String → int: Integer.parseInt( String)
                    Student student = new Student(neptun, firstName, lastName, credits, birthYear, birthMonth, birthDay);
                    System.out.println(student);
                }
                catch (ArrayIndexOutOfBoundsException ex){
                    System.out.println("INCOMPLETE LINE: " + line);
                }
                catch (NumberFormatException ex){
                    System.out.println("NUMBER FORMAT EXCEPTION: " + line);
                }
                catch (InvalidDateException ex){
                    System.out.println("INVALID DATE: "+ line);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

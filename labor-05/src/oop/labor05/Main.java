package oop.labor05;

import oop.labor02.date.MyDate;
import oop.labor05.models.Course;
import oop.labor05.models.Student;
import oop.labor05.models.Training;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Course> courses = new ArrayList<>();
        courses = readCourses("courses.csv");
        for(Course u:courses){
            System.out.println(u);
        }
        ArrayList<Student> students = new ArrayList<>();
        students = readStudents("students.csv");
        for(Student student:students){
            System.out.println(student);
        }
        Training oop = new Training(
                courses.get(0),
                new MyDate(2022,3,21),
                new MyDate(2022,3,25),
                2000
        );
        oop.printToFile();
    }
    public static ArrayList<Course> readCourses(String fileName) {
        ArrayList<Course> courses = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                // trim: eliminates leading and trailing spaces
                String name = items[0].trim(); // a trim a folosleges spaceket kihagyja
                String description = items[1].trim();
                // Convert String → int: Integer.parseInt( String)
                int numHours = Integer.parseInt(items[2].trim());
                courses.add(new Course(name, description, numHours));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return courses;
    }
    private static ArrayList<Student> readStudents(String filename){
        ArrayList<Student> students = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                // trim: eliminates leading and trailing spaces
                String ID = items[0].trim(); // a trim a folosleges spaceket kihagyja
                String firstName = items[1].trim();
                String lastName = items[2].trim();
                // Convert String → int: Integer.parseInt( String)
                students.add(new Student(ID, firstName, lastName));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }
    }

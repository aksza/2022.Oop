package oop.labor05.models;

import oop.labor02.date.MyDate;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Training {
    private final Course course;
    private final MyDate startDate;
    private final MyDate endDate;
    private final double pricePerStudent;
    private ArrayList<Student> enrolledStudents;
    public Training(Course course1,MyDate startDate1,MyDate endDate1,double pricePerStudent1){
        this.course = new Course(course1.getName(), course1.getDescription(),course1.getNumHours());
        this.startDate = new MyDate(startDate1.getYear(),startDate1.getMonth(),startDate1.getDay());
        this.endDate = new MyDate(endDate1.getYear(),endDate1.getMonth(),endDate1.getDay());
        this.pricePerStudent = pricePerStudent1;
    }
    public Student findStudentById(String ID){
        for(Student student:this.enrolledStudents){
            if(student.getID().equals(ID)){
                return student;
            }
        }
        return null;
    }
    public int findPositionById(String ID){
        for(int i = 0;i <enrolledStudents.size();++i){
            if(enrolledStudents.get(i).getID().equals(ID)){
                return i;
            }
        }
        return -1;
    }
    public boolean enroll(Student student){
        if(findStudentById(student.getID()) == null){
            enrolledStudents.add(student);
            return true;
        }
        return false;
    }

    public Course getCourse() {
        return course;
    }
    public int numEnrolled(){
        return enrolledStudents.size();
    }

    public void printToFile(){
        String filename = String.format("%s_%s.%s.%s_%s.%s.%s.csv",course.getName(),startDate.getYear(),startDate.getMonth(),startDate.getDay(),endDate.getYear(),endDate.getMonth(),endDate.getDay());
        try(PrintStream printStream = new PrintStream(filename)){
          printStream.println(this);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    @Override
    public String toString() {
        return "Training{" +
                "course=" + course +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", pricePerStudent=" + pricePerStudent +
                ", enrolledStudents=" + enrolledStudents +
                '}';
    }
    public void unEnroll(String ID){
        if(findPositionById(ID) != -1){
            enrolledStudents.remove(findPositionById(ID));
            return;
        }
        System.out.println("Student is not find!\n");
    }
}

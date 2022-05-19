package oop.labor12.lab12_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Student {
    private HashSet<Mark> marks;
    private int id;
    private String lastName;
    private final String firstName;
    public Student(int id,String lastName,String firstName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.marks = new HashSet<>();
    }
    public void add(Mark mark){
        marks.add(mark);
    }

    public int getId() {
        return id;
    }
    public double avg(){
        double average = 0;
        for(Mark mark:marks){
            average += mark.getGrade();
        }
        return average/marks.size();
    }
    public boolean passed(){
        for(Mark mark:marks){
            if(mark.getGrade() < 5){
                return false;
            }
        }
        return avg() >=6;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

package oop.labor12.lab12_3;

import java.util.ArrayList;

public class Mark {
    private Subject subject;
    private double grade;
    public Mark(Subject subject,double grade){
        this.subject = subject;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }
}

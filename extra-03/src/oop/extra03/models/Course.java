package oop.extra03.models;

import java.time.DayOfWeek;

public class Course {
    public static final int MAX_STUDENTS = 120;
    private  int numberOfCredit;
    private Teacher teacher;
    private  String courseID;
    private  int numberOfEnrolledStudents;
    private  Student[] enrolledStudents;
    private  DayOfWeek dayOfWeek;
    public Course(String courseID,int numberOfCredit,DayOfWeek dayOfWeek){
        this.courseID = courseID;
        this.numberOfCredit = numberOfCredit;
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public String toString(){
        String output = "Course: "+courseID+":\n"+"\tTeacher: "+teacher.toString()+"\n\tCredits: "+numberOfCredit+"\n\tOccurs every: ";
        switch (dayOfWeek){
            case MONDAY :
                output += "MONDAY\n\t";
                break;
            case TUESDAY:
                output +="TUESDAY\n\t";
                break;
            case WEDNESDAY:
                output +="WEDNESDAY\n\t";
                break;
            case THURSDAY:
                output +="THURSDAY\n\t";
                break;
            case FRIDAY:
                output +="FRIDAY\n\t";
                break;
            default:
                output += " -\n\t";
                break;
        }
        output +="Enrolled students: ";
        output +=numberOfEnrolledStudents;
        output +="\n";
        output +=enrolledStudents.toString();
        return output;
    }

}

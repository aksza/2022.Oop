package oop.extra03.models;

import java.time.DayOfWeek;

public class Course {
    public static final int MAX_STUDENTS = 120;
    private  int numberOfCredit;
    private Teacher teacher;
    private  String courseID;
    private  int numberOfEnrolledStudents;
    private  Student[] enrolledStudents = new Student[MAX_STUDENTS];
    private  DayOfWeek dayOfWeek;
    //constructor
    public Course(String courseID,int numberOfCredit,DayOfWeek dayOfWeek){
        this.courseID = courseID;
        this.numberOfCredit = numberOfCredit;
        this.dayOfWeek = dayOfWeek;
    }
    //methods
    public void addNewTeacher(Teacher teacher){
        this.teacher = teacher;
    }
    public void enrollStudents(Student student){
        if(this.numberOfEnrolledStudents < MAX_STUDENTS) {
            this.numberOfEnrolledStudents++;
            this.enrolledStudents[numberOfEnrolledStudents - 1] = student;
        }
        else System.out.println("Cannot enroll more student");
    }
    public void cancelEnrollmentOfStudent(String name){
        int index = -2;
        if(numberOfEnrolledStudents > 0) {
            index = -1;
            for (int i = 0; i < this.numberOfEnrolledStudents; ++i) {
                if (this.enrolledStudents[i].getFirstName().equals(name) || this.enrolledStudents[i].getLastName().equals(name)) {
                    index = i;
                    break;
                }
            }
            if(index >= 0){

                if (numberOfEnrolledStudents - 1 - index >= 0)
                    System.arraycopy(this.enrolledStudents, index + 1, this.enrolledStudents, index, numberOfEnrolledStudents - 1 - index);
            }
            numberOfEnrolledStudents--;
            System.out.println("Student removed succesfully");
        }
        if(index == -2){
            System.out.println("Student not found");
        }
    }

    @Override
    public String toString(){
        String output = "Course: "+courseID+"\n"+"\t"+teacher.toString()+"\n\tCredits: "+numberOfCredit+"\n\tOccurs every: ";
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
        for(int i = 0;i < numberOfEnrolledStudents;++i) {
            output += enrolledStudents[i].toString();
            output += "\n";
        }
        return output;
    }

}

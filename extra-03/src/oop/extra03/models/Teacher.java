package oop.extra03.models;

import oop.extra03.enums.Degree;
import oop.extra03.enums.Department;

public class Teacher {
    public static int currentNumberOfTeachers;
    private String teacherID;
    private String firstName;
    private String lastName;
    private Degree degree;
    private Department department;
    public Teacher(String firstName,String lastName, Degree degree,Department department){
        this.firstName = firstName;
        this.lastName = lastName;
        this.degree = degree;
        this.department = department;
    }
    @Override
    public String toString(){
        String output = "Teaher: ";
        output += this.firstName;
        output += this.lastName;
        output += " - ";
        switch (degree){
            case DOCENT:
                output += "DOCENT";
                break;
            case ASSISTANT:
                output += "ASSISTANT";
                break;
            case ADJUNCT:
                output += "ADJUNCT";
                break;
            case PROFESSOR:
                output += "PROFERSSOR";
                break;
            default:
                output = " - ";
                break;
        }
        output += " from ";
        switch (department){
            case APLLIED_SOCIAL_SCIENCE :
                output += " APPLIED SOCIAL SCIENCE ";
                break;
            case APPLIED_LINGUISTICS:
                output += " APPLIED LINGUISTICS ";
                break;
            case ELECTRICAL_ENGINEERING:
                output += " ELECTRICAL ENGINEERING ";
                break;
            case HORTICULTURE:
                output += " HORTICULTURE ";
                break;
            case MATHEMATICS_INFORMATICS:
                output += " MATHEMATICS INFORMATICS ";
                break;
            case MECHANICAL_ENGINEERING:
                output += "MECHANICAL ENGINEERING";
                break;
            default:
                output += " - ";
                break;
        }
        output += " department.";
        return output;
    }
}

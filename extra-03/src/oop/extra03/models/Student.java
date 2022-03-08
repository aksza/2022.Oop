package oop.extra03.models;

import oop.extra03.Main;
import oop.extra03.enums.Major;

public class Student {
    private String neptunCode;
    private String firstName;
    private String lastName;
    private Major major;
    public Student(String neptunCode, String firstName, String lastName, Major major){
        this.neptunCode = neptunCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
    }

    @Override
    public String toString(){
        return "\t- " + this.firstName + " " + this.lastName + " (" + this.neptunCode +")";
    }

}
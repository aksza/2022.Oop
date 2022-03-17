package oop.extra04.models;

import oop.extra04.utils.Major;

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
    //getters
    public Major getMajor() {
        return this.major;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getNeptunCode() {
        return this.neptunCode;
    }

    @Override
    public String toString(){
        return "\t- " + this.firstName + " " + this.lastName + " (" + this.neptunCode +")";
    }

}
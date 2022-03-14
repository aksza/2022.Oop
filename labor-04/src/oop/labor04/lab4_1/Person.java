package oop.labor04.lab4_1;

public class Person {
    private final String firstName;
    private String lastName;
    private final int birthYear;

    public Person(String firstName, String lastName,int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " was born in" + this.birthYear;
    }
}

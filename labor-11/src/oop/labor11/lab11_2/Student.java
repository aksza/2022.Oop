package oop.labor11.lab11_2;

public class Student {
    private final String neptunId;
    private final String firstName;
    private String lastName;
    private int credits;
    private MyDate birthDate;
    public Student(String neptunId, String firstName, String lastName, int credits, int year,int month,int day) throws InvalidDateException{
        this.neptunId = neptunId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.credits = credits;
        this.birthDate = new MyDate(year,month,day);
    }

    @Override
    public String toString() {
        return "Student{" +
                "neptunId='" + neptunId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", credits=" + credits +
                ", birthDate=" + birthDate +
                '}';
    }
}

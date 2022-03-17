package oop.labor05.models;

public class Course {
    private final String name;
    private final String description;
    private int numHours;

    public Course(String name,String description,int numHours){
        this.name = name;
        this.description = description;
        numHours = numHours;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getNumHours() {
        return numHours;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numHours=" + numHours +
                '}';
    }
}

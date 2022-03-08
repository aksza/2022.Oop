package oop.extra03;

import oop.extra03.enums.Degree;
import oop.extra03.enums.Department;
import oop.extra03.enums.Major;
import oop.extra03.models.Course;
import oop.extra03.models.Student;
import oop.extra03.models.Teacher;


import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args){
        Student student1 = new Student("AVLMO7", "Anne", "Bell",Major.INFORMATION_SCIENCE);
        Teacher teacher1 = new Teacher("Suzanne", "Grey", Degree.DOCENT, Department.MATHEMATICS_INFORMATICS);
        Course course1 = new Course("MB_INFO20", 5, DayOfWeek.FRIDAY);
        System.out.println(course1);

    }
}

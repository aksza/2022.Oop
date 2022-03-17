package oop.extra04;

import oop.extra04.utils.Degree;
import oop.extra04.utils.Department;
import oop.extra04.utils.Major;
import oop.extra04.models.Course;
import oop.extra04.models.Student;
import oop.extra04.models.Teacher;


import java.io.File;
import java.io.FileNotFoundException;
import java.time.DayOfWeek;
import java.util.Scanner;

public class Main {

    //Print all students with a specific major enrolled to a course
    public static void printEnrolledStudentsByMajor(Major major,String courseID){

    }
    //Cancel the enrollment of specific students from all enrolled courses. Use
    //the cancellation.csv file (this file contains a list of students’ neptun
    //code who wants to cancel the enrollment).
    public static void cancelEnrollments(String fileName) {

    }
    //Return an array containing all courses which are held by a teacher with a
    //given degree
    /*public static Course[] coursesByTeacherDegree(Degree degree){

    }

     */
    //Count the number of courses which are held on a given day
    /*public static int nrOfCoursesByDay(DayOfWeek day) {

    }

     */
    public static void ReadFile()
    {
        try {
            File myObj = new File("D:\\egyetem\\elso ev\\masodik felev\\OOP\\Megoldasok\\2022.Oop\\2022.Oop\\extra-03\\src\\oop\\extra03\\models\\university.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] wData = data.split("\t");
                System.out.println(data);
                for(int i=0;i < wData.length;++i){
                    System.out.println(wData[i]);
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        /*
        Student student1 = new Student("AVLMO7", "Anne", "Bell",Major.INFORMATION_SCIENCE);
        Student student2 = new Student("AVLMO6", "Anni", "Bella",Major.AUTOMATION_AND_APPLIED_INFORMATICS);

        Teacher teacher1 = new Teacher("Suzanne", "Grey", Degree.DOCENT, Department.MATHEMATICS_INFORMATICS);
        Course course1 = new Course("MB_INFO20", 5, DayOfWeek.FRIDAY);
        course1.addNewTeacher(teacher1);
        course1.enrollStudents(student2);
        course1.enrollStudents(student1);
        System.out.println(course1.toString());
        course1.cancelEnrollmentOfStudent(student1.getFirstName());
        System.out.println(course1);
//        System.out.println(teacher1);
//        System.out.println(student1);

         */

        final int MAX_COURSES = 50;
        Course[] courses = new Course[MAX_COURSES];
        int currentNrOfCourses= 0;
        /*
        //read file
        try {
            File myObj = new File("D:\\egyetem\\elso ev\\masodik felev\\OOP\\Megoldasok\\2022.Oop\\2022.Oop\\extra-03\\src\\oop\\extra03\\models\\university.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] wData = data.split("\t");
                System.out.println(data);
                courses[currentNrOfCourses] = new Course(wData[0],Integer.parseInt(wData[1]),Integer.parseInt(wData[2]));
                //data = myReader.nextLine();
                //wData = data.split("\t");
                //System.out.println(data);
                //courses[currentNrOfCourses]


            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        */


    }
}

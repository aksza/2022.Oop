package oop.labor04.lab4_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        readFilePrintItsLineNumbered("lab4_1_input.txt");
        ArrayList<Person> personArrayList = readFromCSVFile("lab4_1_input.csv");
        for( int i =0; i < personArrayList.size(); ++i){
            System.out.println(personArrayList.get(i));
        }
    }
    public static void readFilePrintItsLineNumbered( String fileName ){
        /*
        ami itt van az az, ami ott van a tryban. ugy egyszerubb, igy tobb tarhelyet foglalaunk
        File input = new File("input.txt");
        Scanner scanner = new Scanner(input);
        //billentyuzetrol olvasas:
        //System.in(input);
         */
        try (Scanner scanner = new Scanner( new File(fileName))){
            //read and process the lines
            int nrOfLines = 0;
            while(scanner.hasNextLine())
            {
                nrOfLines++;
                System.out.println(nrOfLines + " " + scanner.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static ArrayList<Person> readFromCSVFile(String fileName) {
        ArrayList<Person> persons = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                // trim: eliminates leading and trailing spaces
                String firstName = items[0].trim(); // a trim a folosleges spaceket kihagyja
                String lastName = items[1].trim();
                // Convert String → int: Integer.parseInt( String)
                int birtYear = Integer.parseInt(items[2].trim());
                persons.add(new Person(firstName, lastName, birtYear));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return persons;
    }

}

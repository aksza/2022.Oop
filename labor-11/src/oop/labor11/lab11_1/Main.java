package oop.labor11.lab11_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg szamokat szokozzel elvalasztva");
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");
        double sum = 0;
        for (String number : numbers) {
            try{
                sum += Double.parseDouble(number.trim());
            }
            catch (NumberFormatException ex){
                System.out.println("Hibas input: " + number + " nem szam");
            }
        }
        System.out.println("Az osszeg: " + sum);
    }
}

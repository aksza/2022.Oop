package oop.labor12.lab12_3;

public class Main {
    public static void main(String[] args) {
        Bac bac = new Bac("nevek1.txt");
        bac.addMarks("magyar.txt",Subject.magyar);
        bac.addMarks("roman.txt",Subject.roman);
        bac.addMarks("matek.txt",Subject.matek);
        bac.print();
    }
}

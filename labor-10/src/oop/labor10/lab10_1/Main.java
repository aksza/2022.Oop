package oop.labor10.lab10_1;

import oop.labor10.lab10_1.DateUtil;
import oop.labor10.lab10_1.MyDate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<MyDate> dates = new ArrayList<>();
        Random random = new Random();

        while (dates.size() < 10){
            int year = 2022;
            int month = random.nextInt(12) + 1;
            int day = random.nextInt(31) + 1;
            if(DateUtil.isValidDate(year,month,day)){
                dates.add(new MyDate(year,month,day));
            }
        }
        System.out.println("Dates:");
        for(MyDate d:dates){
            System.out.println(d);
        }
        Collections.sort(dates);

        System.out.println("\n\nDates after sort:");

        for(MyDate d:dates){
            System.out.println(d);
        }

    }
}

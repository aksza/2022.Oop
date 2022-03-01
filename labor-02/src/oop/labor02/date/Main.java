package oop.labor02.date;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        //a.
        int year = 2002;
        System.out.println(DateUtil.leapYear(year)==false);
        System.out.println(DateUtil.isValidDate(2000,2, 29) == true);
        System.out.println(DateUtil.isValidDate(2000,2, 30) == false);
        System.out.println(DateUtil.isValidDate(1900,2, 29) == false);
        System.out.println(DateUtil.isValidDate(1900,2, 28) == true);
        System.out.println(DateUtil.isValidDate(-1900,2, 28) == false);
        System.out.println(DateUtil.isValidDate(0,2, 28) == false);
        System.out.println(DateUtil.isValidDate(2021,2, 29) == false);
        System.out.println(DateUtil.isValidDate(2020,2, 29) == true);
        System.out.println(DateUtil.isValidDate(2020,1, 32) == false);
        System.out.println(DateUtil.isValidDate(2020,1, 0) == false);
        System.out.println(DateUtil.isValidDate(2020,0, 0) == false);
        System.out.println(DateUtil.isValidDate(2020,4, 31) == false);
        System.out.println(DateUtil.isValidDate(2020,1, 31) == true);
        //b.
        int month, day, invalidDates = 0;
        MyDate[] dates = new MyDate[1000];
        Random rand = new Random();
        for(int i = 0;i< dates.length;++i){
            year =1+  rand.nextInt(3000);
            month =1 + rand.nextInt(12);
            day =1 + rand.nextInt(31);
            dates[i] = new MyDate(year,month,day);
            System.out.println(dates[i]);
            if(DateUtil.isValidDate(year,month,day) ){
                System.out.println(dates[i].toString());
            }
            else invalidDates++;
        }
        System.out.println(invalidDates+" invalid dates were generated");
    }
}

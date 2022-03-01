package oop.labor02.date;
import java.lang.String;

public class MyDate {
    private int year;
    private int month;
    private int day;
    //constructor
    public MyDate(int year,int month,int day){
        if(DateUtil.isValidDate(year,month,day)){
            this.year = year;
            this.month = month;
            this.day = day;
        }
    }
    //getter
    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    //

    @Override
    public String toString(){
        String date = "date: ";
        date += this.year;
        date += ".";
        date += this.month;
        date +=".";
        date += this.day;
        date += ".";
        return date;
    }
}

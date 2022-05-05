package oop.extra0506.date;

import oop.extra0506.utils.DateUtil;

public class MyDate {
    private int year;
    private int month;
    private int day;
    //constructor
    public MyDate(int year, int month, int day){
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
        return date;
    }
}

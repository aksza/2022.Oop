package oop.labor11.lab11_2;

public class MyDate {
    private int year;
    private int month;
    private int day;
    //constructor
    public MyDate (int year, int month, int day)throws InvalidDateException{
        if(!DateUtil.isValidDate(year,month,day)){
            throw new InvalidDateException("INVALID DATE");
        }
        this.year = year;
        this.month = month;
        this.day = day;
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

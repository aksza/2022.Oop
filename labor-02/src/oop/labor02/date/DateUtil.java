package oop.labor02.date;

public class DateUtil {
    public static boolean leapYear(int year){
        return (year % 4 == 0 && year % 100!= 0) || (year % 400 == 0 );
    }
    public static boolean isValidDate(int year, int month, int day){
        if(year <= 0 || month <= 0 || day<=0 || month > 12 || day > 31) {
            return false;
        }
        else{
            if(month == 2){
                if(leapYear(year)){
                    if(day > 29){
                        return false;
                    }
                    else return true;
                }
                else if(day > 28){
                    return false;
                }
                    else {
                        return true;
                }
            }
            if(month <= 7){
                if(month %2 == 0){
                    if(day > 30){
                        return false;
                    }
                    else return true;
                }
                else return true;
            }
            if(month > 7){
                if(month %2 != 0){
                    if(day > 30){
                        return false;
                    }
                    else return true;
                }
                else return true;
            }
        }
        return false;
    }
}

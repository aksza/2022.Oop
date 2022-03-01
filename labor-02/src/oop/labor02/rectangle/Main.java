package oop.labor02.rectangle;

import java.util.Random;

public class Main {
   public static void print(Rectangle[] rectangles){
        for(int i=0;i< rectangles.length ; ++i){
            System.out.println(i+". rectangle:\n"+"length: "+ rectangles[i].getLength()+"\twidth: "+rectangles[i].getWidth()+"\nperimeter: "+ rectangles[i].perimeter(rectangles[i].getLength(), rectangles[i].getWidth())+"\tarea: "+ rectangles[i].area(rectangles[i].getLength(), rectangles[i].getWidth()));
        }
    }
    public static double totalArea(Rectangle[] rectangles){
       double total  = 0;
       for(int i = 0;i < rectangles.length;++i){
           total += rectangles[i].area(rectangles[i].getLength(),rectangles[i].getWidth());
       }
       return total;
    }
    public static void main(String[] args)
    {
        //1.
        Rectangle[] rectangles = new Rectangle[10];
        //2.
        double length, width;
        Random rand = new Random();
        for (int i = 0; i < 10; ++i) {
            length = 1 + rand.nextDouble(10);
            width = 1 + rand.nextDouble(10);
            rectangles[i] = new Rectangle(length, width);
        }
        //3.
        print(rectangles);
        /*for(int i=0;i< 10 ; ++i){
            System.out.println(i+". rectangle:\n"+"length: "+ rectangles[i].getLength()+"\twidth: "+rectangles[i].getWidth()+"\nperimeter: "+ rectangles[i].perimeter(rectangles[i].getLength(), rectangles[i].getWidth())+"\tarea: "+ rectangles[i].area(rectangles[i].getLength(), rectangles[i].getWidth()));
        }*/
        //4.
        System.out.println("Total area of the generated rectangles: "+ totalArea(rectangles));
    }
}

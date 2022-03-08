package oop.extra02.car;


import java.nio.file.*;
import java.util.Random;

public class Main {
    public static String readFile(String fileName)throws Exception
    {
        String data = " ";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }
    public static void main(String[] args)throws Exception
    {
        /*
        //test
        Car car = new Car("Ford", "Fiesta", 2, true, 2002);
        System.out.println(car);
         */
        String data = readFile("D:\\egyetem\\elso ev\\masodik felev\\OOP\\Megoldasok\\2022.Oop\\2022.Oop\\extra-02\\src\\oop\\extra02\\car\\cars.txt");
        System.out.println(data);
        String[] arr = data.split("\n");
        String nr = arr[0];

        Integer numberOfVehicules = Integer.valueOf(nr);
        System.out.println(numberOfVehicules);
        /*
        Random rand = new Random();
        Car[] cars = new Car[numberOfVehicules + 1];
        int j = 0;
            for(int i = 1;i < arr.length;i+=3){
                int fuel = rand.nextInt(4);
                boolean passanger = rand.nextBoolean();
                cars[j] = new Car(arr[i],arr[i+1],fuel,passanger,Integer.parseInt(arr[i+2]));
                //System.out.println(cars[j].toString());
                j++;
            }*/
    }
}

package oop.labor04.lab4_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;

public class MyArray {
    private final int length;
    private double[] elements;
    public MyArray(int length){
        this.length = length;
        this.elements = new double[length];
    }
    public MyArray(double[] elements){
        this.length =elements.length;
        this.elements = new double[this.length];
        System.arraycopy(elements, 0, this.elements, 0, elements.length);

    }
    public MyArray(MyArray myArray){
        this.length = myArray.length;
        this.elements = new double[this.length];
        System.arraycopy(myArray.elements,0,this.elements,0,myArray.elements.length);

    }
    public MyArray(String fileName){
        int temp;
        try (Scanner scanner = new Scanner( new File(fileName))){
            //read and process the lines
            int nr = 0;
            if(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] item = line.split(" ");
                temp = Integer.parseInt(item[0]);
                this.elements = new double[temp];
            }
            else{
                temp = 0;
            }
            while(scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                String[] items = line.split(" ");
                for(int i = 0;i < items.length && nr < temp; ++i){
                    String num = items[i].trim();
                    this.elements[nr] = Double.parseDouble(num);
                    nr++;
                }
            }
        }
        catch (FileNotFoundException e) {
            temp = 0;
            e.printStackTrace();
        }
        this.length = temp;
    }
    public void fillRandom(double a,double b){
        Random rand = new Random();
        for (int i= 0;i < length;++i){
            elements[i] = rand.nextDouble(a,b);
        }
    }
    public double mean(){
        double sum = 0;
        for(double i:elements){
            sum +=i;
        }
        return sum/elements.length;
    }
    public double stddev(){
        double stdev = 0;
        double mean = mean();
        for (double num:elements){
            stdev += Math.pow(num - mean,2);
        }
        return Math.sqrt(stdev/length);
    }
    public void sort(){
        boolean sorted = false;
        double temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < elements.length - 1; i++) {
                if (elements[i] > elements[i+1]) {
                    temp = elements[i];
                    elements[i] = elements[i+1];
                    elements[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }
    public void print(String variable){
        StringBuilder res = new StringBuilder(variable + ": ");
        for (double i:elements){
            res.append(i).append(" ");
        }
        System.out.println(res);
    }
}

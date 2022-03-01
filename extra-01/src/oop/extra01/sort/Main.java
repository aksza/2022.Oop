package oop.extra01.sort;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void print(int[] freq){
        int doublee = 0;
        for(int i = 0; i < freq.length; ++i){
            if(freq[i] == 2) doublee++;
        }
        System.out.println(doublee);
    }
    public static void ArrayFill(int[] array){
        Random rand = new Random();
        for(int i = 0;i < array.length; ++i){
            array[i] = rand.nextInt(1000000);
        }
        Arrays.sort(array);
        int[] freq = new int[1000000];
        for(int i = 0;i < array.length; ++i){
            freq[array[i]]++;
        }
        print(freq);
    }
    public static void main(String[] args) {
        int[] array = new int[1000000];
        ArrayFill(array);
    }
}

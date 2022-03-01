package oop.extra01.binarySearch;

import java.util.Arrays;

public class Main {
    public static int binarySearch(int[] array,int s){
        Arrays.sort(array);
        int first = 0, last = array.length-1;
        int mid = (array.length-1)/2;
        while(first <= last){
            if(array[mid] == s){
                return mid;
            }
            else if(array[mid] < s){
                first = mid + 1;
            }
            else{
                last = mid - 1;
            }
            mid = (first + last )/2;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] array = {10, 20 ,15 ,19, 21, 35, 83 ,43};
        int s = 2;
        if(binarySearch(array,s) == -1){
            System.out.println("Element is not found");
        }
        else {
            System.out.println("Element is found at index: "+ binarySearch(array,s));
        }
    }
}

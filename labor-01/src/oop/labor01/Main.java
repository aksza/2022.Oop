package oop.labor01;
import java.lang.Math;

public class Main {
    public static double maxElement( double array[] ){
        double max = Double.NEGATIVE_INFINITY;
        for( int i=0; i<array.length; ++i ){
            if( array[i] > max){
                max = array[ i ];
            }
        }
        return max;
    }
    public static int decToBin(int number){
        if(number == 0){
            return 0;
        }
        else{
            return (decToBin(number/2)*10+number%2);
        }
    }
    public static int getBit(int number,int order){
        int bin = decToBin(number);
        if(bin / (int) Math.pow((double) 10,(double) (order)) != 0){
            return ((bin/(int)Math.pow((double) 10,(double)( order)))%10);
        }
        return -1;

    }
    public static int countBits(int number){
        int bin = decToBin(number),count = 0;
        while(bin != 0){
            if((bin&1) == 1){
                count++;
            }
            bin/=10;
        }
        return count;
    }
    public static double mean(double array[]){
        float avg=0;
        for(int i=0;i<array.length;++i){
            avg+=array[i];
        }
        avg/=array.length;
        return avg;
    }
    /*public static double stddev(double array[]){

    }*/
    public static double[] max2( double array[] ){
        double max[] ={Double.NEGATIVE_INFINITY,
                Double.NEGATIVE_INFINITY};
        if( array.length == 0 ){
            return max;
        }
        else{
            for(int i=0;i<array.length;i++) {
                if (max[0] < array[i]) max[0] = array[i];
                else if(max[1]<array[i]) max[1] = array[i];
            }
            return max;
        }

    }
    public static void main(String[] args) {
        //2.
        /*System.out.println("Suciu Aksza");
		String nev = "Suciu Aksza";
		String mono="";
		mono+= nev.charAt(0);
		;
		for( int i=0; i<nev.length(); ++i){
			if(nev.charAt(i) == ' '){
				mono += nev.charAt(i+1);
			}
		}
		System.out.println(mono);//
        for(int i=0;i<args.length;++i){
            System.out.println(args[i]);
        }
        //3. piramis
        String szo ="ALMAFA";
        String uj = "";
        System.out.println(szo);
        for(int i=0;i<szo.length();++i){
            uj="";
            for(int j=0;j<=i;++j){
                uj +=szo.charAt(j);
            }
            System.out.println(uj);
        }


        //4.
        String nev = "Kovacs Balint Adam Jozsef";
        String[] arr = nev.split(" ");
        String uj = " ";
        for(int i=0;i<arr.length;++i){
            uj+=arr[i].charAt(0);
        }
        System.out.println(uj);

        //fuggvenyek 1,2
        double x[] ={7, 1, -3, 45, 9};
        System.out.printf("MAX: %6.2f\n", maxElement( x ));
        int number = 13,order = 3;
        System.out.println(decToBin(number));
        System.out.println("A "+order+"dik bitjen levo szam: "+getBit(number,order));

        //3.
        for(int i = 0;i<=31;++i){
            System.out.println(i+": "+countBits(i)+"\n");
        }

        //4.
        double x[] ={7, 1, -3, 45, 9};
        System.out.println("A szamok atlaga: "+mean(x));

         */
        //5.
        //6.
        double x[] ={7, 1, -3, 45, 9};
        System.out.println(max2(x));
    }
}

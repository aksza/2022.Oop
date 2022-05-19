package oop.labor10.lab10_3;

public class Main {
    public static void main(String[] args) {
        int testCounter = 0;
        long startTime = System.nanoTime();
        testCounter++;
        System.out.println("Test: " + testCounter);
        test1();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        double durationInSec = (double) duration/1_000_000_000;
        System.out.println("Execution time: " + duration);
        System.out.println("Execution time in seconds: " + durationInSec);

        startTime = System.nanoTime();
        testCounter++;
        System.out.println("Test: " + testCounter);
        test2();
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        durationInSec = (double) duration/1_000_000_000;
        System.out.println("Execution time: " + duration);
        System.out.println("Execution time in seconds: " + durationInSec);

        startTime = System.nanoTime();
        testCounter++;
        System.out.println("Test: " + testCounter);
        test3();
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        durationInSec = (double) duration/1_000_000_000;
        System.out.println("Execution time: " + duration);
        System.out.println("Execution time in seconds: " + durationInSec);

        startTime = System.nanoTime();
        testCounter++;
        System.out.println("Test: " + testCounter);
        test4();
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        durationInSec = (double) duration/1_000_000_000;
        System.out.println("Execution time: " + duration);
        System.out.println("Execution time in seconds: " + durationInSec);

    }

    private static void test1() {
        Storage storage = new Storage("data1000.txt");
        storage.update("update1000.txt");
    }

    private static void test2() {
        Storage storage = new Storage("data1000.txt");
        storage.update("update1000000.txt");
    }

    private static void test3() {
        Storage storage = new Storage("data1000000.txt");
        storage.update("update1000.txt");
    }

    private static void test4() {
        Storage storage = new Storage("data1000000.txt");
        storage.update("update1000000.txt");
    }
}

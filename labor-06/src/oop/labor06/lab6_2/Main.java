package oop.labor06.lab6_2;

public class Main {
    public static void main(String args[]){
        double[][] d = { { 1, 2, 3 }, { 4, 5, 6 }, { 9, 1, 3} };
        Matrix m0 = new Matrix(d);
        System.out.println("m0 rows: " + m0.getRows()+", cols: " + m0.getColumns());
        System.out.println("m0: ");
        m0.printMatrix();
        System.out.println();
        Matrix m00 = new Matrix( m0 );
        System.out.println("m00 is a deep copy of m0: ");
        m00.printMatrix();
        System.out.println("************************");
        Matrix m1 = new Matrix(2, 3);
        m1.fillRandom(1,2);
        System.out.println("m1: ");
        m1.printMatrix();
        System.out.println();
        Matrix m2 = new Matrix(2, 3);
        m2.fillRandom(1,2);
        System.out.println("m2: ");
        m2.printMatrix();
        System.out.println("Sum: m1 + m2");
        Matrix.add(m1, m2).printMatrix();
        Matrix m3 = new Matrix(3, 4);
        m3.fillRandom(0, 1);
        System.out.println("m3: ");
        m3.printMatrix();
        System.out.println("Product: m1 * m3");
        Matrix.multiply(m1, m3).printMatrix();
        System.out.println("Transpose(m3)");
        Matrix.transpose( m3 ).printMatrix();
    }
}

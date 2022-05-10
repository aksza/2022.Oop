package oop.labor11.lab11_5;
import java.util.Arrays;
import java.util.Random;

public class Matrix {
    private double[][] data;
    private final int rows;
    private final int columns;
    public Matrix(int rows, int columns){
        this.columns = columns;
        this.rows = rows;
        this.data = new double[rows][columns];
    }
    public Matrix(double[][] data){
        this.rows = data.length;
        this.columns = data[0].length;
        this.data = new double[rows][columns];
        for (int i = 0; i < data.length; ++i){
            System.arraycopy(data[i], 0, this.data[i], 0, data[i].length);
        }
    }
    public Matrix(Matrix matrix){
        this.columns = matrix.columns;
        this.rows = matrix.rows;
        this.data = new double[rows][columns];
        for (int i = 0; i < matrix.data.length; ++i){
            System.arraycopy(matrix.data[i], 0, this.data[i], 0, matrix.data[i].length);
        }
    }
    public void fillRandom(double start,double fin){
        Random rand = new Random();
        for (int i = 0; i < data.length;++i){
            for ( int j  = 0; j < data[i].length; ++j){
                data[i][j] = rand.nextDouble(start,fin);
            }
        }
    }
    public int getColumns() {
        return columns;
    }

    public int getRows() {
        return rows;
    }
    public void printMatrix(){
        for (double[] datum : data) {
            System.out.println(Arrays.toString(datum));
        }
    }
    public static Matrix add(Matrix matrix1,Matrix matrix2) throws MatrixException{
        if(matrix1.columns != matrix2.columns || matrix1.rows != matrix2.rows){
            throw new MatrixException("nem egyezik meg az oszlop vagy sor");
        }
        Matrix newMatrix = new Matrix(matrix1.rows, matrix1.columns);
        for (int i = 0;i < matrix2.rows; ++i){
            for(int j = 0;j < matrix2.columns;++j){
                newMatrix.data[i][j] = matrix1.data[i][j] + matrix2.data[i][j];
            }
        }
        return newMatrix;
    }
    public static Matrix multiply(Matrix matrix1,Matrix matrix2) throws MatrixException{
        if(matrix2.rows != matrix1.columns){
            throw new MatrixException("\nMultiplication Not Possible");

        }
        Matrix newMatrix = new Matrix(matrix1.rows, matrix2.columns);
        for (int i = 0;i < matrix1.rows; ++i){
            for(int j = 0;j < matrix2.columns;++j){
                for (int k = 0; k < matrix2.rows;++k){
                    newMatrix.data[i][j] += matrix1.data[i][k] * matrix2.data[k][j];
                }
            }
        }
        return newMatrix;
    }
    public static Matrix transpose(Matrix matrix){
        Matrix newMatrix = new Matrix(matrix.columns, matrix.rows);
        for (int i = 0;i < matrix.columns;i++){
            for (int j = 0;j < matrix.rows; ++j){
                newMatrix.data[i][j] = matrix.data[j][i];
            }
        }
        return newMatrix;
    }
}

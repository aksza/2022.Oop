package oop.labor11.lab11_3;

import java.io.*;

public interface FileUtil {
    public static void encode(String inputFileName, String outputFileName) throws IOException {
        try (InputStream in = new FileInputStream(inputFileName)) {
            try (OutputStream out = new FileOutputStream(outputFileName)) {
                int ch;
                while ((ch = in.read()) != -1) {
                    out.write((ch + 1) % 256);
                }
            }
        }
    }
    public static void decode(String inputFileName, String outputFileName) throws IOException{
        try (InputStream in = new FileInputStream(inputFileName)){
            try(OutputStream out = new FileOutputStream(outputFileName)){
                int ch;
                while ((ch = in.read()) != -1){
                    out.write((ch - 1) %256);
                }
            }
        }
    }
}

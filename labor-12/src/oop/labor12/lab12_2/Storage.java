package oop.labor12.lab12_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Storage {
    private ArrayList<Product> products;
    private String filename;
    private int updateCounter = 0;
    public Storage(String filename){
        products = new ArrayList<>();
        this.filename = filename;

        try (Scanner scanner = new Scanner(new File(filename))){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                if(line.isEmpty()){
                    continue;
                }
                String[] items = line.split(" ");
                int identifier = Integer.parseInt(items[0].trim());
                String name = items[1].trim();
                int amount = Integer.parseInt(items[2].trim());
                int price = Integer.parseInt(items[3].trim());

                Product newProduct = new Product(name,amount,price,identifier);

                products.add(newProduct);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void update(String filename){
        //products.sort(Comparator.comparing(Product::getIdentifier));

        try (Scanner scanner = new Scanner(new File(filename))) {
            products.sort(Comparator.comparing(Product::getIdentifier));
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                if(line.isEmpty()){
                    continue;
                }
                String[] items = line.split(" ");
                int updateId = Integer.parseInt(items[0].trim());
                int newAmount = Integer.parseInt(items[1].trim());

                int result = Collections.binarySearch(products, new Product("NaN",newAmount,0,updateId));
                if(result >= 0){
                    products.get(result).increaseAmount(newAmount);
                    updateCounter++;
                }

                /*for (Product p: products){
                    if(p.getIdentifier() == updateId){
                        p.increaseAmount(newAmount);
                        updatedProds++;
                    }
                }*/
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Number of updated products: " + updateCounter);
        }
    }
}

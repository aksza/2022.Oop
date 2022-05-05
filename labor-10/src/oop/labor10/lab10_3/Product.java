package oop.labor10.lab10_3;

public class Product {
    private final int identifier;
    private String name;
    private int amount;
    private int price;
    public Product(String name,int amount,int price,int identifier){
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public int getIdentifier() {
        return identifier;
    }

    public int getPrice() {
        return price;
    }
    public void increaseAmount(int newAmount){
        amount += newAmount;
    }
}

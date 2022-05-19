package oop.labor12.lab12_2;

public class Product implements Comparable<Product>{
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
    public boolean increaseAmount(int newAmount){
        if(newAmount > 0) {
            amount += newAmount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Product: \n" +
                "\tidentifier=" + identifier +
                "\n\t name='" + name + '\'' +
                "\n\t amount=" + amount +
                "\n\t price=" + price;
    }
    @Override
    public int compareTo(Product o) {
        return this.getIdentifier() - o.getIdentifier();
    }
}

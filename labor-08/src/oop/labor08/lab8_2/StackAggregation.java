package oop.labor08.lab8_2;

import java.util.ArrayList;
import java.util.Stack;

public class StackAggregation {
    private ArrayList<Object> items;
    private final int capacity;
    public StackAggregation(int capacity){
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    public boolean isFull(){
        return items.size() >= capacity;
    }
    public boolean isEmpty(){
        return items.size() == 0;
    }
    public void push(Object object){
        if(!isFull()){
            items.add(object);
        }
        else{
            System.out.println("the stack is full");
        }
    }
    public void pop(){
        if(!isEmpty()){
            items.remove(items.size()-1);
        }
        else {
            System.out.println("the stack is empty");
        }
    }
    public Object top(){
        if(!isEmpty()){
            return items.get(items.size()-1);
        }
        else {
            return null;
        }
    }
    public int getSize(){
        return items.size();
    }
}

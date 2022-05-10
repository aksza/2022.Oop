package oop.labor11.lab11_4;

import java.util.ArrayList;

public class Stack {
    private ArrayList<Object> items;
    private final int capacity;
    public Stack(int capacity){
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    public boolean isFull(){
        return items.size() >= capacity;
    }
    public boolean isEmpty(){
        return items.size() == 0;
    }
    public void push (Object object) throws StackException{
        if(isFull()){
            throw new StackException("CANNOT PUSH- STACK IS FULL");
        }
        items.add(object);
    }
    public void pop() throws StackException{
        if(isEmpty()){
           throw new StackException("CANNOT POP- STACK IS EMPTY");
        }
        items.remove(items.size()-1);
    }
    public Object top() throws StackException{
        if(isEmpty()){
           throw new StackException("CANNOT TOP- STACK IS EMPTY");
        }
        return items.get(items.size()-1);
    }
    public int getSize(){
        return items.size();
    }
}

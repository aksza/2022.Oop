package oop.labor09.lab9_1;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListQueue implements IQueue{
    private ArrayList<Object> items = new ArrayList<>();
    private final int CAPACITY;
    public ArrayListQueue(int capacity){
        this.CAPACITY = capacity;
    }
    @Override
    public boolean isEmpty() {
        return items.size() == 0;
    }

    @Override
    public boolean isFull() {
        return items.size() == CAPACITY;
    }

    @Override
    public void enQueue(Object obj) {
        if(!isFull()){
            items.add(obj);
            return;
        }
        System.out.println("Unsuccesfull enQueue");
    }

    @Override
    public Object deQueue() {
        if(!isEmpty()){
            Object element = items.get(0);
            items.remove(0);
            return element;
        }
        System.out.println("The queue is empty");
        return null;
    }

    @Override
    public void printQueue() {
        if (!isEmpty()){
            for(Object obj:items){
                System.out.println(obj);
            }
            return;
        }
        System.out.println("The queue is empty!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayListQueue that = (ArrayListQueue) o;
        if(this.items.size() != that.items.size()) return false;
        for (int i = 0; i < this.items.size(); ++i){
            if(!this.items.get(i).equals(that.items.get(i))){
                return false;
            }
        }
        return true;
    }

}

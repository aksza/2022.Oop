package oop.labor09.lab9_1;

public class CircularQueue implements IQueue{
    private final int CAPACITY;
    private Object[] items;
    private int front;
    private int rear;
    public CircularQueue(int capacity){
        this.CAPACITY = capacity;
        items = new Object[CAPACITY];
        this.front = -1;
        this.rear = -1;
    }
    @Override
    public boolean isEmpty(){
        return (front == -1);
    }
    @Override
    public boolean isFull(){
        return ((front == 0 && rear == CAPACITY -1) || (front == rear + 1));
    }
    @Override
    public void enQueue(Object obj) {
        if(!isFull()) {
            rear = (rear +1) % CAPACITY;
            items[rear] = obj;
            if(front == -1){
                front = 0;
            }
            return;
        }
        System.out.println("Unsuccesfull enQueue");
    }
    @Override
    public Object deQueue(){
        if(!isEmpty()) {
            Object element = items[front];
            if( front == rear){
                front = -1;
                rear = -1;
            }
            else {
                front = (front + 1) % CAPACITY;
            }
            return element;
        }
        return null;
    }
    @Override
    public void printQueue() {
        if(!isEmpty()){
            int i;
            for(i = front ; i < rear; i = (i + 1 ) % CAPACITY){
                System.out.println(items[i]);
            }
            System.out.println(items[i]);
            return;
        }
        System.out.println("The queue is empty!");
    }
}

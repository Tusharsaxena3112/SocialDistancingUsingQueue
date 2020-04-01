package queue;

import customer.Customer;
import linkedList.LinkedList;

public class CustomerQueue {
    private LinkedList linkedList  = new LinkedList();
    private int size=0;

    public void enqueue(Customer data){
        linkedList.addLast(data);
        size++;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Customer dequeue(){
        Customer customer = linkedList.deleteFirst();
        size--;
        return customer;
    }

    public void display(){
        linkedList.show();
    }

    public boolean isEmpty(){
        return linkedList.isEmpty();
    }


}

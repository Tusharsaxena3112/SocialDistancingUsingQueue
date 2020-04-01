package queue;

import customer.Customer;
import linkedList.LinkedList;

public class CustomerQueue {
    private LinkedList linkedList  = new LinkedList();

    public void enqueue(Customer data){
        linkedList.addLast(data);
    }

    public Customer dequeue(){
        Customer customer = linkedList.deleteFirst();
        return customer;
    }

}

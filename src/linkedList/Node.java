package linkedList;

import customer.Customer;

public class Node {
    private Customer data;
    private Node next;

    public Customer getData() {
        return data;
    }

    public void setData(Customer data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node (Customer data){
        this.data = data;
        this.next = null;
    }
}

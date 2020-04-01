package linkedList;

import customer.Customer;

public class Node {
    private Customer data;
    private Node next;

    public Node (Customer data){
        this.data = data;
        this.next = null;
    }
}

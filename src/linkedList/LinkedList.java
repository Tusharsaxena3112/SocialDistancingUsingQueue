package linkedList;

import customer.Customer;

public class LinkedList {
    private Node first;
    private Node last;

    public void addLast(Customer data) {
        Node node  = new Node(data);
        if(first==null){
            first=last = node;
        }
        else{
            last.setNext(node);
            last = node;
        }
    }


}

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

    public Customer deleteFirst(){
        Node response = first;
        if(first.getNext()==null){
            first = last = null;
        }
        else{
            var second = first.getNext();
            first = null;
            first = second;
        }
        return response.getData();
    }

    public void show(){
        var current = first;
        while(current!=null){
            System.out.println(current.getData());
            current=current.getNext();
        }
    }
}

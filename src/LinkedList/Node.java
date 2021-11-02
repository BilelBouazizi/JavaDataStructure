package LinkedList;

public class Node<T> {
    T value;
    Node next;
    public  Node(T value, Node next){
        this.next=next;
        this.value=value;
    }


}

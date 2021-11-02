public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList ls=new LinkedList(new Node <Integer>(12,null));
        ls.add(new Node<Integer>(11,null));
        ls.add(new Node<Integer>(13,null));
        ls.display();
        System.out.println("After delete");
        ls.Delete();
        ls.display();
    }

}


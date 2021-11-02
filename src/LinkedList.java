public class LinkedList {

    Node head;
//initialize the first node
    public LinkedList( Node head){
        this.head=head;
    }
    //add in the first position
    public void add(Node newNode){
        if (newNode == null) {
            head=head;
        }
        else {
        newNode.next=head;
        head=newNode;
        }
    }
    //Delete first position
    public void Delete(){
        head=head.next;
    }
    public void display(){
        Node n=head;
        while (n!=null){
            System.out.println(n.value);
            n=n.next;
        }
    }

}
